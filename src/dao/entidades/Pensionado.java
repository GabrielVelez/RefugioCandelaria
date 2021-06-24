/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.entidades;

import java.sql.Timestamp;

/**
 *
 * @author Zelbag
 */
public class Pensionado extends Perro {
    
    private int id_duenio;
    private int id_perro;

    // <editor-fold defaultstate="collapsed" desc="Constructors">  
    
    public Pensionado() {
    }

    public Pensionado(int id, int id_duenio, int id_perro) {
        
        this.id_duenio = id_duenio;
        this.id_perro = id_perro;
    }

    public Pensionado(int id, int id_duenio, int id_perro, String nombre, byte edad, int id_raza, Timestamp ingreso, boolean sexo, boolean castrado, boolean desparacitado, boolean vacuna, boolean antirrabica) {
        super(id, nombre, edad, id_raza, ingreso, sexo, castrado, desparacitado, vacuna, antirrabica);
        
        this.id_duenio = id_duenio;
        this.id_perro = id_perro;
    }
    
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters & Setters">
    
    /**
     * Get the value of id_duenio
     *
     * @return the value of id_duenio
     */
    public int getId_duenio() {
        return id_duenio;
    }

    /**
     * Set the value of id_duenio
     *
     * @param id_duenio new value of id_duenio
     */
    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
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
