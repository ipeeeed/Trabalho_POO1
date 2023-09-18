package br.com.pessoas.teste;

import br.com.pessoas.dominio.Funcionario;
import br.com.pessoas.servico.FuncionarioServico;

public class FuncionarioTeste extends BaseTeste<Funcionario> {
    public FuncionarioTeste() {
        this.servico = new FuncionarioServico();
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
        
        return 0;
    }
    
    @Override
    protected void TestarLeitura(int chave) {
        System.out.println("Agora testando LEITURA: ");
        
    }
    
    @Override
    protected void TestarLeituraVarios() {
        
    }
    
    @Override
    protected void TestarAlteracao(int chave) {
        System.out.println("Agora testando ALTERAÇÃO: ");
        
    }
    
    @Override
    protected void TestarExclusao(int chave) {
        System.out.println("Agora testando EXCLUSÃO: ");
        
    }
}
