package br.com.atacado.dominio;

import java.time.LocalDate;

public class PessoaFisica extends BasePessoa {

    protected String cpf;
    protected String rg;
    protected String sexo;
    protected String raca;
    protected String nacionalidade;
    protected String naturalidade;
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
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
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

    public PessoaFisica(int codigoPessoa, String nome, String email, String site, LocalDate dataInclusao, String cpf,
            String rg, String sexo, String raca, String nacionalidade, String naturalidade, String nomePai,
            String nomeMae) {
        super(codigoPessoa, nome, email, site, dataInclusao);
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.raca = raca;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
    }

    @Override
    public void Imprimir() {

        System.out.println("=========================================================================");
        System.out.println("PESSOA FISICA");
        System.out.println("=========================================================================");
        System.out.println("");
        System.out.println("Codigo da pessoa: " + this.codigoPessoa);
        System.out.println("Nome da pessoa: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Site: " + this.site);
        System.out.println("Data de inclusão: " + this.dataInclusao);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Rg: " + this.rg);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Raça: " + this.raca);
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println("Naturalidade: " + this.naturalidade);
        System.out.println("Nome do pai: " + this.nomePai);
        System.out.println("Nome da mãe: " + this.nomeMae);
        System.out.println("");
        System.out.println("=========================================================================");

    }

    @Override
    public String toString() {
        return "PessoaFisica [" +
                "codigoPessoa=" + codigoPessoa +
                ", nome=" + nome +
                ", email=" + email +
                ", site=" + site +
                ", dataInclusao=" + dataInclusao +
                ", cpf=" + cpf +
                ", rg=" + rg +
                ", sexo=" + sexo +
                ", raca=" + raca +
                ", nacionalidade=" + nacionalidade +
                ", naturalidade=" + naturalidade +
                ", nomePai=" + nomePai +
                ", nomeMae=" + nomeMae + "]";
    }
}
