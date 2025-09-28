package utilities;
import com.github.javafaker.Faker;
import org.testng.annotations.DataProvider;

public class DataProviderUtilities {

    @DataProvider(name = "faker")
    public Object[][] getFormDataFaker() {
        Faker faker = new Faker();
        return new Object[][]{
                {faker.idNumber().ssnValid(), faker.name().firstName(), faker.name().lastName(), faker.name().username(), faker.internet().emailAddress(), faker.internet().password()},
                {faker.idNumber().ssnValid(), faker.name().firstName(), faker.name().lastName(), faker.name().username(), faker.internet().emailAddress(), faker.internet().password()},
                {faker.idNumber().ssnValid(), faker.name().firstName(), faker.name().lastName(), faker.name().username(), faker.internet().emailAddress(), faker.internet().password()},
                {faker.idNumber().ssnValid(), faker.name().firstName(), faker.name().lastName(), faker.name().username(), faker.internet().emailAddress(), faker.internet().password()},
        };
    }

    @DataProvider(name = "excel")
    public Object[][] getFormDataExcel() {
        ExcelUtilities eu = new ExcelUtilities("src/test/resources/Users.xlsx", "sheet1");
        return eu.getExcelDataAsArray();
    }

    @DataProvider
    public Object[][] addRecord(){
        return new Object[][]{
                {"Tom", "25", "UK"},
                {"Sara", "23", "USA"},
                {"John", "49", "Canada"},
                {"Marya", "35", "UK"}
        };
    }

    @DataProvider(name = "fakerRecords")
    public Object[][] addRecordFaker() {
        Faker faker = new Faker();
        return new Object[][]{
                {faker.name().name(), faker.number().numberBetween(18,65), faker.number().numberBetween(1, 6)},
                {faker.name().name(), faker.number().numberBetween(18,65), faker.number().numberBetween(1, 6)},
                {faker.name().name(), faker.number().numberBetween(18,65), faker.number().numberBetween(1,6)},
                {faker.name().name(), faker.number().numberBetween(18,65), faker.number().numberBetween(1,6)}
        };
    }
    //excel

    @DataProvider(name = "excelRecords")
    public Object[][] getRecord() {
        ExcelUtilities eu = new ExcelUtilities("RecordNames.xlsx", "Sheet1");
        return eu.getExcelDataAsArray();
    }


}
