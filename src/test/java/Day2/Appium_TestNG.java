package Day2;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Appium_TestNG {
	
	AndroidDriver driver;
  @Test(dataProvider = "dp")
  public void f(String name) throws Exception {
	  
	  driver.findElement(By.id("com.bitbar.testdroid:id/radio0"));
		 
	  driver.findElement(By.id("com.bitbar.testdroid:id/editText1")).sendKeys(name);
	  //driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.bitbar.testdroid:id/editText1\"]"));
	  driver.findElement(By.id("com.bitbar.testdroid:id/button1")).click();
	  Thread.sleep(3000);
	  boolean isDisplayed=driver.findElement(By.id("com.bitbar.testdroid:id/textView2")).isDisplayed();
	  if(isDisplayed) {
		  System.out.println("passed");
	  }
	  else {
		  System.out.println("not passed");
	  };
  }

  @BeforeMethod
  public void beforeMethod() throws MalformedURLException {
	  
	  DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability("platforName", "Android");
		dc.setCapability("deviceName", "Medium Phone API 32");
		dc.setCapability("appium:skipServerInstallation", "true");
		  dc.setCapability("appium:noReset", "true");
		  dc.setCapability("appium:platformVersion", "12.0");
		  dc.setCapability("app", "D:\\ShubhamGaikwad\\Appium\\bitbar-sample-app.apk");
		  
		  URL url = new URL("http://127.0.0.1:4723/wd/hub");
		  driver = new AndroidDriver(url, dc);
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"Shubham"},
      
    };
    
  }
}
