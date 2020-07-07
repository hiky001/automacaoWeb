package br.com.bootcamp.web.steps;

import br.com.bootcamp.bean.commons.SeleniumRobot;
import br.com.bootcamp.web.funcionalidade.HomeFuncionalidade;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;

public class HomeSteps {
    private SeleniumRobot seleniumRobot;
    private HomeFuncionalidade homeFuncionalidade = new HomeFuncionalidade();

    @Dado("^que clico no botao \"([^\"]*)\"$")
    public void queClicoNoBotao(String texto) throws Throwable {
        seleniumRobot = new SeleniumRobot();
        seleniumRobot.clicaBotaoPorTexto(texto);
    }

    @Entao("^visualizo a tela inicial com meu usuário logado$")
    public void visualizoATelaInicialComMeuUsuárioLogado() {
        Assert.assertEquals("Bem vindo, Henrique !", homeFuncionalidade.pegaMensagemLogin());

    }
}
