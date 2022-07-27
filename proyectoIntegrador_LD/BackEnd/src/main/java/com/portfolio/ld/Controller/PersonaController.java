package com.portfolio.ld.Controller;

import com.portfolio.ld.Entity.Persona;
import com.portfolio.ld.Interface.IPersonaService;
import java.util.List;
import static org.hibernate.criterion.Projections.id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping("Personas/traer")
    public List<Persona> getPersona(){
    return ipersonaService.getPersona();
}
    
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona) {
        ipersonaService.savePersona(persona);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable long id) {
        ipersonaService.deletePerosna(id);
        return "La persona fue eliminada correctamente";
    }
    
    
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable long id,@RequestParam("nombre") String nuevoNombre,
                                                     @RequestParam("apellido") String nuevoApellido,
                                                     @RequestParam("img") String nuevoImg){
    Persona persona = ipersonaService.FindPersona(id);
    persona.setNombre(nuevoNombre);
    persona.setApellido(nuevoApellido);
    persona.setImg(nuevoImg);
    
    ipersonaService.savePersona(persona);
    return persona;
    }
    
    @GetMapping("/personas/traer/perfil")
    public Persona findPersona(){
     return ipersonaService.FindPersona((long)1);
    }
}
