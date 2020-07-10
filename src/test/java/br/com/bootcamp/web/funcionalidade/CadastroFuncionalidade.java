package br.com.bootcamp.web.funcionalidade;

import br.com.bootcamp.bean.commons.SeleniumRobot;
import br.com.bootcamp.settings.BaseTest;
import br.com.bootcamp.web.pages.CadastroPage;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CadastroFuncionalidade extends BaseTest {
    private CadastroPage cadastroPage;
    private SeleniumRobot seleniumRobot;
    private Faker faker;

    public CadastroFuncionalidade(){
        this.cadastroPage = new CadastroPage(webDriver);
        this.seleniumRobot = new SeleniumRobot();
        this.faker = new Faker();
    }

    public void preencherDadosCadastro(){
        String senha = faker.internet().password();
        this.seleniumRobot.esperaElementoSerClicavel(this.cadastroPage.getBotaoCadastrar());
        this.cadastroPage.getCampoCadastroNome().sendKeys(faker.name().fullName());
        this.cadastroPage.getCampoCadastroEmail().sendKeys(faker.internet().emailAddress());
        this.cadastroPage.getCampoCadastroSenha().sendKeys(senha);
    }

    public String pegaMensagemCadastro(){
        this.seleniumRobot.esperaElementoEstarVisivel(cadastroPage.getMensagemUsuarioCriadoComSucesso());
        return this.seleniumRobot.pegarValorTexto(cadastroPage.getMensagemUsuarioCriadoComSucesso());
    }

    public void clicaBotaoCadastro(){
        this.seleniumRobot.esperaElementoEstarVisivel(cadastroPage.getBotaoCadastrar());
        this.seleniumRobot.clicarBotaoJS(cadastroPage.getBotaoCadastrar());
    }
}