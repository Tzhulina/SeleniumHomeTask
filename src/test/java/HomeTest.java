import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.*;

@RunWith(SerenityRunner.class)
public class HomeTest extends BaseSteps {

    String memory;

    @Steps
    FiltersSteps filtersSteps;

    @Steps
    MainPageSteps mainPageSteps;

    @Steps
    MarketMainPageSteps marketMainPageSteps;

    @Steps
    ProductSteps productSteps;

    @Steps
    TVsPageSteps tVsPageSteps;

    @Title("ЯндексМаркет.ТеликиЗа20к")
    @Test
    public void Test() {
        mainPageSteps.selectMenuItem("Маркет");
        marketMainPageSteps.selectMenuItem("Электроника", "Телевизоры");
        tVsPageSteps.goToAllFilters();
        filtersSteps.fillField("Цена от", "20000");
        filtersSteps.fillField("Производитель", "Samsung");
        filtersSteps.fillField("Производитель", "LG");
        filtersSteps.applyFilter();
        tVsPageSteps.checkCountElementsEquals(12);
        memory = tVsPageSteps.getProductName(1);
        tVsPageSteps.setSearch(memory);
        tVsPageSteps.applySearch();
        productSteps.checkProductTitle(memory);
    }
}