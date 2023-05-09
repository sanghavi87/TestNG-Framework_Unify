package unifyClassExercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class K_DataProviderTestCase {
    WebDriver driver;


    @Test(dataProvider = "loginTest",dataProviderClass = L_CustomDataProvider.class)
//    @Test(dataProvider = "loginTest")
    public void loginTest(String Email,String Pwd)
    {
        System.out.println(Email+ " " + Pwd);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");

        driver.findElement(By.id("Email")).sendKeys(Email);
        driver.findElement(By.id("Password")).sendKeys(Pwd);

    }

//    @DataProvider(name = "loginTest")
//    public Object[][] getData(){
//        Object[][] data = {{"abc@gmail.com","abc"},{"abcd@gmail.com","abcd"}};
//        return data;
//    }
}
