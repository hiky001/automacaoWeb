package br.com.bootcamp.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {
    public LoginPages(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[@id = 'email']")
    private WebElement campoEmail;
    public WebElement getCampoEmail(){
        return campoEmail;
    }

    @FindBy(xpath = "//input[@id = 'senha']")
    private WebElement campoSenha;
    public WebElement getCampoSenha(){
        return campoSenha;
    }

}
