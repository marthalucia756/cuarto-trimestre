/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

/**
 *
 * @martha rico
 */
public class Configuracion {
    private String dbURL;
    private String username;
    private String password;

    public Configuracion() {
        this.dbURL = "jdbc:mysql://localhost:3306/notas";
        this.username = "root";
        this.password = "";
    }

    public String getDbURL() {
        return dbURL;c
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }   
    
}
