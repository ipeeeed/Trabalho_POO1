package br.com.transporte.servico;

import java.util.List;

public interface IBaseServico<TService> {
    TService Criar(TService obj);
    TService Ler(int chave);
    List<TService> Ler();
    TService Atualizar(TService obj);
    TService Deletar(int chave);
}
