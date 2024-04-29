import com.guia6.model;
package com.guia6.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.value;
import org.springframework.web.bind.stereotype.Controller;
import org.springframework.ui.model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {
    @value("${index.mensaje}")
    String dato;
    @GetMapping("/")
    public String inicio (Model modelo){
        String mensaje = "Saludos desde sping MVC";
        modelo.addAttribute("mensaje", mensaje);
        modelo.addAttribute("dato", dato);
        log.info("Ejecutando controlador inicio MVC");
        return "index";
    }
}
