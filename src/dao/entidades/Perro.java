package dao.entidades;

import java.sql.Timestamp;

/**
 *
 * @author Zelbag
 */
public class Perro {
    
    private int id;

    private String nombre;
    private byte edad;
    private int id_raza;
    private Timestamp ingreso;
    private boolean sexo;
    private boolean castrado;
    private boolean desparacitado;
    private boolean vacuna;
    private boolean antirrabica;
    
    
    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public Perro() {
    }

    public Perro(int id, String nombre, byte edad, int id_raza, Timestamp ingreso, boolean sexo, boolean castrado, boolean desparacitado, boolean vacuna, boolean antirrabica) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.id_raza = id_raza;
        this.ingreso = ingreso;
        this.sexo = sexo;
        this.castrado = castrado;
        this.desparacitado = desparacitado;
        this.vacuna = vacuna;
        this.antirrabica = antirrabica;
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
     * Get the value of string
     *
     * @return the value of string
     */
    public Timestamp getString() {
        return ingreso;
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

    
    // </editor-fold>
}
