package br.com.atacado.trabalhoA1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseTransporte {
    protected int codigo;
    protected String descricao;
    protected LocalDate dataInsert;
    protected List<Frota> frota = new ArrayList<>();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInsert() {
        return dataInsert;
    }

    public void setDataInsert(LocalDate dataInsert) {
        this.dataInsert = dataInsert;
    }

    public List<Frota> getFrota() {
        return frota;
    }

    public void setFrota(List<Frota> frota) {
        this.frota = frota;
    }

    public BaseTransporte() {
        super();
    }

    public BaseTransporte(int codigo, String descricao, LocalDate dataInsert) {
        super();
        this.codigo = codigo;
        this.descricao = descricao;
        this.dataInsert = dataInsert;
    }
}