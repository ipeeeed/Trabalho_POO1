package br.com.transporte.repositorio;

import br.com.bases.BaseRepositorio;
import br.com.transporte.dominio.Veiculo;
import br.com.transporte.fakeDB.VeiculoFakeDB;

public class VeiculoRepositorio extends BaseRepositorio<Veiculo> {
    public VeiculoRepositorio() {
        this.tabela = new VeiculoFakeDB().getTabela();
    }

    @Override
    public Veiculo Create(Veiculo obj) {
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
    public Veiculo Read(int chave) {
        Veiculo veiculo = new Veiculo();
        for (Veiculo tupla : tabela) {
            if (tupla.getCodigo() == chave) {
                veiculo = tupla;
            } else {
                veiculo = null;
            }
        }
        return veiculo;
    }

    @Override
    public Veiculo Update(Veiculo obj) {
        Veiculo alteracao = this.Read(obj.getCodigo());
        if (alteracao != null) {
            alteracao.setDescricao(obj.getDescricao());
        }
        return alteracao;
    }
    
}
