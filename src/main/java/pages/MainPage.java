package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePageObject {

    @FindBy(xpath = "//*[contains(@class,'home-arrow__tabs')]")
    WebElement menuItems;

    public void selectMenuItem(String itemName) {
        menuItems.findElement(By.xpath(".//*[contains(text(),'" + itemName + "')]")).click();
    }
}