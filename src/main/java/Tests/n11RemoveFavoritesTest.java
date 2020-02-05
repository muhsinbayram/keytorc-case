package Tests;

import Pages.n11RemoveFavoritesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import static Tests.TestBase.driver;


public class n11RemoveFavoritesTest {

    @Test(dependsOnGroups = {"openFavList"}, description = "Removing the item from Favorites list")
    public void removeFav() {

        n11RemoveFavoritesPage removeFavoritesPage = PageFactory.initElements(driver, n11RemoveFavoritesPage.class);

        try {
            Assert.assertTrue(doesItExist());
            removeFavoritesPage.clickToRemoveFav();
            Assert.assertTrue(isSuccessful());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean doesItExist() {
        return driver.findElements(By.className("pro")).size() > 0;
    }

    private boolean isSuccessful() {
        return driver.findElements(By.className("emptyWatchList")).size() > 0;
    }

}
