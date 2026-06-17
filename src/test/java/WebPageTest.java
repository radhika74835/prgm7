import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class WebPageTest {

    WebDriver driver;

    @BeforeTest
    public void openBrowser(){

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://radhika74835.github.io/prgm7/");

    }

    @Test
    public void titleValidationTest(){

        String actualTitle = driver.getTitle();

        String expectedTitle = "My Simple Website";

        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @AfterTest
    public void closeBrowser(){

        driver.quit();

    }
}
