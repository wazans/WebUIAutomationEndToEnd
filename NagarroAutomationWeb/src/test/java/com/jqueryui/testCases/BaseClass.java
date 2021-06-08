package com.jqueryui.testCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetBanking.utilities.ReadConfig;


public class BaseClass {

	//a. properties file > ReadConfig > Base Class > TestCase Class
	
	ReadConfig readconfig=new ReadConfig();
	
	


	//public String username="mngr265931";
	public String BaseURL=readconfig.getApplicationURL();
	//public String BaseURL="http://demo.guru 99.com/V4/";
	public String username=readconfig.getUserName();
	//public String password="uzuguve";
	public String password=readconfig.getPassword();
	public WebDriver driver;//initiated or defined 
	

	@Parameters("browser")
	@BeforeClass
	public void Setup(String browser) throws InterruptedException
	
	{	

	
		
		//a..System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
		if(browser.equalsIgnoreCase("chrome"))
		{
			//b
			System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
			driver=new ChromeDriver(); //declared
			driver.manage().window().maximize();
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getfirefoxpath());
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver",readconfig.getiepath());
			driver=new InternetExplorerDriver();

		}
		driver.get(BaseURL); 
		
		// config .. read through REadConfig.java .. ReadConfig ka object .. store.. BaseURL
		
		// driver.get(abc.com)
		
	}
	 @AfterClass public void TearDown() { 
		
		 driver.quit(); 
		 } 
	 
	
}
