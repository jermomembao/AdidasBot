package com.bot.framework.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserInitialize {

    public static void InitializeBrowser(BrowserType browserType) {

        WebDriver driver = null;
        switch (browserType) {
            case Chrome: {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;
            }
            case Firefox: {
                //Open the browser
                System.setProperty("webdriver.gecko.driver", "C:\\chromedriver\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            }
            case Edge: {
                break;
            }
        }


        //Set the Driver
        DriverContext.setDriver(driver);
        //Browser
        DriverContext.Browser = new Browser(driver);
    }
}

