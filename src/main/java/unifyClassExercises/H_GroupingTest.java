package unifyClassExercises;

import org.testng.annotations.Test;

public class H_GroupingTest {
    @Test(groups = {"Regression"})
    void firstTest()
    {
        System.out.println("Test Case 1");
    }
    @Test(groups = {"Sanity"})
    void secondTest() {
        System.out.println("Test Case 2");
    }
    @Test(groups = {"Smoke"})
    void thirdTest(){
        System.out.println("Test Case 3");
    }
    @Test(groups = {"Sanity"})
    void fourthTest(){
        System.out.println("Test Case 4");
    }
    @Test(groups = {"Smoke"})
    void fifthTest(){
        System.out.println("Test Case 5");
    }
    @Test(groups = {"Regression","Smoke"})
    void test6() {
        System.out.println("Test Case 6");
    }
    @Test(groups = {"Smoke"})
    void test7() {
        System.out.println("Test Case 7");
    }
    @Test(groups = {"Sanity","Smoke"})
    void test8(){
        System.out.println("Test Case 8");
    }
    @Test(groups = {"Regression"})
    void test9(){
        System.out.println("Test Case 9");
    }

//    @Test(priority = 1, groups = {"Smoke"})
    @Test(groups = {"Smoke"})
    void test10(){
        System.out.println("Test Case 10");
    }
}
