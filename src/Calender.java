import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Calender {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromeNdriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        driver.findElement(By.id("datepicker")).click();
        List<WebElement> x= driver.findElements(By.xpath("//td[@data-event='click']"));
        System.out.println(x.size());
        for (int i =0; i<x.size(); i++){
            String month = x.get(i).getText(); //String.valueOf(i); //toString
            System.out.println(month);
            if (month.equals("29")){
                //System.out.println(x.get(i));
                x.get(i).click();
            }
        }
    }
}