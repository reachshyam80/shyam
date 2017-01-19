package com.amazon.cucumber.common;

public class Commons {

	public WebDriverAutomation auto = WebDriverAutomation.getInstance();
	
	public Commons(){
		System.out.println("common class");
	}
}
