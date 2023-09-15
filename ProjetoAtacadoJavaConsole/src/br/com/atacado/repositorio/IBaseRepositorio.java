package br.com.atacado.repositorio;

import java.util.List;

public interface IBaseRepositorio<TRepos> {
    TRepos Create(TRepos obj);

    TRepos Read(int chave);

    List<TRepos> Read();

    TRepos Update(TRepos obj);

    TRepos Delete(int chave);
}