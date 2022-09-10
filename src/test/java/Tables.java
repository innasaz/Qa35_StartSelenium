import org.asynchttpclient.ClientStats;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Tables {

    WebDriver wd;

    @Test
    public void wschoolTables(){
        wd= new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/html/html_tables.asp");
        // print count raws in table

        List<WebElement> listRows = wd.findElements(By.cssSelector("#customers tr"));
        System.out.println("Count of rows  " + listRows.size());
        Assert.assertEquals(listRows.size(), 7);

        //print last raws
        WebElement lastRow = wd.findElement(By.cssSelector("#customers tr:last-child"));
        System.out.println(lastRow.getText());

        //print count of columns
        List<WebElement> listColumns = wd.findElements(By.cssSelector("#customers th"));







        WebElement canada = wd.findElement(By.cssSelector("#customers tr:nth-child(6) td:last-child"));
        System.out.println(canada.getText());

        //homework
    }

    @Test
    public void homeWorkTable(){
        wd = new ChromeDriver();
        wd.navigate().to("file:///C:\\QA35\\index.html");
        List<WebElement> listRows = wd.findElements(By.cssSelector("tr"));
        System.out.println("Table rows size: " + listRows.size());

        WebElement lastRow = wd.findElement(By.cssSelector("tr:last-child"));
        System.out.println(lastRow.getText());

        List<WebElement> listColumns = wd.findElements(By.cssSelector("tr:first-child td"));
        System.out.println("Table column size: " + listColumns.size());

        WebElement israel = wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(2)"));
        System.out.println(israel.getText());
    }
}
