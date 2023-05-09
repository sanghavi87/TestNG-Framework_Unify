package unifyClassExercises;

import org.testng.annotations.Test;

public class F_Disable
{
    @Test(priority = 1)
    void firstTest()
    {
        System.out.println("Test Case 1");
    }
    @Test(priority = 2)
    void secondTest()
    {
        System.out.println("Test Case 2");
    }
    @Test(priority = 3,enabled = false)
    void thirdTest()
    {
        System.out.println("Test Case 3");
    }
    @Test(priority = 4)
    void fourthTest()
    {
        System.out.println("Test Case 4");
    }
    @Test(priority = 5)
    void fifthTest()
    {
        System.out.println("Test Case 5");
    }
}
