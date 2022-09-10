import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class XPathTest {
    WebDriver wd;

    @Test
    public void xPathTests(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");

        //open login form
        WebElement loginTab = wd.findElement(By.xpath("//a[@href='/login']"));
        loginTab.click();

        //fill email noa@gmail.com Nnaa12345$
        WebElement inputEmail = wd.findElement(By.xpath("//input[@placeholder='Email']"));
        WebElement inputPassword = wd.findElement(By.xpath("//input[@placeholder='Password']"));
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("noa@gmail.com");

        // submit login
        WebElement loginButton = wd.findElement(By.xpath("//*[text()=' Login']"));
        loginButton.click();


    }
}
