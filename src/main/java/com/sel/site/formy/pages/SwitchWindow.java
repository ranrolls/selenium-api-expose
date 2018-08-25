package com.sel.site.formy.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchWindow {
    public static void switchToOriginal(WebDriver driver) {
        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();
        String originalHandle = driver.getWindowHandle();
        for(String handle1: driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }
        driver.switchTo().window(originalHandle);
    }
    public static void switchToAlert(WebDriver driver){
        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
