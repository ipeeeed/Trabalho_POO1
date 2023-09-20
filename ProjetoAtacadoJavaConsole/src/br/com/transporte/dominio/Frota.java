package br.com.transporte.dominio;

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

    @Override
    public String toString() {
        return "Frota [" +
                "veiculos=" + veiculos +
                "codigo=" + codigoTransporte +
                ", descricao=" + descricaoTransporte +
                ", dataInsert" + dataInclusaoTransporte +
                "]";
    }

    @Override
    public void Imprimir() {
        System.out.println("--- Detalhes de Frotas ---");
        System.out.println("Veículos: " + veiculos);
        System.out.println("Código do Transporte: " + codigoTransporte);
        System.out.println("Descrição do Transporte: " + descricaoTransporte);
        System.out.println("Data de Inclusão do Transporte: " + dataInclusaoTransporte);
    }
}
