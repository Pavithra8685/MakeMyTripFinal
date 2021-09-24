package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CabBookingPage {

	WebDriver driver;
	public CabBookingPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Cabs")
	WebElement cabImg;

	@FindBy(id = "fromCity")
	WebElement fromBlock;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[2]/label/span")
	WebElement toBlock;

	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[5]/label/span")
	WebElement timeBlock;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div/div/div/input")
	WebElement fromcity;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div/input")
	WebElement tocity;

	@FindBy(xpath= "//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/p/span")
	WebElement firstOptionFrom;

	@FindBy(xpath= "//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/p/span")
	WebElement firstOptionTo;

	@FindBy(xpath="//div[@class='DayPicker-Day']")
	List<WebElement> depDatePicker;

	@FindBy(xpath="//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")
	WebElement datePickerNxtBtn;

	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[3]/label/p[1]")
	WebElement departuredate;

	@FindBy(xpath = "")
	WebElement date;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[5]/ul")
	WebElement time;

	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")
	WebElement search;

	@FindBy(xpath="//*[@id=\"List\"]/div[1]/div[1]/div[3]/div/a/span")
	WebElement bookCab;

	@FindBy(xpath="//*[@id=\"List\"]/div[1]/div/div[3]/div/a/span/span[1]")
	WebElement viewPrices;

	@FindBy(xpath="//*[@id=\"List\"]/div[1]/div[2]/div/div/div[1]/div[4]/a/span")
	WebElement FirstCar;

	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[3]/div/div[3]/span/label")
	WebElement covidSafetyCheckbox;

	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[3]/div/div[3]/span/input")
	WebElement covidSafetyCheckboxtest;

	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[3]/div/div[3]/button")
	WebElement covidSafetyContinue;

	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[6]/div/div[1]/div[1]/div/input")			   
	WebElement pickupLocationBlock;	
			
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[6]/div/div[1]/div[1]/div/div/div[1]/div/input")
	WebElement pickupLocationTextBox;

	@FindBy(xpath="//*[@id=\"react-autowhatever-1-section-0-item-0\"]")
	WebElement pickupLocationFirstOption;

	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[6]/div/div[1]/div[2]/div/input")
	WebElement dropOffLocationBlock;

	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[6]/div/div[1]/div[2]/div/div/div[1]/div/input")
	WebElement dropOffLocationTextBox;

	@FindBy(xpath="//*[@id=\"react-autowhatever-1-section-0-item-0\"]")
	WebElement dropOffLocationFirstOption;

	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[6]/div/div[2]/div[1]/div[1]/input")
	WebElement name;

	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[7]/div/div[2]/div[1]/div[2]/div/span[1]/div/div")
	WebElement gender;

	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[6]/div/div[2]/div[2]/div[1]/div/input")
	WebElement email;

	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[6]/div/div[2]/div[2]/div[2]/div/input[2]")
	WebElement mobile;

	@FindBy(xpath="//*[@id=\"fromCity\"]")
	WebElement fromTest;

	@FindBy(xpath="//*[@id=\"toCity\"]")
	WebElement toTest;

	@FindBy(xpath="//*[@id=\"pickupTime\"]")
	WebElement timeTest;
	
	
	public WebElement getCabImg() {
		return cabImg;
	}

	public WebElement getFromBlock() {
		return fromBlock;
	}

	public WebElement getToBlock() {
		return toBlock;
	}

	public WebElement getTimeBlock() {
		return timeBlock;
	}

	public WebElement getFromcity() {
		return fromcity;
	}

	public WebElement getTocity() {
		return tocity;
	}

	public WebElement getFirstOptionFrom() {
		return firstOptionFrom;
	}

	public WebElement getFirstOptionTo() {
		return firstOptionTo;
	}

	public List<WebElement> getDepDatePicker() {
		return depDatePicker;
	}

	public WebElement getDatePickerNxtBtn() {
		return datePickerNxtBtn;
	}

	public WebElement getDeparturedate() {
		return departuredate;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getTime() {
		return time;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getBookCab() {
		return bookCab;
	}

	public WebElement getViewPrices() {
		return viewPrices;
	}

	public WebElement getFirstCar() {
		return FirstCar;
	}

	public WebElement getCovidSafetyCheckbox() {
		return covidSafetyCheckbox;
	}

	public WebElement getCovidSafetyCheckboxtest() {
		return covidSafetyCheckboxtest;
	}

	public WebElement getCovidSafetyContinue() {
		return covidSafetyContinue;
	}

	public WebElement getPickupLocationBlock() {
		return pickupLocationBlock;
	}

	public WebElement getPickupLocationTextBox() {
		return pickupLocationTextBox;
	}

	public WebElement getPickupLocationFirstOption() {
		return pickupLocationFirstOption;
	}

	public WebElement getDropOffLocationBlock() {
		return dropOffLocationBlock;
	}

	public WebElement getDropOffLocationTextBox() {
		return dropOffLocationTextBox;
	}

	public WebElement getDropOffLocationFirstOption() {
		return dropOffLocationFirstOption;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getFromTest() {
		return fromTest;
	}

	public WebElement getToTest() {
		return toTest;
	}

	public WebElement getTimeTest() {
		return timeTest;
	}

	







}