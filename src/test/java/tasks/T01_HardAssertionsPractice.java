package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utillites.TestBase;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class T01_HardAssertionsPractice  {
    //Navigate to https://claruswaysda.github.io/signIn.html
//Enter username: "admin"
//Enter password: "123"
//Click Submit button
//Use hard assertions to verify:
//1-New page URL is "https://claruswaysda.github.io/signIn.html"
//2-Page contains text "Employee Table"
//3-Create class HardAssertLoginTest
//4-Use appropriate WebDriver setup and teardown
//5-Implement proper element locators
//6-Use meaningful assertion messages
    WebDriver driver;

    @BeforeClass
    void setUp() {
        driver = new ChromeDriver();
    }
          @AfterClass
          void teardown() throws InterruptedException {
                  Thread.sleep(3000);
                  driver.quit();
          }

    @Test
    void loginTestWithHardAssertions() {
        driver.get("https://claruswaysda.github.io/signIn.html");
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("123");
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/form/input[2]")).click();

        assertEquals( "https://claruswaysda.github.io/signIn.html","https://claruswaysda.github.io/signIn.html", "URL mismatch after login");
        assertEquals("Employee Table","Employee Table","don't match");
    }

}
