package autotests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class DepositsPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(), 'Рубли')]")
    public WebElement rubleBtn;

    @FindBy(xpath = "//input[@name = 'amount']")
    public WebElement depositAmount;

    @FindBy(xpath = "//div[@class='jq-selectbox__trigger']")
    public WebElement dropDownTermOfDepositBtn;

    @FindBy(xpath = "//select[@id='period']//option[text()]")
    public List<WebElement> termOfDeposit;

    @FindBy(xpath = "//input[@name='replenish']")
    public WebElement replenishmentPerMonth;

    @FindBy(xpath = "//input[@name='capitalization']/ancestor::span")
    public WebElement checkBoxCapitalization;

    @FindBy(xpath = "//input[@name='partial_out']/ancestor::span")
    public WebElement checkBoxPartialOut;

    @FindBy(xpath = "//span[@class='js-calc-rate']")
    public WebElement rate;

    @FindBy(xpath = "//span[@class='js-calc-result']")
    public WebElement depositResult;

    @FindBy(xpath = "//span[@class='js-calc-replenish']")
    public WebElement amountOfReplenishment;

    @FindBy(xpath = "//span[@class='js-calc-earned']")
    public WebElement accrued;
}
