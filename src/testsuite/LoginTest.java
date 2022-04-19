package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        WebElement loginLink = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
        loginLink.click();

        // Verify the text
        String expectedText = "Welcome, Please Sign In!";
        String actualText = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]")).getText();

        // Enter valid email
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("wxyz@gmail.com");

        // Enter valid password
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("password");

        // Click on Login field
        WebElement loginfield = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginfield.click();

        // Verify the text
        String expectedMessage = "Log out";
         WebElement text  = driver.findElement(By.className("ico-logout"));
         String actualMessage = text.getText();


        // validate actual and expected message
        Assert.assertEquals("Log out", expectedMessage, actualMessage);

    }

    @Test
    public void verifyTheErrorMessage() {
        WebElement loginLink = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
        loginLink.click();

        // Enter invalid email
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("xyz1@gmail.com");

        // Enter invalid password
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("Abc1234@");

        // Click on Login field
        WebElement loginfield = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginfield.click();

        // Verify the message
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage = driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")).getText();

        // validate actual and expected message
        Assert.assertEquals("Login was unsuccessful. Please correct the errors and try again.",expectedMessage,actualMessage);

    }
    @After
    public void tearDown() {
        closeBrowser();
    }

}
