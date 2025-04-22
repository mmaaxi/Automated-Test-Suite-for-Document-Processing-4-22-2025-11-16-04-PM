Feature: Validar selección de modo de carga de documentos

  Scenario: Selección de opción de carga de documentos
    Given el usuario está en la página de carga de documentos
    When el usuario selecciona la opción 'cargar documentos'
    Then el sistema muestra opción para carga única y carga múltiple

    When el usuario elige 'carga en un solo archivo'
    Then se habilita un único recuadro para subir el archivo

    When el usuario elige 'cargar documentos por separado'
    Then se muestran múltiples recuadros correspondientes a cada documento requerido