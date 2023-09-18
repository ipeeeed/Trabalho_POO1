package br.com.transporte.fakeDB;

import java.time.LocalDate;
import br.com.transporte.dominio.Frota;

public class FrotaFakeDB extends BaseFakeDB<Frota> {

    @Override
    public void AutoFill() {
        this.tabela.add(new Frota(1, "Carros da Renaul", LocalDate.now(), null));
        this.tabela.add(new Frota(2, "Carros da Hyundai", LocalDate.now(), null));

    }    
}
