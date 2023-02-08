package actions;

import config.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

import static config.DriverManager.getDriver;

public class MouseActions {
    private static final int DEFAULT_TIMEOUT = 30;
    private final WaitStrategy wait = new WaitStrategy();

    JavascriptExecutor getJsExecutor() {
        return (JavascriptExecutor) DriverManager.getDriver();
    }

    public void clickOn(By by) {
        wait.isElementClickable(by, DEFAULT_TIMEOUT);
        getDriver().findElement(by).click();
    }

    public void clickOn(final WebElement element) {
        wait.isElementClickable((By) element, DEFAULT_TIMEOUT);
        element.click();
    }

    public void clickOnUsingJsExec(WebElement element) {
        getJsExecutor().executeScript("arguments[0].click();", element);
    }
    public void doubleClickOn(By by) {
        wait.isElementClickable(by, DEFAULT_TIMEOUT);
        getDriver().findElement(by).click();
        wait.isElementClickable(by, DEFAULT_TIMEOUT);
        getDriver().findElement(by).click();
    }



    //TODO add more methods : double click, right click, click and hold, etc
//    public void doubleClickOn(final WebElement element) {
//
//        Actions actions = new Actions(driver);
//        WebElement elementLocator = driver.findElement(By.id("ID"));
//        actions.doubleClick(elementLocator).perform();
//    }
////




    //TODO add methods with

    public void scrollDown(){
        WaitStrategy.waitFor(Duration.ofSeconds(3));
        getJsExecutor().executeScript("window.scrollBy(0,2000)");
    }

//    public void Login()
//    {
//        WebDriver driver= new ChromeDriver();
//
//        //Creating the JavascriptExecutor interface object by Type casting
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//
//        //Launching the Site.
//        driver.get("https://www.servetelemank.ro/inregistrare");
//
//        WebElement button =driver.findElement(By.name("btnIntraInCont"));
//
//        //Login to Guru99
//        driver.findElement(By.name("uid")).sendKeys("");
//        driver.findElement(By.name("password")).sendKeys("");
//
//        //Perform Click on LOGIN button using JavascriptExecutor
//        js.executeScript("arguments[0].click();", button);
//
//        //To generate Alert window using JavascriptExecutor. Display the alert message
//        js.executeScript("alert('Welcome to Guru99');");
//
//    }
}
