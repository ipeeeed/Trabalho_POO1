package br.com.transporte.repositorio;

import java.util.List;

public abstract class BaseRepositorio<TRepos> implements IBaseRepositorio<TRepos> {
    protected List<TRepos> tabela;
    
    @Override
    public List<TRepos> Read() {
        return this.tabela;
    }

    @Override
    public TRepos Delete(int chave) {
        TRepos original = this.Read(chave);
        if (original != null) {
            this.tabela.remove(original);
        }
        return original;
    }
}
