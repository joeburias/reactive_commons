package org.bancolombia.dojos.reactive_commons;

import org.reactivecommons.async.api.HandlerRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

@Configuration
public class ListenerConfig {
    @Bean
    public HandlerRegistry myListenerConfig(){
        return HandlerRegistry.register()
                .handleCommand("Enviar mensaje.", (message) ->{
                    // CASO DE USO Ejecutese
                    System.out.println(message.getData().getNombre()+
                            message.getData().getDescription());
                    return Mono.empty();
                }, Mensaje.class);
    }
}
