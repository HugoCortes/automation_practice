package com.automationpractice;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by HUGO1 on 3/24/2016.
 */


public class example {
    @Given("^I am officiating a FizzBuzz game$")
    public void I_am_officiating_a_FizzBuzz_game() throws Throwable {
        // Express the Regexp above with the code you wish you had

    }

    @When("^the number (\\d+) is played$")
    public void the_number_is_played(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had

    }

    @Then("^I should be told the correct answer is \"([^\"]*)\"$")
    public void I_should_be_told_the_correct_answer_is(String arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        assert(true);
    }
}
