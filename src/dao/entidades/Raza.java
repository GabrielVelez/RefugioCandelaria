/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.entidades;

import dao.Ejecutar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Zelbag
 */
public class Raza {
    
    private int id;
    private String nombre;

    
    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public Raza(int id, String nombre) {
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
 
    
    public static ArrayList<Raza> getRazas() throws SQLException, Exception{
        try{
            
            ArrayList<Raza> razas = new ArrayList<Raza>();
            Ejecutar ej = new Ejecutar();
            ResultSet rs = ej.consulta("select id, nombre from raza");
            try{
                while(rs.next()) {
                    Raza r = new Raza();
                    r.setId(rs.getInt("id"));
                    r.setNombre(rs.getString("nombre"));
                    razas.add(r);
                }
            }
            catch(SQLException sqlEx){
                throw sqlEx;
            }
            return razas;
            
            }
        catch(ClassNotFoundException | SQLException ex){
            throw ex;
        }
    }
    public static Raza getRazaId(int id) throws SQLException, Exception{
        try{
            Raza r = new Raza();
            Ejecutar ej = new Ejecutar();
            ResultSet rs = ej.consulta("select id, nombre from raza where id ="+id);
            try{
                while(rs.next()) {
                    r.setId(rs.getInt("id"));
                    r.setNombre(rs.getString("nombre"));
                }
            }
            catch(SQLException sqlEx){
                throw sqlEx;
            }
            return r;
            
            }
        catch(ClassNotFoundException | SQLException ex){
            throw ex;
        }
    }
    
    public static String createRaza(String nombre) throws ClassNotFoundException{
        String mensaje = "";
        Ejecutar ej = new Ejecutar();
        mensaje = ej.peticion("insert into raza(`nombre`) values('"+nombre+"')");
        return mensaje;
    }
    public static String updateRaza(Raza r) throws ClassNotFoundException{
        String mensaje = "";
        Ejecutar ej = new Ejecutar();
        mensaje = ej.peticion("update raza set `nombre` = '"+r.getNombre()+"' where id ="+r.getId()+";");
        return mensaje;
    }
    
    
    public String toString() {
        return nombre; //NECESARIO PARA QUE EL COMBO BOX DETECTE EL NOMBRE Y NO LA DIRECCION DE MEMORIA DEL OBJETO//
    }
    
    public static String deleteRaza(int id) throws Exception{
        try{
            
            Raza r = new Raza();
            Ejecutar ej = new Ejecutar();
            String mensaje = ej.peticion("delete from raza where id ="+id);
            
            return mensaje;
            
            }
        catch(Exception ex){
            throw ex;
        }
    }
}
