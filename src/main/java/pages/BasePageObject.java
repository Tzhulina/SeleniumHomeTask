package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePageObject extends PageObject {

    public BasePageObject() {
        super(ThucydidesWebDriverSupport.getDriver());
        PageFactory.initElements(ThucydidesWebDriverSupport.getDriver(), this);
    }

    public void fillField(WebElement field, String value) {
        field.clear();
        field.sendKeys(value);
    }
}