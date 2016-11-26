/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

/**
 *
 * @author osocron
 */
public class Catalogo {
     private Integer idCatalogo;
    private String nombre;
    private Integer idTipo;
    private Integer orden;
    
    public Catalogo(){}

    public Catalogo(Integer idCatalogo, String nombre, Integer idTipo, Integer orden) {
        this.idCatalogo = idCatalogo;
        this.nombre = nombre;
        this.idTipo = idTipo;
        this.orden = orden;
    }

    public Integer getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(Integer idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }
}
