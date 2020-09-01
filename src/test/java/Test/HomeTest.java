package Test;

import Base.BasePage;
import com.sun.java.browser.plugin2.DOM;
import org.junit.Test;
import org.openqa.selenium.*;

import java.util.List;
import java.util.Random;

import static Costants.CostantsPage.*;

public class HomeTest extends BasePage
{

    WebDriver driver;
   public HomeTest()
   {
   driver=getDriver();

   }

    public void logIn()
    {

        elementSendKeys(By.cssSelector(USERNAME), "ID-HERE");
        elementSendKeys(By.cssSelector(PASSWORD), "PASSWORD-HERE");
        elementClick(By.cssSelector(BUTTON));

    }

    public void searcfood() throws InterruptedException
    {

        elementClick(By.cssSelector(SEARCHLISTCLICK));
        elementSendKeys(By.cssSelector(SEARCHLIST),"üsküdar (Valide");
        elementClick(By.cssSelector(SEARCHLISTCLICKLI));
        elementSendKeys(By.cssSelector(SEARCHAREA),"pizza");
        elementClick(By.cssSelector(PIZZATIK));

    }

    public void choicepizza() throws InterruptedException
    {
        /*elementClick(By.cssSelector(CHECHKED));*/
        elementClick(By.cssSelector(DOMINOSTIK));
        elementClick(By.linkText(BASLIK));
        elementClick(By.cssSelector(BUYUKBOY));

        /*List <WebElement> pizzalar= driver.findElements(By.cssSelector(RANDOMPIZZA));
        pizzalar.get(new Random().nextInt(pizzalar.size())).click();*/
        elementClick(By.cssSelector(HARDALLI));


    }

    public void addbasket()
    {
        elementClick(By.cssSelector(HAMURSEC));
        elementClick(By.cssSelector(SARIMSAK));
        elementClick(By.cssSelector(ADDPİZZA));


    }

    public void exitAccount() {
        elementClick(By.cssSelector(OPTIONSLIST));
        elementClick(By.cssSelector(DOEXIT));
        System.out.println("TEST BAŞARIYLA TAMAMLANDI");

    }


}
