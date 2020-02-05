package Tests;

import Pages.n11SearchResultPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import static Tests.TestBase.driver;


public class n11SearchResultTest {

    @Test(dependsOnGroups = {"search"}, groups = {"secondPage"}, description = "Navigating to the second page")
    public void secondPage() {

        n11SearchResultPage searchResultPage = PageFactory.initElements(driver, n11SearchResultPage.class);

        try {
            searchResultPage.clickOnSecondPageButton();
            Thread.sleep(1000);
            Assert.assertTrue(isSuccessful());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private boolean isSuccessful() {
        return driver.getCurrentUrl().contains("&pg=2");
    }

}
