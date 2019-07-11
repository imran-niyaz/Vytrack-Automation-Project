package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDefs {


    @Given("i am on vytrack login page")
    public void i_am_on_vytrack_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @Then("i login as a sales manager")
    public void i_login_as_a_sales_manager() {

        String user_name = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("passsword");

        LoginPage page = new LoginPage();
        page.username.sendKeys(user_name);
        page.password.sendKeys(password);
        page.login.click();


    }

}
