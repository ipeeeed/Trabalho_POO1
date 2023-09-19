package br.com.bases;

import java.util.List;

public interface IBaseRepositorio<TRepositorio> {
    TRepositorio Create(TRepositorio obj);
    TRepositorio Read(int chave);
    List<TRepositorio> Read();
    TRepositorio Update(TRepositorio obj);
    TRepositorio Delete(int chave);
}
