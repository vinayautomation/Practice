package stepDefinitions;



import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.pages.LoginPage;
import com.testBase.TestBase;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Login extends TestBase {

	LoginPage loginPage;
	WebDriverWait wait;
	Actions action;

	public Login() {
		super();
	}
	
	@Before
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		action = new Actions(driver);
	}

	@Given("^user is on valid login page$")
	public void user_is_on_valid_login_page() {
		wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(loginPage.lblLoginLogo));
		boolean logoValidation = loginPage.lblLoginLogo.isDisplayed();
		Assert.assertTrue("User not in Login page.", logoValidation);
	}

	@When("^user enters valid username and password$")
	public void user_enters_valid_username_and_password() {
		loginPage.edtEmail.sendKeys(prop.getProperty("username"));
		loginPage.edtPassword.sendKeys(prop.getProperty("password"));
		driver.switchTo().frame(0);
		action.click(loginPage.chkNotRobot).build().perform();
		//loginPage.chkNotRobot.click();
	}

	@When("^click on login button$")
	public void click_on_login_button() {
		driver.switchTo().parentFrame();
		loginPage.btnLogin.click();
	}

	@Then("^user logged in application successfully$")
	public void user_logged_in_application_successfully() {
		
		
	}

}
