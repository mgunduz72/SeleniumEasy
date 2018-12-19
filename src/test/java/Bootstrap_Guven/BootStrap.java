package Bootstrap_Guven;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BootStrap {
	
	@Test
	public void bootstrapModals() {
	
		AlertsandModalsPage alerts= new AlertsandModalsPage(driver); 
		alerts.bootstrapModals.click();
		
		driver.switchTo().activeElement(); 
		alerts.singleModalButton.click(); 
		String expected="This is the place where the content for the modal dialog displays"; 
		WebDriverWait wait= new WebDriverWait(driver, 6); 
		 wait.until(ExpectedConditions.visibilityOf(alerts.singleModalBody)); 
		
		assertEquals(alerts.singleModalBody.getText(), expected); 
		
		alerts.saveChanges.click(); 
	
		
		alerts.multipleModalButton.click();
		WebDriverWait wait2= new WebDriverWait(driver, 6); 
		 wait2.until(ExpectedConditions.visibilityOf(alerts.multiModalBody1)); 
	
		driver.switchTo().activeElement();
		String expected2="Click launch modal button to launch second modal."; 	
		assertEquals(alerts.multiModalBody1.getText(), expected2);
		alerts.launchModalinFirstModal.click();
		driver.switchTo().activeElement();
		wait2.until(ExpectedConditions.visibilityOf(alerts.multipleModal2Body)); 
		String expected3="This is the place where the content for the modal dialog displays.";
		assertEquals(alerts.multipleModal2Body.getText(), expected3);
		alerts.multipleModal2CloseBtn.click();
		driver.switchTo().activeElement();
		wait2.until(ExpectedConditions.visibilityOf(alerts.multipleModal2Body)); 
		String expected4="This is the place where the content for the modal dialog displays.";
		assertEquals(alerts.multipleModal2Body.getText(), expected4);
		//close the first modal
		Actions actions=new Actions(driver); 
		actions.moveToElement(alerts.multiModal1CloseBtn).click().build().perform();
		
		String expected5= "Bootstrap Modal Example for Automation"; 
		assertEquals(alerts.headerModalExample.getText(), expected5);
		
	}

}
