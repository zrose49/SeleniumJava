package com.pageobjects.core;

import org.openqa.selenium.By;

public class ConstantsHeroSite {

    //URLs
    public static final String HEROUKAPPURL = "http://the-internet.herokuapp.com/login";

    //User Credentials
    public static final String USERNAME = "tomsmith";
    public static final String PASSWORD = "SuperSecretPassword!";

    //Locators
    public static final By usernameLocator = By.id("username");
    public static final By passwordLocator = By.id("password");
    public static final By loginButtonLocator = By.cssSelector("#login > button");
    public static final By loginSuccessMessageLocator = By.cssSelector("#flash");


}
