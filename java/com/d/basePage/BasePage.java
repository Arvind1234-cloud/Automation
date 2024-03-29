package com.d.basePage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	public WebDriver driver;
	
	public static final String path="C:\\Users\\dell\\workspace\\AutomationP\\src\\main\\java\\com\\d\\config\\config";
public String getData(String key) throws Exception{
	File f = new File(path);
	FileInputStream fi = new FileInputStream(f);
	Properties p = new Properties();
	p.load(fi);
	return p.getProperty(key);
	}

public void selectOption(WebElement element,int option){
	
	Select s = new Select(element);
	s.selectByIndex(option);
}

public int randomnumber(){
	
	Random r = new Random();
	int random=r.nextInt(48);
	return random;
	
}

public void browserLaunch(String browser,String url){
		
		if(browser.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
			driver=new ChromeDriver();
			}
		
		else if(browser.equalsIgnoreCase("ie")){
			
			System.setProperty("webdriver.ie.driver", "F:\\msedgedriver.exe");
		}
		
		driver.get(url);
		driver.manage().window().maximize();
	}

}
