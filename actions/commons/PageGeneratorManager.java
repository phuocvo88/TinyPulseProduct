package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.tinyPulse.user.LoginPageObject;
import pageObjects.tinyPulse.user.SignUpPageObject;
import pageObjects.tinyPulse.user.UserDashboardPageObject;
import pageObjects.tinyPulse.user.settings.AddPeoplePageObject;

public class PageGeneratorManager {

	public static SignUpPageObject getSignUpPage(WebDriver driver) {
		return new SignUpPageObject(driver);
	}

	public static LoginPageObject getLoginPage(WebDriver driver) {
		return new LoginPageObject(driver);
	}

	public static UserDashboardPageObject getUserDashBoardPage(WebDriver driver) {
		return new UserDashboardPageObject(driver);
	}
	
	public static AddPeoplePageObject getSettingsAddPeoplePage(WebDriver driver) {
		return new AddPeoplePageObject(driver);
	}
	

}
