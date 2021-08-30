package com.cucumlips.maven.eclipse;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * Unit test for simple App.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		plugin = { "pretty", "json:target/cucumber.json" },
		glue = { "com/cucumlips/maven/eclipse/steps" },
		monochrome = true)
public class AppTest 
{
}
