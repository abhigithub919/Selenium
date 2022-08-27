import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AutoSuggestion {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromeNdriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-autocomplete-feature-in.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("tags")).sendKeys("J");
        List<WebElement> x = driver.findElements(By.xpath("//div[@class='ui-menu-item-wrapper']"));
        for (int i = 0; i< x.size();i++){
            String name = x.get(i).getText(); //storing value of webelement
            System.out.println(name);
            if (name.equals("Java")){
                x.get(i).click(); //clicking webelement
            }
        }
        driver.close();
    }
}
