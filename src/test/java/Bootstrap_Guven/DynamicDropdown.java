package Bootstrap_Guven;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropdown {
	
	public  List<String> listMaker(List<WebElement> list){
		List<String> ls=new ArrayList<>(); 
		for (WebElement element : list) {
			ls.add(element.getText()); 
		}
		return ls; 
	} 
	
	//randomly select drop down menu options returns string value of selected
	public String dropDownSelect(WebElement element){
		
		Select slc= new Select(element); 
		List<String> ls= listMaker(slc.getOptions()); 
		
		Random rn= new Random(); 
		int num=rn.ints(0,(ls.size())).findFirst().getAsInt();  //java 8 version of random
		slc.selectByVisibleText(ls.get(num)); 
		
		return slc.getFirstSelectedOption().getText(); 
	}
	
	public String radioSelect(List<WebElement> elements, List <WebElement> radioNames){
		
		
		List <String> ls=listMaker(radioNames);
		
		Random rn= new Random();
		int random=rn.ints(0,(ls.size())).findFirst().getAsInt();
		
		WebElement selected=elements.get(random); 
					selected.click();
		
		return ls.get(random); 
	}
	
	public String expDate(int year){
		year=year-2000; 
		Random rn= new Random();
		int num1=rn.ints(1,13).findFirst().getAsInt();
		String month= ""; 
		if (num1<10){
			month="0"+num1; 
		}else{
			month=""+num1; 
		}
		int num2=rn.ints(year,30).findFirst().getAsInt();
		
		return month+"/"+num2; 
	}
}

}
