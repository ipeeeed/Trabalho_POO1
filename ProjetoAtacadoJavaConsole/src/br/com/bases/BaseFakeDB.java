package br.com.bases;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseFakeDB<TBase> {
    protected List<TBase> tabela;

    public List<TBase> getTabela() {
        // singleton = é um padrão de design pattern que garante que a classe tenha apenas uma instância de si mesma e que forneça um ponto global de acesso a ela
        if (this.tabela == null) {
            this.tabela = new ArrayList<TBase>();
            this.AutoFill();
        }
        return this.tabela;
    }

    public abstract void AutoFill();
}
