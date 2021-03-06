
package com.portfolio.ld.Service;

import com.portfolio.ld.Entity.Persona;
import com.portfolio.ld.Interface.IPersonaService;
import com.portfolio.ld.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    
    @Autowired IPersonaRepository ipersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
        List <Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletePerosna(long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona FindPersona(long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    }
    
}
