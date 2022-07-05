package org.example.Appium1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class CalculatorOperations {
	
	public static AndroidDriver driver;
    
    @BeforeTest
    
    public void launchEmulator() throws MalformedURLException {
   
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("deviceName","emulator-5554");
	cap.setCapability("platformName","Android");
	cap.setCapability("platformVersion","8.1");
	cap.setCapability("appPackage","com.android.calculator2");
    cap.setCapability("appActivity","com.android.calculator2.Calculator");
    driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
    System.out.println("Device time :" + driver.getDeviceTime());
    System.out.println("BeforeTest");
}
  
  @Test (priority=1)
  public void addition(){
	    
	    driver.findElement(By.id("com.android.calculator2:id/digit_1")).click();
	    driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"plus\"]")).click();
	    driver.findElement(By.id("com.android.calculator2:id/digit_1")).click();
	   // String result = driver.findElement(By.id("com.android.calculator2:id/result")).getText();
	    String result = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.calculator2:id/result']")).getText();
		System.out.println("Addition Result " +result);
		System.out.println("Addition test case successfully executed");
		Assert.assertEquals(result, "2");
		driver.findElement(By.id("com.android.calculator2:id/eq")).click();
		driver.findElement(By.id("com.android.calculator2:id/clr")).click();
		
  }
  
  @Test (priority=2)
  public void subtraction() {
	    driver.findElement(By.id("com.android.calculator2:id/digit_7")).click();
	    driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"minus\"]")).click();
	    driver.findElement(By.id("com.android.calculator2:id/digit_3")).click();
	  //String result = driver.findElement(By.id("com.android.calculator2:id/result")).getText();
	    String result = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.calculator2:id/result']")).getText();
	   // System.out.println("Result"+ result);
		System.out.println("subtraction Result " +result);
		System.out.println("subtraction test case successfully executed");
		Assert.assertEquals(result, "4");
		driver.findElement(By.id("com.android.calculator2:id/eq")).click();
		driver.findElement(By.id("com.android.calculator2:id/clr")).click();
  }
  @Test (priority=3)
  public void multiplication() {
	    driver.findElement(By.id("com.android.calculator2:id/digit_5")).click();
	    driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"multiply\"]")).click();
	    driver.findElement(By.id("com.android.calculator2:id/digit_5")).click();
	   // String result = driver.findElement(By.id("com.android.calculator2:id/result")).getText();
	    String result = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.calculator2:id/result']")).getText();
	    //System.out.println("Result"+ result);
		System.out.println("multiplication Result " +result);
		System.out.println("multiplication test case successfully executed");
		Assert.assertEquals(result, "25");
		driver.findElement(By.id("com.android.calculator2:id/eq")).click();
		driver.findElement(By.id("com.android.calculator2:id/clr")).click();
}
  @Test (priority=4)
  public void division() {
	    driver.findElement(By.id("com.android.calculator2:id/digit_8")).click();
	    driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"divide\"]")).click();
	    driver.findElement(By.id("com.android.calculator2:id/digit_4")).click();
	   // String result = driver.findElement(By.id("com.android.calculator2:id/result")).getText();
	    String result = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.calculator2:id/result']")).getText();
	   // System.out.println("Result"+ result);
		System.out.println("division Result " +result);
		System.out.println("division test case successfully executed");
		Assert.assertEquals(result, "2");	  
		driver.findElement(By.id("com.android.calculator2:id/eq")).click();
		driver.findElement(By.id("com.android.calculator2:id/clr")).click();
  }
  
  @AfterTest
  
  public void end() {
	  driver.quit();
}
  
}
