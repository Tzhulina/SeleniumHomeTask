package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MarketMainPage extends BasePageObject {

    @FindBy(xpath = "//*[contains(@class,'topmenu__list')]")
    WebElement menuItems;

    @FindBy(xpath = "//*[contains(@class,'topmenu__sublist')]")
    WebElement menuUnderItems;

    public WebElement selectMenuItem(String itemName) {
        return menuItems.findElement(By.xpath(".//*[contains(text(),'" + itemName + "')]"));
    }

    public void selectSubMenuItem(String subItemName) {
        menuUnderItems.findElement(By.xpath(".//a[contains(@class,'link topmenu__subitem')][contains(text(),'" + subItemName + "')]")).click();
    }
}