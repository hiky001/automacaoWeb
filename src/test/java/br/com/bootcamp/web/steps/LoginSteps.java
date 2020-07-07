package br.com.bootcamp.web.steps;

import br.com.bootcamp.bean.commons.SeleniumRobot;
import br.com.bootcamp.web.funcionalidade.LoginFuncionalidade;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Quando;

public class LoginSteps{
    LoginFuncionalidade home = new LoginFuncionalidade();
    SeleniumRobot seleniumRobot = new SeleniumRobot();

    @E("^preencho os dados de login com usuário cadastrado$")
    public void preenchoOsDadosDeLoginComUsuário() throws Throwable {
        home.preencherCampoEmail("HSilva@gmail.com");
        home.preencherCampoSenha("123456");

    }

    @Quando("^clico em \"([^\"]*)\"$")
    public void clicoEm(String texto) throws Throwable {
        seleniumRobot.clicaBotaoPorTexto(texto);
    }

}
