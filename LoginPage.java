package com.Enzigma.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	public static boolean isValidEmail(String email) {
	    return email.contains("@") && email.contains(".") && email.indexOf("@") < email.lastIndexOf(".");
	}


	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\athar\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
        WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://app-staging.nokodr.com/");
	
	 WebElement usernameField = driver.findElement(By.xpath("//input[@type='email']")); // Adjust ID based on actual site
    WebElement passwordField = driver.findElement(By.xpath("//input[@type='password']"));
    WebElement loginButton = driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']//div[@id='staticElement']"));
//
    String uname="atharvpankar809469@gmail.com";
    String pass="TEst@1234";
    if(!isValidEmail(uname)) {
    	System.out.println("Invalid email id");
    }
    
    usernameField.sendKeys(uname);
//     
     passwordField.sendKeys(pass);
    loginButton.click();
    
    
    WebElement dashboard = driver.findElement(By.className("app-container")); // Adjust ID based on actual site
    if (dashboard.isDisplayed()) {
        System.out.println("Login Test Passed: Valid Login");
    } else {
        System.out.println("Login Test Failed: Valid Login");
    }
    
    WebElement errorMessage = driver.findElement(By.xpath("//div[@class='slds-form-element__help']")); // Adjust class based on actual site
    if (errorMessage.getText().contains("Please enter a valid email")) {
        System.out.println("Login Test Passed: Invalid Login");
        
    } 
    
    

	}

}
