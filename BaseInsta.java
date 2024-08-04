package com.insta.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.insta.utilities.ReadconfigInsta;

public class BaseInsta 
{
ReadconfigInsta readconfigInsta = new ReadconfigInsta();
	
	public String baseurl= readconfigInsta.getweburl();
	public String username= readconfigInsta.getusername();
	public String password= readconfigInsta.getpassword();
	public String title= readconfigInsta.getwebtitle();
	public String chromepath = readconfigInsta.getchromepath();
//	public String search = readconfigInsta.getsearchcoin();
			
	
	public static WebDriver driver;
	
	@BeforeClass
	@Parameters("browser")

	public void setup(String br)
	{
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver = new ChromeDriver();
		}
		
//		else if(br.equals("firefox"))
//		{
//			System.setProperty("webdriver.gecko.driver", firefoxpath);
//			driver = new FirefoxDriver();
//		}
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@AfterClass
	public void termin()
	{
		 if (driver != null) {
	            driver.quit();
	        }
	}

}
