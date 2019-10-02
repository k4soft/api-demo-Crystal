package co.com.k4soft.apidemo.controller;


import co.com.k4soft.apidemo.model.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/demo")
public class PersonaController {


    @GetMapping("/personas")
    public List<Persona> finadAll() {
        List<Persona> personas = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            Persona persona = new Persona();
            persona.setId(i+1);
            persona.setNombre("Nombre "+ (i+1) );
            persona.setApellido("Apellido "+ (i+1) );
            personas.add(persona);
        }
        return personas;
    }


}
