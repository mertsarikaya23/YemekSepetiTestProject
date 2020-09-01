import org.junit.Test;
import Test.HomeTest;

public class HomePageTest extends HomeTest {
    @Test
    public void testRun() throws InterruptedException {
        logIn();
        searcfood();
        choicepizza();
        addbasket();
        exitAccount();
    }
}
