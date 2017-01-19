package com.amazon.cucumber.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;






import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.cucumber.page.CategoryPage;
import com.amazon.cucumber.page.LoginPage;
import com.amazon.cucumber.page.SearchPage;

public class WebDriverAutomation {

	public  WebDriver driver;
	public  LoginPage lp;
	public  SearchPage sp;
	public  CategoryPage cp;
	public  WebDriverWait wait;
	public  Actions act;
	public  Logger App_Log;
	public  Properties prop;
	public static WebDriverAutomation instance= null;
	
	private WebDriverAutomation(){
		System.out.println("constructor");
	}
	
	public void setup() throws IOException {
		App_Log = Logger.getLogger("devpinoyLogger");
		App_Log.debug("Execution started");
		File f = new File(System.getProperty("user.dir")+"//src//main//resources//Automation.properties");
		prop = new Properties();
		FileInputStream fn = new FileInputStream(f);
		prop.load(fn);
		
		if(prop.get("Browser").equals("firefox")){
			driver = new FirefoxDriver();
//		}else if(prop.get("Browser").equals("chrome"))
//		{
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\elora.parija\\Downloads\\chromedriver_win32\\chromedriver.exe");
//			driver = new ChromeDriver();
//		}else if(prop.get("Browser").equals("ie"))
//		{
//			System.setProperty("webdriver.ie.driver", "C:\\Users\\elora.parija\\Downloads\\IEDriverServer_Win32_2.44.0\\IEDriverServer.exe");
//			driver = new InternetExplorerDriver();
		}
		
		lp = PageFactory.initElements(driver, LoginPage.class);
		sp = PageFactory.initElements(driver, SearchPage.class);
		cp = PageFactory.initElements(driver, CategoryPage.class);
		
		driver.get(prop.getProperty("Url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
		act = new Actions(driver);
	}
	
	public WebDriver getDriver(){
		return driver;
	}
	
	public Properties getProperty(){
		return prop;
	}
	
	public WebDriverWait getWebDriverWait(){
		return wait;
	}
	
	public Actions getAct(){
		return act;
	}
	
	public LoginPage getLoginPage(){
		return lp;
	}
	public SearchPage getSearchPage(){
		return sp;
	}
	public CategoryPage getCategoryPage(){
		return cp;
	}
	
	public Logger getLogger(){
		return App_Log;
	}
	
	public void login(){
		   act.moveToElement(lp.signInLink).build().perform();
		   lp.signInBtn.click();
		   wait.until(ExpectedConditions.visibilityOf(lp.email));
		   lp.email.sendKeys(prop.getProperty("Username"));
		   lp.password.sendKeys(prop.getProperty("Password"));
		   lp.password.sendKeys(Keys.ENTER);
		   String name = prop.getProperty("Name");
		   Assert.assertTrue(name+ " is not present and login is not successful", lp.name.getText().contains(name));
	}
	
	public static WebDriverAutomation getInstance(){
		if(instance==null){
			instance = new WebDriverAutomation();
		}
		return instance;
	}
}
