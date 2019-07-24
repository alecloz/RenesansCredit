package autotests.steps;

import autotests.pages.DepositsPage;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class DepositsPageSteps extends BaseSteps {

    private DepositsPage depositsPage = new DepositsPage();

    @Step("выбираем валюту - Рубли")
    public void stepSelectCurrency() {
        depositsPage.rubleBtn.click();
    }

    @Step("выбираем сумму вклада - {0}")
    public void stepSelectDepositAmount(String amount) {
        depositsPage.depositAmount.click();
        depositsPage.depositAmount.sendKeys(amount);
    }

    @Step("выбираем срок вклада - {0}")
    public void stepSelectTermOfDeposit(String term) {
        depositsPage.dropDownTermOfDepositBtn.click();
        for (WebElement terms : depositsPage.termOfDeposit) {
            if (terms.getText().equals(term)) {
                terms.click();
                return;
            }
        }
        Assert.fail(String.format("Срок вклада %s не найден", term));
    }

    @Step("выбираем ежемесячное пополнение вклада - {0}")
    public void stepSelectReplenishmentPerMonth(String replenishment) {
        depositsPage.replenishmentPerMonth.click();
        depositsPage.replenishmentPerMonth.sendKeys(replenishment);
    }

    @Step("кликаем на чекбокс - Ежемесячная капитализация")
    public void stepCheckBoxCapitalizationClick() {
        depositsPage.checkBoxCapitalization.click();
    }

    @Step("кликаем на чекбокс - Частичное снятие")
    public void stepCheckBoxPartialOutClick() {
        depositsPage.checkBoxPartialOut.click();
    }

    @Step("проверяем значение ставки - {0}")
    public void stepCheckRate(String rate) {
        Assert.assertEquals("Ставка не совпадает", depositsPage.rate.getText(), rate);
    }

    @Step("проверяем количество средств в конце срока - {0}")
    public void stepCheckDepositResult(String depositResult) {
        Assert.assertEquals("Ставка не совпадает", depositsPage.depositResult.getText(), depositResult);
    }

    @Step("проверяем значение ставки - {0}")
    public void stepCheckAmountOfReplenishment(String amountOfReplenishment) {
        Assert.assertEquals("Ставка не совпадает", depositsPage.amountOfReplenishment.getText(), amountOfReplenishment);
    }

    @Step("проверяем значение ставки - {0}")
    public void stepCheckAccrued(String accrued) {
        Assert.assertEquals("Ставка не совпадает", depositsPage.accrued.getText(), accrued);
    }
}
