package br.com.bootcamp.runTest;

import br.com.bootcamp.settings.BaseTest;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, dryRun = false, snippets = SnippetType.CAMELCASE,
        plugin = {"pretty", "json:target/cucumber.json"},
        features = {""}, glue = {""}, tags = {"@test-web", "@app"})

public class RunTest extends BaseTest {

}
