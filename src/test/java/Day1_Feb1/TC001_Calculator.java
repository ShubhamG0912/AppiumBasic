package Day1_Feb1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TC001_Calculator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability("platforName", "Android");
		dc.setCapability("deviceName", "Medium Phone API 32");
		dc.setCapability("appium:skipServerInstallation", "true");
		  dc.setCapability("appium:noReset", "true");
		  dc.setCapability("appium:platformVersion", "12.0");
		  dc.setCapability("app", "D:\\ShubhamGaikwad\\Appium\\com.the511plus.MultiTouchTester.apk");

	   
	    URL url1=new URL("http://127.0.0.1:4723/wd/hub");
	    
	    Thread.sleep(3000);
		AndroidDriver driver=new AndroidDriver(url1,dc);
		
		driver.findElement(By.id("android:id/button1")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.the511plus.MultiTouchTester:id/touchStr\"]")).click();
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		Thread.sleep(3000);
//		js.executeScript("window.scrollBy(0,350)", "");
//		


	}

}
