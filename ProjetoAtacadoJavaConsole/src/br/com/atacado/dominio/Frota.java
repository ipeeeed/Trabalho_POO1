package br.com.atacado.dominio;

import java.time.LocalDate;
import java.util.List;

public class Frota extends BaseTransporte {
    private List<Veiculo> veiculos;

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public Frota() {
    }

    public Frota(int codigo, String descricao, LocalDate dataInsert, List<Veiculo> veiculos) {
        super(codigo, descricao, dataInsert);
        this.veiculos = veiculos;
    }
}
