package br.com.bootcamp.web.steps;

import br.com.bootcamp.bean.commons.SeleniumRobot;
import br.com.bootcamp.web.funcionalidade.CadastroFuncionalidade;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

public class CadastroSteps {
    private CadastroFuncionalidade cadastroFuncionalidade;
    private SeleniumRobot seleniumRobot;

    public CadastroSteps() {
        this.cadastroFuncionalidade = new CadastroFuncionalidade();
        this.seleniumRobot = new SeleniumRobot();
    }


    @E("^preencho os dados de cadastro$")
    public void preenchoOsDadosDeCadastro() {
        this.cadastroFuncionalidade.preencherDadosCadastro();
    }


    @Entao("^visualizo a mensagem \"Usuário inserido com sucesso\"$")
    public void visualizoAMensagemDeCadastradoComSucesso() {
        Assert.assertEquals("Usuário inserido com sucesso", cadastroFuncionalidade.pegaMensagemCadastro());
    }

    @Quando("^clico em cadastrar$")
    public void clicoEmCadastrar() {
        this.cadastroFuncionalidade.clicaBotaoCadastro();
    }
}
