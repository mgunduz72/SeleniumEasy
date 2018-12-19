package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ConfigLoader;

public class Form {
	public Form(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="first_name")
	public static WebElement firstName;
	public static WebElement last_name;
	public static WebElement email;
	public static WebElement phone;
	public static WebElement address;
	public static WebElement city;
	public static WebElement state;
	public static WebElement zip;
	public static WebElement website;
	public static WebElement comment;
	
	@FindBy(xpath="//input[@name='hosting'][@value='yes']")
	public static WebElement yes;
	
	@FindBy(xpath="//input[@name='hosting'][@value='no']")
	public static WebElement no;
	
	@FindBy(xpath="//div/button[@type='submit']")
	public static WebElement submit;
	
	//div/button[@type='submit']
	
	public static void getInfo() {
		firstName.sendKeys(ConfigLoader.getMyValue("first.name"));
		last_name.sendKeys(ConfigLoader.getMyValue("last.name"));
		email.sendKeys(ConfigLoader.getMyValue("email"));
		phone.sendKeys(ConfigLoader.getMyValue("phone"));
		address.sendKeys(ConfigLoader.getMyValue("address"));
		city.sendKeys(ConfigLoader.getMyValue("city"));
		zip.sendKeys(ConfigLoader.getMyValue("zip"));
		website.sendKeys(ConfigLoader.getMyValue("web"));
		comment.sendKeys(ConfigLoader.getMyValue("project"));
		
	}

}
