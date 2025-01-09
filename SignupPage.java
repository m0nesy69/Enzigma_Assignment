package com.Enzigma.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignupPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athar\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://app-staging.nokodr.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();
        
        WebElement emailField = driver.findElement(By.xpath("/html[1]/body[1]/abx-modal[1]/section[1]/div[1]/div[1]/abx-sign-up[1]/div[1]/div[1]/div[2]/span[1]/abx-tabs[1]/div[1]/div[1]/abx-tab[1]/div[1]/div[1]/abx-form[1]/div[1]/div[1]/abx-container[1]/div[1]/div[1]/div[1]/span[1]/abx-layout-item[1]/div[1]/abx-field[1]/div[1]/div[1]/div[1]/div[1]/abx-email[1]/input[1]"));
        emailField.sendKeys("atharvpankar7@gmail.com");
        driver.findElement(By.xpath("//span[@class='slds-checkbox_faux']")).click();
        driver.findElement(By.xpath("//abx-button[@class='btn']//button[@name='undefined']")).click();
        
	}

}
