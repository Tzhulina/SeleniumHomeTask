package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePageObject {

    @FindBy(xpath = "//*[contains(@class,'product-title')]//h1")
    WebElement productTitle;

    public String getProductTitle() {
        return productTitle.getText();
    }
}