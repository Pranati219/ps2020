package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String a="P0rt0la123";
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://173.255.219.239:8080/return/");
		//driver.findElement(By.xpath("//*[@id='password_protected_pass']")).click();
		//driver.findElement(By.xpath("//*[@id='password_protected_pass']")).sendKeys("P0rt0la123");
		driver.findElement(By.id("password_protected_pass")).sendKeys("P0rt0la123");
		
		driver.findElement(By.xpath("//*[@id='wp-submit']")).click();
		//driver.findElement(By.xpath("//*[@id='request_type']/div[3]/div[1]/label']")).click();
		//driver.findElement(By.xpath("//*[@id='cookie_action_close_header']")).click();
		driver.get("http://173.255.219.239:8080/return/product/");
	}	
	}
