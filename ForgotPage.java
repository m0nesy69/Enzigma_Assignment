package com.Enzigma.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athar\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://app-staging.nokodr.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Forgot Password?']")).click();
		WebElement emailinput=driver.findElement(By.xpath("/html[1]/body[1]/abx-modal[1]/section[1]/div[1]/div[1]/abx-forgot-password[1]/div[1]/div[1]/div[1]/abx-tabs[1]/div[1]/div[1]/abx-tab[1]/div[1]/div[1]/abx-form[1]/div[1]/div[1]/abx-container[1]/div[1]/div[1]/div[1]/span[1]/abx-layout-item[1]/div[1]/abx-field[1]/div[1]/div[1]/div[1]/div[1]/abx-email[1]/input[1]"));
		emailinput.sendKeys("atharvpankar809469@gmail.com");
		driver.findElement(By.xpath("//abx-button[@name='proceed']//div[@id='staticElement']")).click();
        
	}

}
