import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.atacado.dominio.*;

public class App {
    public static void main(String[] args) throws Exception {
        Categoria c1 = new Categoria(1,
                "Laticinios",
                LocalDate.now());

        Subcategoria s1 = new Subcategoria(1,
                1,
                "Queijos",
                LocalDate.now());

        Subcategoria s2 = new Subcategoria(2,
                1,
                "Iogurte",
                LocalDate.now());

        Produto p1 = new Produto(1,
                1,
                "Mussarela",
                45.5,
                LocalDate.now());

        Produto p2 = new Produto(2,
                1,
                "Provolone",
                50.75,
                LocalDate.now());

        Produto p3 = new Produto(3,
                2,
                "Grego",
                7.25,
                LocalDate.now());

        Produto p4 = new Produto(4,
                2,
                "Natural",
                5.45,
                LocalDate.now());

        List<Produto> prods1 = new ArrayList<>();
        List<Produto> prods2 = new ArrayList<>();

        prods1.add(p1);
        prods1.add(p2);
        s1.setProdutos(prods1);

        prods2.add(p3);
        prods2.add(p4);
        s2.setProdutos(prods2);

        List<Subcategoria> subs = new ArrayList<>();
        subs.add(s1);
        subs.add(s2);

        c1.setSubcategorias(subs);

    }
}
