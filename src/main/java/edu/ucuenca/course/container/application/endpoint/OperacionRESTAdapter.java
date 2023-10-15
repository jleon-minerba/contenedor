package edu.ucuenca.course.container.application.endpoint;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperacionRESTAdapter extends ResourceRESTAdapter {
    
   @GetMapping(path = "test", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<List<String>> getMessages() {
        final List<String> mensajes = new ArrayList<>();
        mensajes.add("Hola");
        mensajes.add("Mundo!");
        return new ResponseEntity<>(mensajes, HttpStatus.OK);
    } 

    @GetMapping(path = "test2/{name}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<List<String>> getMessagesByName(@PathVariable("name") final String name) {
        final List<String> mensajes = new ArrayList<>();
        mensajes.add("Hola");
        mensajes.add(name);
        return new ResponseEntity<>(mensajes, HttpStatus.OK);
    } 
}
