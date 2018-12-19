package page;

import org.openqa.selenium.WebDriver;

public class Input_Page1 extends Input_Page {

	public Input_Page1(WebDriver driver) {
		super(driver);
	}

	public static String addNumber() {

		int a = (int) Math.random() * 50 + 1;

		return String.valueOf(a);

	}

}
