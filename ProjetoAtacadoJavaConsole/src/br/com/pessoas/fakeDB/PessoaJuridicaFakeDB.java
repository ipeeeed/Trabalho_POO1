package br.com.pessoas.fakeDB;

import java.time.LocalDate;

import br.com.bases.BaseFakeDB;
import br.com.pessoas.dominio.PessoaJuridica;

public class PessoaJuridicaFakeDB extends BaseFakeDB<PessoaJuridica> {

    @Override
    public void AutoFill() {
        this.tabela.add(new PessoaJuridica(3, "Empresa", "empresa@gmail.com", "www.empresa.com.br", LocalDate.now(), "456878946540001", "7876546577", "7878785454545", "EmpresaQualquerAí"));
    }
    
}
