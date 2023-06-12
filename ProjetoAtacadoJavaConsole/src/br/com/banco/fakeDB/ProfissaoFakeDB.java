package br.com.banco.fakeDB;

import java.time.LocalDate;

import br.com.banco.dominio.Profissao;

public class ProfissaoFakeDB extends BaseFakeDB<Profissao> {

    @Override
    public void AutoFill() {
        this.tabela.add(new Profissao(1, "Caixa", LocalDate.now(), true));
        this.tabela.add(new Profissao(2, "Gerente", LocalDate.now(), true));
        this.tabela.add(new Profissao(3, "Atendente", LocalDate.now(), true));
        this.tabela.add(new Profissao(4, "Seguranca", LocalDate.now(), true));
    }
}
