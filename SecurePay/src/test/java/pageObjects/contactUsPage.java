package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactUsPage {
	
	public WebDriver ldriver;
	
	public contactUsPage(WebDriver driver) {
		
		ldriver= driver;
		PageFactory.initElements(driver, this);
	}
	
	By firstName= By.name("first-name");
	
	
	@FindBy(name = "last-name")
	@CacheLookup
	WebElement lastName;
	
	@FindBy(name = "email-address")
	@CacheLookup
	WebElement email;
	
	@FindBy(name = "phone-number")
	@CacheLookup
	WebElement phonenumer;
	
	@FindBy(name = "website-url")
	@CacheLookup
	WebElement website;
	
	@FindBy(name = "business-name")
	@CacheLookup
	WebElement company;
	
	@FindBy(name = "reason-for-enquiry")
	@CacheLookup
	WebElement resonDropdown;
	
	@FindBy(name = "message")
	@CacheLookup
	WebElement message;
	
	@FindBy(id = "section-heading")
	@CacheLookup
	WebElement heading;
	
	public String GetTitle()
	{
		try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return ldriver.getTitle();
	}
	
	public void setFirstName(String fname) {
		ldriver.findElement(firstName).click();
		ldriver.findElement(firstName).clear();	
		ldriver.findElement(firstName).sendKeys(fname);
		
	}
	public void setLastName(String lname) {
		lastName.click();
		lastName.clear();
		lastName.sendKeys(lname);
		
	}
	public void setEmail(String emailadd) {
		email.clear();
		email.sendKeys(emailadd);
		
	}public void setPhoneNumber(String pNo) {
		phonenumer.clear();
		phonenumer.sendKeys(pNo);
		
	}
	public void setUrl(String url) {
		website.clear();
		website.sendKeys(url);
		
	}
	public void setBusinessName(String bName) {
		company.clear();
		company.sendKeys(bName);
		
	}
	
	public void setReason(String reason)
	{
		List<WebElement> options = resonDropdown.findElements(By.tagName("option"));
		for (WebElement option : options) {
		if(reason.equals(option.getText()))
		option.click();
		break;
		}
	
	}
	public void setMessage(String messageText) {
		message.clear();
		message.sendKeys(messageText);
		
	}
	public Boolean isHeaderDisplay()
	{
		return heading.isDisplayed();
	}
	
	
	
	
	
	
	
	
	


	

}
