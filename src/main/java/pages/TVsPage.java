package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class TVsPage extends BasePageObject {

    @FindBy(xpath = "//*[contains(text(),'Перейти ко всем фильтрам')]")
    public WebElement allFiltersBtn;

    @FindBy(xpath = "//button[./*[contains(text(),'Найти')]]")
    public WebElement applySearchBtn;

    @FindBy(xpath = "//*[contains(@class,'filter-applied-results__content')]")
    WebElement productItems;

    @FindBy(xpath = "//*[@id='header-search']")
    WebElement searchString;

    public List<WebElement> getProducts() {
        return productItems.findElements(By.xpath(".//*[contains(@class,'n-snippet-card')]"));
    }

    private String getProductName(WebElement product) {
        return product.findElement(By.xpath(".//*[contains(@class,'snippet-card__header')][@title]")).getText();
    }

    public Integer countProducts() {
        return getProducts().size();
    }

    public String getProductNumName(Integer num) {
        assertTrue("Некорректно задан номер продукта", num > 0 & num <= countProducts());
        return getProductName(getProducts().get(num - 1));
    }

    public void fillSearch(String value) {
        fillField(searchString, value);
    }
}