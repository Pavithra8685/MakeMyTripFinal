package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainReservationPages {
	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]/div[3]/div/div[2]")
	WebElement loginField;

	@FindBy(xpath = "//input[@id='username']")
	WebElement emailField;

	@FindBy(xpath = "//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button")
	WebElement continueField;

	@FindBy(xpath = " //*[@id=\"password\"]")
	WebElement passwordField;

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/section[1]/form[1]/div[2]/button[1]")
	WebElement submitLogin;

	@FindBy(xpath = "//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/div[1]/div/span")
	WebElement closePopup;

	@FindBy(xpath = "//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[5]/a/span[1]")
	WebElement trains;

	@FindBy(xpath = "//span[contains(text(),'From')]")
	WebElement fromPlace;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")
	WebElement chooseFrom;

	@FindBy(xpath = "//*[@id=\"react-autowhatever-1\"]/div/ul/li/div/div")
	List<WebElement> FromList;
	
	@FindBy(xpath="//span[@class=\"sr_city blackText\"]")
	List<WebElement>fromSuggestions;

	@FindBy(xpath = "//span[contains(text(),'To')]")
	WebElement toPlace;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")
	WebElement chooseTo;

	@FindBy(xpath = "//*[@id=\"react-autowhatever-1\"]/div/ul/li/div/div")
	List<WebElement> ToList;

	@FindBy(xpath = "//*[@id=\"travelDate\"]")
	WebElement travelDate;

	@FindBy(xpath = "//div[@class='DayPicker-Day']")
	List<WebElement> DatePickerList;

	@FindBy(xpath = "//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")
	WebElement datePickerNextButton;

	@FindBy(xpath = "//span[contains(text(),'Class')]")
	WebElement travelClass;

	@FindBy(xpath = "//div/ul[@class='travelForPopup']/li")
	List<WebElement> chooseClass;

	@FindBy(xpath = "//a[contains(text(),'Search')]")
	WebElement searchButton;

	@FindBy(xpath = "//div/ul[@class='filterList']/li/span/label")
	List<WebElement> filters;

	@FindBy(xpath = "//div[@class='train-name']")
	List<WebElement> trainTypeList;

	@FindBy(xpath = "//div[@class='view-routes']")
	WebElement viewRoute;

	@FindBy(xpath = "//*[@class='textRight viewRouteClose cursorPointer']")
	WebElement closeRoute;

	@FindBy(xpath = "//*[@class='false dropdown-options flex align-center']")
	WebElement nearByDate;

//	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[2]")
//	WebElement acTier;

	@FindBy(xpath = "//div[@class='book-now flex align-center']")
	WebElement booking;

	@FindBy(xpath = "/html/body/div[3]/div/div/div/div/div[3]")
	WebElement selectBooking;
	
	//@FindBy(xpath = "//label[@class='font14 blackText']")
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/section[1]/div[2]/div/ul/li[1]/div[1]/span[1]/label")
	WebElement selectCancellation;
	

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/section[1]/div[3]/div[2]/div/a/span[2]")
	WebElement addTraveller;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/section[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/span[1]")
	WebElement selectTraveller;

	@FindBy(xpath = "//*[@id=\"name\"]")
	WebElement name;

	@FindBy(xpath = "//*[@id=\"age\"]")
	WebElement age;

	@FindBy(xpath = "//*[@id=\"mmt-rails-add-traveller\"]/div/li/div[2]/div[1]/div/form/div[3]/div/p")
	WebElement gender;

	@FindBy(xpath = "//*[@id=\"mmt-rails-add-traveller\"]/div/li/div[2]/div[1]/div/form/div[3]/div/ul/li[2]")
	WebElement selectGender;

	@FindBy(xpath = "//*[@id=\"mmt-rails-add-traveller\"]/div/li/div[2]/div[1]/div/form/div[5]/div/p")
	WebElement berth;

	@FindBy(xpath = "//*[@id=\"mmt-rails-add-traveller\"]/div/li/div[2]/div[1]/div/form/div[5]/div/ul/li[2]")
	WebElement selectBerth;

	@FindBy(xpath = "//*[@id=\"mmt-rails-add-traveller\"]/div/li/div[2]/div[2]/a")
	WebElement add;

	@FindBy(xpath = "//input[@id='irctcUserName']")
	WebElement irctcUsername;
	
	@FindBy(xpath="//*[@id=\"mmt-irctc-modal\"]/div[1]/div[1]/div/div")
	WebElement clickIrctcName;
	
	@FindBy(xpath="//*[@id=\"IRCTCUserName\"]")
	WebElement enterIrctcName;
	
	@FindBy(xpath="//body/div[4]/div[1]/div[1]/div[1]/div[2]/button[1]/span[1]")
	WebElement submitUsername;
	
	@FindBy(xpath = "//*[@id=\"contactEmail\"]")
	WebElement email;

	@FindBy(xpath = "//*[@id=\"mobileNumber\"]")
	WebElement mobileNo;

	@FindBy(xpath = "//*[@id=\"address1\"]")
	WebElement address;

	@FindBy(xpath = "//*[@id=\"pincodeNo\"]")
	WebElement pincode;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/section[2]/div[1]/div/div[1]/a")
	WebElement submit;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLoginField() {
		return loginField;
	}

	public void setLoginField(WebElement loginField) {
		this.loginField = loginField;
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public void setEmailField(WebElement emailField) {
		this.emailField = emailField;
	}

	public WebElement getContinueField() {
		return continueField;
	}

	public void setContinueField(WebElement continueField) {
		this.continueField = continueField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(WebElement passwordField) {
		this.passwordField = passwordField;
	}

	public WebElement getSubmitLogin() {
		return submitLogin;
	}

	public void setSubmitLogin(WebElement submitLogin) {
		this.submitLogin = submitLogin;
	}

	public WebElement getClosePopup() {
		return closePopup;
	}

	public void setClosePopup(WebElement closePopup) {
		this.closePopup = closePopup;
	}

	public WebElement getTrains() {
		return trains;
	}

	public void setTrains(WebElement trains) {
		this.trains = trains;
	}

	public WebElement getFromPlace() {
		return fromPlace;
	}

	public void setFromPlace(WebElement fromPlace) {
		this.fromPlace = fromPlace;
	}

	public WebElement getChooseFrom() {
		return chooseFrom;
	}

	public void setChooseFrom(WebElement chooseFrom) {
		this.chooseFrom = chooseFrom;
	}

	public List<WebElement> getFromList() {
		return FromList;
	}

	public void setFromList(List<WebElement> fromList) {
		FromList = fromList;
	}

	public List<WebElement> getFromSuggestions() {
		return fromSuggestions;
	}

	public void setFromSuggestions(List<WebElement> fromSuggestions) {
		this.fromSuggestions = fromSuggestions;
	}

	public WebElement getToPlace() {
		return toPlace;
	}

	public void setToPlace(WebElement toPlace) {
		this.toPlace = toPlace;
	}

	public WebElement getChooseTo() {
		return chooseTo;
	}

	public void setChooseTo(WebElement chooseTo) {
		this.chooseTo = chooseTo;
	}

	public List<WebElement> getToList() {
		return ToList;
	}

	public void setToList(List<WebElement> toList) {
		ToList = toList;
	}

	public WebElement getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(WebElement travelDate) {
		this.travelDate = travelDate;
	}

	public List<WebElement> getDatePickerList() {
		return DatePickerList;
	}

	public void setDatePickerList(List<WebElement> datePickerList) {
		DatePickerList = datePickerList;
	}

	public WebElement getDatePickerNextButton() {
		return datePickerNextButton;
	}

	public void setDatePickerNextButton(WebElement datePickerNextButton) {
		this.datePickerNextButton = datePickerNextButton;
	}

	public WebElement getTravelClass() {
		return travelClass;
	}

	public void setTravelClass(WebElement travelClass) {
		this.travelClass = travelClass;
	}

	public List<WebElement> getChooseClass() {
		return chooseClass;
	}

	public void setChooseClass(List<WebElement> chooseClass) {
		this.chooseClass = chooseClass;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}

	public List<WebElement> getFilters() {
		return filters;
	}

	public void setFilters(List<WebElement> filters) {
		this.filters = filters;
	}

	public List<WebElement> getTrainTypeList() {
		return trainTypeList;
	}

	public void setTrainTypeList(List<WebElement> trainTypeList) {
		this.trainTypeList = trainTypeList;
	}

	public WebElement getViewRoute() {
		return viewRoute;
	}

	public void setViewRoute(WebElement viewRoute) {
		this.viewRoute = viewRoute;
	}

	public WebElement getCloseRoute() {
		return closeRoute;
	}

	public void setCloseRoute(WebElement closeRoute) {
		this.closeRoute = closeRoute;
	}

	public WebElement getNearByDate() {
		return nearByDate;
	}

	public void setNearByDate(WebElement nearByDate) {
		this.nearByDate = nearByDate;
	}

	public WebElement getBooking() {
		return booking;
	}

	public void setBooking(WebElement booking) {
		this.booking = booking;
	}

	public WebElement getSelectBooking() {
		return selectBooking;
	}

	public void setSelectBooking(WebElement selectBooking) {
		this.selectBooking = selectBooking;
	}
	
	public WebElement getSelectCancellation() {
		return selectCancellation;
	}

	public void setSelectCancellation(WebElement selectCancellation) {
		this.selectCancellation = selectCancellation;
	}

	public WebElement getSelectTraveller() {
		return selectTraveller;
	}

	public void setSelectTraveller(WebElement selectTraveller) {
		this.selectTraveller = selectTraveller;
	}

	public WebElement getAddTraveller() {
		return addTraveller;
	}

	public void setAddTraveller(WebElement addTraveller) {
		this.addTraveller = addTraveller;
	}

	public WebElement getName() {
		return name;
	}

	public void setName(WebElement name) {
		this.name = name;
	}

	public WebElement getAge() {
		return age;
	}

	public void setAge(WebElement age) {
		this.age = age;
	}

	public WebElement getGender() {
		return gender;
	}

	public void setGender(WebElement gender) {
		this.gender = gender;
	}

	public WebElement getSelectGender() {
		return selectGender;
	}

	public void setSelectGender(WebElement selectGender) {
		this.selectGender = selectGender;
	}

	public WebElement getBerth() {
		return berth;
	}

	public void setBerth(WebElement berth) {
		this.berth = berth;
	}

	public WebElement getSelectBerth() {
		return selectBerth;
	}

	public void setSelectBerth(WebElement selectBerth) {
		this.selectBerth = selectBerth;
	}
	

	public WebElement getAdd() {
		return add;
	}

	public void setAdd(WebElement add) {
		this.add = add;
	}
	

	public WebElement getIrctcUsername() {
		return irctcUsername;
	}

	public void setIrctcUsername(WebElement irctcUsername) {
		this.irctcUsername = irctcUsername;
	}
	

	public WebElement getClickIrctcName() {
		return clickIrctcName;
	}

	public void setClickIrctcName(WebElement clickIrctcName) {
		this.clickIrctcName = clickIrctcName;
	}

	public WebElement getEnterIrctcName() {
		return enterIrctcName;
	}

	public void setEnterIrctcName(WebElement enterIrctcName) {
		this.enterIrctcName = enterIrctcName;
	}

	public WebElement getSubmitUsername() {
		return submitUsername;
	}

	public void setSubmitUsername(WebElement submitUsername) {
		this.submitUsername = submitUsername;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(WebElement mobileNo) {
		this.mobileNo = mobileNo;
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(WebElement address) {
		this.address = address;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public void setPincode(WebElement pincode) {
		this.pincode = pincode;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}

	public TrainReservationPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
