package br.com.transporte.fakeDB;

import java.time.LocalDate;

import br.com.bases.BaseFakeDB;
import br.com.transporte.dominio.Veiculo;

public class VeiculoFakeDB extends BaseFakeDB<Veiculo> {

    @Override
    public void AutoFill() {
        this.tabela.add(new Veiculo(1, "Renault Logan - Prata", LocalDate.now(), 1, "oon-1416"));
        this.tabela.add(new Veiculo(2, "Renault Sandero - Branco", LocalDate.now(), 1, "ool-1915"));
        this.tabela.add(new Veiculo(3, "Hyundai - Prata", LocalDate.now(), 2, "ool-3245"));
    }

    
}
