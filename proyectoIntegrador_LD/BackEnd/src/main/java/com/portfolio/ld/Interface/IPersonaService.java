package com.portfolio.ld.Interface;

import com.portfolio.ld.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    public List <Persona> getPersona();
    
    //guardar objeto de tipo persona 
    
    public void savePersona(Persona persona);
    
    //borrar objeto
    
   public void deletePerosna(long id);
   
   //buscar una persona por id 
   
   public Persona FindPersona(long id);
}
