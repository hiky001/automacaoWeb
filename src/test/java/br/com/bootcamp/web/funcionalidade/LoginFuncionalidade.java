package br.com.bootcamp.web.funcionalidade;

import br.com.bootcamp.web.pages.LoginPages;
import br.com.bootcamp.settings.BaseTest;
import br.com.bootcamp.bean.commons.SeleniumRobot;

public class LoginFuncionalidade extends BaseTest {
    private LoginPages loginPage;
    private SeleniumRobot seleniumRobot;

    public LoginFuncionalidade(){
        this.loginPage = new LoginPages(webDriver);
        this.seleniumRobot = new SeleniumRobot();
    }

    public void preencherCampoEmail(String email){
        this.seleniumRobot.insireTextoNoElementoJS(loginPage.getCampoEmail(), email);
    }

    public void preencherCampoSenha(String senha){
        this.seleniumRobot.insireTextoNoElementoJS(loginPage.getCampoSenha(), senha);
    }

}
