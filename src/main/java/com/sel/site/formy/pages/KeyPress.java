package com.sel.site.formy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyPress {
    public static void click(WebDriver driver) {
        driver.get("https://formy-project.herokuapp.com/keypress");
        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Meaghan Lewis");
        WebElement button = driver.findElement(By.id("button"));
        button.click();
    }
}
