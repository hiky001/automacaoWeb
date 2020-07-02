package br.com.bootcamp.automacaosrbarriga.settings;

import br.com.bootcamp.automacaosrbarriga.interfaces.BrowserImp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
    protected static WebDriver webDriver;
    protected WebDriverWait wait;

    protected void inicializaWeb (BrowserImp web){
        if (webDriver != null)
           webDriver.close();
        webDriver = web.getDriver();
        webDriver.manage().window().fullscreen();
        wait = new WebDriverWait(webDriver, 60);
    }

    protected static void fechaWeb(){
        webDriver.quit();
    }
}
