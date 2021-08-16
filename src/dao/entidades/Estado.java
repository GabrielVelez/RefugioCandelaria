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
public class Estado {
    
    private int id;
    private String nombre;

    
    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public Estado(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public Estado() {
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
 
    /**
     *
     * trae todas la lista de estados
     */
    public static ArrayList<Estado> getEstados() throws SQLException, Exception{
        try{
            
            ArrayList<Estado> estados = new ArrayList<Estado>();
            Ejecutar ej = new Ejecutar();
            ResultSet rs = ej.consulta("select id, nombre from estado");
            try{
                while(rs.next()) {
                    Estado e = new Estado();
                    e.setId(rs.getInt("id"));
                    e.setNombre(rs.getString("nombre"));
                    estados.add(e);
                }
            }
            catch(SQLException sqlEx){
                throw sqlEx;
            }
            return estados;
            
            }
        catch(ClassNotFoundException | SQLException ex){
            throw ex;
        }
    }
    
    /**
     *
     * Trae estado por id
     */
    public static Estado getEstadoId(int id) throws SQLException, Exception{
        try{
            Estado e = new Estado();
            Ejecutar ej = new Ejecutar();
            ResultSet rs = ej.consulta("select id, nombre from estado where id ="+id);
            try{
                while(rs.next()) {
                    e.setId(rs.getInt("id"));
                    e.setNombre(rs.getString("nombre"));
                }
            }
            catch(SQLException sqlEx){
                throw sqlEx;
            }
            return e;
            
            }
        catch(ClassNotFoundException | SQLException ex){
            throw ex;
        }
    }
    
    public static String createEstado(String nombre) throws ClassNotFoundException{
        String mensaje = "";
        Ejecutar ej = new Ejecutar();
        mensaje = ej.peticion("insert into estado(`nombre`) values('"+nombre+"')");
        return mensaje;
    }
    public static String createEstado(Estado es) throws ClassNotFoundException{
        String mensaje = "";
        Ejecutar ej = new Ejecutar();
        mensaje = ej.peticion("insert into estado(`nombre`) values('"+es.nombre+"')");
        return mensaje;
    }
    
    public static String updateEstado(Estado e) throws ClassNotFoundException{
        String mensaje = "";
        Ejecutar ej = new Ejecutar();
        mensaje = ej.peticion("update estado set `nombre` = '"+e.getNombre()+"' where id ="+e.getId());
        return mensaje;
    }
}
