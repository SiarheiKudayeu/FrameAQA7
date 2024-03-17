package pages;

import constants.Url;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ClickerPage extends BasePage{
    public ClickerPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id='counter']//span")
    private WebElement resultField;
    @FindBy(id = "plus-btn")
    private WebElement plusButton;
    @FindBy(id = "reset")
    private WebElement resetButton;
    @FindBy(xpath = "//iframe[contains(@src, 'counter/')]")
    private WebElement iframe;
    @FindBy(xpath = "//button[@aria-label=\"Consent\"]")
    private WebElement acceptCookies;

    public ClickerPage openMainPage(){
        driver.get(Url.CLICKER_HOME_PAGE);
        return this;
    }

    public ClickerPage acceptCookies(){
        try {
            workWithElement.click(acceptCookies);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return this;
    }

    public ClickerPage switchToFrame(){
        waiters.switchToFrame(iframe);
        return this;
    }

    public ClickerPage clickOnPlusCountOfTimes(int count){
        for(int i = 0; i < count; i++){
            workWithElement.click(plusButton);
        }
        return this;
    }
    public ClickerPage scrollPageDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 200)");
        return this;
    }
    public int returnResult(){
        return Integer.parseInt(workWithElement.getTextFromElement(resultField));
    }

    public ClickerPage resetCounter(){
        workWithElement.click(resetButton);
        return this;
    }
}
