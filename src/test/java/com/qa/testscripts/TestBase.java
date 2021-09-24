package com.qa.testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.BusesPages;
import com.qa.pages.CabBookingPage;
import com.qa.pages.FlightPages;
import com.qa.pages.HotelPages;
import com.qa.pages.TrainReservationPages;
import com.qa.pages.VilasAptsPages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	static WebDriver driver;
	static TrainReservationPages trainReservationPages;
	static BusesPages pages;
	static VilasAptsPages makeMytrip_OR;
	static HotelPages mytrip;
	static FlightPages fp;
	static CabBookingPage cabpage;
	JavascriptExecutor js;
	Properties prop;
	FileInputStream fileLoc;
	Actions act;

	@Parameters({ "Browser", "Url" })
	@BeforeClass
	public void setUp(String Browser, String Url) throws InterruptedException, IOException {
		if (Browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if (Browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (Browser.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		trainReservationPages = new TrainReservationPages(driver);
		fp = new FlightPages(driver);
		mytrip = new HotelPages(driver);
		cabpage = new CabBookingPage(driver);
		pages = new BusesPages(driver);
		makeMytrip_OR = new VilasAptsPages(driver);
		fileLoc=new FileInputStream("C:\\SeleniumProject\\Selenium-eclipse-workspace\\MakeMyTripFinal\\src\\test\\java\\com\\qa\\testdata\\InputData.properties");
		prop=new Properties();
		prop.load(fileLoc);
		js = (JavascriptExecutor) driver;
		act = new Actions(driver);
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

	public void captureScreenshot(String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot Captured");
	}

	 public void login() throws InterruptedException {

		  pages.getLogin().click();
		  pages.getUsername().sendKeys(prop.getProperty("username"));
		  pages.getContinuebtn().click();
		  Thread.sleep(2000); 
		  pages.getPassword().sendKeys(prop.getProperty("password"));
		  Thread.sleep(2000); 
		  pages.getLoginbtn().click();
		  Thread.sleep(4000);
		  pages.getClosebtn().click();
		  Thread.sleep(2000);
	  }
}
