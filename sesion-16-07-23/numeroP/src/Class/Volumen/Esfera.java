/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Volumen;

/**
 *
 * @author JuanDa
 */
public class Esfera extends Volumen{
    public Double radio;

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    
    @Override
    public Double Volumen(){
        double volumen;
        volumen= (4.0/3.0)*Math.PI*Math.pow(this.getRadio(), 3);
        this.setVolumen(volumen);
        return this.getVolumen();
    }
    
}
