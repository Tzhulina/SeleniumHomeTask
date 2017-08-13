package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.FiltersPage;

public class FiltersSteps extends ScenarioSteps {

    FiltersPage filtersPage;

    @Step("поле {0} заполняется значением {1}")
    public void fillField(String field, String value) {
        filtersPage.fillField(field, value);
    }

    @Step("применить выбранный фильтр")
    public void applyFilter() {
        filtersPage.apply.click();
    }
}