package com.syntax.selenium.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AliP_Personal\\Google Drive\\QA\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.amazon.com");
        // String url = chromeDriver.getCurrentUrl();
        // System.out.println(url);
        //String title=chromeDriver.getTitle();
        //System.out.println(title);
        chromeDriver.navigate().to("http://google.com");
        chromeDriver.navigate().back();
        Thread.sleep(1000);
        chromeDriver.navigate().forward();
        Thread.sleep(1000);
        chromeDriver.navigate().refresh();
        //chromeDriver.close();
        chromeDriver.quit();
    }


}
