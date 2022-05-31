package com.example.StepsDefinition;

import com.example.appbientMicroserviceEvento.api.resource.EventosEvento.CreateEventosEventoResource;
import com.example.appbientMicroserviceEvento.api.resource.EventosEvento.EventosEventoResource;
import io.cucumber.java.en.*;
import lombok.extern.log4j.Log4j2;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

@Log4j2
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class USA07Stepdefs {
    @LocalServerPort
    private RestTemplate restTemplate = new RestTemplate();
    private String baseUrl = "http://localhost:8080/api/v1/";
    private CreateEventosEventoResource eventoResource;
    @Given("el voluntario se encuentra en la sección de creación de evento")
    public void elVoluntarioSeEncuentraEnLaSecciónDeCreaciónDeEvento() {
        baseUrl = baseUrl + "evento/";
    }

    @When("completa el formulario con nombre <name>, descripción <description> y fecha de inicio <start_date>")
    public void completaElFormularioConNombreNameDescripciónDescriptionYFechaDeInicioStart_date(String name, String description, Date start_date) {
    }

    @And("le da clic en el botón de crear evento")
    public void leDaClicEnElBotónDeCrearEvento() {
        EventosEventoResource resource = restTemplate.postForObject(baseUrl, eventoResource,EventosEventoResource.class);
        log.info(resource);
        assertNotNull(resource);

    }

    @Then("se le mostrará un mensaje de confirmación <message>")
    public void seLeMostraráUnMensajeDeConfirmación(String message) {
        log.info(message);
    }

    @Given("el voluntario se encuentra en el formulario de creación de evento")
    public void elVoluntarioSeEncuentraEnElFormularioDeCreaciónDeEvento() {
        baseUrl = baseUrl + "evento/";

    }

    @And("presiona el botón de crear evento")
    public void presionaElBotónDeCrearEvento() {
        EventosEventoResource resource = restTemplate.postForObject(baseUrl, eventoResource,EventosEventoResource.class);
        log.info(resource);
        assertNotNull(resource);
    }

    @Then("se le mostrára un mensaje de error <message>")
    public void seLeMostráraUnMensajeDeErrorMessage(String message) {
        log.info(message);

    }
}
