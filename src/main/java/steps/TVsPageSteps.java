package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.TVsPage;

import static org.junit.Assert.assertEquals;

public class TVsPageSteps extends ScenarioSteps {

    TVsPage tVsPage;

    @Step("выполнен переход ко всем фильтрам")
    public void goToAllFilters() {
        tVsPage.allFiltersBtn.click();
    }

    @Step("количество продуктов на странице равно {0}")
    public void checkCountElementsEquals(Integer count) {
        assertEquals("", count, tVsPage.countProducts());
    }

    @Step("получено имя {0} продукта")
    public String getProductName(Integer num) {
        return tVsPage.getProductNumName(num);
    }

    @Step("поле поиска заполняется значением {0}")
    public void setSearch(String value) {
        tVsPage.fillSearch(value);
    }

    @Step("применить поиск")
    public void applySearch() {
        tVsPage.applySearchBtn.click();
    }
}