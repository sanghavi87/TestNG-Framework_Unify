package unifyClassExercises;

import org.testng.annotations.*;

public class C_AnnotationsTestCase1 {

    @BeforeTest
    void beforeTest() {
        System.out.println("Before Test");
    }

    @AfterTest
    void afterTest() {
        System.out.println("After Test");
    }

    @BeforeClass
    void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    void afterClass() {
        System.out.println("After Class");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("After Method");
    }

    @Test
    void test1() {
        System.out.println("Test Case 1");
    }

    @Test
    void test2() {
        System.out.println("Test Case 2");
    }
}
