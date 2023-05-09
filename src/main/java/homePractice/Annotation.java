package homePractice;

import org.testng.annotations.*;

public class Annotation {

    @BeforeSuite
    void BS()
    {
        System.out.println("this is BeforeSuit Method");
    }

    @AfterSuite
    void AS()
    {
        System.out.println("this is AfterSuit method");
    }

    @BeforeTest
    void m()
    {
        System.out.println("this is method 'm' for BeforeTest method");
    }

    @AfterTest
    void n()
    {
        System.out.println("this is method 'n' for AfterTest method");
    }

    @BeforeClass
    void bc()
    {
        System.out.println("this is BeforeClass method...");
    }


    @AfterClass
    void ac()
    {
        System.out.println("this is AfterClass method...");
    }
    @BeforeMethod
    void bm()
    {
        System.out.println("this is BeforeMethod...");
    }

    @AfterMethod
    void am()
    {
        System.out.println("this is AfterMethod...");
    }

    @Test(priority = 1)
    void xyz()
    {
        System.out.println("This is 'xyz' test-1");
    }

    @Test(priority = 2)
    void abc()
    {
        System.out.println("this is 'abc' test-2");
    }

}


