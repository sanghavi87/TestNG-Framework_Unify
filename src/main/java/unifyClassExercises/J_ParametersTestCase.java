package unifyClassExercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class J_ParametersTestCase {
    WebDriver driver;
    @BeforeClass
    @Parameters({"browser","Url"})
    void openBrowser(String browser, String Url) {
       if(browser.equalsIgnoreCase("chrome")) {
           WebDriverManager.chromedriver().setup();
           driver = new ChromeDriver();
       }else if(browser.equalsIgnoreCase("edge")) {
           WebDriverManager.edgedriver().setup();
           driver = new EdgeDriver();
       }else if(browser.equalsIgnoreCase("firefox")) {
           WebDriverManager.firefoxdriver().setup();
           driver = new FirefoxDriver();
       }else {
           System.out.println("Not Applicable");
       }
        driver.manage().window().maximize();
        driver.get(Url);
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
