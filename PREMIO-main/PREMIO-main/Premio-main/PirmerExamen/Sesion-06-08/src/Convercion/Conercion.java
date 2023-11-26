package Convercion;

import Utils.FunctionNumeric;
import Utils.FunctionString;

public class Conercion {
    private double PesosC;
    private double Bolivares;
    private double soles;
    private double pesetas;
    private double Francos;
    private double dolar;

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    FunctionNumeric fn = new FunctionNumeric();
    FunctionString fs = new FunctionString();

    public double getPesosC() {
        return PesosC;
    }

    public void setPesosC(double PesosC) {
        this.PesosC = PesosC;
    }

    public double getBolivares() {
        return Bolivares;
    }

    public void setBolivares(double Bolivares) {
        this.Bolivares = Bolivares;
    }

    public double getSoles() {
        return soles;
    }

    public void setSoles(double soles) {
        this.soles = soles;
    }

    public double getPesetas() {
        return pesetas;
    }

    public void setPesetas(double pesetas) {
        this.pesetas = pesetas;
    }

    public double getFrancos() {
        return Francos;
    }

    public void setFrancos(double Francos) {
        this.Francos = Francos;
    }

    public void CacularPesos() {

        this.setPesosC(fn.InputDoubleNumericPositiveJOptionPane("INGRESE EL VALOR A PESOS"));
        this.setDolar(this.getPesosC() * 0.00025);
        this.setBolivares(this.getPesosC() * 0.0073);
        this.setFrancos(this.getPesosC() * 0.00021);
        this.setSoles(this.getPesosC() * 0.21);
        this.setPesetas(this.getPesosC() *0.03339);
        fs.ShowJOptionPane("CAMBIO PESOS A DOLA ES  : " + this.getDolar());
        fs.ShowJOptionPane("CAMBIO PESOSO A BOLIVARES ES DE : " + this.getBolivares());
        fs.ShowJOptionPane("CAMBIO PESOS A SOLES ES DE  :  " + this.getSoles());
        fs.ShowJOptionPane("CAMBIO PESOS A PESETAS ES DE  :  " + this.getPesetas());
        fs.ShowJOptionPane("CAMBIO PESOS A FRANCOS ES DE  :  " + this.getFrancos());

    }

    public void CalcularDolar() {

        this.setDolar(fn.InputDoubleNumericPositiveJOptionPane("INGRESE EL VALOR A DOLAR"));
        this.setBolivares(this.getDolar() * 30.07);
        this.setPesosC(this.getDolar() * 4.140);
        this.setFrancos(this.getDolar() * 0.87);
        this.setPesetas(this.getDolar() * 151.01057);
        this.setSoles(this.getDolar() * 3.66 );
        fs.ShowJOptionPane("CAMBIO DOLAR A PESOS ES  : " + this.getPesosC());
        fs.ShowJOptionPane("CAMBIO DOLAR A BOLIVARES ES DE : " + this.getBolivares());
        fs.ShowJOptionPane("CAMBIO DOLAR A SOLES ES DE  :  " + this.getSoles());
        fs.ShowJOptionPane("CAMBIO DOLAR A PESETAS ES DE  :  " + this.getPesetas());
        fs.ShowJOptionPane("CAMBIO DOLAR A FRANCOS ES DE  :  " + this.getFrancos());

    }

    public void CalcularBolivares() {
        this.setBolivares(fn.InputDoubleNumericPositiveJOptionPane("INGRESE EL VALOR A BOLIVARES"));
        this.setPesosC(this.getBolivares() * 137.70);
        this.setFrancos(this.getBolivares() * 0.0000028997088);
        this.setPesetas(this.getBolivares() * 0.0000000512566);
        this.setSoles(this.getBolivares() * 0.0000012187617);
        this.setDolar(this.getBolivares() * 0.00000033219683);
        fs.ShowJOptionPane("CAMBIO BOLIVARES A PESOS ES  : " + this.getPesosC());
        fs.ShowJOptionPane("CAMBIO BOLIVARES A FRANCOS ES DE  :  " + this.getFrancos());
        fs.ShowJOptionPane("CAMBIO BOLIVARES A SOLES ES DE  :  " + this.getSoles());
        fs.ShowJOptionPane("CAMBIO BOLIVARES A PESETAS ES DE  :  " + this.getPesetas());

    }

    public void CalcularSoles() {

        this.setPesosC(fn.InputDoubleNumericPositiveJOptionPane("INGRESE EL VALOR A SOLES"));
        this.setBolivares(this.getSoles() * 8.2071284);
        this.setPesosC(this.getSoles() * 1117.7946);
        this.setDolar(this.getSoles() * 0.27295995);
        this.setFrancos(this.getSoles() * 0.23797575);
        this.setPesetas(this.getSoles() * 41.206489);

        fs.ShowJOptionPane("CAMBIO SOLES A PESOS ES  : " + this.getPesosC());
        fs.ShowJOptionPane("CAMBIO SOLES A DOLAR ES :" + this.getDolar());
        fs.ShowJOptionPane("CAMBIO SOLES A BOLIVARES ES DE : " + this.getBolivares());
        fs.ShowJOptionPane("CAMBIO SOLES A PESETAS ES DE  :  " + this.getPesetas());
        fs.ShowJOptionPane("CAMBIO SOLES A FRANCOS ES DE  :  " + this.getFrancos());

    }
}
