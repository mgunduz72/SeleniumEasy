package test;

import org.testng.annotations.Test;

import base.Input_Base;

import static utility.ConfigLoader.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.Input_Page;
import page.Input_Page1;
import utility.ConfigLoader;

public class Input_Test extends Input_Base{

	
	 Input_Page p1;
	 Input_Page1 p2;
	 
	
	
	
	@Test
	public void login() {
		p1=new Input_Page(driver);
		p2=new Input_Page1(driver);
		driver.get(getMyValue("easy.url"));
		p1.message.sendKeys(ConfigLoader.getMyValue("message"));
		p1.sum1.click();
//		p1.sum1.sendKeys(ConfigLoader.getMyValue("num.a"));
//		p1.sum2.sendKeys(ConfigLoader.getMyValue("num.b"));
		p2.sum1.sendKeys(Input_Page1.addNumber());
		p2.sum2.sendKeys(Input_Page1.addNumber());
		p1.total.click();
		
	}
	
	
	
	
	

	
	
//	@Test
//	public void input() {
//		
//		
//		
//	}
//	
	

}
