package Lesson_12.Task_3;

/* Create test with usage of DataProvider, use at least 3 sets of data*/

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvExample {

    @Test(dataProvider = "LoginDataProvider")
    public void loginTest(String name, String email, String password) {
        System.out.println("Test: " + "name - " + name + ";  email - " + email + ";  password - " + password + ";");
    }

    @DataProvider(name = "LoginDataProvider")
    public Object[][] getData() {
        Object[][] data = {{"User1", "abc@gmail.com", "12345678"},
                {"User2", "bcd@gmail.com", "23456789"},
                {"User3", "cde@gmail.com", "34567891"}};
        return data;
    }

}


