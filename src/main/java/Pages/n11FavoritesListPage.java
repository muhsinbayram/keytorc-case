package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class n11FavoritesListPage {

    WebDriver driver;

    public n11FavoritesListPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[2]/div[3]/ul/li[1]/div/a")
    WebElement favList;

    public void clickFavList() {
        favList.click();
    }
}
