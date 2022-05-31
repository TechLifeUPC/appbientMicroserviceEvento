Feature: Participar en un evento
  Scenario Outline: El voluntario registra su asistencia en un evento
    Given el voluntario se encuentre en la pagina del evento del cual desea participar
    When complete el formulario de participación
    And le de clic al botón de participar en evento
    Then se mostrára un mensaje de confirmación de asistencia <message>
    Examples:
    | message                                |
    | "Gracias por inscribirte, te esperamos |
