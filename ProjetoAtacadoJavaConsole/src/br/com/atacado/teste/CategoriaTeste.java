package br.com.atacado.teste;

import java.time.LocalDate;
import java.util.List;
import br.com.atacado.dominio.Categoria;
import br.com.atacado.servico.CategoriaServico;

public class CategoriaTeste extends BaseTeste<Categoria> {
    public CategoriaTeste() {
        this.servico = new CategoriaServico();
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
        Categoria cat = new Categoria(0, "Bandeja", LocalDate.now());
        Categoria novo = this.servico.Criar(cat);
        System.out.println(novo.toString());
        return novo.getCodigo();
    }

    @Override
    protected void TestarLeitura(int chave) {
        System.out.println("Agora testando LEITURA: ");
        Categoria cat = this.servico.Ler(chave);
        System.out.println(cat.toString());
    }

    @Override
    protected void TestarLeituraVarios() {
        List<Categoria> lista = this.servico.Ler();
        for (Categoria cat : lista) {
            System.out.println(cat.toString());
        }
    }

    @Override
    protected void TestarAlteracao(int chave) {
        System.out.println("Agora testando ALTERAÇÃO: ");
        Categoria antigo = this.servico.Ler(chave);
        antigo.setDescricao("Granadas de mão");
        Categoria alterada = this.servico.Atualizar(antigo);
        System.out.println(alterada.toString());
    }

    @Override
    protected void TestarExclusao(int chave) {
        System.out.println("Agora testando EXCLUSÃO: ");
        Categoria alvo = this.servico.Ler(chave);
        Categoria excluido = this.servico.Deletar(alvo.getCodigo());
        System.out.println(excluido.toString());
    }
}
