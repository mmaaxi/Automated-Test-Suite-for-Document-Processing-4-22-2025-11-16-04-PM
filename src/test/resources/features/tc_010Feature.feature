Feature: Validar generación de 'Slip de salida' y almacenamiento en historial

Scenario: Generar 'Slip de salida' y almacenar en historial al completar carga y procesamiento de documentos
  Given que el usuario ha completado la carga de documentos
  When el sistema procesa los documentos cargados
  Then el sistema debe generar el 'Slip de salida'
  And los documentos originales y los datos extraídos deben ser guardados en el historial de la solicitud