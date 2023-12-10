/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Volumen;

/**
 *
 * @author JuanDa
 */
public class Cono extends Volumen {
    public Double altura;
    public Double radio;

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    
    @Override 
    public Double Volumen(){
        double volumen;
        volumen= ((1/3)*Math.PI*Math.pow(radio, 2)*altura);
        this.setVolumen(volumen);
        return this.getVolumen();
    }
}
