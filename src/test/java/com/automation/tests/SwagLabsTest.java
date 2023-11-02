package com.automation.tests;

import org.testng.annotations.Test;

public class SwagLabsTest extends BaseTest {

    @Test(priority = 1)
    public void LoginWithLockedOutUser() {
        loginPage.checkPageTitleText();
        loginPage.verifyLoginCredentials();
        loginPage.loginLockedOutUser();
    }

    @Test(priority = 2)
    public void loginWithStandardUser() {
        loginPage.checkPageTitleText();
        loginPage.verifyLoginCredentials();
        loginPage.loginStandardUser();
    }

    @Test(priority = 3)
    public void landingPage() {
        landingPage.verifyTitles();
        landingPage.verifyHamburgerMenu();
    }

    @Test(priority = 4)
    public void productPage() {
        landingPage.verifyBackpack();
        landingPage.verifyBikeLight();
        landingPage.verifyTShirt();
        landingPage.verifyFleece();
        landingPage.verifyOnesie();
        landingPage.verifySweater();
        landingPage.verifyAddItems();
    }

    @Test(priority = 5)
    public void footer() {
        landingPage.verifyFooter();
    }

    @Test(priority = 6)
    public void cartPage() {
        cartPage.verifyFullCart();
        cartPage.verifyCheckOut();
        //cartPage.verifyItemTotal();
        cartPage.submittedPage();
    }


}
