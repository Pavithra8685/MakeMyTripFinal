package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightPages {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[1]/a/span[1]")
	WebElement flight;

	public WebElement getFlight() {
		return flight;
	}

	@FindBy(id = "fromCity")
	WebElement from;

	public WebElement getFrom() {
		return from;
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div/div/input")
	WebElement location;

	public WebElement getlocation() {
		return location;
	}

	@FindAll(@FindBy(xpath = "//p[contains(text(),'New Delhi, India')]"))
	List<WebElement> loc;

	public List<WebElement> getloc() {
		return loc;
	}

	@FindBy(id = "toCity")
	WebElement to;

	public WebElement getTo() {
		return to;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement toloca;

	public WebElement toloca() {
		return toloca;

	}

	@FindAll(@FindBy(className = "react-autosuggest__suggestion"))
	List<WebElement> toloc;

	public List<WebElement> toloc() {
		return toloc;
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[3]")
	WebElement departure;

	public WebElement getDepart() {
		return departure;
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[1]")
	WebElement calendar1;
	
	public WebElement getcalendar1() {
		return calendar1;
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[1]")
	WebElement calendar2;
	
	public WebElement getcalendar2() {
		return calendar2;
	}
	
	@FindAll(@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]/div/div/div[1]/p[1]"))
	List<WebElement> calendar2Dates;
	
	public List<WebElement> getcalendar2Dates() {
		return calendar2Dates;
	}
	
	@FindAll(@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div/div/div[1]/p[1]"))
	List<WebElement> calendar1Dates;
	
	public List<WebElement> getcalendar1Dates() {
		return calendar1Dates;
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]")
	WebElement nextNav;
	
	public WebElement getNextNav() {
		return nextNav;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[3]/div[5]")
	WebElement date;

	public WebElement getdate() {
		return date;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]")
	WebElement returnloc;

	public WebElement getretloc() {
		return returnloc;
	}

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]/div[4]/div[7]/div[1]/p[1]")
	WebElement l;

	public WebElement getl() {
		return l;
	}

	@FindBy(id = "travellers")
	WebElement traveller;

	public WebElement gettraveller() {
		return traveller;
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[5]/div[2]/div[1]/ul[1]/li[5]")
	WebElement adults;

	public WebElement getno() {
		return adults;
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[5]/div[2]/div[1]/div/div[1]/ul/li[4]")
	WebElement children;

	public WebElement getChild() {
		return children;
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[5]/div[2]/div[1]/ul[2]/li[2]")
	WebElement flightclass;

	public WebElement getflightClass() {
		return flightclass;
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[5]/div[2]/div[2]/button")
	WebElement apply;

	public WebElement getApply() {
		return apply;
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/p/a")
	WebElement search;

	public WebElement getSearch() {
		return search;
	}

	@FindAll(@FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div"))
	List<WebElement> flightOK;

	public List<WebElement> getFlightOK() {
		return flightOK;
	}
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[2]/button[1]")
    WebElement booknow;
	public WebElement Booknow() {
		return booknow;
	}

	public FlightPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

}
