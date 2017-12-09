import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainClassTest {

    private WebDriver driver;
    private KinoPage kinoPage;

    @BeforeClass
    public void beforeClassMethod() {

    }

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Никита\\IdeaProjects\\testselenium\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://kino.mail.ru");
        kinoPage = new KinoPage(driver);
    }

    /*@Test
    public void method1() {

    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @AfterClass
    public void afterClassMethod() {

    } */
}
