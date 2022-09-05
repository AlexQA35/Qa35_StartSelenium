import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Start {
    WebDriver wd;
    @Test
    public void goToPhoneBook(){
     wd=new ChromeDriver();
        //wd.get("https://contacts-app.tobbymarshall815.vercel.app/");
       wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");
        //wd.navigate().back();
        //wd.navigate().forward();
       // wd.close();

       WebElement element = wd.findElement(By.tagName("h1"));
        element.click();
        List <WebElement> list =wd.findElements(By.tagName("h1"));
        WebElement element1 = list.get(1);
        element.click();

        wd.findElement(By.id("root"));
        wd.findElement(By.className("container"));
        wd.findElement(By.linkText("ABOUT"));
        wd.findElement(By.partialLinkText("AB"));
        wd.findElement(By.cssSelector("h1"));
        wd.findElement(By.cssSelector("a"));
        //id
        wd.findElement(By.cssSelector("#root"));
        //class
        wd.findElement(By.cssSelector(".container"));
        //attribute
        wd.findElement(By.cssSelector("[href='/home']"));



        wd.quit();

    }
}
