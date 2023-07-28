package mapInterface;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hashmaplogintest {

	public static HashMap<String,String>Logindata() {
		HashMap<String,String>HM = new HashMap<String,String>();
		
		HM.put("A","ketan:ketan123");
		HM.put("B","Akash:Akash123");
		HM.put("C","Amit:Amit123");
		HM.put("D","Akshay:Akshay124");
		
	return HM;
	}
	
	 public static void main(String[] args) {
		 
		 System.setProperty("webDriver.chrome.driver","\"C:\\Users\\Vaishnavi\\OneDrive\\Desktop\\Installer\\chromedriver_win32\\chromedriver.exe\"");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 String Name= Hashmaplogintest.Logindata().get("B");
		 String arr[]=Name.split(":");
		 //0 ketan and 1 ketan123
		 driver.findElement(By.id("email")).sendKeys(arr[0]);
		 driver.findElement(By.id("pass")).sendKeys(arr[1]);
		 driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).click();
		 String ActualTitle =driver.getTitle();
		 if(ActualTitle.equals("Log in to Facebook")) {
			 System.out.println("Correct Title");
		 }
		 else {
			 System.out.println("Incorrect Title");
		 }
		 driver.quit();
	 }

}
