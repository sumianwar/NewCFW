import PageObject.Page;
import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class MyStepdefs extends Config {

    Page signup = new Page (driver);

    @Given("I'm in hotels.com signup page")
    public void iMInHotelsComSignupPage() {
        signup.goToSignupPage();
    }

    @When("I fill out the email field")
    public void iFillOutTheEmailField() {
        signup.Email();
    }

    @And("I fill out the Password field")
    public void iFillOutThePasswordField() {
        signup.Password();
    }

    @And("I input First name and Last name")
    public void iInputFirstNameAndLastName() {
        signup.FirstName();
        signup.LastName();
    }

    @And("I click on the create my account button")
    public void iClickOnTheCreateMyAccountButton() {
        signup.CreateMyAccount();
    }

    @Then("I will verify my account is created successfully")
    public void iWillVerifyMyAccountIsCreatedSuccessfully() {
        signup.YourMemberBenefits();
    }
}
