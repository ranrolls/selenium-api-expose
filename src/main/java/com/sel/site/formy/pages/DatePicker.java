package com.sel.site.formy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePicker {
    public static void keysReturn(WebDriver driver) {
        driver.get("https://formy-project.herokuapp.com/datepicker");
        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("03/03/2020");
        dateField.sendKeys(Keys.RETURN);
    }
}
