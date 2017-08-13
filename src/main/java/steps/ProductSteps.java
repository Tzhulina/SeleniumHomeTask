package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.ProductPage;

import static org.junit.Assert.assertEquals;

public class ProductSteps extends ScenarioSteps {

    ProductPage productPage;

    @Step("заголовок продукта равен {0}")
    public void checkProductTitle(String name) {
        assertEquals(String.format("Заголовок продукта не равен ожидаемому [%s]", name), name, productPage.getProductTitle());
    }
}