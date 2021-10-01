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


public class Duenio {

    
    
    private int id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String localidad;
    private String telefono;
    private String facebook;

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    
    public Duenio(int id, String nombre, String apellido, String direccion, String localidad, String telefono, String facebook) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.localidad = localidad;
        this.telefono = telefono;
        this.facebook = facebook;
    }
    
    public Duenio() {
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
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Get the value of apellido
     *
     * @return the value of apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Set the value of apellido
     *
     * @param apellido new value of apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Get the value of direccion
     *
     * @return the value of direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Set the value of direccion
     *
     * @param direccion new value of direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Get the value of localidad
     *
     * @return the value of localidad
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * Set the value of localidad
     *
     * @param localidad new value of localidad
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * Get the value of telefono
     *
     * @return the value of telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Set the value of telefono
     *
     * @param telefono new value of telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Get the value of facebook
     *
     * @return the value of facebook
     */
    public String getFacebook() {
        return facebook;
    }

    /**
     * Set the value of facebook
     *
     * @param facebook new value of facebook
     */
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }
    
    // </editor-fold>
    
    public static ArrayList<Duenio> getDuenios() throws SQLException, Exception{
        try{
            
            ArrayList<Duenio> duenios = new ArrayList<Duenio>();
            Ejecutar ej = new Ejecutar();
            ResultSet rs = ej.consulta("select id, nombre, apellido, direccion, localidad, telefono, facebook from duenio");
            try{
                while(rs.next()) {
                    Duenio d = new Duenio();
                    d.setId(rs.getInt("id"));
                    d.setNombre(rs.getString("nombre"));
                    d.setApellido(rs.getString("apellido"));
                    d.setDireccion(rs.getString("direccion"));
                    d.setLocalidad(rs.getString("localidad"));
                    d.setFacebook(rs.getString("facebook"));
                    d.setTelefono(rs.getString("telefono"));
                    
                    duenios.add(d);
                }
            }
            catch(SQLException sqlEx){
                throw sqlEx;
            }
            return duenios;
            
            }
        catch(ClassNotFoundException | SQLException ex){
            throw ex;
        }
    }
    public static Duenio getDuenioId(int id) throws SQLException, Exception{
        try{
            
            Duenio d = new Duenio();
            Ejecutar ej = new Ejecutar();
            ResultSet rs = ej.consulta("select id, nombre from estado where id ="+id);
            try{
                while(rs.next()) {
                    d.setId(rs.getInt("id"));
                    d.setNombre(rs.getString("nombre"));
                    d.setApellido(rs.getString("apellido"));
                    d.setDireccion(rs.getString("direccion"));
                    d.setLocalidad(rs.getString("localidad"));
                    d.setFacebook(rs.getString("facebook"));
                    d.setTelefono(rs.getString("telefono"));
                    
                }
            }
            catch(SQLException sqlEx){
                throw sqlEx;
            }
            return d;
            
            }
        catch(ClassNotFoundException | SQLException ex){
            throw ex;
        }
    }
    public static ArrayList<Duenio> getDuenios(Duenio du) throws ClassNotFoundException, SQLException{
        try{
            ArrayList<Duenio> duenios = new ArrayList<Duenio>();
            String nombre, apellido;
            Ejecutar ej = new Ejecutar();
            if(du.getNombre().equals("")){
                nombre = "";
            }
            else{
                nombre = "nombre = '"+du.getNombre()+"'";
            }
            if(du.getApellido().equals("")){
                apellido = "";
            }
            else{
                if(!(du.getNombre().equals(""))){
                    apellido = " and apellido = '"+du.getApellido()+"'";
                }
                else
                    apellido = "apellido = '"+du.getApellido()+"'";
            }
            ResultSet rs = ej.consulta("select id, nombre, apellido, direccion from duenio where "+nombre+apellido);
            try{
                while(rs.next()) {
                    Duenio d = new Duenio();
                    d.setId(rs.getInt("id"));
                    d.setNombre(rs.getString("nombre"));
                    d.setApellido(rs.getString("apellido"));
                    d.setDireccion(rs.getString("direccion"));
                    
                    duenios.add(d);
                }
            }
            catch(SQLException sqlEx){
                throw sqlEx;
            }
            return duenios;
            
            }
        catch(ClassNotFoundException | SQLException ex){
            throw ex;
        }
    }
    public static String createDuenio(Duenio de) throws ClassNotFoundException{
        String mensaje = "";
        String facebook = "";
        String vFb = "";
        String telefono = "";
        String vTel = "";
        if (!(de.getFacebook() == null)){
            facebook += ",`facebook`";
            vFb = ", '"+de.getFacebook()+"'";
           
        }
        if (!(de.getTelefono() == null)){
            telefono += ",`telefono`";
            vTel = ",'"+de.getTelefono()+"'";
        }
        Ejecutar ej = new Ejecutar();
        mensaje = ej.peticion("insert into duenio(`nombre`,`apellido`,`direccion`,`localidad`"+telefono+""+facebook+") "
                + "values('"+de.getNombre()+"','"+de.getApellido()+"','"+de.getDireccion()+"','"+de.getLocalidad()+"'"+vTel+""+vFb+")");
        return mensaje;
    }
    public static String updateDuenio(Duenio e) throws ClassNotFoundException{
        String mensaje = "";
        Ejecutar ej = new Ejecutar();
        mensaje = ej.peticion("update estado set `nombre` = '"+e.getNombre()+"' where id ="+e.getId());
        return mensaje;
    }
    
    
    
    public static String deleteDuenio(int id) throws Exception{
        try{
            
            Duenio d = new Duenio();
            Ejecutar ej = new Ejecutar();
            String mensaje = ej.peticion("delete from duenio where id ="+id);
            
            return mensaje;
            
            }
        catch(Exception ex){
            throw ex;
        }
    }
}


