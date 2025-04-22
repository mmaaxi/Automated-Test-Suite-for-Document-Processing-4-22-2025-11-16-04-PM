package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {

    WebDriver driver;

    By cargaDocumentosButton = By.id("cargaDocumentos");
    By procesarButton = By.id("procesar");
    By slipGenerado = By.id("slipGenerado");
    By historialAlmacenado = By.id("historialAlmacenado");

    public tc_010Page(WebDriver driver){
        this.driver = driver;
    }

    public void completarCargaDocumentos() {
        driver.findElement(cargaDocumentosButton).click();
    }

    public void procesarDocumentosCargados() {
        driver.findElement(procesarButton).click();
    }

    public boolean verificarGeneracionSlipDeSalida() {
        return driver.findElement(slipGenerado).isDisplayed();
    }

    public boolean verificarAlmacenamientoEnHistorial() {
        return driver.findElement(historialAlmacenado).isDisplayed();
    }
}