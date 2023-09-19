package br.com.banco.dominio;

import java.time.LocalDate;

public class Profissao extends BaseBanco {
    public Profissao() {
    }
    
    public Profissao(int codigo, String descricao, LocalDate dataInclusao, Boolean ativo) {
        super(codigo, descricao, dataInclusao, ativo);
    }

    @Override
    public String toString() {
        return "Profissao [codigoBanco=" + codigoBanco + 
        ", descricaoBanco=" + descricaoBanco + 
        ", dataInclusaoBanco=" + dataInclusaoBanco + 
        ", ativoBanco=" + ativoBanco + 
        "]";
    }

    @Override
    public void Imprimir() {
        System.out.println("--- Detalhes de Profissões ---");
        System.out.println("Código do Banco: " + codigoBanco);
        System.out.println("Descrição do Banco: " + descricaoBanco);
        System.out.println("Data de Inclusão do Banco: " + dataInclusaoBanco);
        System.out.println("Banco Ativo: " + ativoBanco);
    }
}
