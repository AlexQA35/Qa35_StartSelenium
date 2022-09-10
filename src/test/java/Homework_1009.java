import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Homework_1009 {
    WebDriver wd;

    @Test
    public void Tables() {
        wd = new ChromeDriver();
        wd.navigate().to("file:///Users/kalnitskialexander/Downloads/index.html");

        List<WebElement> listRows = By.cssSelector("#country-table tr").findElements(wd);
        System.out.println("Count of rows    " + listRows.size());

        WebElement lastRow = wd.findElement(By.cssSelector("#country-table tr:last-child"));
        System.out.println(lastRow.getText());

        List<WebElement> listColumns = By.cssSelector("#country-table tr:first-child td").findElements(wd);
        System.out.println("Count of columns    " + listColumns.size());

        WebElement Israel = wd.findElement(By.cssSelector("#country-table tr:nth-child(2) td:nth-child(2)"));
        System.out.println(Israel.getText());

    }
}