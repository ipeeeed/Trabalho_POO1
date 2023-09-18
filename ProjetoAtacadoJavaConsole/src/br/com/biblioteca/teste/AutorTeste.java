package br.com.biblioteca.teste;

import java.time.LocalDate;
import java.util.List;
import br.com.biblioteca.dominio.Autor;
import br.com.biblioteca.servico.AutorServico;

public class AutorTeste extends BaseTeste<Autor> {
    public AutorTeste() {
        this.servico = new AutorServico();
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
        Autor autor = new Autor(4, "", LocalDate.now(), "Novo Autor", "Algum aê");
        Autor novo = this.servico.Criar(autor);
        System.out.println(novo.toString());
        return novo.getCodigo();
    }

    @Override
    protected void TestarLeitura(int chave) {
        System.out.println("Agora testando LEITURA: ");
        Autor autor = this.servico.Ler(chave);
        System.out.println(autor.toString());
    }

    @Override
    protected void TestarLeituraVarios() {
        List<Autor> lista = this.servico.Ler();
        for (Autor autor : lista) {
            System.out.println(autor.toString());
        }
    }

    @Override
    protected void TestarAlteracao(int chave) {
        System.out.println("Agora testando ALTERAÇÃO: ");
        Autor antigo = this.servico.Ler(chave);
        antigo.setDescricao("Outra descrição aí");
        Autor alterada = this.servico.Atualizar(antigo);
        System.out.println(alterada.toString());
    }

    @Override
    protected void TestarExclusao(int chave) {
        System.out.println("Agora testando EXCLUSÃO: ");
        Autor alvo = this.servico.Ler(chave);
        Autor excluido = this.servico.Deletar(alvo.getCodigo());
        System.out.println(excluido.toString());
    }    
}
