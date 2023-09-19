package br.com.bases;

import java.util.List;

public abstract class BaseRepositorio<TRepositorio> implements IBaseRepositorio<TRepositorio> {
    protected List<TRepositorio> tabela;

    @Override
    public List<TRepositorio> Read() {
        return this.tabela;
    }

    @Override
    public TRepositorio Delete(int chave) {
        TRepositorio original = this.Read(chave);
        if (original != null) {
            this.tabela.remove(original);
        }
        return original;
    }    
}
