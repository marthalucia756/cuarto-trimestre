package FORMULAS;

import Utils.FunctionNumeric;
import Utils.FunctionString;

public class Formula extends FunctionNumeric {

    FunctionString fs = new FunctionString();
    private double Celsius;
    private double kelvin;
    private double Fahr;
    private double grados;

    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    public double getCelsius() {
        return Celsius;
    }

    public void setCelsius(double Celsius) {
        this.Celsius = Celsius;
    }

    public double getKelvin() {
        return kelvin;
    }

    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }

    public double getFahr() {
        return Fahr;
    }

    public void setFahr(double Fahr) {
        this.Fahr = Fahr;
    }

    public double calculateCF(String mensaje) {
        this.setFahr((this.getCelsius() * 1.8) + 32);
        return this.getFahr();
    }

    public double calcularCK(String mensaje) {
        this.setKelvin(this.getCelsius() + 273.15);
        return this.getKelvin();
    }

    public double CalcularFC(String mensaje) {
        this.setCelsius((this.getFahr() - 32) * 5 / 9);
        return this.getCelsius();
    }

    public double CalcularFK(String mensaje) {
        this.setKelvin((this.getFahr() - 32) * 5 / 9 + 273.15);
        return this.getKelvin();

    }

    public double CalcularKF(String mensaje) {

        this.setFahr((this.getKelvin() - 273.15) * 1.8 + 32);
        return this.getFahr();

    }
    public double CalcularKC (String mensaje ){
        
        this.setCelsius(this.getKelvin()-273.15);
        return this.getCelsius();
    }
}
//Grados Celsius a grados Fahrenheit.
//Grados Celsius a grados kelvin.
//Grados Fahrenheit a grados Celsius.
//Grados Fahrenheit a grados kelvin.
//Grados kelvin a grados Fahrenheit.
//Grados kelvin a grados Celsius.
