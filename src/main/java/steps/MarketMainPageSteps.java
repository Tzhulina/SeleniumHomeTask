package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.interactions.Actions;
import pages.MarketMainPage;

public class MarketMainPageSteps extends ScenarioSteps {

    MarketMainPage marketMainPage;

    @Step("выбран пункт меню {0}, подпункт {1}")
    public void selectMenuItem(String menuItem, String subMenuItem) {
        new Actions(BaseSteps.getWebDriver()).moveToElement(marketMainPage.selectMenuItem(menuItem)).perform();
        marketMainPage.selectSubMenuItem(subMenuItem);
    }
}