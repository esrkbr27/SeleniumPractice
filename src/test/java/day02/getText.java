package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class getText {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement armk=driver.findElement(By.id("twotabsearchtextbox"));

        String expectedtag="input";
        String actualtag= armk.getTagName();
        if(actualtag.equals(expectedtag)){
            System.out.println("Test passed");
        }
        else{
            System.out.println("Test failed");
        }

        String expectedattribute="field-keysword";
        String actualattribute=armk.getAttribute("name");

        if(actualattribute.equals(expectedattribute)){
            System.out.println("Test passed");
        }
        else{
            System.out.println("Test failed");
        }
        driver.close();
    }
}
