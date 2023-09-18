package br.com.pessoas.fakeDB;

import java.time.LocalDate;

import br.com.pessoas.dominio.PessoaFisica;

public class PessoaFisicaFakeDB extends BaseFakeDB<PessoaFisica> {

    @Override
    public void AutoFill() {
        this.tabela.add(new PessoaFisica(1, "Pedro Henrique Matos dos Santos", "pedro_matos2012@hotmail.com", "github.com/ipeeeed", LocalDate.now(), "46815095827", "?", "M", "Branco", "Brasileiro", "Mato Grosso do Sul", "Helder Alves dos Santos", "Cleyoana Beatriz de Souza Matos"));
    }
}
