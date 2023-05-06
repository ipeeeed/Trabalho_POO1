package br.com.atacado;

import br.com.atacado.fakeDB.*;

import br.com.atacado.dominio.*;

public class App {
        public static void main(String[] args) throws Exception {
                CategoriaFakeDB db = new CategoriaFakeDB();
                for (Categoria c : db.getTabela()) {
                        System.out.println(c.toString());
                }
                SubCategoriasFakeDB sb = new SubCategoriasFakeDB();
                for (Subcategoria s : sb.getTabela()) {
                        System.out.println(s.toString());
                }
                ProdutoFakeDB pd = new ProdutoFakeDB();
                for (Produto p : pd.getTabela()) {
                        System.out.println(p.toString());

                }
        }

}
