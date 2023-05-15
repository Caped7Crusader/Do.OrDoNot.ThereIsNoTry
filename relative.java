import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class relative {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium_k\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement googleLogo = driver.findElement(By.xpath("//img[@alt='Google']"));
        WebElement googleSearchBar = driver.findElement(RelativeLocator.with(By.tagName("textarea")).below(googleLogo));
        googleSearchBar.sendKeys("ipl 2023 points table", Keys.ENTER);
    }
}
