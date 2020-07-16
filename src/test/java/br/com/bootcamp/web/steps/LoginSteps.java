package br.com.bootcamp.web.steps;

import br.com.bootcamp.bean.commons.SeleniumRobot;
import br.com.bootcamp.web.funcionalidade.LoginFuncionalidade;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Quando;

public class LoginSteps{
    LoginFuncionalidade loginFuncionalidade;
    SeleniumRobot seleniumRobot;

    public LoginSteps(){
        this.loginFuncionalidade = new LoginFuncionalidade();
        this.seleniumRobot = new SeleniumRobot();
    }

    @E("^preencho os dados de login com usuário cadastrado$")
    public void preenchoOsDadosDeLoginComUsuário() throws Throwable {
        loginFuncionalidade.preencherCampoEmail("HSilva@gmail.com");
        loginFuncionalidade.preencherCampoSenha("123456");

    }

    @Quando("^clico em \"([^\"]*)\"$")
    public void clicoEm(String texto) throws Throwable {
        this.loginFuncionalidade.clicoBotao(texto);
    }

}
