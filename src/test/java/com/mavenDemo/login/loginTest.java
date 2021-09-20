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
		System.out.println("m1 login1");
		System.out.println("m1 login Edit3");
		System.out.println("m1 loginvasuEdit6");//chnages  done
		/*
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/4.4.3");
		*/

		 // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromDriver\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("http://www.javatpoint.com/");  
          
         //Maximize the browser  
          driver.manage().window().maximize();  

		

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
