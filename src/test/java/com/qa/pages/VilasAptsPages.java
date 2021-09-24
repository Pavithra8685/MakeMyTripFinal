package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class VilasAptsPages {
	WebDriver Driver;
	
	public VilasAptsPages(WebDriver Driver) {
		this.Driver = Driver;
		PageFactory.initElements(Driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]")
	WebElement loginOrCreateAccBtn;
	
	@FindBy(xpath = "//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]/div[3]/div/div[2]")
	WebElement loginUsingMailButton;
	
	@FindBy(id="username")
	WebElement usernameField;
	
	@FindBy(xpath = "//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button")
	WebElement continueBtn;
	
	@FindBy(id="password")
	WebElement passwordField;
	
	@FindBy(xpath = "//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button")
	WebElement loginButton;
	
	@FindBy(xpath = "//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[3]/a")
	WebElement villasAndAptsLink;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[1]/div[1]/label")
	WebElement city;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[1]/div[1]/div[1]/div/div/div/input")
	WebElement cityInput;
	
	@FindBy(css = "p[class='locusLabel appendBottom5']")
	List<WebElement> cityNames;
	
	@FindBy(xpath = "//input[@id='checkin']")
	WebElement checkIn;
	
	@FindBy(xpath = "//div[@aria-label]")
	List<WebElement> datePickerDates;
	////div[@class='DayPicker-Day']
									
	@FindBy(xpath = "//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")
	WebElement datePickerNextBtn;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[6]")
	WebElement checkInDate;
	
	@FindBy(xpath = "//input[@id='checkout']")
	WebElement checkOut;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[7]")
	WebElement checkOutDate;
	
	@FindBy(xpath = "//input[@id='guest']")
	WebElement guestOpt;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[1]/div[4]/div[1]/div[1]/div/div[2]/div/ul[1]")
	List<WebElement> noOfAdultsOptionsList;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[1]/div[4]/div[1]/div[1]/div/div[2]/div/ul[2]")
	List<WebElement> noOfChildrenOptionsList;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[1]/div[4]/div[1]/div[1]/div/div[2]/div/ul[1]/li[2]")
	WebElement noOfGuests;
	
	@FindBy(xpath = "//button[contains(text(),'APPLY')]")
	WebElement applyBtn;
	
	@FindBy(xpath = "//button[@id='hsw_search_button']")
	WebElement searchBtn;
	
	@FindBy(xpath = "//*[@id=\"Listing_hotel_0\"]/a/div/div")
	WebElement chooseApmtOrVillas;

	@FindBy(xpath= "//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/span/a")		
	WebElement viewThisComboBtn;
	////a[contains(text(),'BOOK THIS NOW')]
	//"//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div[2]/span/a")
	
	@FindBy(xpath = "//*[@id=\"RoomType\"]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/a")
	WebElement selectComboBtn;
	
	@FindBy(xpath = "//*[@id=\"room0\"]/div[2]/div[1]/div[2]/div/div/div[2]/a")
	WebElement selectRoomBtn;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/form/div[1]/div[1]/span")
	WebElement myselfRadioBtn;
	//xpath = "//*[@id=\"myself\"]")
	//xpath = "//input[@id='myself']")
	//*[@id="myself"]
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/form/div[1]/div[2]/span")
	WebElement someoneElseRadioBtn;
	
	@FindBy(xpath = "//*[@id=\"title\"]")
	WebElement titleDropDown;
	
	@FindBy(id = "fName")
	WebElement firstNameBox;
	
	@FindBy(id = "lName")
	WebElement lastNameBox;
	
	@FindBy(id = "email")
	WebElement emailAddressbox;
	
	@FindBy(id = "mCode")
	WebElement countryCodeDropDown;
	
	@FindBy(id = "mNo")
	WebElement mobileNumberBox;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[7]/div[1]/a")
	WebElement bookNowBtn;
	//*[@id="root"]/div/div[2]/div/div[2]/div[1]/div[6]/div/a
	//linkText = "Pay Now
	////*[@id="root"]/div/div[2]/div/div[2]/div[1]/div[6]/div[1]/a
	//*[@id="root"]/div/div[2]/div/div[2]/div[1]/div[6]/div[1]/a
	//"<a class=\"btnContinuePayment primaryBtn capText  \">Book @ ₹ 0</a>"
	//xpath = "//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[6]/div[1]/a")
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[6]/div[2]")
	WebElement payNowToolTip;
	
	public WebElement getloginOrCreateAccBtn() {
		return loginOrCreateAccBtn;
	}
	
	public WebElement getLoginUsingMailButton() {
		return loginUsingMailButton;
	}
	
	public WebElement getUsernameField() {
		return usernameField;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}
	
	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public WebElement getvillasAndAptsLink() {
		return villasAndAptsLink;
	}
	
	public WebElement getCity() {
		return city;
	}
	
	public WebElement getCityInput() {
		return cityInput;
	}

	public List<WebElement> getCityNames() {
		return cityNames;
	}
	
	public WebElement getCheckInBtn() {
		return checkIn;
	}
	
	public WebElement getDatePickerNextBtn() {
		return datePickerNextBtn;
	}
	
	public WebElement getCheckOutBtn() {
		return checkOut;
	}
	
	public WebElement getGuestOpt() {
		return guestOpt;
	}
	
	public WebElement getnoOfGuests() {
		return noOfGuests;
	}
	
	public WebElement getApplyBtn() {
		return applyBtn;
	}
	
	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	public WebElement getChooseApmtOrVillas() {
		return chooseApmtOrVillas;
	}
	
	public WebElement getViewThisComboBtn() {
		return viewThisComboBtn;
	}

	public WebElement getSelectComboBtn() {
		return selectComboBtn;
	}
	public WebElement getSelectRoomBtn() {
		return selectRoomBtn;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getMyselfRadioBtn() {
		return myselfRadioBtn;
	}

	public WebElement getSomeoneElseRadioBtn() {
		return someoneElseRadioBtn;
	}

	public Select getTitleDropDown() {
		Select titleDropDownSelect = new Select(titleDropDown);
		return titleDropDownSelect;
	}

	public WebElement getFirstNameBox() {
		return firstNameBox;
	}

	public WebElement getLastNameBox() {
		return lastNameBox;
	}

	public WebElement getEmailAddressbox() {
		return emailAddressbox;
	}

	public Select getCountryCodeDropDown() {
		Select countryCodeDropDownSelect = new Select(countryCodeDropDown);
		return countryCodeDropDownSelect;
	}

	public WebElement getMobileNumberBox() {
		return mobileNumberBox;
	}

	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}

	public WebElement getPayNowToolTip() {
		return payNowToolTip;
	}

	public List<WebElement> getDatePickerDates() {
		return datePickerDates;
	}

	public List<WebElement> getNoOfAdultsOptionsList() {
		return noOfAdultsOptionsList;
	}

	public List<WebElement> getNoOfChildrenOptionsList() {
		return noOfChildrenOptionsList;
	}

	
}
