package com.cucumlips.maven.eclipse.steps.add;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddTwoPositiveNumbers {
	private int firstTerm;
	private int secondTerm;
	private int resultTerm;
	
  @Given("I am selecting 10 as first term")
  public void given() throws Throwable {
	  firstTerm = 10;
  }

  @And("I am selecting 2 as the second term")
  public void and() throws Throwable {
	  secondTerm = 2;
  }
  @When("I am asking for the result")
  public void when() throws Throwable {
	  resultTerm = firstTerm + secondTerm;
  }

  @Then("I want to get 12 as a result")
  public void then() throws Throwable {
	  assertEquals(12, resultTerm);
  }

}
