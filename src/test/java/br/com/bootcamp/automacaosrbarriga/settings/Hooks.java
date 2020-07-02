package br.com.bootcamp.automacaosrbarriga.settings;

import br.com.bootcamp.automacaosrbarriga.enums.Browser;
import org.junit.After;
import org.junit.Before;

public class Hooks extends BaseTest{

    @Before()
    public void beforeweb(){
        System.out.println("Inicializando Chrome");
        inicializaWeb(Browser.CHROME);
    }

    @After()
    public void afterweb(){
        System.out.println("Fechando Chrome");
        fechaWeb();
    }

}
