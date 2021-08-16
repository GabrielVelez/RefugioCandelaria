/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Leirbag
 */
public class Ejecutar {
    private ConexionBD conectar;
    private Connection conexion;
    private Statement stmt = null;
    
    public ResultSet consulta(String query) throws SQLException, ClassNotFoundException{
        conectar = new ConexionBD();
        conexion = conectar.conexion();
        ResultSet res = null;
        if(conexion != null){
            try{
                stmt = conexion.createStatement();
                res = stmt.executeQuery(query);
                return res;
            }
            catch(SQLException ex){
                throw ex;
            }
        }
        return res;
    }
    
    public String peticion(String query) throws ClassNotFoundException{
        conectar = new ConexionBD();
        conexion = conectar.conexion();
        if(conexion != null){
            try{
                stmt = conexion.createStatement();
                stmt.executeUpdate(query);
                
                
            }
            catch(SQLException ex){
                try{
                    if(stmt == null)
                        conexion.rollback();
                    return "Falló en la actualización";
                }
                catch(SQLException se){
                    return "Rollback realizado";
                }
            }
        }
        
        return "";
    }
}
