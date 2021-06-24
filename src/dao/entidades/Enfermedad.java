package dao.entidades;

/**
 *
 * @author Zelbag
 */
public class Enfermedad {
    
    private int id;
    private String nombre;
    private String tratamiento;

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    
    public Enfermedad() {
    }

    public Enfermedad(int id, String nombre, String tratamiento) {
        this.id = id;
        this.nombre = nombre;
        this.tratamiento = tratamiento;
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
     * Get the value of Name
     *
     * @return the value of Name
     */
    public String getName() {
        return nombre;
    }

    /**
     * Set the value of Name
     *
     * @param Name new value of Name
     */
    public void setName(String Name) {
        this.nombre = Name;
    }
    /**
     * Get the value of tratamiento
     *
     * @return the value of tratamiento
     */
    public String getTratamiento() {
        return tratamiento;
    }

    /**
     * Set the value of tratamiento
     *
     * @param tratamiento new value of tratamiento
     */
    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

// </editor-fold> 
}
