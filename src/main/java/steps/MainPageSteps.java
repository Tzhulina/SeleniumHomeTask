package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.MainPage;

public class MainPageSteps extends ScenarioSteps {

    MainPage mainPage;

    @Step("выбран пункт меню {0}")
    public void selectMenuItem(String menuItem) {
        mainPage.selectMenuItem(menuItem);
    }
}