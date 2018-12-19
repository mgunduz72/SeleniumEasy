package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropPage1 {
	public DropPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="select-demo")
	public WebElement dropList;

}
