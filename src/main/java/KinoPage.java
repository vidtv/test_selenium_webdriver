import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
    private By genreList = By.xpath("//div[@class='tab__content js-tab__content tab__content_active']//input[@placeholder='Все жанры']");
    private By drama = By.xpath("//span[@class='checkbox__text' and text()='драма']");
    private By comedy = By.xpath("//span[@class='checkbox__text' and text()='комедия']");
    private By seances2D = By.xpath("//input[@name='is_2d']/parent::label");
    private By chooseButton = By.xpath("//button[@name='clb6796813']");

    public KinoPage inCinemaButtonClick() {
        driver.findElement(inCinemaButton).click();
        return this;
    }

    public KinoPage dateListClick() {
        driver.findElement(dateList).click();
        return this;
    }

    public KinoPage tomorrowChooseClick() {
        driver.findElement(tomorrowChoose).click();
        return this;
    }

    public KinoPage metrostationSearchInput(String metroStation) {
        driver.findElement(metrostationSearch).sendKeys(metroStation);
        return this;
    }

    public KinoPage metrostationChoose() {
        driver.findElement(metrostationKurskaya).click();
        return this;
    }

    public KinoPage genreListClick() {
        driver.findElement(genreList).click();
        return this;
    }

    public KinoPage dramaChoose() {
        driver.findElement(drama).click();
        return this;
    }

    public KinoPage comedyChoose() {
        driver.findElement(comedy).click();
        return this;
    }

    public KinoPage seances2DClick() {
        driver.findElement(seances2D).click();
        return this;
    }

    public ResultPage chooseButtonClick() {
        driver.findElement(chooseButton).click();
        return new ResultPage(driver);
    }

    public ResultPage getSeancesList() {
        this.inCinemaButtonClick();
        this.dateListClick();
        this.tomorrowChooseClick();
        this.metrostationSearchInput("Курская");
        this.metrostationChoose();
        this.genreListClick();
        this.dramaChoose();
        this.comedyChoose();
        this.seances2DClick();
        this.chooseButtonClick();
        return new ResultPage(driver);
    }
}
