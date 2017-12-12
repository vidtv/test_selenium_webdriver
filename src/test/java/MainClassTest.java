import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainClassTest {

    private WebDriver driver;
    private KinoPage kinoPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Никита\\IdeaProjects\\testselenium\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://kino.mail.ru");
        kinoPage = new KinoPage(driver);
    }

    @Test
    public void headingCheck() {
        ResultPage resultPage = kinoPage.getSeancesList();
        String heading = resultPage.getHeading();
        Assert.assertEquals("Киноафиша Москвы", heading);
    }

    @Test
    public void dateCheck() {
        ResultPage resultPage = kinoPage.getSeancesList();
        String date = resultPage.getDate();
        Assert.assertEquals("Завтра", date);
    }

    @Test
    public void metroStationCheck() {
        ResultPage resultPage = kinoPage.getSeancesList();
        String metroStation = resultPage.getMetroStation();
        Assert.assertEquals("Курская", metroStation);
    }

    @Test
    public void genresCheck() {
        ResultPage resultPage = kinoPage.getSeancesList();
        String firstGenre = resultPage.getFirstGenre();
        String secondGenre = resultPage.getSecondGenre();
        Assert.assertEquals("драма", firstGenre);
        Assert.assertEquals("комедия", secondGenre);
    }

    @Test
    public void dayTimeCheck() {
        ResultPage resultPage = kinoPage.getSeancesList();
        String dayTime = resultPage.getTime();
        Assert.assertEquals("Весь день", dayTime);
    }

    @Test
    public void is2DSeancesOnlyCheck() {
        ResultPage resultPage = kinoPage.getSeancesList();
        boolean is2DSeancesOnly = resultPage.is2DSeancesOnly();
        Assert.assertEquals(true, is2DSeancesOnly);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
