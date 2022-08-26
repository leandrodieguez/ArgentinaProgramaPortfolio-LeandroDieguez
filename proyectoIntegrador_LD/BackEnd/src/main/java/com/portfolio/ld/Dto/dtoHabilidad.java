package com.portfolio.ld.Dto;

import javax.validation.constraints.NotBlank;


public class dtoHabilidad {
    @NotBlank
    private String nombreH;
    @NotBlank
    private int nivelH;

    public dtoHabilidad() {
    }

    public dtoHabilidad(String nombreH, int nivelH) {
        this.nombreH = nombreH;
        this.nivelH = nivelH;
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

    public void setNivelH(int nivelH) {
        this.nivelH = nivelH;
    }
    
    
    
}