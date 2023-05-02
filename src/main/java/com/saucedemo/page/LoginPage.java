package com.saucedemo.page;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {



    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginLink = By.id("login-button");


    public void enterUsername(String userName){
        sendTextToElement(usernameField, userName);
    }


    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }


    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

}
