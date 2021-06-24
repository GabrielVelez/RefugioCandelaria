/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.entidades;

/**
 *
 * @author Zelbag
 */
public class Raza {
    
    private String id;
    private String nombre;

    
    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public Raza(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public Raza() {
    }
// </editor-fold>
        
    // <editor-fold defaultstate="collapsed" desc="Getters & Setters">  

    
    
    
    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public String getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * Get the value of Nombre
     *
     * @return the value of Nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of Nombre
     *
     * @param Nombre new value of Nombre
     */
    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }
    
    
    // </editor-fold>
    
}
