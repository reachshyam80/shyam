package com.amazon.cucumber.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {

	@FindBy(id="twotabsearchtextbox")
	public WebElement searchBox;
	
	@FindBy(xpath="//*[@id='ref_493964']/li[4]/strong")
	public WebElement laptopLink;
	
	@FindBy(xpath="//*[@id='refinements']/div[2]/ul[1]/li[1]/ul/li[1]/a/span")
	public WebElement cellPhone;
}
