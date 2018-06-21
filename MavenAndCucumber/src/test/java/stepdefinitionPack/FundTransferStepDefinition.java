package stepdefinitionPack;

import org.openqa.selenium.By;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FundTransferStepDefinition extends AbstractClass{

    @Given("^I am on fund transfer web page$")
    public void i_am_on_fund_transfer_web_page() throws Throwable {

        driver.get("file:///E:/WebSite/JavaScript/FundTransfer.html");

    }

    @When("^I enter valid payee \"(.*?)\" and valid amount \"(.*?)\"$")
    public void i_enter_valid_payee_and_valid_amount(String payee, String amount) throws Throwable {
        driver.findElement(By.xpath(".//*[@id='payee']")).sendKeys(payee);
        driver.findElement(By.xpath(".//*[@id='amount']")).sendKeys(amount);

    }

    @When("^I click on Transfer button$")
    public void i_click_on_Transfer_button() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='transfer']")).click();

    }

    @Then("^I should get success message \"(.*?)\"$")
    public void i_should_get_success_message(String expectedMessage) throws Throwable {

        String actualMessage=driver.findElement(By.xpath(".//*[@id='message']")).getText();
        Assert.assertEquals(expectedMessage, actualMessage);


    }

    @When("^I enter valid payee \"(.*?)\" and invalid amount \"(.*?)\"$")
    public void i_enter_valid_payee_and_invalid_amount(String payee, String amount) throws Throwable {
        driver.findElement(By.xpath(".//*[@id='payee']")).sendKeys(payee);
        driver.findElement(By.xpath(".//*[@id='amount']")).sendKeys(amount);


    }
    @When("^I enter invalid payee \"(.*?)\" and valid amount \"(.*?)\"$")
    public void i_enter_invalid_payee_and_valid_amount(String payee, String amount) throws Throwable {
        driver.findElement(By.xpath(".//*[@id='payee']")).sendKeys(payee);
        driver.findElement(By.xpath(".//*[@id='amount']")).sendKeys(amount);

    }
    @Then("^I should get fail message \"(.*?)\"$")
    public void i_should_get_fail_message(String expectedMessage) throws Throwable {

        String actualMessage=driver.findElement(By.xpath(".//*[@id='message']")).getText();

        Assert.assertEquals(expectedMessage, actualMessage);

    }
	

}
