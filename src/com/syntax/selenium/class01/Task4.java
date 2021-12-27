package com.syntax.selenium.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AliP_Personal\\Google Drive\\QA\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://parabank.parasoft.com/parabank/index.htm");

        chromeDriver.findElement(By.linkText("Register")).click();
        chromeDriver.findElement(By.id("customer.firstName")).sendKeys("John");
        chromeDriver.findElement(By.id("customer.lastName")).sendKeys("Ada");
        chromeDriver.findElement(By.name("customer.address.street")).sendKeys("78 hays dr");
        chromeDriver.findElement(By.id("customer.address.city")).sendKeys("Gwinnet");
        chromeDriver.findElement(By.id("customer.address.state")).sendKeys("GA");
        chromeDriver.findElement(By.name("customer.address.zipCode")).sendKeys("30049");
        chromeDriver.findElement(By.name("customer.phoneNumber")).sendKeys("9002345566");
        chromeDriver.findElement(By.id("customer.ssn")).sendKeys("578900344");
        chromeDriver.findElement(By.id("customer.username")).sendKeys("hakdkk");
        chromeDriver.findElement(By.id("customer.password")).sendKeys("738374");
        chromeDriver.findElement(By.id("repeatedPassword")).sendKeys("738375");
        Thread.sleep(5000);
        chromeDriver.findElement(By.className("button")).click();

        Thread.sleep(5000);

        chromeDriver.quit();
    }
}

