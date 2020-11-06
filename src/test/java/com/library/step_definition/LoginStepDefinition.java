package com.library.step_definition;

import com.library.pages.LoginPage;
import com.library.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition {
    LoginPage loginPage = new LoginPage();

    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");
    }


    @When("user logs in")
    public void user_logs_in() throws InterruptedException{
        loginPage.login();
        Thread.sleep(3000);
    }


    @Then("user should see library page")
    public void user_should_see_library_page() {
        String expectedTitle = "Library";
        String actualTitle =  loginPage.getPageSubTitleText();

        Assert.assertEquals("Title NOT correct",expectedTitle,actualTitle);
        System.out.println("I see the Library page!");
        Driver.closeDriver();
    }

}
