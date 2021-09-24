package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusesPages {

	WebDriver driver;

	public BusesPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// BusesImage icon.
	// @FindBy(xpath="//div[@class=\"autopop__wrap makeFlex column
	// defaultCursor\"]") WebElement popup;

	@FindBy(xpath = "//p[@class=\"font14 latoBold blackText appendBottom5 cursorPointer makeRelative\"]")
	WebElement Login;
	@FindBy(id = "username")
	WebElement Username;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/section[1]/form[1]/div[2]/button[1]")
	WebElement Continuebtn;
	@FindBy(xpath = "//input[@id='password']")
	WebElement Password;
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/section[1]/form[1]/div[2]/button[1]")
	WebElement Loginbtn;
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/section[1]/div[1]/div[1]/span[1]")
	WebElement Closebtn;

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[6]/a[1]/span[1]")
	WebElement BusesImagebtn;
	@FindBy(id = "fromCity")
	WebElement FromCity;
	@FindBy(xpath = "//p[@class=\"searchedResult font14 darkText\"]")
	List<WebElement> FromSuggestions;
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement FromSearchbox;
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement ToLocation;
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement ToSearchbox;
	@FindBy(xpath = "//p[@class=\"searchedResult font14 darkText\"]")
	List<WebElement> ToSuggestion;
	@FindBy(id = "travelDate")
	WebElement traveldate;
	@FindBy(xpath = "//div[@class=\"DayPicker-Day\"][contains(@aria-label,'Oct 25 2021')]")
	WebElement date;
	@FindBy(xpath = "//button[@id='search_button']")
	WebElement Searchbox;

	// body/div[@id='root']/div[1]/div[4]/div[2]/div[4]/div[1]/div[2]/a[1]
	// @FindBy(xpath="//body/div[@id='root']/div[1]/div[4]/div[2]/div[4]/div[1]/div[2]/a[1]")
	// WebElement SelectSeat;
	// @FindBy(xpath="//body/div[@id='root']/div[1]/div[4]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/img[1]")
	// WebElement seat;

	// @FindBy(xpath="//body/div[@id='root']/div[1]/div[4]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/div[5]")
	// WebElement bookseats;

	@FindBy(id = "fname")
	WebElement TravellerName;
	@FindBy(id = "age")
	WebElement TravellerAge;
	@FindBy(xpath = "//div[@class=\"GenderDropDownContainer\"]")
	WebElement TravellerGender;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/section[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/ul[1]/li[1]")
	WebElement male;
	@FindBy(xpath = "//body/div[@id='root']/div[3]/div[1]/section[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/ul[1]/li[2]")
	WebElement female;
	@FindBy(id = "contactEmail")
	WebElement Emailid;
	@FindBy(id = "mobileNumber")
	WebElement Mobileno;

	@FindBy(xpath = "//body/div[@id='root']/div[3]/div[1]/section[1]/div[4]/div[1]/div[1]/ul[1]/li[1]/div[1]/span[1]/span[1]")
	WebElement megabus;
	@FindBy(xpath = "//body/div[@id='root']/div[3]/div[1]/section[1]/div[5]/div[1]/div[4]/div[1]/span[1]/span[1]")
	WebElement TermsAndConditions;

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[4]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/div[1]/div[1]/span[1]")
	WebElement Sleeper;
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[4]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[2]/div[1]/div[1]/span[1]")
	WebElement AC;
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[4]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[3]/div[1]/div[1]/span[1]")
	WebElement BoardingPoint;
	
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[4]/div[1]/div[2]/ul[1]/li[5]/ul[1]/li[4]/div[1]/div[1]/span[1]")
	WebElement DroppingPoint;
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[4]/div[1]/div[2]/ul[1]/li[6]/ul[1]/li[2]/div[1]/div[1]/span[1]")
	WebElement Operators;
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[4]/div[1]/div[2]/ul[1]/li[7]/div[2]/div[5]")
	WebElement PickupTime;
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[4]/div[1]/div[2]/ul[1]/li[8]/div[2]/div[1]/span[2]")
	WebElement DropTime;
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[4]/div[1]/div[2]/ul[1]/li[9]/ul[1]/li[2]/div[1]/div[1]/span[1]/span[1]")
	WebElement BusType;
	
	
	@FindBy(xpath="//span[@class=\"latoBlack font22 blackText appendRight15\"]")
	List<WebElement> BusesAvailable;
	
	@FindBy(xpath="//div//img[@class=\"seat-icon\"]")
	List<WebElement> SeatsAvailable;
	
	

	
	
	
	
	@FindBy(xpath = "//a[@class=\"sc-jKJlTe bPClQZ\"]")
	WebElement SelectSeats;
	
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[4]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[12]/img[1]")
	WebElement Seat;
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[4]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/div[6]")
	WebElement BookSeats;
	@FindBy(xpath = "//div[contains(text(),'CLEAR')]")
	WebElement Clear;
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[4]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/div[1]/div[1]/span[2]")
	WebElement SleeperFilter;
	
	@FindBy(xpath="//div[@class=\"DayPicker-Day\"]")
	List<WebElement> DatePickerDay;
	
	@FindBy(xpath="//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")
	WebElement  DayPickerNavButton;
	
    @FindBy(xpath="//body/div[@id='root']/div[3]/div[1]/section[2]/div[1]/div[1]/a[1]")
    WebElement ContinuetoBooknowbtn;
	
	public WebElement getDayPickerNavButton() {
		return DayPickerNavButton;
	}

	public WebElement getLogin() {
		return Login;
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getContinuebtn() {
		return Continuebtn;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLoginbtn() {
		return Loginbtn;
	}

	public WebElement getClosebtn() {
		return Closebtn;
	}

	public WebElement getBusesImagebtn() {
		return BusesImagebtn;
	}

	public WebElement getFromCity() {
		return FromCity;
	}

	public List<WebElement> getFromSuggestions() {
		return FromSuggestions;
	}

	public WebElement getFromSearchbox() {
		return FromSearchbox;
	}

	public WebElement getToLocation() {
		return ToLocation;
	}

	public WebElement getToSearchbox() {
		return ToSearchbox;
	}

	public List<WebElement> getToSuggestion() {
		return ToSuggestion;
	}

	public WebElement getTraveldate() {
		return traveldate;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getSearchbox() {
		return Searchbox;
	}

	public WebElement getTravellerName() {
		return TravellerName;
	}

	public WebElement getTravellerAge() {
		return TravellerAge;
	}

	public WebElement getTravellerGender() {
		return TravellerGender;
	}

	public WebElement getMale() {
		return male;
	}

	public WebElement getFemale() {
		return female;
	}

	public WebElement getEmailid() {
		return Emailid;
	}

	public WebElement getMobileno() {
		return Mobileno;
	}

	public WebElement getMegabus() {
		return megabus;
	}

	public WebElement getTermsAndConditions() {
		return TermsAndConditions;
	}

	public WebElement getSleeper() {
		return Sleeper;
	}

	public WebElement getPickupTime() {
		return PickupTime;
	}

	public WebElement getBusType() {
		return BusType;
	}

	public WebElement getClear() {
		return Clear;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSleeperFilter() {
		return SleeperFilter;
	}

	public WebElement getAC() {
		return AC;
	}

	public WebElement getBoardingPoint() {
		return BoardingPoint;
	}

	public WebElement getDroppingPoint() {
		return DroppingPoint;
	}

	public WebElement getOperators() {
		return Operators;
	}

	public WebElement getDropTime() {
		return DropTime;
	}

	public WebElement getSelectSeats() {
		return SelectSeats;
	}

	public WebElement getSeat() {
		return Seat;
	}

	public WebElement getBookSeats() {
		return BookSeats;
	}

	public List<WebElement> getBusesAvailable() {
		return BusesAvailable;
	}

	public List<WebElement> getSeatsAvailable() {
		return SeatsAvailable;
	}



	public List<WebElement> getDatePickerDay() {
		return DatePickerDay;
	}

	public WebElement getContinuetoBooknowbtn() {
		return ContinuetoBooknowbtn;
	}
	
	

}