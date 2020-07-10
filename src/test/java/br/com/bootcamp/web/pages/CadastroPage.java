package br.com.bootcamp.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadastroPage {

    public CadastroPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[@id = 'nome']")
    private WebElement campoCadastroNome;
    public WebElement getCampoCadastroNome(){
        return campoCadastroNome;
    }

    @FindBy(xpath = "//input[@id = 'email']")
    private WebElement campoCadastroEmail;
    public WebElement getCampoCadastroEmail(){
        return campoCadastroEmail;
    }

    @FindBy(xpath = "//input[@id = 'senha']")
    private WebElement campoCadastroSenha;
    public WebElement getCampoCadastroSenha(){
        return campoCadastroSenha;
    }

    @FindBy(xpath = "//input[@class = 'btn btn-primary']")
    private WebElement botaoCadastrar;
    public WebElement getBotaoCadastrar(){
        return botaoCadastrar;
    }

    @FindBy(xpath = "//div[@class = 'alert alert-success']")
    private WebElement mensagemUsuarioCriadoComSucesso;
    public WebElement getMensagemUsuarioCriadoComSucesso(){
        return mensagemUsuarioCriadoComSucesso;
    }
}
