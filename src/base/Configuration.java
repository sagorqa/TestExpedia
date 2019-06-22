package base;

import utils.Function;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Parameters;

public class Configuration extends Function {
	@Parameters({"url","browser"})
	@BeforeMethod
	public  void browserInitialize(String url, String browsername){
		applicationLog.info("browser Started");
		//System.setProperty("webdriver.chrome.driver", "C://Users//shahadat//workspace//automationFramework//DRIVER//chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//DRIVER/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get(url);
	}
	@AfterMethod
	public void afterTest (){
        
		applicationLog.info("Close the browser");
		driver.close();
	}
	
}
