package br.ce.wcaquino.servicos;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.utils.DataUtils;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import java.util.Date;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class LocacaoService {

    public Locacao alugarFilme(Usuario usuario, Filme filme) throws Exception {

        if(filme.getEstoque() == 0){
            throw new Exception("Filme sem estoque");

        }

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

    @Rule
    public ErrorCollector error = new ErrorCollector();

    @Test
    public void teste() {
        //cenario
        LocacaoService service = new LocacaoService();
        Usuario usuario = new Usuario("Usuário ");
        Filme filme = new Filme("Filme 1", 2, 5.0);

        //ação
        Locacao locacao = null;
        try {
            locacao = service.alugarFilme(usuario, filme);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //verificação
        Assert.assertTrue(locacao.getValor() == 5.0); // forma inicial
        Assert.assertEquals(5.0, locacao.getValor(), 0.01); //forma correta

        //Verifique que: "CoreMathers"
        Assert.assertThat(locacao.getValor(), is(5.0));
        Assert.assertThat(locacao.getValor(), is(equalTo(5.0)));
        Assert.assertThat(locacao.getValor(), is(CoreMatchers.not(6.0)));
        //Assert.assertThat(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()), is(true));
        //Assert.assertThat(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)), is(true));

        //Uso: @Rule
        error.checkThat(locacao.getValor(), is(equalTo(5.0)));
    }
}
