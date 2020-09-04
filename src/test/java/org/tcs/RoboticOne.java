package org.tcs;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RoboticOne {
	static WebDriver driver;
@BeforeClass
private void loadUrl() {
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();

}

@BeforeMethod
private void startTime() {
Date d=new Date();
System.out.println(d);
}

@AfterMethod
private void endTime() {
Date d=new Date();
System.out.println(d);
}
@AfterClass
private void quitBrowser() {
	driver.quit();

}

@Test(groups="Sanity")
private void testCase1() throws InterruptedException {
driver.get("https://www.flighthub.com/");
WebElement sourc = driver.findElement(By.xpath("//input[@name=\"seg0_from\"]"));
sourc.sendKeys("MAA");
WebElement destination = driver.findElement(By.name("seg0_to"));
destination.sendKeys("BLR");
Thread.sleep(3000);
}






}
