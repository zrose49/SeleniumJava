package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends Base {

    By usernameLocator = By.id("username");
    By loginFormLocator = By.id("login");
    By passwordLocator = By.id("password");
    By submitButton = By.cssSelector("button");
    By successMessageLocator = By.cssSelector(".flash.success");
    By failureMessageLocator = By.cssSelector(".flash.error");

    public Login(WebDriver driver) {
        super(driver);
        visit("http://the-internet.herokuapp.com/login");
        Assert.assertTrue("The login form is not present",isDisplayed(loginFormLocator,10));
    }

    public void with(String username, String password) {

       type(usernameLocator,username);
       type(passwordLocator,password);
       click(submitButton);

    }

    public Boolean successMessagePresent() {
        return isDisplayed(successMessageLocator,10);
    }

    public Boolean failureMessagePresent() {
        return isDisplayed(failureMessageLocator,10);
    }



}
