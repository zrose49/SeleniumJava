package com.tests.herosite;

import com.pageobjects.core.ConstantsHeroSite;
import com.tests.core.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import pageobjects.Login;

import static com.pageobjects.core.ConstantsHeroSite.*;
import static org.junit.Assert.*;

public class TestLoginHeroSite extends BaseTest {

    private Login login;

    @Before
    public void goToSauceLabsSite() {
        login = new Login(driver);
    }

    @Test
    public void verifySuccessfulLogin() {
        login.with(USERNAME, PASSWORD);
        Assert.assertTrue("Success message not present",login.successMessagePresent());
    }

    @Test
    public void verifyFailedLogin() {
        login.with(USERNAME,"testfail");
        Assert.assertTrue("Failure message not present",login.failureMessagePresent());
    }

    @Test(expected = TimeoutException.class)
    public void failed2() {
        login.with("tomsmith", "bad password");
        assertFalse("success message was present after providing bogus credentials",
                login.successMessagePresent());
    }




}
