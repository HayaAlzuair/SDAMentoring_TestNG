
package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C12_DataProviderTask extends TestBase {

/*
    Go to https://claruswaysda.github.io/Registration.html
    Fill the form
    Do it with all 3 ways
    (Same class Data Provider, Data Provider with Faker, Data Provider with Excel)
    */

    @Test(dataProvider = "form")
    void dataProviderTaskTest01(String ssn, String firstname, String lastname, String username, String email, String password) {
//        Go to https://claruswaysda.github.io/Registration.html
        driver.get("https://claruswaysda.github.io/Registration.html");
//        Fill the form
        driver.findElement(By.id("ssn")).sendKeys(ssn);
        driver.findElement(By.id("firstName")).sendKeys(firstname);
        driver.findElement(By.id("lastName")).sendKeys(lastname);
        driver.findElement(By.xpath("//label[@for='female']")).click();
        Select select = new Select(driver.findElement(By.id("job")));
        select.selectByVisibleText("Tester");
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Test(dataProvider = "faker", dataProviderClass = utilities.DataProviderUtilities.class)
    void dataProviderTaskTest02(String ssn, String firstname, String lastname , String username, String email, String password) {
//        Go to https://claruswaysda.github.io/Registration.html
        driver.get("https://claruswaysda.github.io/Registration.html");
//        Fill the form
        driver.findElement(By.id("ssn")).sendKeys(ssn);
        driver.findElement(By.id("firstName")).sendKeys(firstname);
        driver.findElement(By.id("lastName")).sendKeys(lastname);
        driver.findElement(By.xpath("//label[@for='female']")).click();
        Select select = new Select(driver.findElement(By.id("job")));
        select.selectByVisibleText("Tester");
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Test(dataProvider = "excel", dataProviderClass = utilities.DataProviderUtilities.class)
    void dataProviderTaskTest03(String ssn, String firstname, String lastname , String username, String email, String password) {
//        Go to https://claruswaysda.github.io/Registration.html
        driver.get("https://claruswaysda.github.io/Registration.html");
//        Fill the form
        driver.findElement(By.id("ssn")).sendKeys(ssn);
        driver.findElement(By.id("firstName")).sendKeys(firstname);
        driver.findElement(By.id("lastName")).sendKeys(lastname);
        driver.findElement(By.xpath("//label[@for='female']")).click();
        Select select = new Select(driver.findElement(By.id("job")));
        select.selectByVisibleText("Tester");
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }



    @DataProvider(name = "form")
    public Object[][] getFormData() {
        return new Object[][]{
                {"123-66-4567", "John", "Doe" , "johndoe" , "j@a", "P133"},
                {"789-55-1234", "Jane", "Smith" , "janesmith" , "jj@aa", "P123"},
                {"654-66-9876", "Tom", "Stark", "tomstark" , "tt@aaa", "P113"}
        };
    }}

