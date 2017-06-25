package tests;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by thivyalakshimi on 25/06/17.
 */
public class MyStepdefs extends BaseStep {
    @Before
    public void setUp(){
        startDriver();
        driver.navigate().to("http://accountsdemo.herokuapp.com");
    }

    @Given("^I login to application$")
    public void iLoginToApplication() throws Throwable {
        loginPage.login();
    }

    @When("^I search for a client$")
    public void iSearchForAClient() throws Throwable {
        homePage.goToClientsPage();
        clientsPage.searchClient();

    }

    @Then("^I am able to view client details$")
    public void iAmAbleToViewClientDetails() throws Throwable {
        assert (clientsPage.getClientName().equalsIgnoreCase("Thoughtworks 1")); ;

    }

    @And("^I am able to update client details$")
    public void iAmAbleToUpdateClientDetails() throws Throwable {
        editClientDetailsPage.editClientDetails();

    }

    @Then("^I logout of application$")
    public void iLogoutOfApplication() throws Throwable {
        loginPage.logout();
    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}

