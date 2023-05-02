package unifyClassExercises;

import org.testng.annotations.DataProvider;

public class L_CustomDataProvider {
    @DataProvider(name = "loginTest")
    public Object[][] getData(){
        Object[][] data = {{"abc@gmail.com","abc"},{"abcd@gmail.com","abcd"}};
        return data;
    }
}
