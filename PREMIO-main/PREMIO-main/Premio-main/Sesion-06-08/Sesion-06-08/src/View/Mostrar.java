package View;

import FORMULAS.Formula;
import Utils.FunctionNumeric;
import Utils.FunctionString;

public class Mostrar {

    public static void main(String[] args) {
        FunctionString fs = new FunctionString();
        FunctionNumeric fn = new FunctionNumeric();

        Formula fm = new Formula();
        fs.ShowJOptionPane("CELSUIS A FAHRENHEIT");
        fm.setCelsius(fn.InputEnteroJOptionPane("INGRESE LOS DATOS  "));
        fs.ShowJOptionPane(String.valueOf(fm.calculateCF("")));

        fs.ShowJOptionPane("CELSUIS A KELVIN");
        fm.setCelsius(fn.InputEnteroJOptionPane("INGRESE LOS DATOS "));
        fs.ShowJOptionPane(String.valueOf(fm.calcularCK("")));

        fs.ShowJOptionPane("FAHRENHEIT A CELSIUS");
        fm.setFahr(fn.InputEnteroJOptionPane("INGRESE LOS  DATOS  \n"));
        fs.ShowJOptionPane(String.valueOf(fm.CalcularFC("")));

        fs.ShowJOptionPane("FAHRENHEIT A KELVIN");
        fm.setFahr(fn.InputEnteroJOptionPane("INGRESE LSO DATOS"));
        fs.ShowJOptionPane(String.valueOf(fm.CalcularFK("")));

        fs.ShowJOptionPane(" KELVIN A FAHRENHEIT ");
        fm.setKelvin(fn.InputEnteroJOptionPane("INGRESE LSO DATOS"));
        fs.ShowJOptionPane(String.valueOf(fm.CalcularKF("")));

        fs.ShowJOptionPane(" KELVIN A CELSUIS ");
        fm.setKelvin(fn.InputEnteroJOptionPane("INGRESE LSO DATOS"));
        fs.ShowJOptionPane(String.valueOf(fm.CalcularKC("")));

    }
}
