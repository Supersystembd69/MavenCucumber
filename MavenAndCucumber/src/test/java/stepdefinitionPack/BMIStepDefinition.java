package stepdefinitionPack;

import org.openqa.selenium.By;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BMIStepDefinition extends AbstractClass{


	    @Given("^I am on BMI calculator web page$")
	    public void i_am_on_BMI_calculator_web_page() throws Throwable {
	        driver.get("file:///E:/WebSite/JavaScript/BMI.html");
	        driver.manage().window().maximize();

	    }

	    @When("^I enter my \"(.*?)\" in height text field$")
	    public void i_enter_my_in_height_text_field(String height) throws Throwable {
	        driver.findElement(By.id("heightCMS")).sendKeys(height);

	    }

	    @When("^I enter my \"(.*?)\" in weight text field$")
	    public void i_enter_my_in_weight_text_field(String weight) throws Throwable {
	        driver.findElement(By.id("weightKg")).sendKeys(weight);

	    }

	    @When("^I click on Calculate Button$")
	    public void i_click_on_Calculate_Button() throws Throwable {
	        driver.findElement(By.id("Calculate")).click();

	    }

	    @Then("^I will see \"(.*?)\" and \"(.*?)\"$")
	    public void i_will_see_and(String BMIValue, String Catagory) throws Throwable {

	        String BMI=driver.findElement(By.id("bmi")).getAttribute("value");
	        Assert.assertEquals(BMI, BMIValue);
	        System.out.println("BMI is : "+BMI);

	        String catagory=driver.findElement(By.id("bmi_category")).getAttribute("value");
	        Assert.assertEquals(Catagory, catagory);
	        System.out.println("Catagoty is : "+catagory);


	    }

}
