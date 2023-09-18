package br.com.transporte.teste;

import java.time.LocalDate;
import java.util.List;

import br.com.transporte.dominio.Frota;
import br.com.transporte.servico.FrotaServico;

public class FrotaTeste extends BaseTeste<Frota> {
    public FrotaTeste() {
        this.servico = new FrotaServico();
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
        Frota frota = new Frota(3, "Carros da Volkswager", LocalDate.now(), null);
        Frota novaFrota = this.servico.Criar(frota);
        System.out.println(novaFrota.toString());
        return novaFrota.getCodigo();
    }
    
    @Override
    protected void TestarLeitura(int chave) {
        System.out.println("Agora testando LEITURA: ");
        Frota frota = this.servico.Ler(chave);
        System.out.println(frota.toString());
    }
    
    @Override
    protected void TestarLeituraVarios() {
        List<Frota> lista = this.servico.Ler();
        for (Frota frota : lista) {
            System.out.println(frota.toString());
        }
    }
    
    @Override
    protected void TestarAlteracao(int chave) {
        System.out.println("Agora testando ALTERAÇÃO: ");
        Frota antiga = this.servico.Ler(chave);
        antiga.setDescricao("Nova Frota de carros");
        Frota alterada = this.servico.Atualizar(antiga);
        System.out.println(alterada.toString());
    }
    
    @Override
    protected void TestarExclusao(int chave) {
        System.out.println("Agora testando EXCLUSÃO: ");
        Frota alvo = this.servico.Ler(chave);
        Frota excluido = this.servico.Deletar(alvo.getCodigo());
        System.out.println(excluido.toString());
    }
}
