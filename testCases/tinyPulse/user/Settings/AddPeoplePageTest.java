package tinyPulse.user.Settings;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.PageGeneratorManager;
import pageObjects.tinyPulse.user.LoginPageObject;
import pageObjects.tinyPulse.user.UserDashboardPageObject;
import pageObjects.tinyPulse.user.settings.AddPeoplePageObject;

public class AddPeoplePageTest extends BaseTest {
	private WebDriver driver;

	private LoginPageObject loginPage;
	private UserDashboardPageObject userDashboardPage;
	private AddPeoplePageObject addPeoplePage;
	private String emailAddress, validPassword;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String url) throws InterruptedException {
		
		driver = getBrowserDriver(browserName, url);

		loginPage = PageGeneratorManager.getLoginPage(driver);

		validPassword = "Tt@123456789";
		emailAddress = "employee02@gmail.com";
		
		userDashboardPage = loginPage.LoginSuccessfulUserAccount(emailAddress, validPassword);

		addPeoplePage = userDashboardPage.clickToSubMenuAddPeopleLink();

	}

	@Test
	public void AddPeople_01_AddPeopleSuccessful() {
		addPeoplePage.inputFirstNameTextbox("Elon");
		addPeoplePage.inputLastNameTextbox("Tesla");
		addPeoplePage.inputEmailTextbox(addPeoplePage.generateFakeEmail());
		addPeoplePage.inputStartDate();
//		addPeoplePage.inputManager();
		addPeoplePage.clickToAddPeopleButton();
		

		Assert.assertTrue(addPeoplePage.isTextCongratDisplayed());
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
