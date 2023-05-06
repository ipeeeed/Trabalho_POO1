package br.com.atacado.repositorio;

public interface IBaseRepositorio<TTipo> {
    TTipo Create(TTipo obj);

    TTipo Read(TTipo obj);

    List<TTipo> Read();

    TTipo Update(TTipo obj);

    TTipo Delete(int Chave);
}
