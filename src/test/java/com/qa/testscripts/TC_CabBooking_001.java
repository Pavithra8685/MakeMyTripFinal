package com.qa.testscripts;



import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.qa.utility.ExcelUtility;

public class TC_CabBooking_001 extends TestBase{

	@Test(dataProvider = "excelData")
	public void bookCab(String from,String to,String date,String time,String pickup,String dropoff,String name,String email,String mob) throws InterruptedException, IOException
	{

		login();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//CAB PAGE CLICKING
		if(cabpage.getCabImg().isDisplayed())
		{
			Assert.assertTrue(true);
			cabpage.getCabImg().click();
		}
		else
		{
			captureScreenshot("CabImg_NotAvail");
			Assert.assertTrue(false);
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url=driver.getCurrentUrl();
		if(url.contains("cabs"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			captureScreenshot("Cab Page");
			Assert.assertTrue(false);
		}

		//FROM TO CITY
		cabpage.getFromBlock().click(); 
		cabpage.getFromcity().sendKeys(from);
		Thread.sleep(3000);
		cabpage.getFirstOptionFrom().click(); 

		String fromvalue= cabpage.getFromTest().getAttribute("value");
		fromvalue= fromvalue.toUpperCase();
		from=from.toUpperCase();
		if(fromvalue.contains(from))
		{
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Error at From");
			captureScreenshot("FromCityWrong");
			Assert.assertTrue(false);
		}

		cabpage.getToBlock().click(); Thread.sleep(1000);
		cabpage.getTocity().sendKeys(to);
		Thread.sleep(3000);
		cabpage.getFirstOptionTo().click();
		String tovalue= cabpage.getToTest().getAttribute("value");
		tovalue= tovalue.toUpperCase();
		to= to.toUpperCase();
		if(tovalue.contains(to))
		{
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Error at TO");
			captureScreenshot("ToCityWrong");
			Assert.assertTrue(false);
		}

		//DATE ADDED HERE
		
		cabpage.getDeparturedate().click();
		Thread.sleep(5000); 
		boolean flag = false; 
		try { while (flag == false) {
			List<WebElement> dates = cabpage.getDepDatePicker();
			for (WebElement d:dates) 
			{ 
				String getDate = (d.getAttribute("aria-label")); 
				if (getDate.contentEquals(date))
				{ d.click();
				flag = true; break; 
				}
			}
			cabpage.getDatePickerNxtBtn().click(); } }
		catch (Exception e) {

			System.out.println("Error at Date"); e.printStackTrace(); 
		}






		//FOR SELECTING TIME
		cabpage.getTimeBlock().click(); 
		WebElement countryUL=cabpage.getTime(); 
		Thread.sleep(2000); 
		List<WebElement> countriesList=countryUL.findElements(By.tagName("li"));
		Thread.sleep(2000);
		String updatedtime = "0"+time;
		for (WebElement li : countriesList) 
		{ 
			if (li.getText().equals(updatedtime))
			{
				li.click();
				break;
			}
		} 
		Thread.sleep(2000);

		String timeValue= cabpage.getTimeTest().getAttribute("value");
		if(updatedtime.contains(timeValue)) 
		{ 
			Assert.assertTrue(true);
		} 
		else 
		{
			captureScreenshot("TimeWrong"); 
			Assert.assertTrue(false); 
		}


		cabpage.getSearch().click();

		String curpage= driver.getCurrentUrl().toUpperCase();
		if(curpage.contains(from))
		{
			Assert.assertTrue(true);
		}
		else
		{
			captureScreenshot("Not in booking page");
			Assert.assertTrue(false);
		}

		js.executeScript("window.scrollBy(0,350)");
		try
		{
			if(cabpage.getViewPrices().isDisplayed())
			{
				cabpage.getViewPrices().click();
				Thread.sleep(1000);
				cabpage.getFirstCar().click();
			}
		}
		catch(Exception e )
		{
			cabpage.getBookCab().click();
		}
		cabpage.getCovidSafetyCheckbox().click();
		Thread.sleep(2000);
		if(cabpage.getCovidSafetyCheckboxtest().isSelected())
		{
			Assert.assertTrue(true);
		}
		else
		{
			captureScreenshot("covidcheckbox");
			Assert.assertTrue(false);
		}
		if(cabpage.getCovidSafetyContinue().isEnabled())
		{
			cabpage.getCovidSafetyContinue().click();
			Assert.assertTrue(true);
		}
		else
		{
			captureScreenshot("covidcondiitons");
			Assert.assertTrue(false);
		}
		
		
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,950)");


		cabpage.getPickupLocationBlock().click();
		cabpage.getPickupLocationTextBox().sendKeys(pickup);
		Thread.sleep(2000);
		cabpage.getPickupLocationFirstOption().click();
		cabpage.getDropOffLocationBlock().click();
		cabpage.getDropOffLocationTextBox().sendKeys(dropoff);
		Thread.sleep(2000);
		cabpage.getDropOffLocationFirstOption().click();
		Thread.sleep(3000);
		

		Thread.sleep(2000);
		try {
		cabpage.getName().click();
		cabpage.getName().clear();
		cabpage.getName().sendKeys(name);
		cabpage.getEmail().click();
		cabpage.getEmail().clear();
		cabpage.getEmail().sendKeys(email);
		cabpage.getMobile().click();
		cabpage.getMobile().clear();
		cabpage.getMobile().sendKeys(mob);
		System.out.println(cabpage.getName().getText());
		if(cabpage.getName().getAttribute("value").contains(name)&& cabpage.getEmail().getAttribute("value").contains(email) && cabpage.getMobile().getAttribute("value").contains(mob))
		{
			Assert.assertTrue(true);
			
		}
		else
		{
			captureScreenshot("Personal Details");
			Assert.assertTrue(false);
		}

		Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}



	}

	@DataProvider(name = "excelData")
	public Object[][] getExcelDetails() throws IOException {
		Object obj[][] = ExcelUtility.getDatas("Cab");
		return obj;
	}
}