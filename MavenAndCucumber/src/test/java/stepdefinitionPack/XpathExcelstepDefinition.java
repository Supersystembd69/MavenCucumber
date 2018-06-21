package stepdefinitionPack;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.DataHelper;


public class XpathExcelstepDefinition {
	WebDriver driver;
	List<HashMap<String,String>>datamap;
	
	public XpathExcelstepDefinition() throws IOException{
		driver=Hook.driver;
		datamap=DataHelper.data(System.getProperty("user.dir")+"//src//test//resources//TestData//Xpath.xlsx", "Data1");
	}
	
	@Given("^User is on Xpath web page$")
	public void user_is_on_Xpath_web_page() throws Throwable {
		driver.get("file:///C:/Users/A%20R%20Tarafder/OneDrive/Dynamic/OurWebSite.html");
	    
	}
	@When("^User will enter and click and select \"(.*?)\"$")
	public void user_will_enter_and_click_and_select(String arg1) throws Throwable {
		int index=Integer.parseInt(arg1)-1;
		
		driver.findElement(By.xpath("//input[1]")).sendKeys(datamap.get(index).get("First Name"));
		driver.findElement(By.xpath("//input[2]")).sendKeys(datamap.get(index).get("Last Name"));
		driver.findElement(By.xpath("//input[3]")).sendKeys(datamap.get(index).get("Email"));
		driver.findElement(By.xpath("//input[4]")).sendKeys(datamap.get(index).get("AgEmail"));
		driver.findElement(By.xpath("//input[5]")).sendKeys(datamap.get(index).get("Password"));
		
		if(datamap.get(index).get("Sex").equalsIgnoreCase("Male")){
		driver.findElement(By.xpath("//input[7]")).click();
		}
		else if(datamap.get(index).get("Sex").contentEquals("Female")){
		driver.findElement(By.xpath("//input[8]")).click();
		}
		
		Select Monthselect=new Select(driver.findElement(By.id("MN")));
		Monthselect.selectByVisibleText(datamap.get(index).get("Month"));
		
	    Select DaySelect=new Select(driver.findElement(By.id("DY")));
	    DaySelect.selectByVisibleText(datamap.get(index).get("Day"));
	    
	    Select YearSelect=new Select(driver.findElement(By.id("YR")));
	    YearSelect.selectByVisibleText(datamap.get(index).get("Year"));
	   
	    
	}
	@When("^User will click on submit button$")
	public void user_will_click_on_submit_button() throws Throwable {
	    
	}

	@Then("^User will fill up successfully$")
	public void user_will_fill_up_successfully() throws Throwable {
		System.out.println("Xpath signup is completed successfully");
	    
	}
}
