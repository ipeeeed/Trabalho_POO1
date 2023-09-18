package br.com.transporte.teste;

import java.time.LocalDate;
import java.util.List;
import br.com.transporte.dominio.Veiculo;
import br.com.transporte.servico.VeiculoServico;

public class VeiculoTeste extends BaseTeste<Veiculo> {
    public VeiculoTeste() {
        this.servico = new VeiculoServico();
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
        Veiculo veiculo = new Veiculo(4, "Volkswager Gol - Vermelho", LocalDate.now(), 3, "ool-7864");
        Veiculo novoVeiculo = this.servico.Criar(veiculo);
        System.out.println(novoVeiculo.toString());
        return novoVeiculo.getCodigo();
    }
    
    @Override
    protected void TestarLeitura(int chave) {
        System.out.println("Agora testando LEITURA: ");
        Veiculo veiculo = this.servico.Ler(chave);
        System.out.println(veiculo.toString());
    }
    
    @Override
    protected void TestarLeituraVarios() {
        List<Veiculo> lista = this.servico.Ler();
        for (Veiculo veiculo : lista) {
            System.out.println(veiculo.toString());
        }
    }
    
    @Override
    protected void TestarAlteracao(int chave) {
        System.out.println("Agora testando ALTERAÇÃO: ");
        Veiculo antigo = this.servico.Ler(chave);
        antigo.setDescricao("NovoCarro");
        Veiculo alterada = this.servico.Atualizar(antigo);
        System.out.println(alterada.toString());
    }
    
    @Override
    protected void TestarExclusao(int chave) {
        System.out.println("Agora testando EXCLUSÃO: ");
        Veiculo alvo = this.servico.Ler(chave);
        Veiculo excluido = this.servico.Deletar(alvo.getCodigo());
        System.out.println(excluido.toString());
    }
}
