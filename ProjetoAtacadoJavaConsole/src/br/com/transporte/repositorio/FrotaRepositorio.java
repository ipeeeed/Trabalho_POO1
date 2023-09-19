package br.com.transporte.repositorio;

import br.com.bases.BaseRepositorio;
import br.com.transporte.dominio.Frota;
import br.com.transporte.fakeDB.FrotaFakeDB;

public class FrotaRepositorio extends BaseRepositorio<Frota> {
    public FrotaRepositorio() {
        this.tabela = new FrotaFakeDB().getTabela();
    }

    @Override
    public Frota Create(Frota obj) {
        int chave = 0;
        if (this.tabela.size() == 0) {
            chave++;
        } else {
            int tamanho = this.tabela.size();
            chave = this.tabela.get(tamanho - 1).getCodigo() + 1;
        }
        obj.setCodigo(chave);
        this.tabela.add(obj);
        return obj;
    }

    @Override
    public Frota Read(int chave) {
        Frota frota = new Frota();
        for (Frota tupla : tabela) {
            if (tupla.getCodigo() == chave) {
                frota = tupla;
            } else {
                frota = null;
            }
        }
        return frota;
    }

    @Override
    public Frota Update(Frota obj) {
        Frota alteracao = this.Read(obj.getCodigo());
        if (alteracao != null) {
            alteracao.setDescricao(obj.getDescricao());
        }
        return alteracao;
    }
    
}
