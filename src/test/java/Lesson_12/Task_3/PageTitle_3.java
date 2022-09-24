package Lesson_12.Task_3;

/*  Task_3  Create at 3 test using testNG:
* Open any desirable site and verify title
* Using Random java class Random random = new Random(); Validate that random returns values in the correct range(for example use range 10)
* Create test with usage of DataProvider, use at least 3 sets of data*/


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PageTitle_3{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromeDriwer\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.navigate().to("https://butlers.ua/ua/");
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title - " + actualTitle);
        System.out.println();
        driver.manage().window().maximize();
        String expectedTitle = "BUTLERS Made for Your Home БАТЛЕРС Декор для Дома Интерьера Новый год";
        System.out.println("Expected Title - " + expectedTitle);
        System.out.println();
        if(actualTitle.equalsIgnoreCase(expectedTitle))
            System.out.println("Title Matched");
        else
            System.out.println("Title didn't match");
        //Assert.assertEquals( actualTitle, expectedTitle,"Condition true");
        driver.close();
        driver.quit();

    }

}