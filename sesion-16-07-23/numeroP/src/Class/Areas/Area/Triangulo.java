/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Areas.Area;

/**
 *
 * @author JuanDa
 */
public class Triangulo extends Area{
    public Double base;
    public Double altura;

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    @Override
    public Double Area(){
       
        this.setArea((this.getBase()*this.getAltura())/2);
       
        return this.getArea();
    }
}
