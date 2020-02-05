package Tests;

import Pages.n11FavoritesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import static Tests.TestBase.driver;

public class n11FavoritesTest {

    @Test(dependsOnGroups = {"secondPage"}, groups = {"favTest"}, description = "Adding to favorites")
    public void favTest() {

        n11FavoritesPage favoritesPage = PageFactory.initElements(driver, n11FavoritesPage.class);

        try {
            favoritesPage.clickToFav();
            Actions action = new Actions(driver);
            action.moveToElement(driver
                    .findElement(By.className("myAccount")))
                    .perform();
            favoritesPage.clickMyFavs();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
