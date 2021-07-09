import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage extends PageObject {

    @FindBy(xpath = "//h3[contains(text(), \"Test Automation\")]")
    private WebElement textDisplayed;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public void verifyTextDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(), \"Test Automation\")]")));
        textDisplayed.isDisplayed();
    }
}
