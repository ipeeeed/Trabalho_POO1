package br.com.pessoas.teste;

import java.time.LocalDate;
import java.util.List;

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
        Funcionario funcionario = new Funcionario(1, "Hamilton", "hmil@gmail.com", "não tem", LocalDate.now(), "12398764537", "454879", "M", "Pardo", "Brasileiro", "São Paulo", "Emanoel Freitas", "Gisele Bintin", "454687823", "hmiltom", "bgbgalsd123", LocalDate.now());
        Funcionario novo = this.servico.Criar(funcionario);
        System.out.println(novo.toString());
        return novo.getCodigoPessoa();
    }
    
    @Override
    protected void TestarLeitura(int chave) {
        System.out.println("Agora testando LEITURA: ");
        Funcionario funcionario = this.servico.Ler(chave);
        System.out.println(funcionario.toString());
    }
    
    @Override
    protected void TestarLeituraVarios() {
        List<Funcionario> lista = this.servico.Ler();
        for (Funcionario funcionario : lista) {
            System.out.println(funcionario.toString());
        }
    }
    
    @Override
    protected void TestarAlteracao(int chave) {
        System.out.println("Agora testando ALTERAÇÃO: ");
        Funcionario antigo = this.servico.Ler(chave);
        antigo.setLogin("Algum aí");
        antigo.setSenha("senha123");
        Funcionario alterada = this.servico.Atualizar(antigo);
        System.out.println(alterada.toString());
    }
    
    @Override
    protected void TestarExclusao(int chave) {
        System.out.println("Agora testando EXCLUSÃO: ");
        Funcionario alvo = this.servico.Ler(chave);
        Funcionario excluido = this.servico.Deletar(alvo.getCodigoPessoa());
        System.out.println(excluido.toString());
    }
}
