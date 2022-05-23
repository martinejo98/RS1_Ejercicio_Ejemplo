package com.example.Ejercicio6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Controlador {

    @Autowired
    Greeting greeting1;

    @Autowired
    ArrayList <Greeting> listaUsuarios;

    @PostMapping("/postMetodo")
    @RequestMapping(value = "/postMetodo", method = RequestMethod.POST, consumes = "application/json")
    public String postMetodo(@RequestBody Greeting greeting1){
        listaUsuarios.add(greeting1);
        return greeting1.toString();
    }

    @GetMapping("/user/{id}")
    public String getMetodo(@PathVariable int id) {
        StringBuilder sb = new StringBuilder();
        for (Greeting g: listaUsuarios){
            if(g.getId()==id){
                sb.append(g.getId());
                sb.append(", ");
                sb.append(g.getContenido());
            }
        }
        return sb+"";
    }

    @PutMapping("/actualiza/{id}")
    @RequestMapping(value = "/actualiza/{id}", method = RequestMethod.PUT, consumes = "application/json")
    public String actualizar(@PathVariable int id, @RequestBody Greeting gret){
        Greeting gret1=null;
        int aux=0;
        int pos=0;
        for(Greeting g: listaUsuarios){
            if(g.getId()==id){
                gret1=g;
                aux=pos;
            }
            pos++;
        }

        gret1.setContenido(gret.getContenido());

        listaUsuarios.remove(aux);
        listaUsuarios.add(aux, gret1);

        return "OK";
    }

}
