package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebElementOperations extends LoggingUtils{

    private static WebDriver driver;
    private static WebDriverWait webDriverWait;

    public void setDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    public WebDriver getDriver(){
        if(driver == null){
            setDriver();
        }
        return driver;
    }

    public void click(WebElement element){
        waitForElementToBeClickable(element);
        logMessage(element.getText()+"  is clicked");
        element.click();
    }

    public void waitForElementToBeClickable(WebElement element){
        getWebDriverWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    public void setWebDriverWait(){
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public WebDriverWait getWebDriverWait(){
        if(webDriverWait == null){
            setWebDriverWait();
        }
        return webDriverWait;
    }



}
