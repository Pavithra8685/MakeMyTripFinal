package com.qa.testscripts;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import com.qa.utility.ExcelUtility;

public class TC_TrainReservation_001 extends TestBase {

	@Test(dataProvider = "excelDatas")
	public void reservationDetails(String arrLoc,String arrLocSuggestion, String depLoc,String depLocSuggestion, String travelDate, String selectClass, String filter,
			String name, String age, String irctcUsername, String emailId, String phoneNo,
			String address, String pincode) throws InterruptedException, IOException {

		//Login
		login();
         
		// Train Module
		trainReservationPages.getTrains().click();
		Thread.sleep(2000);

		// Assertion
		String moduleUrl = driver.getCurrentUrl();
		Reporter.log("Module Url contains " + moduleUrl);
		SoftAssert sa = new SoftAssert();
		if (moduleUrl.contains("railways")) {
			sa.assertTrue(true);
		} else {
			captureScreenshot("reservationDetails");
			System.out.println("UrlError");                 
			sa.assertTrue(false);
		}

		// Select Travel Details
		//getFrom
		trainReservationPages.getFromPlace().click();
		Thread.sleep(2000);
		trainReservationPages.getChooseFrom().sendKeys(arrLoc);
		Thread.sleep(7000);
		List<WebElement> sug = trainReservationPages.getFromList();
		for (int i = 0; i < sug.size(); i++) {
			String txt = sug.get(i).getText();
			// System.out.println(txt);
			if (txt.contains(arrLocSuggestion)) {
				sug.get(i).click();
				Reporter.log("From Location is selected");
				sa.assertTrue(true);
				break;
			} else {
				captureScreenshot("reservationDetails");
				System.out.println("FromError");  
				sa.assertTrue(false);
			}
		}
		Thread.sleep(2000);

		//getTo
		trainReservationPages.getToPlace().click();
		trainReservationPages.getChooseTo().sendKeys(depLoc);
		List<WebElement> toSug = trainReservationPages.getToList();
		for (int i = 0; i < toSug.size(); i++) {
			String txt1 = toSug.get(i).getText();
			// System.out.println("====" + txt1);
			if (txt1.contains(depLocSuggestion)) {
				toSug.get(i).click();
				Reporter.log("To Location is selected");
				sa.assertTrue(true);
				break;
			} else {
				captureScreenshot("reservationDetails");
				System.out.println("ToError");  
				sa.assertTrue(false);
			}
		}
		Thread.sleep(2000);

		
		// Travel Date 
		trainReservationPages.getTravelDate().click();
		Thread.sleep(5000);
		boolean flag = false;
		try {
			while (flag == false) {
				List<WebElement> dates = trainReservationPages.getDatePickerList();
				for (WebElement date : dates)
				{
					String getDate = (date.getAttribute("aria-label")); 
					if (getDate.contentEquals(travelDate)) 
					{
						date.click();
						flag = true;
						Thread.sleep(4000);
					}
				}
			trainReservationPages.getDatePickerNextButton().click();
			}
		} 
		catch (StaleElementReferenceException e) {
			e.printStackTrace();
		}
		 
		// Class
		trainReservationPages.getTravelClass().click();
		Thread.sleep(2000);
		List<WebElement> allOptions = trainReservationPages.getChooseClass();
		// System.out.println(allOptions.size());
		for (WebElement option : allOptions) {
			if (option.getText().contains(selectClass)) {
				option.click();
				Reporter.log("Class is selected");
				sa.assertTrue(true);
				break;
			}
			else {
				captureScreenshot("reservationDetails");
				System.out.println("classError");
				sa.assertTrue(false);
			}
		}
		Thread.sleep(2000);

		// Search
		trainReservationPages.getSearchButton().click();

		// Assertion
		String title = driver.getTitle();
		Reporter.log("Module title is " + title);
		if (title.equals("MakeMyTrip - Trains")) {
			sa.assertTrue(true);
		} else {
			captureScreenshot("reservationDetails");
			System.out.println("titleError");  
			sa.assertTrue(false);
		}

		List<WebElement> selects = trainReservationPages.getFilters();
		// System.out.println(selects.size());
		for (WebElement sel : selects) {
			if (sel.getText().equals(filter)) {
				sel.click();
				sa.assertTrue(true);
				break;
			} 
			else {
				captureScreenshot("reservationDetails");
				System.out.println("filterError");
				sa.assertTrue(false);
			}
				 
		}
		Thread.sleep(2000);

		/*
		 * // Select from Trains List<WebElement> opts =
		 * trainReservationPages.getTrainTypeList(); for (WebElement opt : opts) { if
		 * (opt.getText().equals(trainName)) {
		 */
		// Thread.sleep(2000);
		// System.out.println(opt.getText());
		
		
		// Select a train
		js.executeScript("window.scrollBy(0,250)");
		act.moveToElement(trainReservationPages.getViewRoute()).click().build().perform();
		Thread.sleep(2000);
		trainReservationPages.getCloseRoute().click();
		Thread.sleep(2000);
		// js.executeScript("window.scrollBy(0,200)");
		trainReservationPages.getNearByDate().click();
		// Thread.sleep(2000);
		// js.executeScript("window.scrollBy(0,300)");
		trainReservationPages.getBooking().click();
		Thread.sleep(2000);
		trainReservationPages.getSelectBooking().click();
		
		//break;
		/*
		 * } else { // System.out.println(opt.getText());
		 * js.executeScript("window.scrollBy(0,200)"); Thread.sleep(2000); } }
		 */
	 

		// Assertion
		String url = driver.getCurrentUrl();
		Reporter.log("Select Travellers page url has the word:" + url);
		if (url.contains("review")) {
			sa.assertTrue(true);
		} else {
			captureScreenshot("reservationDetails");
			System.out.println("traveller page url");  
			sa.assertTrue(false);
		}

		
		js.executeScript("window.scrollBy(0,200)");
		// Select cancellation
		trainReservationPages.getSelectCancellation().click();
		Thread.sleep(10000);
		
		//Assertion
		if (trainReservationPages.getSelectCancellation().isSelected()) {
			sa.assertTrue(true);
		} else {
			captureScreenshot("reservationDetails");
			Reporter.log("Cancellation checkbox is not selected");  
			System.out.println("cancelError");
			sa.assertTrue(false);
		}
		

		js.executeScript("window.scrollBy(0,200)");

		// Traveller Details
		trainReservationPages.getAddTraveller().click();

		Thread.sleep(4000);
		trainReservationPages.getName().sendKeys(name);
		trainReservationPages.getAge().sendKeys(age);
		// Thread.sleep(2000);
		trainReservationPages.getGender().click();
		trainReservationPages.getSelectGender().click();
		// Thread.sleep(2000);
		trainReservationPages.getBerth().click();
		trainReservationPages.getSelectBerth().click();
		trainReservationPages.getAdd().click();
		Thread.sleep(2000);
		
		
		trainReservationPages.getSelectTraveller().click();
		
		//Assertion
		if (trainReservationPages.getSelectTraveller().isSelected()) {
			sa.assertTrue(true);
		} else {
			captureScreenshot("reservationDetails");
			Reporter.log("Traveller is not selected");  
			System.out.println("travellerError");
			sa.assertTrue(false);
		}
		
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,600)");

		trainReservationPages.getIrctcUsername().click();
//		Thread.sleep(2000);
//		Thread.sleep(3000);
		trainReservationPages.getClickIrctcName().click();
//		Thread.sleep(3000);
		trainReservationPages.getEnterIrctcName().sendKeys(irctcUsername);
//		Thread.sleep(4000);
		trainReservationPages.getSubmitUsername().click();
//		Thread.sleep(4000);

		trainReservationPages.getEmail().sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		// Thread.sleep(2000);
		trainReservationPages.getEmail().sendKeys(emailId);
		// Thread.sleep(4000);
		trainReservationPages.getMobileNo().sendKeys(phoneNo);
		// Thread.sleep(4000);
		trainReservationPages.getAddress().sendKeys(address);
		// Thread.sleep(4000);
		trainReservationPages.getPincode().sendKeys(pincode);
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,-900)");
		trainReservationPages.getSubmit().click();
		Thread.sleep(3000);

		// Assertion
		String currentUrl = driver.getCurrentUrl();
		Reporter.log("Payment Page Url has the word " + currentUrl);
		if (currentUrl.contains("payments")) {
			sa.assertTrue(true);
		} else {
			captureScreenshot("reservationDetails");
			System.out.println("payment page url");  
			sa.assertTrue(false);
		}

	}

	@DataProvider(name = "excelDatas")
	public Object[][] getExcelDetails() throws IOException {
		Object obj[][] = ExcelUtility.getDatas("Trains");
		return obj;
	}
}
