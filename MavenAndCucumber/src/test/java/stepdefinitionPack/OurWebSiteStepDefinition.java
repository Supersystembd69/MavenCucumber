package stepdefinitionPack;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OurWebSiteStepDefinition extends AbstractClass {

	@Given("^user is on registration form web page$")
	public void user_is_on_registration_form_web_page() throws Throwable {
		driver.get("file:///C:/Users/A%20R%20Tarafder/OneDrive/Dynamic/OurWebSite.html");

	}

	@When("^user will Enter \"(.*?)\", \"(.*?)\",\"(.*?)\", \"(.*?)\",\"(.*?)\"$")
	public void user_will_Enter(String FN, String LN, String EM, String AEM, String PW) throws Throwable {
		driver.findElement(By.xpath("//input[1]")).sendKeys(FN);
		driver.findElement(By.xpath("//input[2]")).sendKeys(LN);
		driver.findElement(By.xpath("//input[3]")).sendKeys(EM);
		driver.findElement(By.xpath("//input[4]")).sendKeys(AEM);
		driver.findElement(By.xpath("//input[5]")).sendKeys(PW);

	}

	@When("^user will click on \"(.*?)\"$")
	public void user_will_click_on(String Sex) throws Throwable {
		if(Sex.equalsIgnoreCase("Male")){
			driver.findElement(By.xpath("//input[7]")).click();
		}
		else if(Sex.equalsIgnoreCase("Female")){
			driver.findElement(By.xpath("//input[8]")).click();
		}
	}

	@When("^user will select \"(.*?)\",\"(.*?)\", \"(.*?)\"$")
	public void user_will_select(String MN, String DY, String YR) throws Throwable {
		Select monthSelect=new Select(driver.findElement(By.id("MN")));
		monthSelect.selectByVisibleText(MN);

		Select daySelect=new Select(driver.findElement(By.id("DY")));
		daySelect.selectByVisibleText(DY);

		Select yearSelect=new Select(driver.findElement(By.id("YR")));
		yearSelect.selectByVisibleText(YR);
	}

	@Then("^user will able to register successfully$")
	public void user_will_able_to_register_successfully() throws Throwable {


	}


}
