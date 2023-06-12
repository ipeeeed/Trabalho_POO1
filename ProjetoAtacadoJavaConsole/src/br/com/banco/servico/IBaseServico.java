package br.com.banco.servico;

import java.util.List;

public interface IBaseServico<TService> {
    TService Criar(TService obj);
    TService Ler(int chave);
    List<TService> Ler();
    TService Atualiza(TService obj);
    TService Deletar(int chave);
}
