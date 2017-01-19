package com.amazon.cucumber.stepdef;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.remote.Command;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.amazon.cucumber.common.Commons;
import com.amazon.cucumber.common.WebDriverAutomation;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Category extends Commons{

	
	@Given("^I go to the category page$")
	public void I_go_to_the_category_page() throws Throwable {
	    System.out.println("went to category page");
	}

	@Then("^I should see all the categories$")
	public void I_should_see_all_the_categories(DataTable arg1) throws Throwable {
	 
		List<String> categories = arg1.asList(String.class);
		auto.getWebDriverWait().until(ExpectedConditions.visibilityOf(auto.getCategoryPage().category1));
		Assert.assertTrue(categories.get(0) +" not found", auto.getCategoryPage().category1.getText().contains(categories.get(0)));
		
	}
}
