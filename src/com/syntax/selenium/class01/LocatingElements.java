package com.syntax.selenium.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AliP_Personal\\Google Drive\\QA\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.fb.com");
        chromeDriver.findElement(By.id("email")).sendKeys("hellomi");
        chromeDriver.findElement(By.id("pass")).sendKeys("pass123");
        chromeDriver.findElement(By.name("login")).click();
        Thread.sleep(2000);
        chromeDriver.findElement(By.linkText("Forgot password?"));
        Thread.sleep(2000);
        chromeDriver.quit();
    }
}
