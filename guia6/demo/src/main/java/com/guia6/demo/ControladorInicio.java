import com.guia6.model;
import com.guia6.model.Usuario;

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
        Usuario u = new Usuario();
        u.setCedula("28288282");
        u.setClave("16171");
        u.setNombre("Leidi");
        u.setEmail("leidi@gmail.com");
        modelo.addAttribute("mensaje", mensaje);
        modelo.addAttribute("dato", dato);
        modelo.addAttribute("alguien", u);
        log.info("Ejecutando controlador inicio MVC");
        return "index";
    }
}
