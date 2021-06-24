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
public class EnfermedadPerro {
    
    private int id;
    private int id_enfermedad;
    private int id_perro;

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    
    public EnfermedadPerro() {
    }

    public EnfermedadPerro(int id, int id_enfermedad, int id_perro) {
        this.id = id;
        this.id_enfermedad = id_enfermedad;
        this.id_perro = id_perro;
    }

    // </editor-fold>
    
    
    // <editor-fold defaultstate="collapsed" desc="Getters & Setters">
      
    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Get the value of id_enfermedad
     *
     * @return the value of id_enfermedad
     */
    public int getId_enfermedad() {
        return id_enfermedad;
    }

    /**
     * Set the value of id_enfermedad
     *
     * @param id_enfermedad new value of id_enfermedad
     */
    public void setId_enfermedad(int id_enfermedad) {
        this.id_enfermedad = id_enfermedad;
    }


    /**
     * Get the value of id_perro
     *
     * @return the value of id_perro
     */
    public int getId_perro() {
        return id_perro;
    }

    /**
     * Set the value of id_perro
     *
     * @param id_perro new value of id_perro
     */
    public void setId_perro(int id_perro) {
        this.id_perro = id_perro;
    }
    
    // </editor-fold>

}
