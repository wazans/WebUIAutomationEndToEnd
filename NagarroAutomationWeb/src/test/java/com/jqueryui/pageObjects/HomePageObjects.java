package com.jqueryui.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {
	//1 . Create driver driver object
	WebDriver ldriver;
	//2 . Public Constructor - To make object and then access methods ||  from your class's methods.
	public HomePageObjects(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}


	//3. WebElement
	@FindBy(xpath="//a[text()='Droppable']")
	WebElement LeftMenu_Droppable;
	

	
	@FindBy(className="demo-frame")
	WebElement uiFrame;
	
	@FindBy(xpath="//div[@id='draggable']")
	WebElement DragFrom;
	
	@FindBy(xpath="//div[@id='droppable']")
	WebElement DropInto;
	

	@FindBy(xpath="//a[text()='Selectable']")
	WebElement LeftMenu_Selectable;
	
	
	@FindBy(xpath="//a[text()='Controlgroup']")
	WebElement LeftMenu_Controlgroup;
	
	/*
	 * @FindBy(xpath="//ol[@id='selectable']") List<WebElement> list;
	 */
	
	
	@FindBy(xpath="//li[text()='Item 1']")
	WebElement Item1;
	
	@FindBy(xpath="//li[text()='Item 3']")
	WebElement Item3;
	
	@FindBy(xpath="//li[text()='Item 7']")
	WebElement Item7;
	
	
	//
	
	@FindBy(xpath="/html/body/div[1]/fieldset[1]/div/label[2]/span[1]")
	WebElement AutomaticRadioButton;
	
	@FindBy(xpath="/html/body/div[1]/fieldset[1]/div/label[3]/span[1]")
	WebElement InsuranceCheckBox1;
	
	
	@FindBy(xpath="/html/body/div[1]/fieldset[2]/div/label[1]/span[1]")
	WebElement StandardRadioButton;
	
	@FindBy(xpath="/html/body/div[1]/fieldset[2]/div/label[3]/span[1]")
	WebElement InsuranceCheckBox2;
	

	@FindBy(xpath="//*[@id=\"vertical-spinner\"]")
	WebElement TextBox;
	
	@FindBy(xpath="//button[@id='book']")
	WebElement BookNow;
	
	
	
	
	
	
	
	

	//4.Actions
	public void ClickOnDroppableFromLeftMenu()
	{
		
		LeftMenu_Droppable.click();
	}
	
	public void ClickOnSelectableFromLeftMenu()
	{
		
		LeftMenu_Selectable.click();
	}
	
	public void ClickOnControlgroupFromLeftMenu()
	{
		
		LeftMenu_Controlgroup.click();
	}
	
	
	public void DragAndDrop() throws InterruptedException {
		
		 JavascriptExecutor js = (JavascriptExecutor) ldriver;
	
		js.executeScript("arguments[0].scrollIntoView(true);",uiFrame);
		ldriver.switchTo().frame(uiFrame); 
		 Actions action=new Actions(ldriver);
	
		action.moveToElement(DragFrom).clickAndHold().moveToElement(DropInto).release().build().perform();
				
	}
	
	public void SelectItems()
	{
		 JavascriptExecutor js = (JavascriptExecutor) ldriver;
			
		js.executeScript("arguments[0].scrollIntoView(true);",uiFrame);
		
		ldriver.switchTo().frame(uiFrame); 
		
		 //List<WebElement> list=ldriver.findElements(By.xpath("//ol[@id='selectable']"));
		 Actions act=new Actions(ldriver);
		 act.keyDown(Keys.CONTROL).click(Item1).click(Item3).click(Item7).build().perform();
	}
	
	public void MiscActions	()
	{
		 JavascriptExecutor js = (JavascriptExecutor) ldriver;
			
		js.executeScript("arguments[0].scrollIntoView(true);",uiFrame);
		
		ldriver.switchTo().frame(uiFrame); 

		AutomaticRadioButton.click();
		
		InsuranceCheckBox1.click();
		
		StandardRadioButton.click();
		
		InsuranceCheckBox2.click();
		
		TextBox.click();
		
		TextBox.sendKeys("1");
		
		 //Actions act=new Actions(ldriver);
		 
		 //act.clickAndHold(BookNow).build().perform();
		 
		 //act.click(BookNow).build().perform();
		
		
	}
}
