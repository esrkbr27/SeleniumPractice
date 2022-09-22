package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class findElement {

    /*
    Main method oluşturun ve aşağıdaki görevi tamamlayın.
    a. http://a.testaddressbook.com adresine gidiniz.
    b. Sign in butonuna basin
    c. email textbox,password textbox, and signin button elementlerini locate ediniz..
    d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
    i. Username : testtechproed@gmail.com
    ii. Password : Test1234!
    e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
    f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
    3. Sayfada kac tane link oldugunu bulun.
     */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //      a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        //        b. Sign in butonuna basin
             driver.findElement(By.id("sign-in")).click();
        //        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
           WebElement emaitxtbox=driver.findElement(By.id("session_email"));
           WebElement password=driver.findElement(By.id("session_password"));
           WebElement signinbutton=driver.findElement(By.name("commit"));


        //        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //        i. Username : testtechproed@gmail.com
        //        ii. Password : Test1234!

        emaitxtbox.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        signinbutton.click();

        //        e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).

        //-----------------1.yol--------------
        String expectedid="testtechproed@gmail.com";
        WebElement actualid=driver.findElement(By.className("navbar-text"));

        if(actualid.equals(expectedid)) {
            System.out.println("Test PASSED");
        }
        else{
            System.out.println("Test FAILED");
        }

        //---------------2.yol----------------

        if(actualid.isDisplayed()) { //actual id sayfadakı gibi görünüyor mu
            System.out.println("Test PASSED");
        }
        else{
            System.out.println("Test FAILED");
        }


        //        f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

        WebElement address=driver.findElement(By.linkText("Addresses"));

        if(address.isDisplayed()){
            System.out.println("Test PASSED");
        }
        else{
            System.out.println("Test FAILED");
        }

        WebElement signout=driver.findElement(By.linkText("Sign out"));

        if(signout.isDisplayed()){
            System.out.println("Test PASSED");
        }
        else{
            System.out.println("Test FAILED");
        }

        //        3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> list=driver.findElements(By.tagName("a"));

        System.out.println(list.size());


        //4.Bu linklerin isimlerini yazalım

        for (WebElement each:list) {
            System.out.println(each.getText());
        }

        driver.close();

    }
}
