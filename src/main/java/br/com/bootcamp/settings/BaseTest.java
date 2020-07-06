package br.com.bootcamp.settings;

import br.com.bootcamp.bean.interfaces.WebApplication;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    protected static WebDriver webDriver;
    protected static WebDriverWait wait;

    protected void initializeWebApplication(WebApplication webApplication){
        if (webDriver != null)
            webDriver.close();
        webDriver = webApplication.getDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://srbarriga.herokuapp.com/login");
        wait = new WebDriverWait(webDriver, 60);
    }

    protected static void closeWeb(){
        webDriver.quit();
    }


}
