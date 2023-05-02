package com.saucedemo.page;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;

public class ProductPage extends Utility {


    By productsText = By.xpath("//span[contains(text(),'Products')]");
    By list = (By.xpath("//div[@id='']"));


    public String getProductsText(){
        return getTextFromElement(productsText);
    }

    public String getItemNumberOnProductsPage(){
        return getTextFromElement(list);
    }
}
