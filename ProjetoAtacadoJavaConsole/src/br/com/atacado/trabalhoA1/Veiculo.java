package br.com.atacado.trabalhoA1;

import java.time.LocalDate;

public class Veiculo extends BaseTransporte {
    private int codigoFrota;
    private String placa;
    
    public int getCodigoFrota() {
        return codigoFrota;
    }
    
    public void setCodigoFrota(int codigoFrota) {
        this.codigoFrota = codigoFrota;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public Veiculo() {
        super();
    }

    public Veiculo(int codigo, String descricao, LocalDate dataInsert, int codigoFrota, String placa) {
        super(codigo, descricao, dataInsert);
        this.codigoFrota = codigoFrota;
        this.placa = placa;
    }
}
