package test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Input_Base;
import page.AlertsPage;
import page.BootStrapProgressBarPage;
import page.DragSropSliderPage;
import page.JQuery_Page;
import utility.ConfigLoader;

public class Jquery_Test extends Input_Base{
	
	 JQuery_Page query;
	 BootStrapProgressBarPage boot;
	 WebDriverWait wait;
	 DragSropSliderPage sl;
	 AlertsPage al;
	
//	@Test
	public void jQuery()  {
		
		query= new JQuery_Page(driver);
		
		driver.get(ConfigLoader.getMyValue("progress.url"));
		
		// click startdownload 
		query.download.click();
	
	    //get the webelement for condition
		WebElement message = query.complete;
		
		// crate wait  to set the waiting time
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(message));
		
		assertTrue(message.isDisplayed(), "Messeage is not displayed");
		Assert.assertEquals(message.getText(), "Complete!");
		
		query.close.click();
		
		
	}
	
//	@Test
	public void Bootstrap() {
		
		driver.get(ConfigLoader.getMyValue("boot.url"));
		boot = new BootStrapProgressBarPage(driver);
		boot.downloadButton.click();
		
		WebElement per = boot.percent;
		
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(per));
		
		assertTrue(per.isDisplayed(), "Percentage is not displayed");
		Assert.assertEquals(per.getText(), "100%", "Percentage is not equal");
		
		
	}
	
//	@Test
	public void drag() {
		
		sl = new DragSropSliderPage(driver);
		driver.get(ConfigLoader.getMyValue("slider.url"));
		
		Actions action = new Actions(driver);
		
		WebElement slide = sl.ten;
		WebElement slide1 = sl.thirdy;
		WebElement slide2 = sl.fifty;
	
//		action.moveToElement(slide).clickAndHold().dragAndDropBy(slide, 0, -200).release().build().perform();
//		action.moveToElement(slide1).clickAndHold().dragAndDropBy(slide1, 0, -350).release().build().perform();
//		action.moveToElement(slide2).clickAndHold().dragAndDropBy(slide2, 0, -100).release().build().perform();
		action.dragAndDropBy(slide2, 10, 30).release().build().perform();
	}
	
//	@Test
	public void Alerts() throws InterruptedException {
		
		al = new AlertsPage(driver);
		driver.get(ConfigLoader.getMyValue("alert.url"));
		al.autoSucces.click();
		Thread.sleep(300);
		boolean b = al.alert5sec.isDisplayed();
		System.out.println(al.alert5sec.getText());
		
		
		
	}
	
	@Test
	public void normal() throws InterruptedException {
		al = new AlertsPage(driver);
		driver.get(ConfigLoader.getMyValue("alert.url"));
		al.normalSucces.click();
		Thread.sleep(300);
//		boolean c = al.close.isDisplayed();
//		System.out.println(al.close.getText());
//		Actions act = new Actions(driver);
//		act.moveToElement(al.close).click(al.close).build().perform();
//		al.close.click();
		
		
//		boolean c = al.close.isDisplayed();
	
		al.close.click();
		
		
	}
	

}
