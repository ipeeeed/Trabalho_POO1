package br.com.biblioteca.fakeDB;

import br.com.biblioteca.dominio.Colecao;

public class ColecaoFakeDB extends BaseFakeDB<Colecao> {

    @Override
    public void AutoFill() {
        this.tabela.add();
    }
    
}
