package Lesson_12.Task_1;

/*  Task_1.   Implement singleton patern for Webdriver*/

public class Webdriver {

    private static Webdriver webdriver;

    private Webdriver() {
    }

    public static Webdriver getwebdriver() {
        if (webdriver == null) {
            webdriver = new Webdriver();
        }
        return webdriver;
    }

    public static void main(String[] args) {
        System.out.println(webdriver.getwebdriver());
        System.out.println(Webdriver.getwebdriver());
        System.out.println(Webdriver.getwebdriver());
    }
}
