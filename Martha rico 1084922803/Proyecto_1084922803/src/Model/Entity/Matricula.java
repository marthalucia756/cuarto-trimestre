/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Entity;

import Conexion.Conexion;
import Model.Interface.Accion;

public class Matricula implements Accion{
    
    private Integer id;
    private Integer numPeriodo;
    private String periodo;
    private Integer idEstudiante;
    private Integer idMateria;
    Conexion conn = new Conexion();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumPeriodo() {
        return numPeriodo;
    }

    public void setNumPeriodo(Integer numPeriodo) {
        this.numPeriodo = numPeriodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Integer getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }
    
    
    @Override
    public void Agregar() {
        String sql;
        sql = "INSERT INTO matricula ("
                + "num_periodo, "
                + "periodo "
                + "id_estudiante, "
                + "id_materia "
                + ") VALUES ("
                + " " + this.getNumPeriodo() + ", "
                + "' " + this.getPeriodo() + "' "
                + " " + this.getIdEstudiante() + ", "
                + " " + this.getIdMateria() + " "
                + ");";
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();
    }

    @Override
    public void Modificar() {
        String sql;
        sql = "UPDATE matricula SET "
                + "id = '" + this.getId() + "', "
                + "num_periodo = " + this.getNumPeriodo() + ", "
                + "periodo = '" + this.getPeriodo() + "' "
                + "id_estudiante = " + this.getIdEstudiante() + ", "
                + "id_materia = " + this.getIdMateria() + " "
                + "WHERE id = '" + this.getId() + "';";
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();
    }

    @Override
    public void Eliminar() {
        String sql;
        sql = "DELETE FROM matricula "
                + "WHERE id = '" + this.getId() + "';";
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();
    }

    @Override
    public Object Consultar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
