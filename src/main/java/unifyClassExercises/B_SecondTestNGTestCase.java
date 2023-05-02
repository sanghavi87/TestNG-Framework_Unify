package unifyClassExercises;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class B_SecondTestNGTestCase {
    WebDriver driver;

    @Test(priority = 1)
    void openBrowser() {
        System.out.println("Open Browser1");
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://demo.nopcommerce.com/");
    }

    void register() {

    }

    @Test(priority = 2)
    void logIn() {
        System.out.println("User Login1");
//        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
//        driver.findElement(By.id("Email")).sendKeys("test123@gmail.com");
//        driver.findElement(By.id("Password")).sendKeys("Tester123");
//        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
    }

    void logout() {
        //validate homepage
    }

    @Test(priority = 3)
    void closeBrowser() {
        System.out.println("Close Browser1");
//        driver.close();
    }
}
