import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Никита on 17.09.2017.
 */
public class MainClass {

    static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Никита\\IdeaProjects\\testselenium\\drivers\\geckodriver.exe");

        driver = new FirefoxDriver();

        // Задаем неявное ожидание 3 секунды для поиска станций метро
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://afisha.mail.ru");

        KinoPage kinoPage = new KinoPage(driver);

        kinoPage.getSeancesList();
    }
}
