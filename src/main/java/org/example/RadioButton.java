package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RadioButton {
    private WebDriver driver;

    public RadioButton(WebDriver driver) {
        this.driver = driver;
    }

    //Локаторы
    private final By yesButton = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/label[1]");
    private final By impressiveButton = By.xpath("//label[text()='Impressive']" );
    private final By noButton = By.xpath("//input[@id=noRadio]");
    private final By selectedResult= By.xpath("(//input[@name='like']/following-sibling::label)[3]");
           public void clickYesButton() {
        driver.findElement(yesButton).click();
           }

        public void clickImpressiveButton(){
            driver.findElement(impressiveButton).click();
        }
    public void clickNoButton(){
        driver.findElement(noButton).click();
    }
    public String actualResult() {
        return driver.findElement(selectedResult).getText();
    }
     // открыть окно
    public void fullScreen() {
        driver.manage().window().maximize();
    }
    //ожидание кликабельности
    public void waitForLoad(By lokator) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(lokator));
           }

        public void yesButtonRadioTest () {
            fullScreen();
            waitForLoad(yesButton);
            clickYesButton();
            Assert.assertEquals("You have selected Yes", actualResult());

        }
    public void impressiveButtonRadioTest () {
        fullScreen();
        waitForLoad(impressiveButton);
        clickImpressiveButton();
        Assert.assertEquals("You have selected Impressive", actualResult());
    }

    public void noButtonRadioTest () {
        fullScreen();
        waitForLoad(noButton);
        clickNoButton();
        Assert.assertEquals("You have selected No", actualResult());

    }

    }

