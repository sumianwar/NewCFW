package PageObject;

import base.Config;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Page extends Config {
    Faker faker = new Faker();

    public Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }

    @FindBy(how = How.NAME, using = "email")
    public WebElement email;
    @FindBy(how = How.ID, using = "sign-up-password")
    public WebElement password;
    @FindBy(how = How.NAME, using = "firstName")
    public WebElement firstName;
    @FindBy(how = How.NAME, using = "lastName")
    public WebElement lastName;
    @FindBy(how = How.ID, using = "signup-button")
    public WebElement createMyAccount;
    @FindBy(how = How.XPATH, using = "*[@id='main-content']/div/div/div[3]/div/h2")
    public WebElement YourMemberBenefits;

    public void goToSignupPage() {
        String getCurrentUrl = driver.getCurrentUrl();
        // String signupPageUrl = getCurrentUrl + "home/signup";
        System.out.println(getCurrentUrl);
        //driver.get(signupPageUrl);
    }

    public void Email() {

        email.sendKeys(faker.internet().safeEmailAddress());
    }

    public void Password() {

        password.sendKeys("test1234$");
    }

    public void FirstName() {

        firstName.sendKeys(faker.name().firstName());

    }

    public void LastName() {

        lastName.sendKeys(faker.name().lastName());
    }

    public void CreateMyAccount() {

        createMyAccount.click();

    }
    public void YourMemberBenefits() {
        String expected = "Your member benefits ";
        String actual = YourMemberBenefits.getText();
        System.out.println("actual message from webpage is: " + actual);
        Assert.assertEquals(actual, expected);
    }

}