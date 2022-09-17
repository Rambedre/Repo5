package com.BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.UtilityFiles.Configuratonsread;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeBaseClass {
	public WebDriver Driver;
	
	Configuratonsread read = new Configuratonsread();
	
	public String url = read.mainURL();
	public String username = read.user();
	public String password = read.pass();
	
	@Parameters({"browser"})
	@BeforeTest
	public void browserstart(@Optional("chrome") String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			Driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			Driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			Driver = new EdgeDriver();
		}
		else {
			throw new RuntimeException("invalid Browser");
		}
		
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterTest
	public void Browserclose() throws InterruptedException {
		Thread.sleep(3000);
		Driver.close();
	}
}
