import driver.DriverSetUp;
import functions.WaitersClass;
import functions.WorkWithElementClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import pages.BasePage;
import pages.ClickerPage;
import pages.NewPage;
import utils.MyAllureListener;

@Listeners({MyAllureListener.class})
public class BaseTest {
    protected WebDriver driver = DriverSetUp.startDriver();
    protected WaitersClass waiters= new WaitersClass(driver);
    protected WorkWithElementClass workWithElement = new WorkWithElementClass(driver);
    protected BasePage basePage = new BasePage(driver);
    protected ClickerPage clickerPage = new ClickerPage(driver);
    protected NewPage newPage = new NewPage(driver);

    @BeforeSuite
    public void driverInit(){
        driver = DriverSetUp.startDriver();
    }
    @AfterSuite
    public void stopDriver(){
        driver.quit();
    }


}
