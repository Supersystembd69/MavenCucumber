package stepdefinitionPack;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookDataStepdefintion extends AbstractClass{
	@Given("^User is on facebook signup page$")
	public void user_is_on_facebook_signup_page() throws Throwable {
		
		driver.get("https://www.facebook.com");
	    
	}

	@When("^User will enter \"(.*?)\" ,\"(.*?)\" ,  \"(.*?)\" , \"(.*?)\", \"(.*?)\"$")
	public void user_will_enter (String FirstName, String LastName, String EmailAddress, String AgEmailAddress, String Password ) throws Throwable {
		driver.findElement(By.name("firstname")).sendKeys(FirstName);
		driver.findElement(By.name("lastname")).sendKeys(LastName);
		driver.findElement(By.name("reg_email__")).sendKeys(EmailAddress);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys(AgEmailAddress);
		driver.findElement(By.name("reg_passwd__")).sendKeys(Password);
	   
	}
	
	@When("^user will select \"(.*?)\" , \"(.*?)\" , \"(.*?)\"$")
	public void user_will_select(String Month, String Day, String Year) throws Throwable {
		//Select Monthselect=new Select(driver.findElement(By.id("month")));
		//Monthselect.selectByVisibleText(Month);
		driver.findElement(By.id("month")).sendKeys(Month);
		
	    //Select DaySelect=new Select(driver.findElement(By.id("day")));
	    //DaySelect.selectByVisibleText(Day);
		driver.findElement(By.id("day")).sendKeys(Day);
		
	    //Select YearSelect=new Select(driver.findElement(By.id("year")));
	    //YearSelect.selectByVisibleText(Year);
		
		driver.findElement(By.id("year")).sendKeys(Year);
	    
	}

	@When("^user will click on Male Radio button$")
	public void user_will_click_on_Male_Radio_button() throws Throwable {
		
		driver.findElement(By.xpath(".//*[@id='u_0_8']")).click();
	    
	}

	@When("^user will click on submit button$")
	public void user_will_click_on_submit_button() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='u_0_i']")).click();
	   
	}

	@Then("^user will create new account successfully$")
	public void user_will_create_new_account_successfully() throws Throwable {
		System.out.println("User has created new account successfully ");

	}


}
