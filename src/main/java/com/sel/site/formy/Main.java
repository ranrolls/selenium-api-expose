package com.sel.site.formy;

import com.sel.site.formy.pages.*;
import org.openqa.selenium.WebDriver;

public class Main {
    public static void start(WebDriver driver){
//        AssertFormSuccess AFS = new AssertFormSuccess();    AFS.assertEqual(driver);
//        AutoComplete AC = new AutoComplete();               AC.expectedCondition(driver);
//        DatePicker DP = new DatePicker();                   DP.keysReturn(driver);
//        DragDrop DD = new DragDrop();                       DD.action(driver);
//        DropDown DDo = new DropDown();                      DDo.click(driver);
//        FileUpload FU = new FileUpload();                   FU.submitForm(driver);
//        Form F = new Form();                                F.btnClick(driver);
//        KeyPress KP = new KeyPress();                       KP.click(driver);
//        Model M = new Model();                              M.jsExecutor(driver);
        RadioButton RB = new RadioButton();                 RB.cssSelectors(driver);
//        Scroll S = new Scroll();                            S.moveToElement(driver);
//        SwitchWindow SW = new SwitchWindow();               SW.switchToOriginal(driver); SW.switchToAlert(driver);
    }
}
