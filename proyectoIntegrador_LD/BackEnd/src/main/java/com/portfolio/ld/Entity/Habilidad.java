package com.portfolio.ld.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreH;
    private int nivelH;

    public Habilidad() {
    }

    public Habilidad(String nombreH, int nivelH) {
        this.nombreH = nombreH;
        this.nivelH = nivelH;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreH() {
        return nombreH;
    }

    public void setNombreH(String nombreH) {
        this.nombreH = nombreH;
    }

    public int getNivelH() {
        return nivelH;
    }

    public void setNivelH(int descripcionE) {
        this.nivelH = nivelH;
    }
    
    
}