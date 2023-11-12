/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Entity.Estudiantes;

public class EstudianteC {
    
    public void Agregar(String nombre, String apellido, Integer grado, Integer numId, Integer edad){
        Estudiantes st = new Estudiantes();
        st.setNombre(nombre);
        st.setApellido(apellido);
        st.setGrado(grado);
        st.setNumId(numId);
        st.setEdad(edad);
        st.Agregar();
    }
    
    public void Modificar(Integer id, String nombre, String apellido, Integer grado, Integer numId, Integer edad){
        Estudiantes st = new Estudiantes();
        st.setId(id);
        st.setNombre(nombre);
        st.setApellido(apellido);
        st.setGrado(grado);
        st.setNumId(numId);
        st.setEdad(edad);
        st.Modificar();
    }
    
    public void Eliminar(Integer id){
        Estudiantes st = new Estudiantes();
        st.setId(id);
        st.Eliminar();
    }
    
}
