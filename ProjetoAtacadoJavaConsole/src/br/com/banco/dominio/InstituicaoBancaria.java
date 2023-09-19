package br.com.banco.dominio;

import java.time.LocalDate;

public class InstituicaoBancaria extends BaseBanco {
    private int codigoInstituicaoBancaria;
    private String siteInstituicaoBancaria;

    public int getCodigo() {
        return codigoInstituicaoBancaria;
    }

    public void setCodigo(int codigoBanco) {
        this.codigoInstituicaoBancaria = codigoBanco;
    }

    public String getSite() {
        return siteInstituicaoBancaria;
    }

    public void setSite(String site) {
        this.siteInstituicaoBancaria = site;
    }

    public InstituicaoBancaria() {
    }

    public InstituicaoBancaria(int codigo, String descricao, LocalDate dataInclusao, Boolean ativo, int codigoBanco,
            String site) {
        super(codigo, descricao, dataInclusao, ativo);
        this.codigoInstituicaoBancaria = codigoBanco;
        this.siteInstituicaoBancaria = site;
    }

    @Override
    public String toString() {
        return "InstituicaoBancaria [codigoBanco=" + codigoBanco + 
        "codigo=" + codigoInstituicaoBancaria + 
        ", siteWWW=" + siteInstituicaoBancaria + 
        ", descricao=" + descricaoBanco + 
        ", dataInclusao=" + dataInclusaoBanco + 
        ", ativo=" + ativoBanco + 
        "]";
    }

    @Override
    public void Imprimir() {
        System.out.println("--- Detalhes de Instituições Bancarias ---");
        System.out.println("Código do Banco: " + codigoBanco);
        System.out.println("Código da Instituição Bancária: " + codigoInstituicaoBancaria);
        System.out.println("Site da Instituição Bancária: " + siteInstituicaoBancaria);
        System.out.println("Descrição do Banco: " + descricaoBanco);
        System.out.println("Data de Inclusão do Banco: " + dataInclusaoBanco);
        System.out.println("Banco Ativo: " + ativoBanco);
    }
}
