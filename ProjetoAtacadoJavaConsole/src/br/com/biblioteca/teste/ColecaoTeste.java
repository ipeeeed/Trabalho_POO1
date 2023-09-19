package br.com.biblioteca.teste;

import java.time.LocalDate;
import java.util.List;

import br.com.bases.BaseTeste;
import br.com.biblioteca.dominio.Colecao;
import br.com.biblioteca.servico.ColecaoServico;

public class ColecaoTeste extends BaseTeste<Colecao> {
    public ColecaoTeste() {
        this.servico = new ColecaoServico();
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
        Colecao colecao = new Colecao(1, "", LocalDate.now(), "Editora Saravaia");
        Colecao novo = this.servico.Criar(colecao);
        System.out.println(novo.toString());
        return novo.getCodigo();
    }
    
    @Override
    protected void TestarLeitura(int chave) {
        System.out.println("Agora testando LEITURA: ");
        Colecao colecao = this.servico.Ler(chave);
        System.out.println(colecao.toString());
    }
    
    @Override
    protected void TestarLeituraVarios() {
        List<Colecao> lista = this.servico.Ler();
        for (Colecao colecao : lista) {
            System.out.println(colecao.toString());
        }
    }

    @Override
    protected void TestarAlteracao(int chave) {
        System.out.println("Agora testando ALTERAÇÃO: ");
        Colecao antigo = this.servico.Ler(chave);
        antigo.setDescricao("Nova Coleção da Roda do Tempo");
        Colecao alterada = this.servico.Atualizar(antigo);
        System.out.println(alterada.toString());
    }
    
    @Override
    protected void TestarExclusao(int chave) {
        System.out.println("Agora testando EXCLUSÃO: ");
        Colecao alvo = this.servico.Ler(chave);
        Colecao excluido = this.servico.Deletar(alvo.getCodigo());
        System.out.println(excluido.toString());
    }
}
