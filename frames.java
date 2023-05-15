import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement frameT = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(frameT);
        driver.findElement(By.id("tinymce")).sendKeys("hi");

    }
}
