package unifyClassExercises;

import org.testng.Assert;
import org.testng.annotations.Test;

public class G_DependancyTestCase {
    /*
    Login
    Find Product
    Select Product
    Add Product
    Buy Product
     */
    @Test(priority = 1)
    void logIn()
    {
        System.out.println("User logged in successfully");
        Assert.fail();
    }


    @Test(dependsOnMethods = {"logIn"},alwaysRun = true)
   //@Test(dependsOnMethods = "logIn")
    void findProduct()
    {
        System.out.println("User able to find product");
    }


    @Test(dependsOnMethods = "findProduct")
    void selectProduct()
    {
        System.out.println("User able to select product");
    }


    @Test(dependsOnMethods = "selectProduct")
    void addProduct()
    {
        System.out.println("User able to add product");
    }


    @Test(dependsOnMethods = "addProduct")
    void buyProduct()
    {
        System.out.println("User able to buy product");
    }
}
