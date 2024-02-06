package Day5Feb;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TC01_DragDrop {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platforName", "Android");
		dc.setCapability("deviceName", "Medium Phone API 32");
		dc.setCapability("appium:skipServerInstallation", "true");
		  dc.setCapability("appium:noReset", "true");
		  dc.setCapability("appium:platformVersion", "12.0");
		dc.setCapability("app", "D:\\ShubhamGaikwad\\Appium\\com.mobeta.android.demodslv_2013-01-11.apk");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url, dc);
		
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.mobeta.android.demodslv:id/activity_title\" and @text=\"Basic usage playground\"]")).click();
		

		//Element which needs to drag.    		
        	WebElement From=driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.mobeta.android.demodslv:id/drag_handle\"])[1]"));	
         
         //Element on which need to drop.		
         WebElement To=driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.mobeta.android.demodslv:id/drag_handle\"])[3]"));					
         		
         //Using Action class for drag and drop.		
         Actions act=new Actions(driver);					

	//Dragged and dropped.		
         act.dragAndDrop(From, To).build().perform();		
	}		
//		driver.findElement(By.id("at.markushi.reveal:id/btn_1")).click();
//		driver.findElement(By.id("at.markushi.reveal:id/btn_2")).click();
//		driver.findElement(By.id("at.markushi.reveal:id/btn_3")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id=\"at.markushi.reveal:id/slow_motion\"]")).click();
		
	}




