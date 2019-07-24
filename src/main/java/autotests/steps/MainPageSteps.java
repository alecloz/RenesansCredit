package autotests.steps;

import autotests.pages.MainPage;
import io.qameta.allure.Step;

public class MainPageSteps extends BaseSteps {

    private MainPage mainPage = new MainPage();

    @Step("переходим в меню - Вклады")
    public void stepSelectDepositsPage(){
        mainPage.deposits.click();
    }
}
