package com.amazon.cucumber.common;

import java.io.IOException;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class StartupAndShutdown extends Commons{

	@Before
	public void init() throws IOException{
		auto.setup();
		auto.login();
	}
	@After
	public void closeBrowser(){
		auto.App_Log.debug("Execution ends");
		auto.getDriver().quit();
	}
}
