package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class googlePage {
public WebDriver ldriver;
	
	 public googlePage(WebDriver driver) {
		ldriver =driver;
		PageFactory.initElements(driver, this);
	}
	 @FindBy(name = "q")
	 @CacheLookup
	 WebElement txtSearch;
	 
	 @FindBy(name = "btnK")
	 @CacheLookup
	 WebElement btnSearch;
	 
	 
	 
	 public void setSearchText(String search) {
		
	txtSearch.clear();
	txtSearch.sendKeys(search);

	}
	 public void clickSearch() {
		 btnSearch.submit();
		
	}
	 public void clickLink(String linkText) {
		 ldriver.findElement(By.xpath("//cite[@class='UdQCqe'][contains(.,"+linkText+")]")).click();
		 
		
	}
	 
	 

}
