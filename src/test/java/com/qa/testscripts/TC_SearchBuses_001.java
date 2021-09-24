package com.qa.testscripts;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.qa.utility.ExcelUtility;

public class TC_SearchBuses_001 extends TestBase

{

	JavascriptExecutor js;

	@Test(dataProvider = "excelData")
	public void searchBus(String email, String password, String FromLocation, String FromSuggestion, String ToLocation,
			String ToSuggestion, String name, String age, String mobileno,String Userdate) throws InterruptedException, IOException {

		login();
		pages.getBusesImagebtn().click();
		Thread.sleep(3000);

		String BusUrl = driver.getCurrentUrl();
		if (BusUrl.contains("bus-tickets")) {
			Assert.assertTrue(true);
		} else {
			captureScreenshot("searchBus");
			Assert.assertTrue(false);
		}

		pages.getFromCity().click();
		Thread.sleep(3000);
		pages.getFromSearchbox().sendKeys(FromLocation);
		Thread.sleep(3000);
		
		try{
		List<WebElement> suggestions = pages.getFromSuggestions();
		for (WebElement suggestion : suggestions) {
			if (suggestion.getText().equals(FromSuggestion)) 
				suggestion.click();
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		Thread.sleep(3000);
		pages.getToLocation().click();
		Thread.sleep(3000);
		pages.getToSearchbox().sendKeys(ToLocation);
		Thread.sleep(3000);
		
		try {
		List<WebElement> tosuggestions = pages.getToSuggestion();
		for (WebElement tosuggestion : tosuggestions) {
		if (tosuggestion.getText().equalsIgnoreCase(ToSuggestion))
			tosuggestion.click();
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

		Thread.sleep(3000);
		
		boolean flag = false;

		try {
				
		 while(flag==false) {
		   
		 List<WebElement> dates = pages.getDatePickerDay();
		   	  
		 for(WebElement date : dates)
		 {
			
			String text = (date.getAttribute("aria-label"));
			 System.out.println(text);
			if(text.contentEquals(Userdate))
			{
				date.click();
				flag=true;
				Thread.sleep(7000);
			}
		 }
		 
		 pages.getDayPickerNavButton().click();	  		 
		 
		  }
		 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		 
		//pages.getDate().click();
		Thread.sleep(3000);
		pages.getSearchbox().click();
		Thread.sleep(5000);
		
		String bookSeatUrl = driver.getCurrentUrl();
		if (bookSeatUrl.contains("search")) {
			Reporter.log("Search Button is clicked");
			Assert.assertTrue(true);
		} else {
			captureScreenshot("searchBus");
			Reporter.log("Search Button is not clicked");
			Assert.assertTrue(false);
		}
		
		
		js = (JavascriptExecutor) driver;
		pages.getSleeper().click();
		Thread.sleep(2000);
		pages.getAC().click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(3000);
		pages.getBoardingPoint().click();
		Thread.sleep(2000);
		pages.getDroppingPoint().click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,350)");
		Thread.sleep(2000);
		pages.getPickupTime().click();
		Thread.sleep(2000);
		pages.getDropTime().click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView()", pages.getSleeperFilter());
		Thread.sleep(4000);
		
		if(pages.getSleeperFilter().isDisplayed())
		{
			Reporter.log("Selection of filters is completed");
			Assert.assertTrue(true);
		}
		else
		{
			Reporter.log("Selection of filters is not completed");
			Assert.assertTrue(false);
		}
		
		
		
		List<WebElement> BusesAvailable = pages.getBusesAvailable();
		if(BusesAvailable!=null)
		{
			Reporter.log("Bus is available");
			Assert.assertTrue(true);
		}
		else
		{
			Reporter.log("No Bus is available");
			Assert.assertTrue(false);
		}
		
		Thread.sleep(2000);
        pages.getSelectSeats().click();
        Thread.sleep(3000);
		List<WebElement> SeatsAvailable = pages.getSeatsAvailable();
			for(WebElement seat : SeatsAvailable)
			{
				if(seat.isEnabled())
				{
					seat.click();
					Reporter.log("Seat is selected");
				    break;
				}
				else
				{
					Reporter.log("No seat is available");
				}
			
			}
		
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(5000);
		pages.getBookSeats().click();
		Thread.sleep(5000);
		String  TravellerUrl= driver.getCurrentUrl();
		if (TravellerUrl.contains("traveller")) {
			Reporter.log("Entered into Traveller Page");
			Assert.assertTrue(true);
		} else {
			captureScreenshot("searchBus");
			Reporter.log("Not Entered into Traveller Page");
			Assert.assertTrue(false);
		}
		
		Thread.sleep(3000);
		pages.getTravellerName().sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(3000);
		pages.getTravellerName().sendKeys(name);
		Thread.sleep(3000);
		pages.getTravellerAge().sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(3000);
		pages.getTravellerAge().sendKeys(age);
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(pages.getTravellerGender()).build().perform();
		Thread.sleep(3000);
		pages.getFemale().click();
		Thread.sleep(3000);
		pages.getMobileno().sendKeys(mobileno);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		pages.getMegabus().click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,150)");
		Thread.sleep(3000);
		pages.getTermsAndConditions().click();
		Thread.sleep(3000);
		pages.getContinuetoBooknowbtn().click();
		Thread.sleep(3000);
		driver.navigate().to("https://www.makemytrip.com/");
		String HomePage = driver.getCurrentUrl();
		if (BusUrl.contains("makemytrip")) {
			Reporter.log("Navigated to home page");
			Assert.assertTrue(true);
		} else {
			captureScreenshot("searchBus");
			Reporter.log("Not Navigated to home page");
			Assert.assertTrue(false);
		}
		Thread.sleep(3000);
		  }

	

	@DataProvider(name = "excelData")
	public Object[][] getExcelDetails() throws IOException {
		Object obj[][] = ExcelUtility.getDatas("Buses");
		return obj;
	}
}