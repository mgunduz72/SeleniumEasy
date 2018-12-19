package test;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.Input_Base;
import page.Form;
import utility.ConfigLoader;

public class Form_Test extends Input_Base {
	
	Form fr;
	
	@Test
	public void formSubmit() {
		driver.get(ConfigLoader.getMyValue("form.url"));
		fr = new Form(driver);
		fr.getInfo();
		Select st = new Select(fr.state);
		st.selectByIndex(3);
		fr.yes.click();
		fr.submit.click();
		
	}
	

}
