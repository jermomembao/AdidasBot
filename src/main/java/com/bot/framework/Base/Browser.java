package com.bot.framework.Base;

import org.openqa.selenium.WebDriver;

public class Browser extends Base{

    private WebDriver driver;

    public Browser(WebDriver driver) {
        this.driver = driver;
    }

    public BrowserType Type;


    public void GoToUrl(String url)
    {
        driver.get(url);
    }

    public void Maximize()
    {
        driver.manage().window().maximize();
    }
}
