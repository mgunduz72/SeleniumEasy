package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Input_Base;

public class JQuery_Page  {
	
	public JQuery_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="downloadButton")
	public WebElement download;
	
	@FindBy(xpath="//div[.='Complete!']")
	public WebElement complete;
	
	@FindBy(xpath="//button[.='Close']")
	public WebElement close;
	
	

}
