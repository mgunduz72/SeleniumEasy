package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Input_Base;
import page.Checkbox_Page;
import page.Checkbox_Page1;
import utility.ConfigLoader;

public class Checkbox_Test extends Input_Base{
	
	Checkbox_Page check;
	Checkbox_Page1 check1;
	int x = (int) (Math.random()*3+1);
	@Test
	public void checkTest() throws InterruptedException {
		check = new Checkbox_Page(driver);
		check1 = new Checkbox_Page1(driver);
		driver.get(ConfigLoader.getMyValue("box.url"));
		check.singleBox.click();
		boolean b = driver.findElement(By.id("txtAge")).isDisplayed();
		Assert.assertTrue(b, "Success message is not displayed");
		check.check1.click();
		String expected = "Uncheck All";
		Thread.sleep(1234);
		String actual = check.checkAll.getAttribute("value");
		System.out.println(actual);
		Assert.assertTrue(expected.equals(actual), "Uncheck All is not displayed");
		check.check1.click();
		expected = "Check All";
		actual = check.checkAgain.getAttribute("value");
		Assert.assertTrue(expected.equals(actual), "Check All is not displayed");
		Checkbox_Page1.checkRandom(x);
		
		System.out.println("sample");
		
		
	}
	
	

}
