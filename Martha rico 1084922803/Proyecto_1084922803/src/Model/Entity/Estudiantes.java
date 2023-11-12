package Model.Entity;

import Model.Interface.Accion;
import Conexion.Conexion;

public class Estudiantes implements Accion{
    
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer grado;
    private Integer numId;
    private Integer edad;
    Conexion conn = new Conexion();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getGrado() {
        return grado;
    }

    public void setGrado(Integer grado) {
        this.grado = grado;
    }

    public Integer getNumId() {
        return numId;
    }

    public void setNumId(Integer numId) {
        this.numId = numId;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public void Agregar() {
        String sql;
        sql = "INSERT INTO estudiantes ("
                + "nombre, "
                + "apellido, "
                + "grado, "
                + "num_identificacion, "
                + "edad "
                + ") VALUES ("
                + "' " + this.getNombre() + "', "
                + "' " + this.getApellido() + "', "
                + " " + this.getGrado() + ", "
                + " " + this.getNumId() + ", "
                + " " + this.getEdad() + " "
                + ");";
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();
    }

    @Override
    public void Modificar() {
        String sql;
        sql = "UPDATE estudiantes SET "
                + "id = '" + this.getId() + "', "
                + "nombre = '" + this.getNombre() + "', "
                + "apellido = '" + this.getApellido() + "', "
                + "grado = " + this.getGrado() + ", "
                + "num_identificacion = " + this.getNumId() + ", "
                + "edad = " + this.getEdad() + " "
                + "WHERE id = '" + this.getId() + "';";
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();
    }

    @Override
    public void Eliminar() {
        String sql;
        sql = "DELETE FROM estudiantes "
                + "WHERE id = '" + this.getId() + "';";
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();
    }

    @Override
    public Object Consultar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
