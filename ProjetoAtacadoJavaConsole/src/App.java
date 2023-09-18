import br.com.atacado.teste.*;
import br.com.banco.teste.*;
import br.com.biblioteca.teste.*;
import br.com.pessoas.teste.*;
import br.com.transporte.teste.*;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("\nTESTE ATACADO");
        CategoriaTeste categoriaTeste = new CategoriaTeste();
        categoriaTeste.Executar();
        SubcategoriaTeste subcategoriaTeste = new SubcategoriaTeste();
        subcategoriaTeste.Executar();
        ProdutoTeste produtoTeste = new ProdutoTeste();
        produtoTeste.Executar();
        
        System.out.println("\nTESTE BANCO");
        InstituicaoBancariaTeste instituicaoBancariaTeste = new InstituicaoBancariaTeste();
        instituicaoBancariaTeste.Executar();
        ProfissaoTeste profissaoTeste = new ProfissaoTeste();
        profissaoTeste.Executar();
        
        System.out.println("\nTESTE BIBLIOTECA");
        AutorTeste autorTeste = new AutorTeste();
        autorTeste.Executar();
        ColecaoTeste colecaoTeste = new ColecaoTeste();
        colecaoTeste.Executar();
        LivroTeste livroTeste = new LivroTeste();
        livroTeste.Executar();

        System.out.println("\nTESTE PESSOAS");
        FuncionarioTeste funcionarioTeste = new FuncionarioTeste();
        funcionarioTeste.Executar();
        PessoaFisicaTeste pessoaFisicaTeste = new PessoaFisicaTeste();
        pessoaFisicaTeste.Executar();
        PessoaJuridicaTeste pessoaJuridicaTeste = new PessoaJuridicaTeste();
        pessoaJuridicaTeste.Executar();

        System.out.println("\nTESTE TRANSPORTE");

    }
}