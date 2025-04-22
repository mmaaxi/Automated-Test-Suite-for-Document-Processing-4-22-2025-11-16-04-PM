Feature: Validar la subida de archivo con formato válido y vista previa

  Scenario: Subir un archivo PDF/DOCX válido para su vista previa
    Given el usuario está en la página de carga de archivos
    When el usuario selecciona un archivo "muestra.pdf" de formato válido
    Then el archivo debe cargarse correctamente
    And se debe mostrar la vista previa con el nombre, tamaño y tipo del archivo