package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TextBox {
private WebDriver driver;
public TextBox(WebDriver driver) {
    this.driver= driver;
}
// Локаторы
private final By fullName = By.id ("userName");
private final By emailAddress = By.id ("userEmail");
private final By currentAddress= By.id ("currentAddress");
private final By permanentAddress= By.id("permanentAddress");
private final By submintButton= By.id("submit");// кнопка отправить
    //заполнение полей
    public void fillFullName(String name){
        driver.findElement(fullName).sendKeys(name);
    }
    public void fillEmailAdress(String email){
        driver.findElement(emailAddress).sendKeys(email);}
    public void fillCurrentAddress (String CurAddress){
        driver.findElement(currentAddress).sendKeys(CurAddress);}
    public void fillPermanentAddress(String Per){
        driver.findElement(permanentAddress).sendKeys(Per);}

    public void fillSubmintButton(){
        driver.findElement(submintButton).click();} // нажали кнопку отправить
    public void fillForm (String name,String email,String CurAddress,String Per){
        waitForLoad(fullName);
        fillFullName(name);
        waitForLoad(emailAddress);
        fillEmailAdress(email);
        waitForLoad(currentAddress);
        fillCurrentAddress (CurAddress);
        waitForLoad(permanentAddress);
        fillPermanentAddress(Per);
        waitForLoad(submintButton);
        fillSubmintButton();
    }
    public void waitForLoad(By selector) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(selector));
    }
}
