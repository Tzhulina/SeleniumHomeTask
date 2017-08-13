package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FiltersPage extends BasePageObject {

    @FindBy(xpath = "//a[.//*[contains(text(),'Показать подходящие')]]")
    public WebElement apply;

    @FindBy(xpath = "//*[@id='glf-pricefrom-var']")
    WebElement priceFrom;

    @FindBy(xpath = "//*[contains(text(),'Производитель')]/ancestor::*[contains(@class,'filter-block ')]")
    WebElement vendorItems;

    public void fillField(String fieldName, String value) {
        switch (fieldName) {
            case "Цена от":
                fillField(priceFrom, value);
                break;
            case "Производитель":
                vendorItems.findElement(By.xpath(".//*[contains(text(),'" + value + "')]")).click();
                break;
            default:
                throw new AssertionError("Поле '" + fieldName + "' не объявлено на странице");
        }
    }
}