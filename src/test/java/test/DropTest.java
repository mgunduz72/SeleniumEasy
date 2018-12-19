package test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.Input_Base;
import page.DropPage1;
import utility.ConfigLoader;

public class DropTest extends Input_Base{
	
	DropPage1 d1;
	int n = (int) (Math.random()*7+1);
	
	@Test
	public void select1() {
		d1 = new DropPage1(driver);
		driver.get(ConfigLoader.getMyValue("drop.url"));
		Select s = new Select(d1.dropList);
//		s.getFirstSelectedOption();
		s.selectByIndex(n);
		List<WebElement> options = s.getOptions();
		for(WebElement lst:options) {
			System.out.println(lst.getText());
		}
		
		
	}

}
