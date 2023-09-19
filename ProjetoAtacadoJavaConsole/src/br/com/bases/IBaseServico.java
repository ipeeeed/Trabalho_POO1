package br.com.bases;

import java.util.List;

public interface IBaseServico<TServico> {
    TServico Criar(TServico obj);
    TServico Ler(int chave);
    List<TServico> Ler();
    TServico Atualizar(TServico obj);
    TServico Deletar(int chave);
}
