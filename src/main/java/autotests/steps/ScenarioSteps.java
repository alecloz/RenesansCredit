package autotests.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;

import static autotests.steps.BaseSteps.*;

public class ScenarioSteps {

    private MainPageSteps mainPageSteps;
    private DepositsPageSteps depositsPageSteps;

    @Before
    public void start(){
        setUp();
        mainPageSteps = new MainPageSteps();
        depositsPageSteps = new DepositsPageSteps();
    }

    @Когда("выбран пункт меню Вклады")
    public void выбран_пункт_меню_Вклады() {
        mainPageSteps.stepSelectDepositsPage();
    }

    @Тогда("переходим на страницу заполнения данных по вкладу")
    public void переходим_на_страницу_заполнения_данных_по_вкладу() {}

    @Когда("выбрана валюта - Рубли")
    public void выбрана_валюта_Рубли() {
        depositsPageSteps.stepSelectCurrency();
    }

    @Когда("сумма вклада - {string} руб")
    public void сумма_вклада_руб(String amount) {
        depositsPageSteps.stepSelectDepositAmount(amount);
    }

    @Когда("срок вклада - {string}")
    public void срок_вклада(String termOfDeposit) {
        depositsPageSteps.stepSelectTermOfDeposit(termOfDeposit);
    }

    @Когда("ежемесячное пополнение - {string} руб")
    public void ежемесячное_пополнение_руб(String replenishmentPerMonth) {
        depositsPageSteps.stepSelectReplenishmentPerMonth(replenishmentPerMonth);
    }

    @Когда("активен чекбокс Ежемесячная капитализация")
    public void активен_чекбокс_Ежемесячная_капитализация() {
        depositsPageSteps.stepCheckBoxCapitalizationClick();
    }

    @Когда("активен чекбокс Частичное снятие")
    public void активен_чекбокс_Частичное_снятие() {
        depositsPageSteps.stepCheckBoxPartialOutClick();
    }

    @Тогда("процентная ставка - {string}")
    public void процентная_ставка(String rate) {
        waitOneSec();
        depositsPageSteps.stepCheckRate(rate);
    }

    @Тогда("общий доход в конце срока вклада - {string} руб")
    public void общий_доход_в_конце_срока_вклада_руб(String depositResult) {
        depositsPageSteps.stepCheckDepositResult(depositResult);
    }

    @Тогда("сумма довложений - {string} руб")
    public void сумма_довложений_руб(String amountOfReplenishment) {
        depositsPageSteps.stepCheckAmountOfReplenishment(amountOfReplenishment);
    }

    @Тогда("начисленные проценты - {string} руб")
    public void начисленные_проценты_руб(String accrued) {
        depositsPageSteps.stepCheckAccrued(accrued);
    }

    @After
    public void exit(){
       tearDown();
    }
}
