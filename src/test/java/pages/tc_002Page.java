import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tc_002Page {
    WebDriver driver;

    @FindBy(id = "fileInput")
    WebElement inputArchivo;

    @FindBy(id = "preview")
    WebElement vistaPrevia;

    public Tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void subirArchivo(String nombreArchivo) {
        inputArchivo.sendKeys(System.getProperty("user.dir") + "/archivos/" + nombreArchivo);
    }

    public void verificarArchivoCargado() {
        // Lógica para verificar que el archivo se carga correctamente
        WebElement mensajeExito = driver.findElement(By.id("successMessage"));
        assert mensajeExito.isDisplayed();
    }

    public void verificarVistaPreviaArchivo() {
        // Lógica para verificar la vista previa del archivo
        assert vistaPrevia.isDisplayed();
        // Más validaciones para nombre, tamaño y tipo del archivo
    }
}