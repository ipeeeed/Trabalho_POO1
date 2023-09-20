package br.com.transporte.dominio;

import java.time.LocalDate;

public class Veiculo extends BaseTransporte {
    private int codigoFrota;
    private String placaVeiculo;
    
    public int getCodigoFrota() {
        return codigoFrota;
    }
    
    public void setCodigoFrota(int codigoFrota) {
        this.codigoFrota = codigoFrota;
    }
    
    public String getPlaca() {
        return placaVeiculo;
    }

    public void setPlaca(String placa) {
        this.placaVeiculo = placa;
    }
    
    public Veiculo() {
    }

    public Veiculo(int codigo, String descricao, LocalDate dataInsert, int codigoFrota, String placa) {
        super(codigo, descricao, dataInsert);
        this.codigoFrota = codigoFrota;
        this.placaVeiculo = placa;
    }

    @Override
    public String toString() {
        return "Veiculo [" +
                "codigoFrota=" + codigoFrota +
                ", placaVeiculo=" + placaVeiculo +
                ", codigo=" + codigoFrota +
                ", descricao=" + descricaoTransporte +
                ", dataInsert" + dataInclusaoTransporte +
                "]";
    }

    @Override
    public void Imprimir() {
        
    }
}
