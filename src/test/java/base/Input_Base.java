package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;
import page.JQuery_Page;

public class Input_Base {
	protected WebDriver driver;

	 JQuery_Page query= new JQuery_Page(driver);

	
	@BeforeClass
	public void setupClass() {
		System.out.println("Test starts........");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
	}
	
	@AfterClass
	public void tearDownClass() throws InterruptedException {
		Thread.sleep(1234);
	//	driver.quit();
	}
}
