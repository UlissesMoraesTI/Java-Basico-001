package br.ce.wcaquino.servicos;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.utils.DataUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class LocacaoService {

    public Locacao alugarFilme(Usuario usuario, Filme filme) {
        Locacao locacao = new Locacao();
        locacao.setFilme(filme);
        locacao.setUsuario(usuario);
        locacao.setDataLocacao(new Date());
        locacao.setValor(filme.getPrecoLocacao());

        //Entrega no dia seguinte
        Date dataEntrega = new Date();
        //dataEntrega = adicionarDias(dataEntrega, 1);
        locacao.setDataRetorno(dataEntrega);

        //Salvando a locação...
        //TODO: Adicionar método para salvar

        return locacao;
    }

    @Test
    public void teste() {
        //cenario
        LocacaoService service = new LocacaoService();
        Usuario usuario = new Usuario("Usuário ");
        Filme filme = new Filme("Filme 1", 2, 5.0);

        //ação
        Locacao locacao = service.alugarFilme(usuario, filme);

        //verificação
        Assert.assertTrue(locacao.getValor() == 5.0);
    }
}
