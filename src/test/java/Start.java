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
        //начало значения
        wd.findElement(By.cssSelector("[href='/home']"));
        //разные набор значений
        wd.findElement(By.cssSelector("div#rott.container"));

        wd.findElement(By.cssSelector("[href='/home']"));
        wd.findElement(By.cssSelector("[href ^='/ho']")); /// start with /ho
        wd.findElement(By.cssSelector("[href *='om']")); // containce - om
        wd.findElement(By.cssSelector("[href $='me']")); // end of me

        wd.findElement(By.cssSelector("div#root.container"));
        wd.findElement(By.cssSelector("a[href='/home']"));


        wd.quit();

    }
    WebElement el1 = wd.findElement(By.tagName("a"));
    WebElement el2 = wd.findElement(By.id("skip-to-content"));
    WebElement el3 = wd.findElement(By.className("visually-hidden"));
    WebElement el5 = wd.findElement(By.linkText ("Log in"));

    WebElement elc1 = wd.findElement(By.cssSelector("#skip-to-content"));
    WebElement elc2 = wd.findElement(By.cssSelector(".visually-hidden"));
    WebElement elc3= wd.findElement(By.cssSelector("[data-testid='smallnav']"));

    //for login
    WebElement li1 = wd.findElement(By.cssSelector("[href='/login']"));
    WebElement li2 = wd.findElement(By.cssSelector("#user"));
    WebElement li3 = wd.findElement(By.cssSelector("#login"));
    WebElement li4 = wd.findElement(By.cssSelector("#password"));
    WebElement li5 = wd.findElement(By.cssSelector("#login-submit"));

    WebElement li6 = wd.findElement(By.cssSelector("[data-test-id='header-member-menu-button']"));
    WebElement li7 = wd.findElement(By.cssSelector(".m2N684FcksCyfT"));

    //log out
    WebElement li8 = wd.findElement(By.cssSelector("[data-test-id='header-member-menu-button']"));
    WebElement li9 = wd.findElement(By.cssSelector("[data-test-id='header-member-menu-logout']"));
    WebElement li10 = wd.findElement(By.cssSelector("#logout-submit"));

    List<WebElement> list4 = wd.findElements(By.tagName("td"));
    WebElement element1 = list4.get(9); ///Poland
    String text = element1.getText();


}

