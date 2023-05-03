package testNG_Homework_2;

// Write a End-to-End test script for following application - "demo.nopcommerce.com"
//-----------------------------------------------------------------------------------

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.*;

public class TestNG_Homework_2
{
    WebDriver driver;
    @BeforeClass
    void openBrowser() throws InterruptedException
    {
        System.out.println("Open Browser");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

    }

    @Test(priority = 1)
    void selectProduct()
    {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")).click();
        driver.findElement(By.xpath("//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Lenovo IdeaCentre 600 All-in-One PC']")).click();

    }

    @Test(priority = 2)
    void AddtoCart() throws InterruptedException
    {
        //we need to clear default qty. and add new qty.  :-
        //--------------------------------------------------
        Thread.sleep(3000);
        WebElement quantityInput=driver.findElement(By.xpath("//input[@id='product_enteredQuantity_3']"));
        quantityInput.clear();                                                                            //so we will clear the default qty. from the box
        quantityInput.sendKeys("5");                                                        // here we have add our qty. in box

        //Validate the qty. is added in cart:-
        //---------------------------------------
        Assert.assertTrue(true,"Qty. is not added into cart");

        driver.findElement(By.xpath("//button[@id='add-to-cart-button-3']")).click();

    }


    @Test(priority = 3)
    void shoppingCart() throws InterruptedException
    {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='shopping cart']")).click();  //click on shopping cart pop-up message

        //Clear the old qty. and update the new qty. - 3 :-
        //--------------------------------------------------
        Thread.sleep(3000);
        WebElement quantityInput1=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[5]/input"));
        quantityInput1.clear();                                                              //we have clear old qty. here
        quantityInput1.sendKeys("3");                                          //we add new qty. here

        driver.findElement(By.xpath("//button[@id='updatecart']")).click();    //update shopping cart
        driver.findElement(By.xpath("//input[@id='termsofservice']")).click();  //click on T&C box
        driver.findElement(By.xpath("//button[@id='checkout']")).click();     //click on "CHECKOUT"

    }


    @Test(priority = 4)
    void checkOut() throws InterruptedException
    {
        Thread.sleep(2000);
       driver.findElement(By.xpath("//button[normalize-space()='Checkout as Guest']")).click(); //checkout as a guest
    }


    @Test(priority = 5)
    void billingDetails() throws InterruptedException
    {
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_FirstName']")).sendKeys("Magan");
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_LastName']")).sendKeys("Patel");
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_Email']")).sendKeys("abcabc@gmail.com");
        driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']")).sendKeys("United States");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@id='BillingNewAddress_StateProvinceId']")).sendKeys("Alaska");
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']")).sendKeys("NewYork");
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']")).sendKeys("1020 Edward Road");
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']")).sendKeys("E78LE");
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']")).sendKeys("07845120120");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@onclick='Billing.save()']")).click();  //click on "CONTINUE"

    }

    @Test(priority = 6)
    void shippingMethod() throws InterruptedException
    {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='shippingoption_1']")).click(); //Next Day Air

        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']")).click(); //click on "CONTINUE"

    }



    @Test(priority = 7)
    void payment() throws InterruptedException
    {

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='paymentmethod_1']")).click();   //select credit card

        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='button-1 payment-method-next-step-button']")).click();  //click on "CONTINUE"

        //Fill all card details:-
        //-------------------------
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@id='CreditCardType']")).sendKeys("Master card");
        driver.findElement(By.xpath("//input[@id='CardholderName']")).sendKeys("Magan Patel");
        driver.findElement(By.xpath("//input[@id='CardNumber']")).sendKeys("4659446678073231");
        driver.findElement(By.xpath("//select[@id='ExpireMonth']")).sendKeys("12");
        driver.findElement(By.xpath("//select[@id='ExpireYear']")).sendKeys("2026");
        driver.findElement(By.xpath("//input[@id='CardCode']")).sendKeys("369");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='button-1 payment-info-next-step-button']")).click(); //click on "CONTINUE"

        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='Confirm']")).click();  //click on the "CONFIRM" order

        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();  //click on "CONTINUE" to go on homepage
    }



    @Test(priority = 8)
    void ValidateHomepage() throws InterruptedException
    {
        //we are verifying homepage title here by using the Assert method:-
        //--------------------------------------------------------------------
        Thread.sleep(3000);
        Assert.assertEquals(driver.getTitle(),"nopCommerce demo store","Title is not matched...");
    }


    @AfterClass
    void CloseBrowser() throws InterruptedException
    {
        Thread.sleep(1000);
        driver.quit();
    }


}
