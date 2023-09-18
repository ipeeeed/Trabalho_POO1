package br.com.transporte.fakeDB;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseFakeDB<TBase> {
    protected List<TBase> tabela;

    public List<TBase> getTabela() {
        if (this.tabela == null) {
            this.tabela = new ArrayList<TBase>();
            this.AutoFill();
        }
        return this.tabela;
    }

    public abstract void AutoFill();
}
