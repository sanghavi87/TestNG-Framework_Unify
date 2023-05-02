package unifyClassExercises.parallelTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParallelTesting1 {
    WebDriver driver;
    @BeforeClass
    void openBrowser() {
        System.out.println("Open Browser");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }
    @Test(priority = 1)
    void webLogo(){
        WebElement Logo = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
        Assert.assertTrue(Logo.isDisplayed(),"Logo is not present");
    }
    @Test(priority = 2)
    void homePageTitle(){
        String Title = driver.getTitle();
        Assert.assertEquals(Title,"nopCommerce demo store","Page title is incorrect");
    }
    @AfterClass
    void closeBrowser(){
        driver.quit();
    }

}
