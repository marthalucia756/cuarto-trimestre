/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Entity;

import Model.Interface.Accion;
import Conexion.Conexion;

public class Materia implements Accion{
    
    private Integer id;
    private String descripcion;
    private String profesor;
    private Double nota1;
    private Double nota2;
    private Double nota3;
    private Double promedio;
    private Integer idEstudiante;
    Conexion conn = new Conexion();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public Integer getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
    

    @Override
    public void Agregar() {
        String sql;
        sql = "INSERT INTO materia ("
                + "descripcion, "
                + "profesor, "
                + "nota1, "
                + "nota2, "
                + "nota3, "
                + "promedio "
                + "id_estudiante "
                + ") VALUES ("
                + "' " + this.getDescripcion() + "', "
                + "' " + this.getProfesor() + "', "
                + " " + this.getNota1() + ", "
                + " " + this.getNota2() + ", "
                + " " + this.getNota3() + ", "
                + " " + this.getPromedio() + ", "
                + " " + this.getIdEstudiante() + " "
                + ");";
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();
    }

    @Override
    public void Modificar() {
        String sql;
        sql = "UPDATE materia SET "
                + "id = '" + this.getId() + "', "
                + "descripcion = '" + this.getDescripcion() + "', "
                + "profesor = '" + this.getProfesor() + "', "
                + "nota1 = " + this.getNota1() + ", "
                + "nota2 = " + this.getNota2() + ", "
                + "nota3 = " + this.getNota3() + ", "
                + "promedio = " + this.getPromedio() + ", "
                + "id_estudiante = " + this.getIdEstudiante() + " "
                + "WHERE id = '" + this.getId() + "';";
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();
    }

    @Override
    public void Eliminar() {
        String sql;
        sql = "DELETE FROM materia "
                + "WHERE id = '" + this.getId() + "';";
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();
    }

    @Override
    public Object Consultar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
