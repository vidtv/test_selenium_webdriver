import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KinoPage {
    private static WebDriver driver;

    public KinoPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@name='clb6796617']")
    private WebElement inCinemaButton;

    @FindBy(xpath = "//div[@class='dropdown__text js-dates__title' and text()='Сегодня']")
    private WebElement dateList;

    @FindBy(xpath = "//input[@data-title='Завтра']/parent::label")
    private WebElement tomorrowChoose;

    @FindBy(xpath = "//input[@placeholder='Станции метро']")
    private WebElement metrostationSearch;

    @FindBy(xpath = "//div[@data-id='68']")
    private WebElement metrostationKurskaya;

    @FindBy(xpath = "/html/body/div[3]/div[4]/div[3]/div/div[5]/div/form/div[1]/div[3]")
    //@FindBy(xpath = "//div[@class=\'input-group input-group_fixed\']/div[2]")
    private WebElement genreList;

    @FindBy(xpath = "//span[@class='checkbox__text' and text()='драма']")
    private WebElement drama;

    @FindBy(xpath = "//span[@class='checkbox__text' and text()='комедия']")
    private WebElement comedy;

    @FindBy(xpath = "//input[@name='is_2d']/parent::label")
    private WebElement seances2D;

    @FindBy(xpath = "//button[@name='clb6796813']")
    private WebElement chooseButton;

    public KinoPage inCinemaButtonClick() {
        inCinemaButton.click();
        return this;
    }

    public KinoPage dateListClick() {
        dateList.click();
        return this;
    }

    public KinoPage tomorrowChooseClick() {
        tomorrowChoose.click();
        return this;
    }

    public KinoPage metrostationSearchInput(String metroStation) {
        metrostationSearch.sendKeys(metroStation);
        return this;
    }

    public KinoPage metrostationChoose() {
        metrostationKurskaya.click();
        return this;
    }

    public KinoPage genreListClick() {
        genreList.click();
        return this;
    }

    public KinoPage dramaChoose() {
        drama.click();
        return this;
    }

    public KinoPage comedyChoose() {
        comedy.click();
        return this;
    }

    public KinoPage seances2DClick() {
        seances2D.click();
        return this;
    }

    public ResultPage chooseButtonClick() {
        chooseButton.click();
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
