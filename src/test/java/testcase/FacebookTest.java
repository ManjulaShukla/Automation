
	package testcase;

	import org.testng.annotations.Test;

	import Core.page;
import utility.poiConfig;

import org.openqa.selenium.By;
	import org.testng.annotations.DataProvider;

	public class FacebookTest extends page
	{
	  @Test(dataProvider = "loginData")
	  public void test(String id, String pwd) 
	  {
		  // reading xpath from properties
		 String uid =  p.getProperty("userid");
		 String pw = p.getProperty("password");
		 String sub =p.getProperty("submit");
		 
		 driver.findElement(By.xpath(uid)).sendKeys(id);
		 driver.findElement(By.xpath(pw)).sendKeys(pwd);
		 driver.findElement(By.xpath(sub)).click();
	  }

	  @DataProvider
	  public Object[][] loginData() throws Exception 
	  {
	    return poiConfig.getData("C:\\Users\\Sandeep\\Desktop\\ref.xls", "Sheet1");
	  }
	}


