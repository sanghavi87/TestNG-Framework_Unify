package unifyClassExercises;

import org.testng.annotations.*;

public class D_AnnotationsTestCase2 {
    @BeforeSuite
    void beforeSuite() {
        System.out.println("Before Suite");
    }

    @AfterSuite
    void afterSuite() {
        System.out.println("After Suite");
    }

    @BeforeMethod
    void beforeMethod1() {
        System.out.println("Before Method1");
    }

    @AfterMethod
    void afterMethod1() {
        System.out.println("After Method1");
    }

    @Test
    void test3() {
        System.out.println("Test Case 3");
    }

    @Test
    void test4() {
        System.out.println("Test Case 4");
    }

}
