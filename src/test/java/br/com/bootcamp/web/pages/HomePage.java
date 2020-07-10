package br.com.bootcamp.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//div [@class = 'alert alert-success']")
    private WebElement mensagemBemVindo;
    public WebElement getMensagemBemVindo(){
        return mensagemBemVindo;
    }


}
