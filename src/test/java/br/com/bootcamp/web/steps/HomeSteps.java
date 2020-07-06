package br.com.bootcamp.web.steps;

import br.com.bootcamp.bean.commons.SeleniumRobot;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class HomeSteps {
    private SeleniumRobot seleniumRobot;

    @Dado("^que clico no botao \"([^\"]*)\"$")
    public void queClicoNoBotao(String texto) throws Throwable {
        seleniumRobot = new SeleniumRobot();
        seleniumRobot.clicaBotaoPorTexto(texto);
    }

    @Entao("^visualizo a tela inicial com meu usuário logado$")
    public void visualizoATelaInicialComMeuUsuárioLogado() {

    }
}
