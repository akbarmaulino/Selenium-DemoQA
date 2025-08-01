package selenium;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Alert {
    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeSuite
    public void startBrowser() {
        System.out.println("Starting the browser...");
        System.setProperty("webdriver.chrome.driver", "C:/Users/Yantrisnandra Akbar/Downloads/Selenium-AfterOffice/resources/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @Test
    public void testAlert() throws InterruptedException {
        WebElement inputAlert = driver.findElement(By.xpath("//input[@id='name']"));
        wait.until(d -> ExpectedConditions.visibilityOf(inputAlert));
        inputAlert.sendKeys("Yantrisnandra Akbar");
        WebElement alertButton = driver.findElement(By.xpath("//input[@id='alertbtn']"));
        wait.until(d -> ExpectedConditions.elementToBeClickable(alertButton));
        alertButton.click();
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(2000); // Wait for the alert to appear
        driver.switchTo().alert().accept(); // Accept the alert
    }

    @AfterSuite
    public void closeBrowser() {
        System.out.println("Closing the browser...");
        if (driver != null) {
            driver.quit(); 
        }
    }
    
}
