package br.com.talentfour.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, snippets = SnippetType.CAMELCASE,
				plugin = {"pretty","html:target/cucumber.html"},
				features = {".//src//test//resources//"},
				glue = {"br.com.talentfour.steps","talentfour.config"},
				tags = {"@CT001"})
public class RunTest {

}
