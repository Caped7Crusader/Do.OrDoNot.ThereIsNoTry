import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class dateSelector {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mycontactform.com/samples.php");
        driver.findElement(By.name("q7")).click();
        System.out.println("clicked");
        List<WebElement> datePicker = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/descendant::td"));
        for(WebElement single : datePicker){
            String date = single.getText();
            if(date.equalsIgnoreCase("7")){
                single.click();
            }
        }
    }
}
