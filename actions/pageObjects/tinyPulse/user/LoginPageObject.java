package pageObjects.tinyPulse.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.tinyPulse.user.UserLoginPageUI;

public class LoginPageObject extends BasePage {
	WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}
	

	public void inputToEmailOrUsernameTextbox(String emailAddress) {
		waitForElementVisible(driver, UserLoginPageUI.USERNAME_EMAIL_TEXTBOX);
		sendKeyToElement(driver, UserLoginPageUI.USERNAME_EMAIL_TEXTBOX, emailAddress);
	}

	public void clickToContinueButton() {
		waitForElementClickable(driver, UserLoginPageUI.CONTINUE_BUTTON);
		clickToElement(driver, UserLoginPageUI.CONTINUE_BUTTON);
	}
	
	public void inputPasswordTextbox(String password) {
		waitForElementVisible(driver, UserLoginPageUI.PASSWORD_TEXTBOX);
		sendKeyToElement(driver, UserLoginPageUI.PASSWORD_TEXTBOX, password);
	}
	
	public UserDashboardPageObject clickToSignInButton() {
		waitForElementClickable(driver, UserLoginPageUI.SIGN_IN_BUTTON);
		clickToElement(driver, UserLoginPageUI.SIGN_IN_BUTTON);
		return PageGeneratorManager.getUserDashBoardPage(driver);
	}
	
	public  UserDashboardPageObject LoginSuccessfulUserAccount(String emailAddress, String password) {
		inputToEmailOrUsernameTextbox(emailAddress);
		clickToContinueButton();
		inputPasswordTextbox(password);
		return clickToSignInButton();
	}
}
