import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Homework_0609 {
    WebDriver wd;
    @Test
    public void homework(){
        wd = new ChromeDriver();
        wd.navigate().to("file:///Users/kalnitskialexander/Downloads/index.html");

        // find items
        WebElement item1 = wd.findElement(By.cssSelector("a[href='#item1']"));
        WebElement item2 = wd.findElement(By.cssSelector("a[href='#item2']"));
        WebElement item3 = wd.findElement(By.cssSelector("a[href='#item3']"));
        WebElement item4 = wd.findElement(By.cssSelector("a[href='#item4']"));
        //find element of form
        WebElement name = wd.findElement(By.cssSelector("#form1"));

        WebElement surename = wd.findElement(By.cssSelector("#form1"));
        WebElement send = wd.findElement(By.cssSelector("#form1"));


    }
}

