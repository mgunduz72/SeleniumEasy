package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Input_Page {
	
	public Input_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-message")
	public WebElement message;
	
	public WebElement sum1;
	
	public WebElement sum2;
	
	@FindBy(xpath="//button[.='Get Total']")
	public WebElement total;
	
	
	

}
