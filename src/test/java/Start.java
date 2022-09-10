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
        //open browser
        wd=new ChromeDriver();
        //go to phonebook
        wd.get("https://contacts-app.tobbymarshall815.vercel.app/");
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");

        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();
        //close browser
       wd.close();
      //  wd.quit();
    }
    @Test
    public void loinTest() {

        wd = new ChromeDriver();
        //wd=new FirefoxDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");
        // open loginPage :find loginTab + click
        //fill email  : find ElementEmail + type "email"
        //fill password :find ElementPassword + type "password"
        // login submit : find login button _ click
        // Assert (ex res=ac res)
        //[PNONEBOOK ; HOME Camponent ]
        WebElement element = wd.findElement(By.tagName("h1"));
        element.click();

        List<WebElement> list = wd.findElements(By.tagName("h1"));
        WebElement element1 = list.get(1);
        element1.click();

        wd.findElement(By.id("root"));

        wd.findElement(By.className("container"));

        wd.findElement(By.linkText("ABOUT"));
        wd.findElement(By.partialLinkText("AB"));

        wd.findElement(By.name("name"));
        //By.cssSelector
        //By.xPath
        //By.tagname
        wd.findElement(By.cssSelector("h1"));
        wd.findElement(By.cssSelector("a"));
        //by id
        wd.findElement(By.cssSelector("#root"));
        //by class
        wd.findElement(By.cssSelector("container"));
        //by attribute
        wd.findElement(By.cssSelector("[href='/home]"));
        wd.findElement(By.cssSelector("[href"));
        wd.findElement(By.cssSelector("[href='/home']"));
        wd.findElement(By.cssSelector("[href ^='/ho']"));

        wd.findElement(By.cssSelector("div#root.container"));
        wd.findElement(By.cssSelector("a[href='/home']"));

        wd.quit();

    }

        @Test
        public void homework(){
            wd = new ChromeDriver();
            wd.navigate().to("file:///C:/QA35/index.html");

//        // find items
//        WebElement item1 = wd.findElement(By.cssSelector("a[href='#item1']"));
//        WebElement item2;
//        WebElement item3;
//        WebElement item4;
//        //find element of form
//        WebElement name;
//        WebElement surename;
//        WebElement send;
//
//        // ****** find from table
//        WebElement poland;




            // find items

            WebElement item1 = wd.findElement(By.cssSelector("a[href='#item1']"));
            WebElement item1_1 = wd.findElement(By.linkText("Item 1"));
            WebElement item1_2 = wd.findElement(By.cssSelector("[href $='m1']"));
            WebElement element = wd.findElement(By.tagName("a")); //Item1
            element.click();

            //  WebElement item1 = List<WebElement> list =wd.findElements(By.tagName("a"));
            List<WebElement> list =wd.findElements(By.tagName("a"));
            WebElement el =list.get(0);


            WebElement item =(wd.findElements(By.tagName("a"))).get(0);
            //WebElement element1 = list.get(0); ///item1
            // item1
            WebElement item1_3 = wd.findElement(By.className("nav-item"));


            // Same for everyone

            WebElement item2 = wd.findElement(By.cssSelector("a[href='#item2']"));
            //  WebElement item2 = wd.findElement(By.name("Item 2")); // error
            WebElement item2_5 = wd.findElement(By.linkText("Item 2")); // error
            WebElement item2_1 = wd.findElement(By.cssSelector("[href $='m2']"));
            //WebElement item2 = List<WebElement> list =wd.findElements(By.tagName("a"));
            WebElement element2 = wd.findElements(By.tagName("a")).get(1); ///item2
            element2.click();

            WebElement item3 = wd.findElement(By.cssSelector("a[href='#item3']"));
            //WebElement item3 = wd.findElement(By.name("Item 3")); error
            WebElement item3_1 = wd.findElement(By.cssSelector("[href $='m3']"));
            List<WebElement> list1 =wd.findElements(By.tagName("a"));
            WebElement element3 = list1.get(2); ///item3
            element3.click();

            WebElement item4 = wd.findElement(By.cssSelector("a[href='#item4']"));
            //WebElement item4 = wd.findElement(By.name("Item 4")); error
            WebElement item4_1 = wd.findElement(By.cssSelector("[href $='m4']"));
            List<WebElement> list2 =wd.findElements(By.tagName("a"));
            WebElement element4 = list2.get(3); ///item4
            element4.click();


            //find element of form
            WebElement name = wd.findElement(By.name("name"));
            WebElement name1 = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
            WebElement surename = wd.findElement(By.name("surename"));
            WebElement surename1 = wd.findElement(By.cssSelector("[placeholder='Type your surename']"));
            WebElement send = wd.findElement(By.className("btn"));
            WebElement send2 = wd.findElement(By.cssSelector(".btn"));
            // WebElement send = wd.findElement(By.name("Send")); error

            // ****** find from table
            List<WebElement> list4 = wd.findElements(By.tagName("td"));
            WebElement element1 = list4.get(9); ///Poland
            String text = element1.getText();
            System.out.println(text);

            wd.quit();
        }



}









