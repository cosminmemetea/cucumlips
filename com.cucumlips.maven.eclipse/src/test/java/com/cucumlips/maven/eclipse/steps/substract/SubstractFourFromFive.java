package com.cucumlips.maven.eclipse.steps.substract;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubstractFourFromFive {
	  private int five;
	  private int result;
	 
	  @Given("5")
	  public void given() throws Throwable {
		  five = 5;
	  }

	  @When("Substracting 4")
	  public void when() throws Throwable {
		  result = five - 4;
	  }

	  @Then("We get 1")
	  public void then() throws Throwable {
		  assertEquals(2, result); // FAIL on purpose.
	  }
}
