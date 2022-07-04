package org.bancolombia.dojos.reactive_commons;

import lombok.Data;
import org.reactivecommons.api.domain.Command;
import org.reactivecommons.async.api.DirectAsyncGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ComponentA {
    @Autowired
    DirectAsyncGateway asyncGateway;

    @GetMapping("/hola")
    public Mono<String> holaMundo(){
        Mensaje mensaje = new Mensaje();
        mensaje.setNombre("Hola Reactive!");
        mensaje.setDescription("Mensaje reactivo con REACTIVE-COMMONS");
        Command<Mensaje> command = new Command<>("Enviar mensaje.","1234",mensaje);
        return asyncGateway.sendCommand(command, "ComponenteB")
                .thenReturn("Todo perfecto.");
    }
}

@Data
class Mensaje {
    String nombre;
    String description;
}
