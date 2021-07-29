package pl.coursera.seleniumTraining;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyFirstTest {

    private WebDriver driver;
    private WebDriverWait wait;


    @BeforeEach
    public  void start(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        }


    @Test
    public void myFirstTest(){
        driver.get("https://google.com");
        //driver.findElement(By.name(("q"))).sendKeys("webdriver");
        //driver.findElement(By.name("btnK")).click();

    }

    @AfterEach
    public  void stop() {
        driver.quit();
        driver=null;
    }
}
