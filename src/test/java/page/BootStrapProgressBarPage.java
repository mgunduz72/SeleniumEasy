package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BootStrapProgressBarPage {
	
public BootStrapProgressBarPage(WebDriver driver) {
	PageFactory.initElements(driver, this);

}

 @FindBy(id = "cricle-btn")
 public WebElement downloadButton;
 
 @FindBy(xpath = "//div[.='100%']")
 public WebElement percent;

 
 
}
