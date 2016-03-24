package com.automationpractice;

/**
 * Created by HUGO1 on 3/2/2016.
 */

import cucumber.api.junit.Cucumber;
// import cucumber.api.CucumberOptions;
// import cucumber.api.junit.Cucumber.Options;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@Cucumber.Options(
        features={"src/test/resources"}
)
public class runner {}