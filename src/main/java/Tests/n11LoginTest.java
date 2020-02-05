package Tests;

import Pages.n11LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Tests.TestBase.driver;
import static Tests.TestBase.n11Title;

public class n11LoginTest {

    @Test(groups = {"login"}, description = "Logging in")
    public void login() {

        n11LoginPage loginPage = PageFactory.initElements(driver, n11LoginPage.class);

        try {
            loginPage.setEmailField("accfortesting05022020@gmail.com");
            loginPage.setPassField("test0502");
            loginPage.clickOnLoginButton();
            Assert.assertTrue(isSuccesfull());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public boolean isSuccesfull() {
        return n11Title.equals(driver.getTitle());
    }

}
