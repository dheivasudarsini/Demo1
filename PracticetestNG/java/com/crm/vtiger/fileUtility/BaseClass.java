package com.crm.vtiger.fileUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import fileUtilities.PropertyFileUtility;

public class BaseClass1 {
	
	public WebDriver driver;
	PropertyFileUtility pfile = new PropertyFileUtility();
	Login in = new Login();
	Logout out = new Logout();
	
	@BeforeClass(groups="Smoketest")
	public void launchBrowser() throws Exception {
		
		System.out.println("launch the browser");
	
		
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get(pfile.readDatafromProperty("url"));
	}
	
	@BeforeMethod(groups="Smoketest")
	public void signIn() {
		in.login(driver);
	}
	
    @AfterMethod(groups="Smoketest")	
	public void signOut() {
		out.logout(driver);
	}
    
    @AfterClass(groups="Smoketest")
    public void closeBrowser()
    {
    	driver.close();
    }
	
	

}
