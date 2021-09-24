package com.qa.testscripts;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;

public class TC_FlightReservation_001 extends TestBase {
	
	
	@Test(dataProvider = "excelData")
	public void get(String From,String To,String depatureDate,String returnDate) throws InterruptedException, ParseException {
		
		login();
		
		fp.getFlight().click();
		WebElement ele=fp.getFrom();
		act.doubleClick(ele).build().perform();
		Thread.sleep(5000);
		
		fp.getlocation().sendKeys(From);
		List<WebElement>city=fp.getloc();
		for(WebElement ele1:city) {
			System.out.println(ele1.getText());
			String titles=driver.getTitle();
			if(titles.contains(From)) {
				Reporter.log("yes");
			}
			else
				Reporter.log("no");
		}	
		Thread.sleep(5000);
		Actions act0=new Actions(driver);
		WebElement web=fp.getTo();
		act0.doubleClick(web).build().perform();
		
		Thread.sleep(5000);
		fp.toloca().sendKeys(To);
		List<WebElement> tocity=fp.toloc();
		for(WebElement elem:tocity) {
			if(elem.getText().contains(To)) {
				js.executeScript("arguments[0].click()",ele);
				System.out.println("true");
				break;
			}
		}
		Thread.sleep(6000);
		fp.getDepart().click();
		selectDate(depatureDate);
		Thread.sleep(3000);
		fp.getretloc().click();
		selectDate(returnDate);
		
		Actions as=new Actions(driver);
		WebElement wt=fp.gettraveller();
		as.doubleClick(wt).build().perform();
		js.executeScript("arguments[0].click()", fp.getno());
		js.executeScript("arguments[0].click()",fp.getChild());
		js.executeScript("arguments[0].click()",fp.getflightClass());
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()",fp.getApply());
		fp.getSearch().click();
		
		Thread.sleep(3000);
		//js.executeScript("arguments[0].click()",fp.Booknow());
		//Thread.sleep(3000);
		driver.navigate().to("https://www.makemytrip.com/");
		Thread.sleep(3000);
		
			
	}
	@DataProvider(name = "excelData")
	public Object[][] getExcelDetails() throws IOException {
		Object obj[][] = ExcelUtility.getDatas("Flight");
		return obj;
	}
	public static void selectDate(String gDate) throws InterruptedException, ParseException {
		SimpleDateFormat sdfo = new SimpleDateFormat("yyyy-MMM-dd");
		//String d1=sdfo.format(new Date());
		String d2=gDate;
		String[] givendate=d2.split("-");

		Calendar cal = Calendar.getInstance();
	    Date currentDate = cal.getTime();
	    String d1 = sdfo.format(currentDate);
	    cal.add(Calendar.DATE,-1);
	    cal.add(Calendar.YEAR, 1); 
	    Date nyear = cal.getTime();
	    String d3 = sdfo.format(nyear);
	    
		Date date1 = sdfo.parse(d1);   
		Date date2 = sdfo.parse(d2);	
		Date date3 = sdfo.parse(d3);
		if ((date2.after(date1) && date2.before(date3)) || date1.equals(date2)){  
			System.out.println("valid date");   
		}  
		else if (date2.before(date1))   {    
			Reporter.log("Select valid date");
			Assert.assertTrue(false);  
		}   

		WebElement m1;
		WebElement m2;
		boolean flag=true;
		int temp=1;
		while(flag) {
			m1=fp.getcalendar1();
			m2=fp.getcalendar2();                              
			if(m1.getText().contains(givendate[1]) && m1.getText().contains(givendate[0])){
				temp=1;
				flag=false;
			}
			else if(m2.getText().contains(givendate[1]) && m1.getText().contains(givendate[0])) {
				temp=2;
				flag=false;
			}
			else {
				fp.getNextNav().click();
				Thread.sleep(3000);
			}
		}
		int count=0;
		List<WebElement> col=null;
		if(temp==1) {
		    col=fp.getcalendar1Dates();
		}
		else if(temp==2) {
			col=fp.getcalendar2Dates();
		}
		for(WebElement c:col) {
			if(c.getText().equals("1")){
				System.out.print(c.getText());
				break;
			}
			else {
				
				count++;
			}
		}
		System.out.print(count);
		col.get(Integer.parseInt(givendate[2])-1+count).click();
		
		
	}
}

