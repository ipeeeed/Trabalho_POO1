package br.com.banco.teste;

import java.time.LocalDate;
import java.util.List;

import br.com.banco.dominio.Profissao;
import br.com.banco.servico.ProfissaoServico;

public class ProfissaoTeste extends BaseTeste<Profissao> {

    public ProfissaoTeste() {
        this.servico = new ProfissaoServico();
    }

    @Override
    public void Executar() {
        System.out.println("\n");
        int valorChave = this.TestarCriacao();
        this.TestarAlteracao(valorChave);
        this.TestarLeitura(valorChave);
        this.TestarExclusao(valorChave);
        // this.TestarLeituraVarios();
    }

    @Override
    protected int TestarCriacao() {
        System.out.println("Agora testando CRIAÇÃO: ");
        Profissao prf = new Profissao(1, "Otorrinolaringologista", LocalDate.now(), true);
        Profissao novo = this.servico.Criar(prf);
        System.out.println(novo.toString());
        return novo.getCodigo();
    }

    @Override
    protected void TestarLeitura(int chave) {
        System.out.println("Agora testando LEITURA: ");
        Profissao prf = this.servico.Ler(chave);
        System.out.println(prf.toString());
    }

    @Override
    protected void TestarLeituraVarios() {
        List<Profissao> lista = this.servico.Ler();
        for (Profissao prf : lista) {
            System.out.println(prf.toString());
        }
    }

    @Override
    protected void TestarAlteracao(int chave) {
        System.out.println("Agora testando ALTERAÇÃO: ");
        Profissao antigo = this.servico.Ler(chave);
        antigo.setDescricao("Médico de nariz");
        Profissao alterada = this.servico.Atualizar(antigo);
        System.out.println(alterada.toString());
    }

    @Override
    protected void TestarExclusao(int chave) {
        System.out.println("Agora testando EXCLUSÃO: ");
        Profissao alvo = this.servico.Ler(chave);
        Profissao excluido = this.servico.Deletar(alvo.getCodigo());
        System.out.println(excluido.toString());
    }
}
