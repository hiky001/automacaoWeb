package br.com.bootcamp.web.funcionalidade;

import br.com.bootcamp.bean.commons.SeleniumRobot;
import br.com.bootcamp.settings.BaseTest;
import br.com.bootcamp.web.pages.HomePages;

public class HomeFuncionalidade extends BaseTest {
    private HomePages homePages;
    private SeleniumRobot seleniumRobot;

    public HomeFuncionalidade(){
        this.homePages = new HomePages(webDriver);
        this.seleniumRobot = new SeleniumRobot();
    }

    public String pegaMensagemLogin(){
        seleniumRobot.esperaElementoEstarVisivel(homePages.getMensagemBemVindo());
        return seleniumRobot.pegarValorTexto(homePages.getMensagemBemVindo());
    }
}
