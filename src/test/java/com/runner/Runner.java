package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\anand.kumar\\eclipse-workspace\\Task1310\\src\\test\\resources\\Login.feature",
glue="com.stepDef",stepNotifications =true ,dryRun = false,monochrome = true,tags = "@AddToCart")
public class Runner {

}
