package br.com.banco.fakeDB;

import java.time.LocalDate;

import br.com.banco.dominio.InstituicaoBancaria;

public class InstituicaoBancariaFakeDB extends BaseFakeDB<InstituicaoBancaria> {

    @Override
    public void AutoFill() {
        this.tabela.add(new InstituicaoBancaria(1, "NU", LocalDate.now(), true, 001, "www.nu.com.br"));
        this.tabela.add(new InstituicaoBancaria(2, "BrasilBank", LocalDate.now(), true, 033, "www.bb.com.br"));
        this.tabela.add(new InstituicaoBancaria(3, "BOX", LocalDate.now(), true, 404, "www.caixa.com.br"));
    }
    
}
