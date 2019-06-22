package utils;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class Function {
	
	public static WebDriver driver;
	public static Logger applicationLog=Logger.getLogger("devpinoyLogger");

		public void typeByid(String locator){
		
			driver.findElement(By.id(locator)).click();
			}
		public void clickByid (String locator){
		
		driver.findElement(By.id(locator)).click();
		}

	public void typeByfirstname(String locator, String values){
		try{
			driver.findElement(By.xpath(locator)).clear();
			driver.findElement(By.xpath(locator)).sendKeys(values);
		}
		catch(Exception e){
		}
		}
		
	public void typeBylastname(String locator, String values){

			driver.findElement(By.xpath(locator)).clear();
			driver.findElement(By.xpath(locator)).sendKeys(values);
	}
		public void  typeByemail (String locator, String values){
			driver.findElement(By.xpath(locator)).clear();
			driver.findElement(By.xpath(locator)).sendKeys(values);
		
		}
		public void  typeByPassword (String locator, String values){
			driver.findElement(By.xpath(locator)).clear();
			driver.findElement(By.xpath(locator)).sendKeys(values);
	}
		/*public void typeByflight(String locator){
			driver.findElement(By.xpath(locator)).click();
		}
		public void typeByflightType(String locator){
			driver.findElement(By.xpath(locator)).click();
		}
		public void typeByoriginAirport(String locator, String values){
			driver.findElement(By.xpath(locator)).clear();
			driver.findElement(By.xpath(locator)).sendKeys(values);
			driver.findElement(By.xpath(locator)).sendKeys(values);
		}*/
	}


