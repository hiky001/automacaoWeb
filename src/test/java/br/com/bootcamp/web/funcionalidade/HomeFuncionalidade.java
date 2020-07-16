package br.com.bootcamp.web.funcionalidade;

import br.com.bootcamp.bean.commons.SeleniumRobot;
import br.com.bootcamp.settings.BaseTest;
import br.com.bootcamp.web.pages.HomePage;

public class HomeFuncionalidade extends BaseTest {
    private HomePage homePages;
    private SeleniumRobot seleniumRobot;

    public HomeFuncionalidade(){
        this.homePages = new HomePage(webDriver);
        this.seleniumRobot = new SeleniumRobot();
    }

    public String pegaMensagemLogin(){
        this.seleniumRobot.esperaElementoEstarVisivel(homePages.getMensagemBemVindo());
        return this.seleniumRobot.pegarValorTexto(homePages.getMensagemBemVindo());
    }

    public void clicaBotao(String texto){
        seleniumRobot.clicaBotaoPorTexto(texto);
    }
}
