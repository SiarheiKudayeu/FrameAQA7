package pages;

import org.openqa.selenium.WebDriver;

public class NewPage extends BasePage{
    public NewPage(WebDriver driver) {
        super(driver);
    }

    public void testPage(){
        System.out.println("Test new page!!!");
    }

}
