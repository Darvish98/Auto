package Uitests;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bank {
	public static void main(String[] args) {
		System.setProperty("webdrive.chrome.drive","C:\\Users\\Darvish\\eclipse-workspace\\Auto\\");
		WebDriver driver = new ChromeDriver();												
							
		driver.get("https://idemo.bspb.ru/auth?response_type=code&client_id=1&redirect_uri=https%3A%2F%2Fidemo.bspb.ru"
				+ "%2Flogin%2Fsuccess&prefetch_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fprefetch&force_new_session=true");
		driver.manage().window().maximize();	
					
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("password")).clear();
		
		driver.findElement(By.name("username")).sendKeys("demo");
		driver.findElement(By.name("password")).sendKeys("demo");
		
		driver.findElement(By.id("login-button")).click();
		
		driver.findElement(By.name("otpCode")).clear();
		
		driver.findElement(By.name("otpCode")).sendKeys("0000");
		
		driver.findElement(By.id("login-otp-button")).click();	
	        
      }

	public  class Error {
		public void main(String[] args) {
		System.setProperty("webdrive.chrome.drive","C:\\Users\\Darvish\\eclipse-workspace\\Auto\\");
		WebDriver driver = new ChromeDriver();												
		
		driver.get("https://idemo.bspb.ru/auth?response_type=code&client_id=1&redirect_uri=https%3A%2F%2Fidemo.bspb.ru"
				+ "%2Flogin%2Fsuccess&prefetch_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fprefetch&force_new_session=true");
		driver.manage().window().maximize();	
		
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("password")).clear();
		
		driver.findElement(By.id("login-button")).click();
	}
	public  class Error2 {
		public  void main(String[] args) {	
			System.setProperty("webdrive.chrome.drive","C:\\Users\\Darvish\\eclipse-workspace\\Auto\\");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://idemo.bspb.ru/auth?response_type=code&client_id=1&redirect_uri=https%3A%2F%2Fidemo.bspb.ru"
					+ "%2Flogin%2Fsuccess&prefetch_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fprefetch&force_new_session=true");
			
			driver.findElement(By.name("username")).sendKeys("demo");
			driver.findElement(By.name("password")).sendKeys("demo");
			driver.findElement(By.id("login-button")).click();
			
		
	     }
	 }	
	
  }
}