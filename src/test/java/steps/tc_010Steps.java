package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {

    tc_010Page slipDeSalidaPage = new tc_010Page();

    @Given("^que el usuario ha completado la carga de documentos$")
    public void cargarDocumentos() {
        slipDeSalidaPage.completarCargaDocumentos();
    }

    @When("^el sistema procesa los documentos cargados$")
    public void procesarDocumentos() {
        slipDeSalidaPage.procesarDocumentosCargados();
    }

    @Then("^el sistema debe generar el 'Slip de salida'$")
    public void validarGeneracionSlip() {
        boolean isSlipGenerated = slipDeSalidaPage.verificarGeneracionSlipDeSalida();
        Assert.assertTrue("Slip de salida no generado", isSlipGenerated);
    }

    @Then("^los documentos originales y los datos extraídos deben ser guardados en el historial de la solicitud$")
    public void validarAlmacenamientoHistorial() {
        boolean isStoredInHistory = slipDeSalidaPage.verificarAlmacenamientoEnHistorial();
        Assert.assertTrue("No se almacenó en el historial", isStoredInHistory);
    }
}