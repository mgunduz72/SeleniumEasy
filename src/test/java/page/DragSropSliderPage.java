package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragSropSliderPage {
	
	public DragSropSliderPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(xpath = "//input[@value='10']")
	public WebElement ten;
    
    
    @FindBy(xpath = "//div[@class='range range-success']/input[@value='30']")
	public WebElement thirdy;
   
    
    @FindBy(xpath = "//div[@class='range range-primary']/input[@value='50']")
	public WebElement fifty;
  

}
