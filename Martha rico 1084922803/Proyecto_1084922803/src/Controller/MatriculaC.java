/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Entity.Matricula;

public class MatriculaC {
    
    public void Agregar(Integer numPeriodo, String periodo, Integer idEstudiante, Integer idMateria){
        Matricula st = new Matricula();
        st.setNumPeriodo(numPeriodo);
        st.setPeriodo(periodo);
        st.setIdEstudiante(idEstudiante);
        st.setIdMateria(idMateria);
        st.Agregar();
    }
    
    public void Modificar(Integer id, Integer numPeriodo, String periodo, Integer idEstudiante, Integer idMateria){
        Matricula st = new Matricula();
        st.setId(id);
        st.setNumPeriodo(numPeriodo);
        st.setPeriodo(periodo);
        st.setIdEstudiante(idEstudiante);
        st.setIdMateria(idMateria);
        st.Modificar();
    }
    
    public void Eliminar(Integer id){
        Matricula st = new Matricula();
        st.setId(id);
        st.Eliminar();
    }
    
}
