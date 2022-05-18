package com.choucairtesting.challenge.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/citaMedica.feature",
        tags = "@historias",
        glue = "com.choucairtesting.challenge.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class CitaMedica {
}
