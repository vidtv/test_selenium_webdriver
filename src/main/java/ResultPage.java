import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultPage {
    private static WebDriver driver;

    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    private By heading = By.xpath("//h1[@class='title__title']");
    private By dateChoose = By.xpath("//div[@class='dropdown__text js-dates__title']");
    private By metroStationChoose = By.xpath("//div[@class='input-group__item'][2]//span[@class='tag__text']");
    private By genreFirst = By.xpath("//div[@class='input__tags-inner js-filter_selected_list']/div[1]//span[@class='tag__text']");
    private By genreSecond = By.xpath("//div[@class='input__tags-inner js-filter_selected_list']/div[2]//span[@class='tag__text']");
    private By dayTime = By.xpath("//div[@class='dropdown__text js-range__title']");
    private By seances2DOnly = By.xpath("//input[@name='is_2d']");

    public String getHeading() {
        return driver.findElement(heading).getText();
    }

    public String getDate() {
        return driver.findElement(dateChoose).getText();
    }

    public String getMetroStation() {
        return driver.findElement(metroStationChoose).getText();
    }

    public String getFirstGenre() {
        return driver.findElement(genreFirst).getText();
    }

    public String getSecondGenre() {
        return driver.findElement(genreSecond).getText();
    }

    public String getTime() {
        return driver.findElement(dayTime).getText();
    }

    public boolean is2DSeancesOnly() {
        return driver.findElement(seances2DOnly).isSelected();
    }

}
