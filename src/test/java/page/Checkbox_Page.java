package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkbox_Page {
	
	public Checkbox_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "isAgeSelected")
	public WebElement singleBox;
	
	public WebElement check1;
	
	@FindBy(xpath= "//input[@value='Uncheck All']")
	public WebElement checkAll;
	
	@FindBy(xpath= "//input[@value='Check All']")
	public WebElement checkAgain;
	
	
	
	
	
	
	
	
	
	
	
	
	

}
