package br.com.pessoas.dominio;

import java.time.LocalDate;

public class Funcionario extends PessoaFisica {
    private String matriculaFuncionario;
    private String loginFuncionario;
    private String senhaFuncionario;
    private LocalDate dataContratacaoFuncionario;

    public String getMatricula() {
        return matriculaFuncionario;
    }

    public void setMatricula(String matricula) {
        this.matriculaFuncionario = matricula;
    }

    public String getLogin() {
        return loginFuncionario;
    }

    public void setLogin(String login) {
        this.loginFuncionario = login;
    }

    public String getSenha() {
        return senhaFuncionario;
    }

    public void setSenha(String senha) {
        this.senhaFuncionario = senha;
    }

    public LocalDate getDataContratacao() {
        return dataContratacaoFuncionario;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacaoFuncionario = dataContratacao;
    }

    public Funcionario() {
    }

    public Funcionario(int codigoPessoa, String nome, String email, String site, LocalDate dataInclusao, String cpf,
            String rg, String sexo, String raca, String nacionalidade, String naturalidade, String nomePai,
            String nomeMae, String matricula, String login, String senha, LocalDate dataContratacao) {
        super(codigoPessoa, nome, email, site, dataInclusao, cpf, rg, sexo, raca, nacionalidade, naturalidade, nomePai,
                nomeMae);
        this.matriculaFuncionario = matricula;
        this.loginFuncionario = login;
        this.senhaFuncionario = senha;
        this.dataContratacaoFuncionario = dataContratacao;
    }

    @Override
    public String toString() {
        return "Funcionario [" +
                "codigoPessoa=" + codigoPessoa +
                ", nomePessoa=" + nomePessoa +
                ", emailPessoa=" + emailPessoa +
                ", sitePessoa=" + sitePessoa +
                ", dataInclusaoPessoa=" + dataInclusaoPessoa +
                ", cpf=" + cpf +
                ", rg=" + rg +
                ", sexoPessoaFisica=" + sexoPessoaFisica +
                ", racaPessoaFisica=" + racaPessoaFisica +
                ", nacionalidadePessoaFisica=" + nacionalidadePessoaFisica +
                ", naturalidadePessoaFisica=" + naturalidadePessoaFisica +
                ", nomePai=" + nomePai +
                ", nomeMae=" + nomeMae + 
                ", matriculaFuncionario=" + matriculaFuncionario +
                ", loginFuncionario=" + loginFuncionario +
                ", senhaFuncionario=" + senhaFuncionario +
                ", dataContratacaoFuncionario=" + dataContratacaoFuncionario + 
                "]";
    }

    @Override
    public void Imprimir() {
        System.out.println("--- Detalhes de Funcionários ---");
        System.out.println("Código da Pessoa: " + codigoPessoa);
        System.out.println("Nome: " + nomePessoa);
        System.out.println("Email: " + emailPessoa);
        System.out.println("Site: " + sitePessoa);
        System.out.println("Data de Inclusão: " + dataInclusaoPessoa);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Sexo: " + sexoPessoaFisica);
        System.out.println("Raça: " + racaPessoaFisica);
        System.out.println("Nacionalidade: " + nacionalidadePessoaFisica);
        System.out.println("Naturalidade: " + naturalidadePessoaFisica);
        System.out.println("Nome do Pai: " + nomePai);
        System.out.println("Nome da Mãe: " + nomeMae);
        System.out.println("Matrícula do Funcionário: " + matriculaFuncionario);
        System.out.println("Login do Funcionário: " + loginFuncionario);
        System.out.println("Senha do Funcionário:" + senhaFuncionario);
        System.out.println("Data da Contratação: " + dataContratacaoFuncionario);
        // super.Imprimir();
    }

    
}
