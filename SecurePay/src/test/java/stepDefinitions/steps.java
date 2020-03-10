package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

import io.cucumber.java.en.*;
import pageObjects.contactUsPage;
import pageObjects.securePageHome;
import pageObjects.googlePage;




public class steps extends  BaseClass {
	
	
	public String fName,lName,email,company,phoneNumber,url,message,reasonval;
	
public String getOsName() {
	return System.getProperty("os.name");
	
}
	
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
		
		if(getOsName().startsWith("Windows"))
		{
	    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers/chromedriver.exe");
		}
		else
		{
			 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers/chromedriver");	
		}
		
	    driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	}
//---------Google Search----------------------------
	
	@When("User opens Url {string}")
	public void user_opens_Url(String url) {
		driver.get(url);
		gp= new googlePage(driver);
	}

	@When("User enter searach text {string}")
	public void user_enter_serach_text(String searchText) {
		
		gp.setSearchText(searchText);
	 
	}

	@When("Click on Search")
	public void click_on_Search() {
		
		gp.clickSearch();
	   
	}

	@When("Click on {string}")
	public void click_on(String webLink) {
		gp.clickLink(webLink);
	   
	}
//------- SecurePay Home Page --------------------------
	@Then("Page Titile should be {string}")
	public void page_Titile_should_be(String title)  {
		
		sph= new securePageHome(driver);
		org.junit.Assert.assertEquals(title, driver.getTitle());
		
	    
	}
	@When("User click {string}")
	public void user_click(String menu) {
	    
		
		sph.clickContactUs();

	}
	
//--------Contact Us Page ---------------------------------
	
	@Then("Verifies Contact Us loaded")
	public void verifies_Contact_Us_loaded() {
	    cp= new contactUsPage(driver);
	
	    org.junit.Assert.assertEquals("Contact Us – SecurePay – Sales – Support – Accounts", cp.GetTitle());
	}
	
	
	@Then("Enter details to Contact Us")
	public void enter_details_to_Contact_Us() {
		
		Faker faker= new Faker();
		fName =faker.name().firstName();
	    lName=faker.name().lastName();
	    email= faker.name().fullName()+"@abc.test.com";
	    reasonval = "Support";
	   company=faker.company().name();
	    phoneNumber=faker.phoneNumber().phoneNumber();
	    url=faker.company().url();
	    message=faker.random().toString();
	
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	    cp.setFirstName(fName);
	    cp.setLastName(lName);
	    cp.setEmail(email);
	    cp.setBusinessName(company);
	    cp.setPhoneNumber(phoneNumber);
	    cp.setUrl(url);
	    cp.setReason(reasonval);
	    cp.setMessage(message);
	    
	}
//--------------------------Close the Browser------------------------

	@Then("close the browser")
	public void close_the_browser() {
	    driver.close();
	}

	



}
