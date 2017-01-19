package com.amazon.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format={"html:output"},
//features={"//src//main//resources//Features//"},
features={"/Users/Radhi/workspace/Shyam/src/main/resources/Features"},
//features={System.getProperty("user.dir") + "//src//main//resources//Features//"},
glue={ 
	  "com.amazon.cucumber.common",
	  "com.amazon.cucumber.stepdef" 
	  },
tags=
	{
		"~@Category",
		"@Search"
	}	  
)
public class Runnertest {

}
