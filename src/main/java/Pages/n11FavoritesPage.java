package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class n11FavoritesPage {

    WebDriver driver;

    public n11FavoritesPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div/div[2]/section[1]/div[2]/ul/li[3]/div/div[1]/span")
    WebElement favClick;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/header/div/div/div[2]/div[2]/div[2]/div[2]/div/a[2]")
    WebElement myFavs;

    public void clickToFav() {
        favClick.click();
    }

    public void clickMyFavs() {
        myFavs.click();
    }

}
