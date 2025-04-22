import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Tc_002Page;

public class Tc_002Steps {
    WebDriver driver;
    Tc_002Page page;

    public Tc_002Steps() {
        driver = Hooks.driver;
        page = PageFactory.initElements(driver, Tc_002Page.class);
    }

    @Given("el usuario está en la página de carga de archivos")
    public void usuario_en_pagina_carga_archivos() {
        driver.get("http://example.com/upload");
    }

    @When("el usuario selecciona un archivo {string} de formato válido")
    public void usuario_selecciona_archivo(String nombreArchivo) {
        page.subirArchivo(nombreArchivo);
    }

    @Then("el archivo debe cargarse correctamente")
    public void archivo_se_carga_correctamente() {
        page.verificarArchivoCargado();
    }

    @Then("se debe mostrar la vista previa con el nombre, tamaño y tipo del archivo")
    public void verificar_vista_previa() {
        page.verificarVistaPreviaArchivo();
    }
}