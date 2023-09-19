package br.com.pessoas.teste;

import java.time.LocalDate;
import java.util.List;

import br.com.bases.BaseTeste;
import br.com.pessoas.dominio.PessoaFisica;
import br.com.pessoas.servico.PessoaFisicaServico;

public class PessoaFisicaTeste extends BaseTeste<PessoaFisica> {
    public PessoaFisicaTeste() {
        this.servico = new PessoaFisicaServico();
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
        PessoaFisica pessoaFisica = new PessoaFisica(1, "Lucas André", "Lcas@hotmail.com", "nao tem", LocalDate.now(), "16487928914", "45654546", "M", "Branco", "Brasileiro", "Rio de Janeiro", "Altair", "Mariana");
        PessoaFisica novo = this.servico.Criar(pessoaFisica);
        System.out.println(novo.toString());
        return novo.getCodigoPessoa();
    }
    
    @Override
    protected void TestarLeitura(int chave) {
        System.out.println("Agora testando LEITURA: ");
        PessoaFisica pessoaFisica = this.servico.Ler(chave);
        System.out.println(pessoaFisica.toString());
    }
    
    @Override
    protected void TestarLeituraVarios() {
        List<PessoaFisica> lista = this.servico.Ler();
        for (PessoaFisica pessoaFisica : lista) {
            System.out.println(pessoaFisica.toString());
        }
    }
    
    @Override
    protected void TestarAlteracao(int chave) {
        System.out.println("Agora testando ALTERAÇÃO: ");
        PessoaFisica antigo = this.servico.Ler(chave);
        antigo.setEmail("OutroEmail@hotmail.com");
        PessoaFisica alterada = this.servico.Atualizar(antigo);
        System.out.println(alterada.toString());
    }
    
    @Override
    protected void TestarExclusao(int chave) {
        System.out.println("Agora testando EXCLUSÃO: ");
        PessoaFisica alvo = this.servico.Ler(chave);
        PessoaFisica excluido = this.servico.Deletar(alvo.getCodigoPessoa());
        System.out.println(excluido.toString());
    }
}
