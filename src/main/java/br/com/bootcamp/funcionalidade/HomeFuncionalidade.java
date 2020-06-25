package br.com.bootcamp.funcionalidade;

import br.com.bootcamp.pages.HomePages;
import br.com.bootcamp.settings.BaseTest;

public class HomeFuncionalidade extends BaseTest {
        private HomePages homePage;

        public HomeFuncionalidade(){
            this.homePage = new HomePages(webDriver);
        }

}
