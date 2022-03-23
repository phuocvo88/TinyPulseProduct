package pageObjects.tinyPulse.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageObjects.tinyPulse.user.settings.AddPeoplePageObject;
import pageUIs.tinyPulse.user.BasePageUI;


public class UserDashboardPageObject extends BasePage {
	WebDriver driver;

	public UserDashboardPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToUserAvatarDropdown() {
		waitForElementClickable(driver, BasePageUI.AVATAR_DROPDOWN);
		clickToElement(driver, BasePageUI.AVATAR_DROPDOWN);
	}

	public AddPeoplePageObject clickToSubMenuAddPeopleLink() throws InterruptedException {
		
		//waitForElementInvisible(driver, BasePageUI.SPINNER_BACKDROP_LAYER);
		//fluentWaitAndClickSettings(driver);
		Thread.sleep(10000);
		
		scrollToElementByJS(driver, BasePageUI.MENU_SETTINGS);
		clickToElementByJS(driver, BasePageUI.SUBMENU_ADDPEOPLE);

		return PageGeneratorManager.getSettingsAddPeoplePage(driver);
	}

	public boolean isLogOutButtonDisplayed() {
		waitForElementVisible(driver, BasePageUI.LOGOUT_BUTTON);
		return isElementDisplayed(driver, BasePageUI.LOGOUT_BUTTON);
	}

}
