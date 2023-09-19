package br.com.biblioteca.teste;

import java.time.LocalDate;
import java.util.List;

import br.com.bases.BaseTeste;
import br.com.biblioteca.dominio.Livro;
import br.com.biblioteca.servico.LivroServico;

public class LivroTeste extends BaseTeste<Livro> {
    public LivroTeste() {
        this.servico = new LivroServico();
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
        System.out.println("agora testando CRIAÇÃO: ");
        Livro livro = new Livro(1, "Livro novo do Harry Potter", LocalDate.now(), "123456987", 3, "Harry Potter e a Criança Amaldiçoada");
        Livro novo = this.servico.Criar(livro);
        System.out.println(novo.toString());
        return novo.getCodigo();
    }

    @Override
    protected void TestarLeitura(int chave) {
        System.out.println("agora testando LEITURA: ");
        Livro livro = this.servico.Ler(chave);
        System.out.println(livro.toString());
    }

    @Override
    protected void TestarLeituraVarios() {
        List<Livro> lista = this.servico.Ler();
        for (Livro livro : lista) {
            System.out.println(livro.toString());
        }
    }

    @Override
    protected void TestarAlteracao(int chave) {
        System.out.println("agora testando ALTERAÇÃO: ");
        Livro antigo = this.servico.Ler(chave);
        antigo.setDescricao("Livro do Martin que não lança a anos");
        Livro alterada = this.servico.Atualizar(antigo);
        System.out.println(alterada.toString());
    }

    @Override
    protected void TestarExclusao(int chave) {
        System.out.println("agora testando EXCLUSÃO: ");
        Livro alvo = this.servico.Ler(chave);
        Livro excluido = this.servico.Deletar(alvo.getCodigo());
        System.out.println(excluido.toString());
    }
}
