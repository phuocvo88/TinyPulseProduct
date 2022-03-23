package tinyPulse.user;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.PageGeneratorManager;
import pageObjects.tinyPulse.user.LoginPageObject;
import pageObjects.tinyPulse.user.SignUpPageObject;
import pageObjects.tinyPulse.user.UserDashboardPageObject;

public class LoginPageTest extends BaseTest{
	private WebDriver driver;

	private LoginPageObject loginPage;
	private UserDashboardPageObject userDashboardPage;
	private String emailAddress, validPassword; 
	
	@Parameters({"browser","url"})
	@BeforeClass
	public void beforeClass(String browserName, String url) {

		driver = getBrowserDriver(browserName, url);

		loginPage = PageGeneratorManager.getLoginPage(driver);

		
		validPassword = "Tt@123456789";
		emailAddress = "employee01@gmail.com"; // web mail server

	
	}

	@Test
	public void Login_01_UserLogInSuccessful() {
		loginPage.inputToEmailOrUsernameTextbox(emailAddress);
		loginPage.clickToContinueButton();
		loginPage.inputPasswordTextbox(validPassword);
		userDashboardPage = loginPage.clickToSignInButton();
		
		userDashboardPage.clickToUserAvatarDropdown();
		Assert.assertTrue(userDashboardPage.isLogOutButtonDisplayed());
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
