package autotests.pages;

import autotests.steps.BaseSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


class BasePage {
    private WebDriver driver = BaseSteps.getDriver();

    BasePage() {
        PageFactory.initElements(driver, this);
    }
}
