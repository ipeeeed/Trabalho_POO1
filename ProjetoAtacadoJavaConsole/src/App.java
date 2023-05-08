import br.com.atacado.teste.TesteCategoriaRepositorio;
import br.com.atacado.teste.TesteSubcategoriaRepositorio;
import br.com.atacado.teste.TesteProdutoRepositorio;

public class App {

    public static void main(String[] args) throws Exception {
        TesteCategoriaRepositorio teste1 = new TesteCategoriaRepositorio();
        teste1.Executar();

        TesteSubcategoriaRepositorio teste2 = new TesteSubcategoriaRepositorio();
        teste2.Executar();
        
        TesteProdutoRepositorio teste3 = new TesteProdutoRepositorio();
        teste3.Executar();
    }
}