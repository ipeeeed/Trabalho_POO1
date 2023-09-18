package br.com.biblioteca.fakeDB;

import java.time.LocalDate;

import br.com.biblioteca.dominio.Colecao;

public class ColecaoFakeDB extends BaseFakeDB<Colecao> {

    @Override
    public void AutoFill() {
        this.tabela.add(new Colecao(1, "", LocalDate.now(), "Leya"));
        this.tabela.add(new Colecao(2, "", LocalDate.now(), "HarperCollins"));
        this.tabela.add(new Colecao(3, "", LocalDate.now(), "Rocco"));
    }
    
}
