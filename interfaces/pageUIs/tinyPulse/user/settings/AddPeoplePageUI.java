package pageUIs.tinyPulse.user.settings;

public class AddPeoplePageUI {

	
	public static final String SETTINGS_MENU_LINK = "xpath=//span[text()='Settings']";
	public static final String SETTINGS_MENU_ADD_PEOPLE_LINK = "xpath=//span[text()='Add People']";
	
	public static final String FIRST_NAME_TEXTBOX = "xpath=(//input[@field='firstName'])[1]";
	public static final String LAST_NAME_TEXTBOX = "xpath=(//input[@field='lastName'])[1]";
	public static final String EMAIL_TEXTBOX = "xpath=(//input[@field='email'])[1]";
	
	public static final String START_DATE_DATEPICKER = "xpath=(//input[@field='startDate'])[1]";
	public static final String DATE_ITEM = "xpath=//div[@class='DateItem__item___14Cn2 DatesPicker__cell___3oOSl DateItem__inCurrentMonth___3N-tW']";
	
	public static final String MANAGER_DROPDOWN = "xpath=(//td[@data-cucumber='manager']//div[@aria-label='Dropdown Trigger'])[1]";
	public static final String MANAGER_SEARCH_TEXTBOX = "xpath=//div[@data-cucumber='dropdown-menu']//input";
	
	
	public static final String ADD_PEOPLE_BUTTON = "xpath=//div[contains(@class, 'cucumber-send-invite-button')]/span[text()='Add People']";
	
	public static final String CONGRAT_TEXT = "xpath=//div[@class='tu mv3 fw6 f3 flex items-center green' and text()='Congratulations']";
}
