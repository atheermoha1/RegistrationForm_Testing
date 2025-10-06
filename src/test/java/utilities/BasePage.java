package utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

/**
 * Base class for all Page Objects
 * CRITICAL: Does NOT store driver reference - gets it fresh each time
 * This ensures ThreadLocal works correctly in parallel execution
 */
public class BasePage {
    
    private static final int EXPLICIT_WAIT_SECONDS = 10;
    
    // DO NOT STORE DRIVER - get it dynamically each time
    public BasePage() {
        // Constructor doesn't need driver parameter
    }
    
    /**
     * Get driver from ThreadLocal for current thread
     */
    protected WebDriver getDriver() {
        return Driver.getDriver();
    }
    
    /**
     * Get WebDriverWait instance for current thread
     */
    protected WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(EXPLICIT_WAIT_SECONDS));
    }
    
    /**
     * Wait for element to be visible
     */
    protected void waitForElementToBeVisible(WebElement element) {
        getWait().until(ExpectedConditions.visibilityOf(element));
    }
    
    /**
     * Wait for element to be clickable
     */
    protected void waitForElementToBeClickable(WebElement element) {
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }
    
    /**
     * Safe click with explicit wait
     */
    protected void safeClick(WebElement element) {
        waitForElementToBeClickable(element);
        element.click();
    }
    
    /**
     * Safe send keys with explicit wait
     */
    protected void safeSendKeys(WebElement element, String text) {
        waitForElementToBeVisible(element);
        element.clear();
        element.sendKeys(text);
    }
    
    /**
     * Check if element is displayed
     */
    protected boolean isElementDisplayed(WebElement element) {
        try {
            waitForElementToBeVisible(element);
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}