package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class n11RemoveFavoritesPage {

    WebDriver driver;

    public n11RemoveFavoritesPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[2]/div[3]/div[1]/div[2]/ul/li/div/div[3]/span")
    WebElement removeFav;

    public void clickToRemoveFav() {
        removeFav.click();
        driver.findElement(By.xpath("/html/body/div[4]/div/div/span")).click();
    }
}
