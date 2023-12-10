/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Areas.Area;

/**
 *
 * @author JuanDa
 */
public class Cubo extends Area{
    public Double lado;

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
    
    @Override
    public Double Area(){
        double area=(Math.pow(this.getLado(), 3));;
        area=(Math.pow(this.getLado(), 3));
        this.setArea(area);
        return this.getArea();
    }
}
