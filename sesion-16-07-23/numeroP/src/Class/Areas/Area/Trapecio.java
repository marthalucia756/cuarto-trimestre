/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Areas.Area;

/**
 *
 * @author JuanDa
 */
public class Trapecio extends Area {
    public Double baseM, baseMe, altura;

    public Double getBaseM() {
        return baseM;
    }

    public void setBaseM(Double baseM) {
        this.baseM = baseM;
    }

    public Double getBaseMe() {
        return baseMe;
    }

    public void setBaseMe(Double baseMe) {
        this.baseMe = baseMe;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    @Override
    public Double Area(){
        double area;
        area=((this.getBaseM()+this.getBaseMe())*this.getAltura()/2);
        this.setArea(area);
        return this.getArea();
    }
    
}
