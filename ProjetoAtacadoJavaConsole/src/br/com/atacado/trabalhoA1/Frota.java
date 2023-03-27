package br.com.atacado.trabalhoA1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Frota extends BaseTransporte {
    private List<Veiculo> veiculos = new ArrayList<>();

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public Frota() {
        super();
    }

    public Frota(int codigo, String descricao, LocalDate dataInsert) {
        super(codigo, descricao, dataInsert);
    }
    
}
