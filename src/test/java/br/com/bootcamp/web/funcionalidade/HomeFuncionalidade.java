package br.com.bootcamp.web.funcionalidade;

import br.com.bootcamp.web.pages.HomePages;
import br.com.bootcamp.settings.BaseTest;
import br.com.bootcamp.bean.commons.SeleniumRobot;

public class HomeFuncionalidade extends BaseTest {
    private HomePages homePage;

    public HomeFuncionalidade(){
        this.homePage = new HomePages(webDriver);
    }

    public void start(){
        System.out.println("Testando nossa execucao");
    }
}
