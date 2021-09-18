package com.mavenDemo.login;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {

	@Test
	public void m1() throws InterruptedException
	{
		System.out.println("m1 login");
		System.out.println("m1 login Edit3");
		System.out.println("m1 loginvasuEdit6");//chnages  done
		/*
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/4.4.3");
		*/
		// We could use any driver for our tests...
		DesiredCapabilities capabilities = new DesiredCapabilities();

		// ... but only if it supports javascript
		capabilities.setJavascriptEnabled(true);

		// Get a handle to the driver. This will throw an exception
		// if a matching driver cannot be located
		WebDriver driver = new RemoteWebDriver(capabilities);

		// Query the driver to find out more information
		Capabilities actualCapabilities = ((RemoteWebDriver) driver).getCapabilities();

		// And now use it
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Ended login");
		
	}
	@Test
	public void m2()
	{
		System.out.println("m2 login");
	}
}
