import org.testng.Assert;
import org.testng.annotations.Test;

public class ClickerPageTest extends BaseTest{
    @Test
    public void checkResetButton(){
        int countOfTimes= 7;
        clickerPage.openMainPage()
                .acceptCookies()
                .scrollPageDown()
                .switchToFrame()
                .clickOnPlusCountOfTimes(countOfTimes);
        Assert.assertEquals(clickerPage.returnResult(), countOfTimes);
        clickerPage.resetCounter();
        Assert.assertEquals(clickerPage.returnResult(), 0);
    }

}
