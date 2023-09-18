package br.com.pessoas.fakeDB;

import java.time.LocalDate;

import br.com.pessoas.dominio.Funcionario;

public class FuncionarioFakeDB extends BaseFakeDB<Funcionario> {

    @Override
    public void AutoFill() {
        this.tabela.add(new Funcionario(1, "Pedro Henrique Matos dos Santos", "pedromatos2012@gmail.com", "github.com/ipeeeed", LocalDate.now(), "46815095827", "Num lembro", "M", "Branco", "Brasileira", "Mato Grosso do Sul", "Helder Alves dos Santos", "Cleyoana Beatriz de Souza Matos", "8502", "pedro.santos", "123", LocalDate.now()));
        this.tabela.add(new Funcionario(2, "Raquel dos Santos Silva", "raquel@gmail.com", "github.com/quelb", LocalDate.now(), "12345678900", "num sei", "F", "Parda", "Brasileira", "Mato Grosso do Sul", "", "Maria Aparecida", "8501", "raquel.santos", "301016", LocalDate.now()));
    }
    
}
