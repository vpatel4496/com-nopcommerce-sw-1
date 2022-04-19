package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        // Click on computer tab
        WebElement computertab = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
        computertab.click();

        // Verift the Text
        String expectedText = "Computers";
        String actualText = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]")).getText();
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        // Click on electronics tab
        WebElement electronicstab = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        electronicstab.click();

        // Verify the Text
        String expectedText = "Electronics";
        String actualText = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]")).getText();
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        // Click on apparel tab
        WebElement appareltab = driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/h2[1]/a[1]"));
        appareltab.click();

        // Verify the Text
        String expectedText = "Apparel";
        String actualText = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]")).getText();
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        // Click on DigitalDownloads tab
        WebElement DigitalDownloadstab = driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/h2[1]/a[1]"));
        DigitalDownloadstab.click();

        // Verify the Text
        String expectedText = "Digital downloads";
        String actualText = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]")).getText();
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        // Click on books tab
        WebElement bookstab = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]"));
        bookstab.click();

        // Verify the Text
        String expectedText = "Books";
        String actualText = driver.findElement(By.xpath("//h1[contains(text(),'Books')]")).getText();
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        // Click on jewelry tab
        WebElement jewelrytab = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));
        jewelrytab.click();

        // Verify the Text
        String expectedText = "Jewelry";
        String actualText = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]")).getText();
    }

    @Test
    public void userShouldNavigateToGiftCardPageSuccessfully() {
        // Click on Gift Card tab
        WebElement giftcardstab = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]"));
        giftcardstab.click();

        // Verify the Text
        String expectedText = "Gift Cards";
        String actualText = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]")).getText();
    }
@After
    public void tearDown(){
        closeBrowser();
}
}