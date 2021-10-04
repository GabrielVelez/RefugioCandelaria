package dao.entidades;

import dao.Ejecutar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Zelbag
 */
public class Perro {
    
    private int id;

    private String nombre;
    private byte edad;
    private int id_raza;
    private Date ingresado;
    private boolean sexo;
    private boolean castrado;
    private boolean desparacitado;
    private boolean vacuna;
    private boolean antirrabica;
    private boolean adopcion;
    private Integer id_duenio;
    private int id_estado;
    private Date egreso;
    private ArrayList<Enfermedad> enfermedades;
    
    
    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public Perro() {
    }
    public Perro(int id, String nombre, byte edad, int id_raza, Date ingresado, boolean sexo,
            boolean castrado, boolean desparacitado, boolean vacuna, boolean antirrabica,
            boolean adopcion, int id_duenio, Date egreso, int id_estado) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.id_raza = id_raza;
        this.ingresado = ingresado;
        this.sexo = sexo;
        this.castrado = castrado;
        this.desparacitado = desparacitado;
        this.vacuna = vacuna;
        this.antirrabica = antirrabica;
        this.adopcion = adopcion;
        this.id_duenio = id_duenio;
        this.egreso = egreso;
        this.id_estado = id_estado;
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
     * Get the value of edad
     *
     * @return the value of edad
     */
    public byte getEdad() {
        return edad;
    }

    /**
     * Set the value of edad
     *
     * @param edad new value of edad
     */
    public void setEdad(byte edad) {
        this.edad = edad;
    }

    /**
     * Get the value of id_raza
     *
     * @return the value of id_raza
     */
    public int getId_raza() {
        return id_raza;
    }

    /**
     * Set the value of id_raza
     *
     * @param id_raza new value of id_raza
     */
    public void setId_raza(int id_raza) {
        this.id_raza = id_raza;
    }

    /**
     * Get the value of sexo
     *
     * @return the value of sexo
     */
    public boolean isSexo() {
        return sexo;
    }

    /**
     * Set the value of sexo
     *
     * @param sexo new value of sexo
     */
    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    /**
     * Get the value of castrado
     *
     * @return the value of castrado
     */
    public boolean isCastrado() {
        return castrado;
    }

    /**
     * Set the value of castrado
     *
     * @param castrado new value of castrado
     */
    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    /**
     * Get the value of desparacitado
     *
     * @return the value of desparacitado
     */
    public boolean isDesparacitado() {
        return desparacitado;
    }

    /**
     * Set the value of desparacitado
     *
     * @param desparacitado new value of desparacitado
     */
    public void setDesparacitado(boolean desparacitado) {
        this.desparacitado = desparacitado;
    }

    /**
     * Get the value of vacuna
     *
     * @return the value of vacuna
     */
    public boolean isVacuna() {
        return vacuna;
    }

    /**
     * Set the value of vacuna
     *
     * @param vacuna new value of vacuna
     */
    public void setVacuna(boolean vacuna) {
        this.vacuna = vacuna;
    }

    /**
     * Get the value of antirrabica
     *
     * @return the value of antirrabica
     */
    public boolean isAntirrabica() {
        return antirrabica;
    }

    /**
     * Set the value of antirrabica
     *
     * @param antirrabica new value of antirrabica
     */
    public void setAntirrabica(boolean antirrabica) {
        this.antirrabica = antirrabica;
    }

    
    public Date getIngresado() {
        return ingresado;
    }

    public void setIngresado(Date ingresado) {
        this.ingresado = ingresado;
    }

    public boolean isAdopcion() {
        return adopcion;
    }

    public void setAdopcion(boolean adopcion) {
        this.adopcion = adopcion;
    }

    public Integer getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(Integer id_duenio) {
        this.id_duenio = id_duenio;
    }

    public Date getEgreso() {
        return egreso;
    }

    public void setEgreso(Date egreso) {
        this.egreso = egreso;
    }
    public ArrayList<Enfermedad> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(ArrayList<Enfermedad> enfermedades) {
        this.enfermedades = enfermedades;
    }
    
    public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }
    
    // </editor-fold>

    
    
    
    public static ArrayList<Perro> getPerros() throws SQLException, Exception{
        try{
            
            ArrayList<Perro> perros = new ArrayList<Perro>();
            Ejecutar ej = new Ejecutar();
            ResultSet rs = ej.consulta("select id, nombre, edad, ingresado, "
                                     + "id_raza, sexo, castrado, desparacitado, "
                                     + "vacuna, antirrabica, adoptado "
                                     + "from perro");
            try{
                while(rs.next()) {
                    Perro p = new Perro();
                    p.setId(rs.getInt("id"));
                    p.setNombre(rs.getString("nombre"));
                    p.setEdad(rs.getByte("edad"));
                    p.setIngresado(rs.getDate("ingresado"));
                    p.setId_raza(rs.getInt("id_raza"));
                    p.setSexo(rs.getBoolean("sexo"));
                    p.setCastrado(rs.getBoolean("castrado"));
                    p.setDesparacitado(rs.getBoolean("desparacitado"));
                    p.setVacuna(rs.getBoolean("vacuna"));
                    p.setAntirrabica(rs.getBoolean("antirrabica"));
                    p.setAdopcion(rs.getBoolean("adoptado"));
                    perros.add(p);
                }
            }
            catch(SQLException sqlEx){
                throw sqlEx;
            }           
            
            return perros;
            
            }
        catch(ClassNotFoundException | SQLException ex){
            throw ex;
        }
    }

    public static ArrayList<Perro> getPerroId(int id) throws SQLException, Exception{
        try{
            
            ArrayList<Perro> perros = new ArrayList<Perro>();
            Ejecutar ej = new Ejecutar();
            ResultSet rs = ej.consulta("select id, nombre, edad, ingresado, "
                                     + "id_raza, sexo, castrado, desparacitado, "
                                     + "vacuna, antirrabica, adoptado "
                                     + "from perro "
                                     + "where id ="+id);
            try{
                while(rs.next()) {
                    Perro p = new Perro();
                    p.setId(rs.getInt("id"));
                    p.setNombre(rs.getString("nombre"));
                    p.setEdad(rs.getByte("edad"));
                    p.setIngresado(rs.getDate("ingresado"));
                    p.setId_raza(rs.getInt("id_raza"));
                    p.setSexo(rs.getBoolean("sexo"));
                    p.setCastrado(rs.getBoolean("castrado"));
                    p.setDesparacitado(rs.getBoolean("desparacitado"));
                    p.setVacuna(rs.getBoolean("vacuna"));
                    p.setAntirrabica(rs.getBoolean("antirrabica"));
                    p.setAdopcion(rs.getBoolean("adoptado"));
                    perros.add(p);
                }
            }
            catch(SQLException sqlEx){
                throw sqlEx;
            }           
            
            return perros;
            
            }
        catch(ClassNotFoundException | SQLException ex){
            throw ex;
        }
    }
    
    public static String createPerro(Perro pe) throws ClassNotFoundException{
        String mensaje = "";
        int year = pe.getIngresado().getYear() + 1900;
        int month = pe.getIngresado().getMonth() +1;
        int  day = pe.getIngresado().getDate();
        String query = "insert into perro(`nombre`,`edad`,`id_raza`,`ingresado`,`id_estado`,`sexo`,`castrado`,`desparacitado`,`vacuna`,`antirrabica`,`adoptado`";
        
        if(pe.getEgreso()!= null){
            query += ",`egreso`";
        }
        if(pe.getId_duenio()!= null){
            query += ",`id_duenio`";
        }
        query += ") "
                + "values('"+pe.getNombre()+"',"+pe.getEdad()+","+pe.getId_raza()+",'"+year+"-"+month+"-"+day+"',"+pe.getId_estado();
        
        
        if(pe.isSexo()){
            query += ", 1";
        }
        else{
            query += ", 0";
        }
        if(pe.isCastrado()){
            query += ", 1";
        }
        else{
            query += ", 0";
        }
        if(pe.isDesparacitado()){
            query += ", 1";
        }
        else{
            query += ", 0";
        }
        if(pe.isVacuna()){
            query += ", 1";
        }
        else{
            query += ", 0";
        }
        if(pe.isAntirrabica()){
            query += ", 1";
        }
        else{
            query += ", 0";
        }
        if(pe.isAdopcion()){
            query += ", 1";
        }
        else{
            query += ", 0";
        }
        if(pe.getEgreso()!= null){
            year = pe.getEgreso().getYear() + 1900;
            month = pe.getEgreso().getMonth() +1;
            day = pe.getEgreso().getDate();
            query += ", '"+year+"-"+month+"-"+day+"'";
        }
        if(pe.getId_duenio()!= null){
            query += ",`"+pe.getId_duenio()+"`";
        }
        query  += ")";
        
        Ejecutar ej = new Ejecutar();
        mensaje = ej.peticion(query);
        return mensaje;
    }
    public static String deletePerro(int id) throws Exception{
        try{
            
            Perro p = new Perro();
            Ejecutar ej = new Ejecutar();
            String mensaje = ej.peticion("delete from perro where id ="+id);
            
            return mensaje;
            
            }
        catch(Exception ex){
            throw ex;
        }
    }
}
