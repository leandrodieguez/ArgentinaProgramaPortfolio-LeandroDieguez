package com.portfolio.ld.Dto;

import javax.validation.constraints.NotBlank;


public class dtoProyecto {
    @NotBlank
    private String nombreP;
     @NotBlank
    private String descripcionP;
     @NotBlank
    private String imgP;
     @NotBlank
    private String link;

    public dtoProyecto() {
    }

    public dtoProyecto(String nombreP, String descripcionP, String imgP, String link) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.imgP = imgP;
        this.link = link;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public String getImgP() {
        return imgP;
    }

    public void setImgP(String imgP) {
        this.imgP = imgP;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    
    
    
}
