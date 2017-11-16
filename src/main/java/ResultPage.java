import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage {
    private static WebDriver driver;

    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@data-title='Завтра']/parent::label")
    private WebElement tomorrowChoose;

    @FindBy(xpath = "//div[@data-id='68']//span[@class='tag__text']")
    private WebElement kurskayaChoose;

    @FindBy(xpath = "//div[@class='input__tags-inner js-filter_selected_list']/div[1]//span[@class='tag__text']")
    private WebElement dramaChoose;

    @FindBy(xpath = "//div[@class='input__tags-inner js-filter_selected_list']/div[2]//span[@class='tag__text']")
    private WebElement comedyChoose;

    @FindBy(xpath = "//div[@class='dropdown__text js-range__title']")
    private WebElement allDayChoose;

    @FindBy(xpath = "//input[@name='is_2d']")
    private WebElement seances2dChoose;

}
