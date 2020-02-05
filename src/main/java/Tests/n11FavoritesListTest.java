package Tests;

import Pages.n11FavoritesListPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import static Tests.TestBase.driver;


public class n11FavoritesListTest {

    @Test(dependsOnGroups = {"favTest"}, groups = {"openFavList"}, description = "Opening Favorites List")
    public void openFavList() {
        n11FavoritesListPage favoritesListPage = PageFactory.initElements(driver, n11FavoritesListPage.class);

        try {
            favoritesListPage.clickFavList();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
