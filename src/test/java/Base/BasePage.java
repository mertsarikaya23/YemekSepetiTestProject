package Base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Costants.CostantsPage.*;

public class BasePage
{
    public WebDriver driver;
    public WebDriverWait wait;


    public WebDriver getDriver()
    {

        return driver;

    }
    @Before
    public void setUp()
    {

        System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver2.exe");
        driver=new ChromeDriver();
        driver.get(URL);
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        wait=new WebDriverWait(driver,20000);

    }

    public boolean isElementDisplayed(By Locater)
    {
        return driver.findElement(Locater).isDisplayed();
    }

    public WebElement elementFind(By Locater)
    {
       isElementDisplayed(Locater);

        return driver.findElement(Locater);
    }



    public void elementSendKeys(By Locater, String sendValue)
    {
        isElementDisplayed(Locater);
        wait.until(ExpectedConditions.elementToBeClickable(Locater));
        elementFind(Locater).sendKeys(sendValue);

    }

    public void elementClick(By Locater)
    {

        wait.until(ExpectedConditions.elementToBeClickable(Locater));
        isElementDisplayed(Locater);
        elementFind(Locater).click();

    }

    @After
    public void closeDriver()
    {

        driver.quit();
    }

}
