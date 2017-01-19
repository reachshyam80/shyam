package com.amazon.cucumber.stepdef;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.amazon.cucumber.common.Commons;
import com.amazon.cucumber.common.WebDriverAutomation;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchProduct extends Commons {

	@When("^I search for (.*)$")
	public void searchProduct(String product) throws Throwable {
	  
		auto.getSearchPage().searchBox.sendKeys(product);
		auto.getSearchPage().searchBox.sendKeys(Keys.ENTER);
		
	}

	@Then("^I should see the (.*) on the page$")
	public void verifyProduct(String product) throws Throwable {
	 
		if(product.equals("laptop")){
			
		auto.getWebDriverWait().until(ExpectedConditions.visibilityOf(auto.getSearchPage().laptopLink));
		Assert.assertTrue(product+" not found", auto.getSearchPage().laptopLink.getText().equals(product));
		
		}else if(product.equals("mobile")){
			
			auto.getWebDriverWait().until(ExpectedConditions.visibilityOf(auto.getSearchPage().cellPhone));
			Assert.assertTrue(product+" not found", auto.getSearchPage().cellPhone.getText().equals(product));
		}
	}

}
