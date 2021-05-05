package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static com.tests.core.Config.*;

public class Base {

    private WebDriver driver;

    public Base(WebDriver driver) {
        this.driver = driver;
    }

    public void visit(String url) {
        if (url.contains("http"))  {
            driver.get(url);
        } else {
            driver.get(baseUrl + url);
        }
    }

    public WebElement find(By locator) {
        return driver.findElement(locator);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void type(By locator, String inputText) {
        driver.findElement(locator).sendKeys(inputText);
    }

    public Boolean isDisplayed(By locator, Integer timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout).getSeconds());
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        }
        catch(NoSuchElementException exception) {
            return false;
        }
        return true;
    }

}
