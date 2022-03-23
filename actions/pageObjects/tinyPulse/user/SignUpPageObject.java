package pageObjects.tinyPulse.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;


public class SignUpPageObject extends BasePage {
	WebDriver driver;
	
	public SignUpPageObject(WebDriver driver) {
		this.driver = driver;
	}

}
