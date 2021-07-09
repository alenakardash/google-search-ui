import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageObject {
    public static String searchQuery = "Test Automation";

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    private WebElement searchField;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitButton;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void enterSearchQuery() {
        searchField.sendKeys(searchQuery);
    }

    public void pressEnterKey() {
        searchField.sendKeys(Keys.ENTER);
    }
}