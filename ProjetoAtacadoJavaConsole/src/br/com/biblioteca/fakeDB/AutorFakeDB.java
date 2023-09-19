package br.com.biblioteca.fakeDB;

import java.time.LocalDate;

import br.com.bases.BaseFakeDB;
import br.com.biblioteca.dominio.Autor;

public class AutorFakeDB extends BaseFakeDB<Autor> {

    @Override
    public void AutoFill() {
        this.tabela.add(new Autor(1, "", LocalDate.now(), "George R. R.", "Martin", 1));
        this.tabela.add(new Autor(2, "", LocalDate.now(), "J. R. R.", "Tolkien", 2));
        this.tabela.add(new Autor(3, "", LocalDate.now(), "J. K.", "Rowling", 3));
    }
}
