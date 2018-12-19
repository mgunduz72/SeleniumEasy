package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkbox_Page1 extends Checkbox_Page{
	

	
	public Checkbox_Page1(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='panel panel-default']/div[2]/div[2]/label/input")
	public static WebElement option2;
	
	@FindBy(xpath = "//div[@class='panel panel-default']/div[2]/div[3]/label/input")
	public static WebElement option3;
	
	@FindBy(xpath = "//div[@class='panel panel-default']/div[2]/div[4]/label/input")
	public static WebElement option4;
	
	public static void checkRandom(int n) {
		
		switch (n) {
		case 0 : 
		    option2.click();
		    break;
		case 1 :
			option2.click();
			option3.click();
			break;
		case 2 :
			option2.click();
			option3.click();
			option4.click();
			break;
			
		
		}
		}
	}


