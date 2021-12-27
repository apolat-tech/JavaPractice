package com.syntax.class27;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AliP_Personal\\Google Drive\\QA\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.amazon.com/Apple-iPhone-11-64GB-Green/dp/B08BHN96L6/?_encoding=UTF8&pd_rd_w=8V8yw&pf_rd_p=885fab39-df66-4ed3-abdc-3fe066077d6a&pf_rd_r=Z5JSKK8JNGDR5SRSQAFR&pd_rd_r=d2bed725-ae81-44be-a29c-b47b9b714604&pd_rd_wg=eo08R&ref_=pd_gw_unk");
    }

}
