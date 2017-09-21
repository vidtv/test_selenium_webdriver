import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Никита on 22.09.2017.
 */
public class KinoPage {
    private static WebDriver driver;

    public KinoPage(WebDriver driver) {
        this.driver = driver;
    }

    private By inCinemaButton = By.xpath("html/body/div[3]/div[4]/div[3]/div/div[1]/div/div/div[2]/div[3]/div/span");
    private By dateList = By.xpath("//div[@class='dropdown dropdown_scrollable js-dates']");
    private By tomorrowChoose = By.xpath("//input[@data-title='Завтра']/parent::label");
    private By metrostationSearch = By.xpath("//input[@placeholder='Станции метро']");
    private By metrostationKurskaya = By.xpath("//div[@data-id='68']");
    private By genreList = By.xpath("//div[@class='dropdown dropdown_scrollable dropdown_scrollable js-module']");
    private By drama = By.xpath("//div[@class='checkbox checkbox_block checkbox_colored checkbox_small suggest__item js-multiselect__control'][2]");
    private By comedy = By.xpath("//div[@class='checkbox checkbox_block checkbox_colored checkbox_small suggest__item js-multiselect__control'][3]");
    private By seances2D = By.xpath("/html/body/div[3]/div[4]/div[3]/div/div[5]/div/form/div[2]/span[1]/div/div[1]");
    private By chooseButton = By.xpath("/html/body/div[3]/div[4]/div[3]/div/div[5]/div/form/div[1]/div[5]");

    public void inCinemaButtonClick() {
        driver.findElement(inCinemaButton).click();
    }

    public void dateListClick() {
        driver.findElement(dateList).click();
    }

    public void tomorrowChooseClick() {
        driver.findElement(tomorrowChoose).click();
    }

    public void metrostationSearchInput(String metroStation) {
        driver.findElement(metrostationSearch).sendKeys(metroStation);
    }

    public void metrostationKurskayaChoose() {
        driver.findElement(metrostationKurskaya).click();
    }

    public void genreListClick() {
        driver.findElement(genreList).click();
    }

    public void dramaChoose() {
        driver.findElement(drama).click();
    }

    public void comedyChoose() {
        driver.findElement(comedy).click();
    }

    public void seances2DClick() {
        driver.findElement(seances2D).click();
    }

    public void chooseButtonClick() {
        driver.findElement(chooseButton).click();
    }
}
