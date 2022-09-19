package Lesson_11;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class MyFirstTest {

    @Test
    public void firsttest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua");
        Thread.sleep(3000);
        driver.close();
    }

}

