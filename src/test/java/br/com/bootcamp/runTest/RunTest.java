package br.com.bootcamp.runTest;

import br.com.bootcamp.settings.BaseTest;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        dryRun = false,
        snippets = SnippetType.CAMELCASE,
        plugin = {"pretty", "json:target/cucumber.json"},
        features = {"src/test/resources/features"},
        glue = {"br.com.bootcamp.web.steps", "br.com.bootcamp.settings", "br.com.bootcamp.bean"},
        tags = {"@login", "@web"})

public class RunTest extends BaseTest {

}
