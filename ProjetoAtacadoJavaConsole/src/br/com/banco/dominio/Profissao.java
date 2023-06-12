package br.com.banco.dominio;

import java.time.LocalDate;

public class Profissao extends BaseAtributos {
    public Profissao() {
    }
    
    public Profissao(int codigo, String descricao, LocalDate dataInclusao, Boolean ativo) {
        super(codigo, descricao, dataInclusao, ativo);
    }

    @Override
    public String toString() {
        return "Profissao [codigo=" + codigo + 
        ", descricao=" + descricao + 
        ", dataInclusao=" + dataInclusao + 
        ", ativo=" + ativo + 
        "]";
    }
}
