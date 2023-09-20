package br.com.pessoas.dominio;

import java.time.LocalDate;

public class PessoaFisica extends BasePessoa {
    protected String cpf;
    protected String rg;
    protected String sexoPessoaFisica;
    protected String racaPessoaFisica;
    protected String nacionalidadePessoaFisica;
    protected String naturalidadePessoaFisica;
    protected String nomePai;
    protected String nomeMae;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexoPessoaFisica;
    }

    public void setSexo(String sexo) {
        this.sexoPessoaFisica = sexo;
    }

    public String getRaca() {
        return racaPessoaFisica;
    }

    public void setRaca(String raca) {
        this.racaPessoaFisica = raca;
    }

    public String getNacionalidade() {
        return nacionalidadePessoaFisica;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidadePessoaFisica = nacionalidade;
    }

    public String getNaturalidade() {
        return naturalidadePessoaFisica;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidadePessoaFisica = naturalidade;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public PessoaFisica() {
    }

    public PessoaFisica(int codigoPessoa, String nome, String email, String site, LocalDate dataInclusao, String cpf,
            String rg, String sexo, String raca, String nacionalidade, String naturalidade, String nomePai,
            String nomeMae) {
        super(codigoPessoa, nome, email, site, dataInclusao);
        this.cpf = cpf;
        this.rg = rg;
        this.sexoPessoaFisica = sexo;
        this.racaPessoaFisica = raca;
        this.nacionalidadePessoaFisica = nacionalidade;
        this.naturalidadePessoaFisica = naturalidade;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
    }
    
    @Override
    public String toString() {
        return "PessoaFisica [" +
                "codigoPessoa=" + codigoPessoa +
                ", nome=" + nomePessoa +
                ", email=" + emailPessoa +
                ", site=" + sitePessoa +
                ", dataInclusao=" + dataInclusaoPessoa +
                ", cpf=" + cpf +
                ", rg=" + rg +
                ", sexo=" + sexoPessoaFisica +
                ", raca=" + racaPessoaFisica +
                ", nacionalidade=" + nacionalidadePessoaFisica +
                ", naturalidade=" + naturalidadePessoaFisica +
                ", nomePai=" + nomePai +
                ", nomeMae=" + nomeMae +
                "]";
            }
    
        @Override
        public void Imprimir() {
            System.out.println("-- Detalhes da Pessoa Física --");
            System.out.println("Código da Pessoa: " + this.codigoPessoa);
            System.out.println("Nome: " + this.nomePessoa);
            System.out.println("E-mail: " + this.emailPessoa);
            System.out.println("Site: " + this.sitePessoa);
            System.out.println("Data de Inclusão: " + this.dataInclusaoPessoa);
            System.out.println("CPF: " + this.cpf);
            System.out.println("RG: " + this.rg);
            System.out.println("Sexo: " + this.sexoPessoaFisica);
            System.out.println("Raça: " + this.racaPessoaFisica);
            System.out.println("Nacionalidade: " + this.nacionalidadePessoaFisica);
            System.out.println("Naturalidade: " + this.naturalidadePessoaFisica);
            System.out.println("Nome do Pai: " + this.nomePai);
            System.out.println("Nome da Mãe: " + this.nomeMae);
        }
}