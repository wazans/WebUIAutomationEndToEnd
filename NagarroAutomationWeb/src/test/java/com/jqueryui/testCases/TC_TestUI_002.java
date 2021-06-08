package com.jqueryui.testCases;

import org.openqa.selenium.StaleElementReferenceException;
import org.testng.annotations.Test;

import com.jqueryui.pageObjects.HomePageObjects;
import com.relevantcodes.extentreports.LogStatus;


public class TC_TestUI_002 extends BaseClass {
	@Test(priority=2)
	public void SelectItemsTest() throws Exception
	{
		//driver.get(BaseURL); cut and put in Base after desire browser code
		//Logger.info("URL is opened");
		HomePageObjects homepageactions=new HomePageObjects(driver);//IV
		
		try{
			homepageactions.ClickOnSelectableFromLeftMenu();
			homepageactions.SelectItems();
			

			
		}
		catch(StaleElementReferenceException e)
		{
			e.printStackTrace();
			
			
		}
		
		
		
		
	}
}
