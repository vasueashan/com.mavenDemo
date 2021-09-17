package com.mavenDemo.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {

	@Test
	public void m1() throws InterruptedException
	{
		System.out.println("m1 login");
		System.out.println("m1 login Edit3");
		System.out.println("m1 loginvasuEdit6");//chnages  done
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/4.4.3");
		Thread.sleep(4000);
		driver.quit();
		
	}
	@Test
	public void m2()
	{
		System.out.println("m2 login");
	}
}
