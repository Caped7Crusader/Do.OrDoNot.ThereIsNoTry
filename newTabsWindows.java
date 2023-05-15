import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class newTabsWindows {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        String mainWindow = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.rottentomatoes.com/");
        Set<String> windwoHandles = driver.getWindowHandles();
        for(String single : windwoHandles){
            if(single.equals(mainWindow)){
                driver.switchTo().window(single);
            }
        }
    }
}
