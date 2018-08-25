package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static org.junit.Assert.*;


public class One {
    public static void main( String[] args ) throws InterruptedException {

//        System.setProperty("webdriver.chrome.driver", "C:/Users/yeswe/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();

//        System.setProperty("webdriver.gecko.driver", "C:/Users/yeswe/geckodriver64.exe");
//        FirefoxOptions firefoxOptions = new FirefoxOptions();
//        firefoxOptions.setCapability("marionette", true);
//        WebDriver driver = new FirefoxDriver(firefoxOptions);

        System.setProperty("webdriver.edge.driver", "C:/Users/yeswe/iedriver.exe");
        WebDriver driver = new EdgeDriver();

//        WebDriver driver = new HtmlUnitDriver();

        driver.get("https://formy-project.herokuapp.com/form");
        driver.findElement(By.id("first-name")).sendKeys("John");
        driver.findElement(By.id("last-name")).sendKeys("Doe");
        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-2")).click();
        driver.findElement(By.cssSelector("option[value='1']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("05/28/2019");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        WebElement alert2 = wait2.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));
        String alertText = alert2.getText();
        assertEquals("The form was successfully submitted!", alertText);

//        driver.get("https://formy-project.herokuapp.com/fileupload");
//        WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
//        fileUploadField.sendKeys("file-to-upload.png");

/*

        driver.get("https://formy-project.herokuapp.com/dragdrop");
        WebElement image = driver.findElement(By.id("image"));
        WebElement box = driver.findElement(By.id("box"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(image,box).build().perform();

        driver.get("https://formy-project.herokuapp.com/keypress");
        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Meaghan Lewis");
        WebElement button = driver.findElement(By.id("button"));
        button.click();

        driver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
        Thread.sleep(1000);
        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();

        driver.get("https://formy-project.herokuapp.com/scroll");
        name = driver.findElement(By.id("name"));
        actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Meaghan Lewis");
        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/2020");

        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();
        String originalHandle = driver.getWindowHandle();
        for(String handle1: driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }
        driver.switchTo().window(originalHandle);

        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.get("https://formy-project.herokuapp.com/modal");
        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();
        WebElement closeButton = driver.findElement(By.id("close-button"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", closeButton);

        driver.get("https://formy-project.herokuapp.com/dragdrop");
        image = driver.findElement(By.id("image"));
        box = driver.findElement(By.id("box"));
        actions = new Actions(driver);
        actions.dragAndDrop(image,box).build().perform();

        driver.get("https://formy-project.herokuapp.com/radiobutton");
        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click();
        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radioButton2.click();
        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioButton3.click();

        driver.get("https://formy-project.herokuapp.com/datepicker");
        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("03/03/2020");
        dateField.sendKeys(Keys.RETURN);

        driver.get("https://formy-project.herokuapp.com/dropdown");
        WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();
        WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));
        autocompleteItem.click();


        driver.get("https://formy-project.herokuapp.com/autocomplete");
        autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));
        autocompleteResult.click();

*/


        driver.quit();
    }
}
