package br.com.bootcamp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePages {

    public HomePages(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[]@href = '12345678'")
    private WebElement btnTeste;

    public WebElement getBtnTeste(){
        return btnTeste;
    }

}
