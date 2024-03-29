package br.com.atacado.teste;

import java.time.LocalDate;
import java.util.List;
import br.com.atacado.dominio.Produto;
import br.com.atacado.servico.ProdutoServico;
import br.com.bases.BaseTeste;

public class ProdutoTeste extends BaseTeste<Produto> {
    public ProdutoTeste() {
        this.servico = new ProdutoServico();
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
        Produto prd = new Produto(1, 1, 1, "Papona", LocalDate.now());
        Produto novo = this.servico.Criar(prd);
        System.out.println(novo.toString());
        return novo.getCodigo();
    }

    @Override
    protected void TestarLeitura(int chave) {
        System.out.println("Agora testando LEITURA: ");
        Produto prd = this.servico.Ler(chave);
        System.out.println(prd.toString());
    }

    @Override
    protected void TestarLeituraVarios() {
        List<Produto> lista = this.servico.Ler();
        for (Produto prd : lista) {
            System.out.println(prd.toString());
        }
    }

    @Override
    protected void TestarAlteracao(int chave) {
        System.out.println("Agora testando ALTERAÇÃO: ");
        Produto antigo = this.servico.Ler(chave);
        antigo.setDescricao("Mingal");
        Produto alterada = this.servico.Atualizar(antigo);
        System.out.println(alterada.toString());
    }

    @Override
    protected void TestarExclusao(int chave) {
        System.out.println("Agora testando EXCLUSÃO: ");
        Produto alvo = this.servico.Ler(chave);
        Produto excluido = this.servico.Deletar(alvo.getCodigo());
        System.out.println(excluido.toString());
    }
}
