import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

/**
 * Created by Никита on 17.09.2017.
 */
public class MainClass {

    static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Никита\\IdeaProjects\\testselenium\\drivers\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Никита\\IdeaProjects\\testselenium\\drivers\\chromedriver.exe");
        System.setProperty("webdriver.ie.driver", "C:\\Users\\Никита\\IdeaProjects\\testselenium\\drivers\\IEDriverServer.exe");
        System.setProperty("webdriver.opera.driver", "C:\\Users\\Никита\\IdeaProjects\\testselenium\\drivers\\operadriver.exe");

        DesiredCapabilities IEDesiredCapabilities = DesiredCapabilities.internetExplorer();
        IEDesiredCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        IEDesiredCapabilities.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "http://www.google.com");
        IEDesiredCapabilities.internetExplorer().setCapability("ignoreProtectedModeSettings", true);
        IEDesiredCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        IEDesiredCapabilities.setJavascriptEnabled(true);
        IEDesiredCapabilities.setCapability("requireWindowFocus", true);
        IEDesiredCapabilities.setCapability("enablePersistentHover", false);

        driver = new FirefoxDriver();
        //driver = new ChromeDriver();
        //driver = new OperaDriver();
        //driver = new InternetExplorerDriver();

        // Задаем неявное ожидание 2 секунды для поиска станций метро
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.get("https://afisha.mail.ru");

        KinoPage kinoPage = new KinoPage(driver);

        kinoPage.inCinemaButtonClick();
        kinoPage.dateListClick();
        kinoPage.tomorrowChooseClick();
        kinoPage.metrostationSearchInput("Курская");
        kinoPage.metrostationKurskayaChoose();
        kinoPage.genreListClick();
        kinoPage.dramaChoose();
        kinoPage.comedyChoose();
        kinoPage.seances2DClick();
        kinoPage.chooseButtonClick();
    }
}
