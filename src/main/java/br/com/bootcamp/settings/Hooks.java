package br.com.bootcamp.settings;

import br.com.bootcamp.bean.enums.Web;
import br.com.bootcamp.bean.interfaces.WebApplication;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseTest{

    @Before(value = "@web")
    public void beforeWeb(){
        System.out.println("Iniciando Browser Web");
        initializeWebApplication((WebApplication) Web.CHROME);
    }


    @After(value = "@web")
    public void afterWeb(){
        System.out.println("Fechando Web");
        closeWeb();
    }

}
