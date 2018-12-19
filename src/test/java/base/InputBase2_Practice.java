package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputBase2_Practice {
	
	protected WebDriver driver;
	
	@BeforeClass
	public void setupClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	
	
	@AfterClass
	public void tearDownClass() {
		driver.quit();
		
	}

}
