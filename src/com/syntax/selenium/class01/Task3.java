package com.syntax.selenium.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AliP_Personal\\Google Drive\\QA\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        chromeDriver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        chromeDriver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        chromeDriver.findElement(By.id("ctl00_MainContent_login_button")).click();
        Thread.sleep(3000);
        String title = chromeDriver.getTitle();
        if (title.equalsIgnoreCase("Web Orders")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        chromeDriver.findElement(By.id("ctl00_logout")).click();

        chromeDriver.quit();

    }
}
