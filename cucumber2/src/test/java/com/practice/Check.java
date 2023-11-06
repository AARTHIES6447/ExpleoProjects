package com.practice;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\akumaresan2\\eclipse-workspace\\cucumber2\\src\\test\\resources\\Features\\aa.feature", glue = "com.practice", plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class Check {
	
}
