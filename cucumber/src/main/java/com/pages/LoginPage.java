package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public final class LoginPage {

    private WebDriver driver;

    /**
     * 1. private Locators
     * 2. public Constructors
     * 3. Page Actions
     */

    private By username = By.xpath("//input[@placeholder='Username']");
    private By password = By.xpath("//input[@placeholder='Password']");
    private By loginButton = By.xpath("//button[@type='submit']");
    private By forgotPassword = By.xpath("//p[text()='Forgot your password? ']");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    
    }

    public boolean isForgotPasswordLinkExists() {
        return driver.findElement(forgotPassword).isDisplayed();
        
    }

    public void enterUserName(String uname) {
        driver.findElement(username).sendKeys(uname);
        
    }

    public void enterPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
        
    }

    public void clickOnLogin() {
        driver.findElement(loginButton).click();
        
    }

    public String getLoginPageTitle() {
        return driver.getTitle();
        
    }

}
