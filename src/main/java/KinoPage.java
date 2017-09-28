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

    private By inCinemaButton = By.xpath("//span[@name='clb6796617']");
    private By dateList = By.xpath("//div[@class='dropdown__text js-dates__title' and text()='Сегодня']");
    private By tomorrowChoose = By.xpath("//input[@data-title='Завтра']/parent::label");
    private By metrostationSearch = By.xpath("//input[@placeholder='Станции метро']");
    private By metrostationKurskaya = By.xpath("//div[@data-id='68']");
    private By genreList = By.xpath("//div[@class='dropdown dropdown_scrollable dropdown_scrollable js-module' and @data-module='Dropdown.Multiselect']");
    private By drama = By.xpath("//div[@class='checkbox checkbox_block checkbox_colored checkbox_small suggest__item js-multiselect__control'][2]");
    private By comedy = By.xpath("//div[@class='checkbox checkbox_block checkbox_colored checkbox_small suggest__item js-multiselect__control'][3]");
    private By seances2D = By.xpath("//input[@name='is_2d']/parent::label");
    private By chooseButton = By.xpath("//button[@name='clb6796813']");

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
