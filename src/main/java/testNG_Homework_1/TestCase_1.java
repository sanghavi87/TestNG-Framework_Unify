package testNG_Homework_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase_1 {
    WebDriver driver;


    @Test(priority= 1)
        void openBrowser()
    {
      System.out.println("Open Browser");
      WebDriverManager.chromedriver().setup();
      driver=new ChromeDriver();
      driver.get("https://demo.nopcommerce.com/");
      driver.manage().window().maximize();
    }

    @Test(priority = 2)
    void Register()
    {
      driver.findElement(By.className("ico-register")).click();
      driver.findElement(By.id("gender-male")).click();
      driver.findElement(By.id("FirstName")).sendKeys("Abhishek");
      driver.findElement(By.id("LastName")).sendKeys("Sanghavi");
      driver.findElement(By.name("DateOfBirthDay")).sendKeys("14");
      driver.findElement(By.name("DateOfBirthMonth")).sendKeys("July");
      driver.findElement(By.name("DateOfBirthYear")).sendKeys("1987");
      driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("admin123@gmail.com");
      driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("Marks Wholesale Ltd");
      driver.findElement(By.xpath("//input[@id='Newsletter']")).click();
      driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("admin123");
      driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("admin123");
      driver.findElement(By.xpath("//button[@id='register-button']")).click();

    }

    @Test(priority= 3)
        void login()

    {
      System.out.println("Run Login Functionality ");
      driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
      driver.findElement(By.id("Email")).sendKeys("admin123@gmail.com");
      driver.findElement(By.className("password")).sendKeys("admin123");
      driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

    }


    @Test(priority = 4)
    void logout()
    {
        driver.findElement(By.xpath("//a[normalize-space()='Log out']"));

    //Validate Homepage:-
    //-------------------

        String ActualTitle=driver.getTitle();
        String ExpectedTitle= "nopCommerce demo store";

        if(ActualTitle.equals(ExpectedTitle))
        {
            System.out.println("Test is Passed");
        }
        else
        {
            System.out.println("Test is Failed");
        }

    }


    @Test(priority = 5)
        void closeBrowser()
    {
      System.out.println("Close Browser");
      driver.close();
    }



}
