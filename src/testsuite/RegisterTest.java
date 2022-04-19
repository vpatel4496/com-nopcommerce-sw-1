package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class RegisterTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        // Click on register link
        WebElement registerlink = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        registerlink.click();

        // Verift the Text
        String expectedText = "Register";
        String actualText = driver.findElement(By.xpath("//a[contains(text(),'Register')]")).getText();
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        // Click on register link
        WebElement registerlink = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        registerlink.click();

        // Click the gender radio button
        WebElement genderradiobutton = driver.findElement(By.xpath("//label[contains(text(),'Gender:')]"));
        genderradiobutton.click();

        // Select the Gender radio button
        WebElement selectgender = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
        selectgender.click();

        // Enter the first name
        WebElement firstname = driver.findElement(By.id("FirstName"));
        firstname.sendKeys("xyz");

        // Enter the Last name
        WebElement lastname = driver.findElement(By.id("LastName"));
        lastname.sendKeys("uvw");

        // Select Day
        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        day.sendKeys("25");

        // Select Month
        WebElement month = driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]"));
        month.sendKeys("May");

        // Select year
        WebElement year = driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]"));
        year.sendKeys("2007");

        // Enter Email Address
        WebElement email = driver.findElement(By.name("Email"));
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        email.sendKeys("username"+ randomInt +"@gmail.com");

        // Enter Password
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("Churchstreet");

        // Enter Confirm Password
        WebElement confirmpassword = driver.findElement(By.id("ConfirmPassword"));
        confirmpassword.sendKeys("Churchstreet");

        // Click on register button
        WebElement registerbutton = driver.findElement(By.id("register-button"));
        registerbutton.click();

        // Verify Text
        String expectedText = "Your registration completed";
        String actualText = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]")).getText();
    }
    public void tearDown(){
        closeBrowser();
    }
}
