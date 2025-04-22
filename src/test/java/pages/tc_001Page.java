package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_001Page {
    WebDriver driver;

    private By uploadDocumentsOption = By.id("uploadDocumentsOption");
    private By singleUploadOption = By.id("singleUploadOption");
    private By multipleUploadOption = By.id("multipleUploadOption");
    private By singleUploadBox = By.id("singleUploadBox");
    private By multipleUploadBoxes = By.className("multipleUploadBox");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectUploadDocumentsOption() {
        driver.findElement(uploadDocumentsOption).click();
    }

    public boolean areUploadOptionsDisplayed() {
        return driver.findElement(singleUploadOption).isDisplayed() &&
               driver.findElement(multipleUploadOption).isDisplayed();
    }

    public void selectSingleFileUploadOption() {
        driver.findElement(singleUploadOption).click();
    }

    public boolean isSingleUploadBoxEnabled() {
        WebElement box = driver.findElement(singleUploadBox);
        return box.isDisplayed() && box.isEnabled();
    }

    public void selectMultipleFilesUploadOption() {
        driver.findElement(multipleUploadOption).click();
    }

    public boolean areMultipleUploadBoxesDisplayed() {
        return driver.findElements(multipleUploadBoxes).size() > 0;
    }
}