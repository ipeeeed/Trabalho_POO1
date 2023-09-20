package br.com.pessoas.teste;

import java.time.LocalDate;
import java.util.List;

import br.com.bases.BaseTeste;
import br.com.pessoas.dominio.PessoaJuridica;
import br.com.pessoas.servico.PessoaJuridicaServico;

public class PessoaJuridicaTeste extends BaseTeste<PessoaJuridica> {
    public PessoaJuridicaTeste() {
        this.servico = new PessoaJuridicaServico();
    }

    @Override
    public void Executar() {
        System.out.println("\n");
        int valorChave = this.TestarCriacao();
        this.TestarAlteracao(valorChave);
        this.TestarLeitura(valorChave);
        this.TestarExclusao(valorChave);
        // this.TestarLeituraVarios();
    }

    @Override
    protected int TestarCriacao() {
        System.out.println("Agora testando CRIAÇÃO: ");
        PessoaJuridica pessoaJuridica = new PessoaJuridica(1, "IpedStudios", "Iped@gmail.com.br", "www.ipedstudios.com.br", LocalDate.now(), "4578797564654687", "4579465", "45454", "Iped Studios");
        PessoaJuridica novo = this.servico.Criar(pessoaJuridica);
        System.out.println(novo.toString());
        return novo.getCodigo();
    }
    
    @Override
    protected void TestarLeitura(int chave) {
        System.out.println("Agora testando LEITURA: ");
        PessoaJuridica pessoaJuridica = this.servico.Ler(chave);
        System.out.println(pessoaJuridica.toString());
    }
    
    @Override
    protected void TestarLeituraVarios() {
        List<PessoaJuridica> lista = this.servico.Ler();
        for (PessoaJuridica pessoaJuridica : lista) {
            System.out.println(pessoaJuridica.toString());
        }
    }
    
    @Override
    protected void TestarAlteracao(int chave) {
        System.out.println("Agora testando ALTERAÇÃO: ");
        PessoaJuridica antigo = this.servico.Ler(chave);
        antigo.setEmail("OutroEmailJuridico@hotmail.com");
        PessoaJuridica alterada = this.servico.Atualizar(antigo);
        System.out.println(alterada.toString());
    }
    
    @Override
    protected void TestarExclusao(int chave) {
        System.out.println("Agora testando EXCLUSÃO: ");
        PessoaJuridica alvo = this.servico.Ler(chave);
        PessoaJuridica excluido = this.servico.Deletar(alvo.getCodigo());
        System.out.println(excluido.toString());
    }
}
