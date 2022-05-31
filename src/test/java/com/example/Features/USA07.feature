Feature: Crear Evento

  Scenario Outline: El voluntario realiza correctamente la creación de un Evento
    Given el voluntario se encuentra en la sección de creación de evento
    When completa el formulario con nombre <name>, descripción <description> y fecha de inicio <start_date>
    And le da clic en el botón de crear evento
    Then se le mostrará un mensaje de confirmación "Se creó exitosamente el evento"
    Examples:
      | name               | description                                     | start_date |
      | "Evento Especial"  | "Evento que ayudará a cuidar el medio ambiente" | 05/06/2022 |

    Scenario Outline: El voluntario no puede realizar la creación de un evento
      Given el voluntario se encuentra en el formulario de creación de evento
      When completa el formulario con nombre <name>, descripción <description> y fecha de inicio <start_date>
      And presiona el botón de crear evento
      Then se le mostrára un mensaje de error <message>
      Examples:
      | message                                              |
      | "Hubo un error al crear el evento, intente más tarde |

