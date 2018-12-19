package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage {
	public AlertsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "autoclosable-btn-success")
	public WebElement autoSucces;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-autocloseable-success']")
	public WebElement alert5sec;
	
	
	
	@FindBy(id = "normal-btn-success")
	public WebElement normalSucces;
	
	@FindBy(id = "//div[@class='alert alert-success alert-normal-success']/button[@class='close']")
	public WebElement close;
	
	
	//div[@class='alert alert-success alert-normal-success']/button[@class='close']

	@FindBy(id = "autoclosable-btn-warning")
	public WebElement autoWarning;
	
	@FindBy(id = "normal-btn-warning")
	public WebElement normalWarning;
	
}
