package br.com.atacado.teste;

import java.time.LocalDate;
import java.util.List;
import br.com.atacado.dominio.Subcategoria;
import br.com.atacado.servico.SubcategoriaServico;

public class SubcategoriaTeste extends BaseTeste<Subcategoria> {
    public SubcategoriaTeste() {
        this.servico = new SubcategoriaServico();
    }

    @Override
    public void Executar() {
        int valorChave = this.TestarCriacao();
        this.TestarAlteracao(valorChave);
        this.TestarExclusao(valorChave);
        // this.TestarLeitura(valorChave);
        // this.TestarLeituraVarios();
    }

    @Override
    protected int TestarCriacao() {
        System.out.println("Agora testando criação: ");
        Subcategoria sub = new Subcategoria(0, "Bandeja de Prata", LocalDate.now(), 0);
        Subcategoria novo = this.servico.Criar(sub);
        System.out.println(novo.toString());
        return novo.getCodigo();
    }

    @Override
    protected void TestarLeitura(int chave) {
        Subcategoria sub = this.servico.Ler(chave);
        System.out.println(sub.toString());
    }

    @Override
    protected void TestarLeituraVarios() {
        List<Subcategoria> list = this.servico.Ler();
        for (Subcategoria sub : list) {
            System.out.println(sub.toString());
        }
    }

    @Override
    protected void TestarAlteracao(int chave) {
        System.out.println("Agora testando alteração: ");
        Subcategoria antigo = this.servico.Ler(chave);
        antigo.setDescricao("Copos de Plastico");
        Subcategoria alterada = this.servico.Atualizar(antigo);
        System.out.println(alterada.toString());

    }

    @Override
    protected void TestarExclusao(int chave) {
        System.out.println("Agora testando exclusão: ");
        Subcategoria alvo = this.servico.Ler(chave);
        Subcategoria excluido = this.servico.Deletar(alvo.getCodigo());
        System.out.println(excluido.toString());
    }
}
