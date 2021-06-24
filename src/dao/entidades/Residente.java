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
public class Residente extends Pensionado{
    private int id_pensionado;
    private Timestamp egreso;

    // <editor-fold defaultstate="collapsed" desc="Constructors">  
    
    public Residente(int id, int id_pensionado, Timestamp string,int id_duenio, int id_perro, String nombre, byte edad, int id_raza, Timestamp ingreso, boolean sexo, boolean castrado, boolean desparacitado, boolean vacuna, boolean antirrabica) {
        super(id, id_duenio, id_perro, nombre, edad, id_raza, ingreso, sexo, castrado, desparacitado, vacuna, antirrabica);
        
        this.id_pensionado = id_pensionado;
        this.egreso = string;
    }

    public Residente() {
    }
    
    // </editor-fold>  

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">  
    
    
    /**
     * Get the value of id_pensionado
     *
     * @return the value of id_pensionado
     */
    public int getId_pensionado() {
        return id_pensionado;
    }

    /**
     * Set the value of id_pensionado
     *
     * @param id_pensionado new value of id_pensionado
     */
    public void setId_pensionado(int id_pensionado) {
        this.id_pensionado = id_pensionado;
    }


    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public Timestamp getEgresoS() {
        return egreso;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setEgreso(Timestamp string) {
        this.egreso = string;
    }

    // </editor-fold>
}
