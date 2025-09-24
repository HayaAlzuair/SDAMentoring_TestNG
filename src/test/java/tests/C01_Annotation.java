package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class C01_Annotation {

    WebDriver driver;

    @BeforeMethod
    void setUp() {
        driver = new ChromeDriver();
    }

    @AfterMethod
    void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    void test03() {
        System.out.println("Test 03");
    }

    @Test
    void test01() {
        System.out.println("Test 01");
    }

    @Test
    void test02() {
        System.out.println("Test 02");
    }
}

