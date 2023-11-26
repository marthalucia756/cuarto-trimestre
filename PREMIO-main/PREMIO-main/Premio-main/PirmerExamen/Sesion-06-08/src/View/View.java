package View;

import Convercion.Condiciones;
import Utils.FunctionNumeric;
import Utils.FunctionString;

public class View {

      public static void main(String[] args) {

        FunctionString fs = new FunctionString();
        FunctionNumeric fn = new FunctionNumeric();

        Condiciones[] cd = new Condiciones[fn.InputIntegerNumericPositiveScanner("Cuántos estudiantes desea: ")];

        for (int i = 0; i < cd.length; i++) {
            cd[i] = new Condiciones();
            cd[i].GenerarFACTUR();
            cd[i].mostrarResultados();
        }
        
        for (int i = 0; i < cd.length; i++) {
            fs.ShowScanner(cd[i].getNombre() + " $" + cd[i].getTotalPagar().toString());
        }
    }
}





