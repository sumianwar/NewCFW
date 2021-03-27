package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Util {

    public void dropDownByVisibleText(WebElement element, String testData){
        Select drop = new Select(element);
        drop.selectByVisibleText(testData);
    }
    public void dropDownByIndex(WebElement element, int indexNumber){
        Select drop = new Select(element);
        drop.selectByIndex(indexNumber);
    }
    public void dropDownByValue(WebElement element, String value){
        Select drop = new Select(element);
        drop.selectByValue(value);
    }














}
