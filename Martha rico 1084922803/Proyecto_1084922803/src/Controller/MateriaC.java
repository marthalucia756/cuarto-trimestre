/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Entity.Materia;

public class MateriaC {
    
    public void Agregar(String descripcion, String profesor, Double nota1, Double nota2, Double nota3, Double promedio, Integer idEstudiante){
        Materia st = new Materia();
        st.setDescripcion(descripcion);
        st.setProfesor(profesor);
        st.setNota1(nota1);
        st.setNota2(nota2);
        st.setNota3(nota3);
        promedio = (nota1 + nota2 + nota3) / 3;
        st.setPromedio(promedio);
        st.setIdEstudiante(idEstudiante);
        st.Agregar();
    }
    
    public void Modificar(Integer id, String descripcion, String profesor, Double nota1, Double nota2, Double nota3, Double promedio, Integer idEstudiante){
        Materia st = new Materia();
        st.setId(id);
        st.setDescripcion(descripcion);
        st.setProfesor(profesor);
        st.setNota1(nota1);
        st.setNota2(nota2);
        st.setNota3(nota3);
        promedio = (nota1 + nota2 + nota3) / 3;
        st.setPromedio(promedio);
        st.setIdEstudiante(idEstudiante);
        st.Modificar();
    }
    
    public void Eliminar(Integer id){
        Materia st = new Materia();
        st.setId(id);
        st.Eliminar();
    }
    
}
