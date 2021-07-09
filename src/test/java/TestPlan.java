import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        driver.manage().window().maximize();
    }

    @Test
    public static void userGetsRelevantSearchResult() {
        driver.get(Utils.BASE_URL);
        SearchPage searchPage = new SearchPage(driver);
        searchPage.enterSearchQuery();
        searchPage.pressEnterKey();
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        searchResultPage.verifyTextDisplayed();
    }

    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
