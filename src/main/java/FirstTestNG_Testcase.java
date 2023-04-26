import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestNG_Testcase {
    WebDriver driver;


    @Test(priority = 1)
    void openBrowser()
    {
        System.out.println("Open Browser");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }

    @Test(priority = 2)
    void login()
    {
        System.out.println("Run Login Functionality ");
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.id("Email")).sendKeys("rohan@gmail.com");
        driver.findElement(By.className("password")).sendKeys("rohan123");
        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
        //driver.findElement(By.className("ico-logout")).click();
    }


    @Test(priority = 3)
    void closeBrowser()
    {
        System.out.println("Close Browser");
        driver.close();
    }


}
