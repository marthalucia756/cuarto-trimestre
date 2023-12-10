/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Volumen;

/**
 *
 * @author JuanDa
 */
public class Cubo extends Volumen {
    public Double lado;

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
    
    @Override
    public Double Volumen(){
        double volumen;
        volumen=(Math.pow(this.getLado(), 3));
        this.setVolumen(volumen);
        return this.getVolumen();
    }
}
