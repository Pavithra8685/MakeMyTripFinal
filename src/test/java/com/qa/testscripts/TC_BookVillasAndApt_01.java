package com.qa.testscripts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;

public class TC_BookVillasAndApt_01 extends TestBase {
	
	
	@Test( dataProvider = "excelData")
	public void bookVillasAndApartment(String city, String exactPlace, String checkInDate, String checkOutDate, String noOfAdults, String noOfChildren, String bookingFor, String title, String firstname,
			String lastname, String emailAddress, String countrycode, String mobileNumber) throws InterruptedException, IOException {
		
		login();
		makeMytrip_OR.getvillasAndAptsLink().click();
		Thread.sleep(2000);
		
		String pageUrl = driver.getCurrentUrl();
		if(pageUrl.contains("homestays")) {
			Assert.assertTrue(true);
		}
		else
		{
			captureScreenshot("VillasandAptsHomePage");
			Assert.assertFalse(false);
		}
		
		makeMytrip_OR.getCity().click();
		Thread.sleep(3000);
		
		 makeMytrip_OR.getCityInput().sendKeys(city);
		Thread.sleep(4000); 
		
		List<WebElement> citySuggestions = makeMytrip_OR.getCityNames(); 
		Thread.sleep(2000);
		for(WebElement i: citySuggestions) {
			if(i.getText().contains(exactPlace)) {
				//System.out.print(i);
				//System.out.println(" " + i.getText());	
				i.click();
				break;
		   }	
			else {
				continue;
			}
		}	
		//System.out.println("Checkin : " + checkInDate);
		//System.out.println("Checkout : " + checkOutDate);
		boolean flag = false;
		makeMytrip_OR.getCheckInBtn().click();
		Thread.sleep(2000);
		try {
			while(flag == false) {
				List<WebElement> dates = makeMytrip_OR.getDatePickerDates();
				for(WebElement date: dates) {
					String exactDate = date.getAttribute("aria-label");						
					if(exactDate.contentEquals((checkInDate).trim())) {
						date.click();
						flag = true;
						Thread.sleep(1000);
					}
				}
				if(flag != true)
					makeMytrip_OR.getDatePickerNextBtn().click();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		makeMytrip_OR.getCheckOutBtn().click();
		Thread.sleep(2000);
		flag = false;
		try {
			while(flag == false) {
				List<WebElement> dates = makeMytrip_OR.getDatePickerDates();
				for(WebElement date: dates) {
					String exactDate = date.getAttribute("aria-label");
					if(exactDate.contentEquals(checkOutDate)) {
						date.click();
						flag = true;
						Thread.sleep(1000);
					}
				}
				makeMytrip_OR.getDatePickerNextBtn().click();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		makeMytrip_OR.getGuestOpt().click();
		List<WebElement> noOfAdultsList = makeMytrip_OR.getNoOfAdultsOptionsList();
		List<WebElement> noOfChildrenList = makeMytrip_OR.getNoOfChildrenOptionsList();

		for(WebElement i: noOfAdultsList) {
			if(i.getText().equals(noOfAdults)) {
				i.click();
				Thread.sleep(2000);
				break;
			}
			
		}
		
		for(WebElement i: noOfChildrenList) {
			if(i.getText().equals(noOfChildren)) {
				i.click();
				Thread.sleep(2000);
				break;
			}
			
		}
		Thread.sleep(2000);
		
		makeMytrip_OR.getApplyBtn().click();
		Thread.sleep(1000);
		
		makeMytrip_OR.getSearchBtn().click();
		Thread.sleep(5000);
		
		pageUrl = driver.getCurrentUrl();
		if(pageUrl.contains("hotel-listing")) {
			Assert.assertTrue(true);
		}
		else
		{
			captureScreenshot("HotelsPage");
			Assert.assertFalse(false);
		}
		
		makeMytrip_OR.getChooseApmtOrVillas().click();
		Thread.sleep(3000);
		
		List<String> list = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(list.get(1));	
		//Thread.sleep(5000);
		Thread.sleep(7000);
		
		pageUrl = driver.getCurrentUrl();
		if(pageUrl.contains("hotels/hotel-details/?hotelId")) {
			Assert.assertTrue(true);
		}
		else
		{
			captureScreenshot("HotelDetailsPage");
			Assert.assertFalse(false);
		}
		
		makeMytrip_OR.getViewThisComboBtn().click();
		Thread.sleep(2000);
		//js.executeScript("window.scrollBy(0,450)");
		makeMytrip_OR.getSelectComboBtn().click();
		
		list.clear();
		list = new ArrayList<String>(driver.getWindowHandles());		
		Thread.sleep(10000);
		
		pageUrl = driver.getCurrentUrl();
		if(pageUrl.contains("hotel-review")) {
			Assert.assertTrue(true);
		}
		else
		{
			captureScreenshot("HotelConfirmationPage");
			Assert.assertFalse(false);
		}
		
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(3000);
		
		 if(bookingFor.equals("Myself")) {
			makeMytrip_OR.getMyselfRadioBtn().click();
		}
		else if(bookingFor.equals("Someone Else")) {
			makeMytrip_OR.getSomeoneElseRadioBtn().click();
		} 
		Thread.sleep(1000); 
		makeMytrip_OR.getTitleDropDown().selectByVisibleText(title);
		Thread.sleep(1000);
		
		WebElement firstNameField = makeMytrip_OR.getFirstNameBox();
		firstNameField.sendKeys(Keys.CONTROL + "a");
		firstNameField.sendKeys(Keys.DELETE);
		firstNameField.sendKeys(firstname);
		makeMytrip_OR.getLastNameBox().sendKeys(lastname);
		Thread.sleep(1000);
		
		WebElement emailField = makeMytrip_OR.getEmailAddressbox();
		emailField.sendKeys(Keys.CONTROL + "a");
		emailField.sendKeys(Keys.DELETE);
		emailField.sendKeys(emailAddress);
		Thread.sleep(1000);
		
		makeMytrip_OR.getCountryCodeDropDown().selectByVisibleText(countrycode);
		Thread.sleep(1000);
		
		WebElement mobileNumField = makeMytrip_OR.getMobileNumberBox();
		mobileNumField.sendKeys(Keys.CONTROL + "a");
		mobileNumField.sendKeys(Keys.DELETE);
		mobileNumField.sendKeys(mobileNumber);
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		WebElement bookNowBtn = makeMytrip_OR.getBookNowBtn();
		Thread.sleep(4000);
		bookNowBtn.click();
		Thread.sleep(8000);
}
	

	
	@DataProvider(name = "excelData")
	public Object[][] getVillasAndAptsData() throws Exception {
		Object[][] details = ExcelUtility.getDatas("VillasAndApts");
		return details;
	}
}
