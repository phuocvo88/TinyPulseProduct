package pageObjects.tinyPulse.user.settings;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.tinyPulse.user.BasePageUI;

import pageUIs.tinyPulse.user.settings.AddPeoplePageUI;

public class AddPeoplePageObject extends BasePage {
	WebDriver driver;

	public AddPeoplePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void inputFirstNameTextbox(String firstName) {
		waitForElementVisible(driver, AddPeoplePageUI.FIRST_NAME_TEXTBOX);
		sendKeyToElement(driver, AddPeoplePageUI.FIRST_NAME_TEXTBOX, firstName);
	}

	public void inputLastNameTextbox(String lastName) {
		waitForElementVisible(driver, AddPeoplePageUI.LAST_NAME_TEXTBOX);
		sendKeyToElement(driver, AddPeoplePageUI.LAST_NAME_TEXTBOX, lastName);
	}

	public void inputEmailTextbox(String email) {
		waitForElementVisible(driver, AddPeoplePageUI.EMAIL_TEXTBOX);
		sendKeyToElement(driver, AddPeoplePageUI.EMAIL_TEXTBOX, email);
	}

	public void inputStartDate() {
		waitForElementClickable(driver, AddPeoplePageUI.START_DATE_DATEPICKER);
		clickToElement(driver, AddPeoplePageUI.START_DATE_DATEPICKER);

		waitForElementClickable(driver, AddPeoplePageUI.DATE_ITEM);
		clickToElement(driver, AddPeoplePageUI.DATE_ITEM);
	}

	public void inputManager() {
		selectItemInCustomDropdown(driver, AddPeoplePageUI.MANAGER_DROPDOWN, AddPeoplePageUI.MANAGER_SEARCH_TEXTBOX,
				"employee02@gmail.com");
	}

	public void clickToAddPeopleButton() {
		waitForElementClickable(driver, AddPeoplePageUI.ADD_PEOPLE_BUTTON);
		clickToElement(driver, AddPeoplePageUI.ADD_PEOPLE_BUTTON);
	}

	public void scrollToViewAndClickToSettingsMenu() {
		scrollToElementByJS(driver, AddPeoplePageUI.SETTINGS_MENU_LINK);
	}

	public void scrollToViewAndClickToAddPeopleLink() {
		scrollToElementByJS(driver, AddPeoplePageUI.SETTINGS_MENU_ADD_PEOPLE_LINK);
	}
	
	
	public boolean isTextCongratDisplayed() {
		waitForAllElementVisible(driver, AddPeoplePageUI.CONGRAT_TEXT);
		return isElementDisplayed(driver, AddPeoplePageUI.CONGRAT_TEXT);
	}



}
