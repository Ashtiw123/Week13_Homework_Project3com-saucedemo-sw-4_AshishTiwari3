package com.saucedemo.basetest.testsuite;

import com.saucedemo.basetest.basetest.BaseTest;
import com.saucedemo.page.LoginPage;
import com.saucedemo.page.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    ProductPage productsPage = new ProductPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginLink();
        String expectedMessage = "PRODUCTS";
        String actualMessage = productsPage.getProductsText();
        Assert.assertEquals(expectedMessage, actualMessage, "Products Page not displayed");
    }
}