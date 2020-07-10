package br.com.bootcamp.web.steps;

import br.com.bootcamp.bean.commons.SeleniumRobot;
import br.com.bootcamp.web.funcionalidade.HomeFuncionalidade;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;

public class HomeSteps {
    private SeleniumRobot seleniumRobot;
    private HomeFuncionalidade homeFuncionalidade = new HomeFuncionalidade();

    public HomeSteps(){
        this.seleniumRobot = new SeleniumRobot();
        this.homeFuncionalidade = new HomeFuncionalidade();
    }

    @Dado("^que clico no botao \"([^\"]*)\"$")
    public void queClicoNoBotao(String texto) throws Throwable {
        seleniumRobot = new SeleniumRobot();
        seleniumRobot.clicaBotaoPorTexto(texto);
    }

    @Entao("^visualizo a tela home com meu usuário logado$")
    public void visualizoATelaHomeComMeuUsuárioLogado() {
        Assert.assertEquals("Bem vindo, Henrique !", homeFuncionalidade.pegaMensagemLogin());

    }
}
