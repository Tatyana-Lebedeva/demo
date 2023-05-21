package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckBox {
    private WebDriver driver;

    public CheckBox(WebDriver driver) {
        this.driver = driver;
    }
    // Локаторы

    private final By toggleButton = By.xpath("//button[@title='Toggle']"); // кнопка стрелочки
    private final By plusButton = By.xpath("//button[@title='Expand all']");// кнопка плюсик
    private final By minusButton = By.xpath("//button[@title='Collapse all']"); //кнопка минус
    private final By homeCheckBox = By.className("rct-checkbox");
    private final By desktopCheckBox = By.xpath("(//input[@id='tree-node-desktop']/following-sibling::span)[3]");
    private final By notesCheckBox = By.xpath("(//input[@id='tree-node-notes']/following-sibling::span)[3]");
    private final By commandsCheckBox = By.xpath("(//input[@id='tree-node-commands']/following-sibling::span)[3]");
    private final By documentsCheckBox = By.xpath("(//input[@id='tree-node-documents']/following-sibling::span)[3]");
    private final By workSpaceCheckBox = By.xpath("(//input[@id='tree-node-workspace']/following-sibling::span)[3]");
    private final By reactCheckBox = By.xpath("(//input[@id='tree-node-react']/following-sibling::span)[3]");
    private final By angularCheckBox = By.xpath("(//input[@id='tree-node-angular']/following-sibling::span)[3]");
    private final By veuCheckBox = By.xpath("(//input[@id='tree-node-veu']/following-sibling::span)[3]");
    private final By officeCheckBox = By.xpath("(//input[@id='tree-node-office']/following-sibling::span)[3]");
    private final By publicCheckBox = By.xpath("(//input[@id='tree-node-public']/following-sibling::span)[3]");
    private final By privateCheckBox = By.xpath("(//input[@id='tree-node-private']/following-sibling::span)[3]");
    private final By classifiedCheckBox = By.xpath("(//input[@id='tree-node-classified']/following-sibling::span)[3]");
    private final By generalCheckBox = By.xpath("(//input[@id='tree-node-general']/following-sibling::span)[3]");
    private final By downloadsCheckBox = By.xpath("(//input[@id='tree-node-downloads']/following-sibling::span)[3]");
    private final By wordFileCheckBox = By.xpath("(//input[@id='tree-node-wordFile']/following-sibling::span)[3]");
    private final By excelCheckBox = By.xpath("(//input[@id='tree-node-excelFile']/following-sibling::span)[3]");

    // нажали кнопку отправить
    public void clickToggleButton() {
        driver.findElement(toggleButton).click();
    } // нажали кнопку стрелочки

    public void clickPlusButton() {
        driver.findElement(plusButton).click();
    } // нажали кнопку отправить

    public void clickMinusButton() {
        driver.findElement(minusButton).click();
    } // нажали кнопку отправить

    public void clickHomeCheckBox() {
        driver.findElement(homeCheckBox).click();
    }

    public void clickDesktopCheckBox() {
        driver.findElement(desktopCheckBox).click();
    }

    public void clickNotesCheckBox() {
        driver.findElement(notesCheckBox).click();
    }

    public void clickCommandsCheckBox() {
        driver.findElement(commandsCheckBox).click();
    }

    public void clickDocumentsCheckBox() {
        driver.findElement(documentsCheckBox).click();
    }

    public void clickWorkSpaceCheckBox() {
        driver.findElement(workSpaceCheckBox).click();
    }

    public void clickReactCheckBox() {
        driver.findElement(reactCheckBox).click();
    }

    public void clickAngularCheckBox() {
        driver.findElement(angularCheckBox).click();
    }

    public void clickVeuCheckBox() {
        driver.findElement(veuCheckBox).click();
    }

    public void clickOfficeCheckBox() {
        driver.findElement(officeCheckBox).click();
    }

    public void clickPublicCheckBox() {
        driver.findElement(publicCheckBox).click();
    }

    public void clickPrivateCheckBox() {
        driver.findElement(privateCheckBox).click();
    }

    public void clickclassifiedCheckBox() {
        driver.findElement(classifiedCheckBox).click();
    }

    public void clickgeneralCheckBox() {
        driver.findElement(generalCheckBox).click();
    }

    public void clickDownloadsCheckBox() {
        driver.findElement(downloadsCheckBox).click();
    }

    public void clickwordFileCheckBox() {
        driver.findElement(wordFileCheckBox).click();
    }

    public void clickexcelCheckBox() {
        driver.findElement(excelCheckBox).click();
    }

    //скролинг до кнопки
    public void scroll(By locator) {
        WebElement element = driver.findElement(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

    }

    //локатор текста под списком

    private final By selectedResult = By.id("result");

    public String actualResult() {
        return driver.findElement(selectedResult).getText();
    }


    public void fullScreen() {
        driver.manage().window().maximize();
    }

    public void waitForLoad(By lokator) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(lokator));


    }

    public void buttonTest() {
        fullScreen();
        waitForLoad(minusButton);
        clickToggleButton();
        clickPlusButton();
        clickMinusButton();
    }

    public void homeCheckTest() {
        fullScreen();
        waitForLoad(homeCheckBox);
        clickHomeCheckBox();
        waitForLoad(homeCheckBox);
        Assert.assertEquals("Ошибка", "You have selected :\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile", actualResult());
    }

    public void desktopCheckBoxTest() {
        fullScreen();
        waitForLoad(plusButton);
        clickPlusButton();
        waitForLoad(desktopCheckBox);
        clickDesktopCheckBox();
        Assert.assertEquals("Ошибка", "You have selected :\n" +
                "desktop\n" +
                "notes\n" +
                "commands", actualResult());
    }

    public void documentsCheckBoxTest() {
        fullScreen();
        waitForLoad(plusButton);
        clickPlusButton();
        waitForLoad(documentsCheckBox);
        clickDocumentsCheckBox();
        Assert.assertEquals("Ошибка", "You have selected :\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general", actualResult());
    }

    public void downloadsCheckBoxTest() {
        fullScreen();
        waitForLoad(plusButton);
        clickPlusButton();
        scroll(downloadsCheckBox);
        waitForLoad(downloadsCheckBox);
        clickDownloadsCheckBox();
        Assert.assertEquals("Ошибка", "You have selected :\n" +
                        "downloads\n" +
                        "wordFile\n" +
                        "excelFile"
                , actualResult());
    }

    public void notesCheckBoxTest() {
        fullScreen();
        waitForLoad(plusButton);
        clickPlusButton();
        waitForLoad(notesCheckBox);
        clickNotesCheckBox();
        Assert.assertEquals("Ошибка", "You have selected :\n" +
                "notes", actualResult());
    }

    public void commandsCheckBoxTest() {
        fullScreen();
        waitForLoad(plusButton);
        clickPlusButton();
        waitForLoad(commandsCheckBox);
        clickCommandsCheckBox();
        Assert.assertEquals("Ошибка", "You have selected :\n" +
                "commands", actualResult());
    }

    public void workSpaceCheckBoxTest() {
        fullScreen();
        waitForLoad(plusButton);
        clickPlusButton();
        waitForLoad(workSpaceCheckBox);
        clickWorkSpaceCheckBox();
        Assert.assertEquals("Ошибка", "You have selected :\n" +
                        "workspace\n" +
                        "react\n" +
                        "angular\n" +
                        "veu",
                actualResult());
    }

    public void reactCheckBoxTest() {
        fullScreen();
        waitForLoad(plusButton);
        clickPlusButton();
        waitForLoad(reactCheckBox);
        clickReactCheckBox();
        Assert.assertEquals("Ошибка", "You have selected :\n" +
                        "react",
                actualResult());

    }

    public void angularCheckBoxTest() {
        fullScreen();
        waitForLoad(plusButton);
        clickPlusButton();
        waitForLoad(angularCheckBox);
        clickAngularCheckBox();
        Assert.assertEquals("Ошибка", "You have selected :\n" +
                        "angular",
                actualResult());
    }

    public void veyCheckBoxTest() {
        fullScreen();
        waitForLoad(plusButton);
        clickPlusButton();
        waitForLoad(veuCheckBox);
        clickVeuCheckBox();
        Assert.assertEquals("Ошибка", "You have selected :\n" +
                        "veu",
                actualResult());//
    }

    public void officeCheckBoxTest() {
        fullScreen();
        waitForLoad(plusButton);
        clickPlusButton();
        waitForLoad(officeCheckBox);
        clickOfficeCheckBox();
        Assert.assertEquals("Ошибка", "You have selected :\n" +
                        "office\n" +
                        "public\n" +
                        "private\n" +
                        "classified\n" +
                        "general",
                actualResult());
    }

    public void publicCheckBoxTest() {
        fullScreen();
        waitForLoad(plusButton);
        clickPlusButton();
        waitForLoad(publicCheckBox);
        clickPublicCheckBox();
        Assert.assertEquals("Ошибка", "You have selected :\n" +
                        "public",
                actualResult());
    }

    public void privateCheckBoxTest() {
        fullScreen();
        waitForLoad(plusButton);
        clickPlusButton();
        waitForLoad(privateCheckBox);
        clickPrivateCheckBox();
        Assert.assertEquals("Ошибка", "You have selected :\n" +
                        "private",
                actualResult());
    }

    public void classifiedCheckBoxTest() {
        fullScreen();
        waitForLoad(plusButton);
        clickPlusButton();
        waitForLoad(classifiedCheckBox);
        clickclassifiedCheckBox();
        Assert.assertEquals("Ошибка", "You have selected :\n" +
                        "classified",
                actualResult());

    }

    public void generalCheckBoxTest() {
        fullScreen();
        waitForLoad(plusButton);
        clickPlusButton();
        waitForLoad(generalCheckBox);
        clickgeneralCheckBox();
        Assert.assertEquals("Ошибка", "You have selected :\n" +
                        "general",
                actualResult());
    }

    public void wordFileCheckBoxTest() {
        fullScreen();
        waitForLoad(plusButton);
        clickPlusButton();
        scroll(wordFileCheckBox);
        waitForLoad(wordFileCheckBox);
        clickwordFileCheckBox();
        Assert.assertEquals("Ошибка", "You have selected :\n" +
                        "wordFile",
                actualResult());

    }
    public void excelFileCheckBoxTest() {
        fullScreen();
        waitForLoad(plusButton);
        clickPlusButton();
        scroll(excelCheckBox);
        waitForLoad(excelCheckBox);
        clickexcelCheckBox();
        Assert.assertEquals("Ошибка", "You have selected :\n" +
                        "excelFile",
                actualResult());

    }
}
