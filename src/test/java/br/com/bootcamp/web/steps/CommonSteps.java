package br.com.bootcamp.web.steps;

import br.com.bootcamp.web.funcionalidade.HomeFuncionalidade;
import cucumber.api.java.pt.Dado;

public class CommonSteps {

    private HomeFuncionalidade homeFuncionalidade = new HomeFuncionalidade();

    @Dado("^que estou no site \"([^\"]*)\"$")
    public void queEstouNoSite(String site) {
        homeFuncionalidade.start();
    }
}
