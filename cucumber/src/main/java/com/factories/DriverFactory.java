package com.factories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

    public WebDriver driver;

    static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();

    /**
     * This method used to initialise thee driver based on the browser input given
     * @param browser
     * @return getDriver()
     */
    public WebDriver setDriver(String browser) {

        if (browser.equals("chrome")) {
            tldriver.set(new ChromeDriver());
        } else if (browser.equals("firefox")) {
            tldriver.set(new FirefoxDriver());
        } else if (browser.equals("safari")) {
            tldriver.set(new SafariDriver());
        } else {
            System.out.println("Please pass correcct value of the browser");
        }

        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();

        return getDriver();
    }

    /**
     * Adding "synchronized" Keyword to ensure the threads are in-sync when running in Parallel.
     * This meethod is used to get Driver using Threadlocal
     * @return 
     */
    public static synchronized WebDriver getDriver() {

        return tldriver.get();

    }

    public void unload() {

        tldriver.remove();
        
    }



}
