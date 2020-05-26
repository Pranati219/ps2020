package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Worldometer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		//driver.findElement(By.xpath("//*[@id='main_table_countries_today']/tbody[1]/tr[15]/td[2]/a")).click();
		driver.findElement(By.linkText("India")).click();
	}

}
