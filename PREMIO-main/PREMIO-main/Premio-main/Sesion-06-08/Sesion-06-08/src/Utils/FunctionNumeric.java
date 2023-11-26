package Utils;

public class FunctionNumeric {

    private Double numero;
    private int Entero;

    private Double getNumero() {
        return numero;
    }

    private void setNumero(Double numero) {
        this.numero = numero;
    }

    public Double InputNumericScanner(String mensaje) {
        InputNumeric(mensaje, 1);
        return this.getNumero();
    }

    public Double InputNumericJOptionPane(String mensaje) {
        InputNumeric(mensaje, 2);
        return this.getNumero();
    }

    private void InputNumeric(String mensaje, int tipo) {
        Boolean validar = false;
        FunctionString fs = new FunctionString();

        //Validar que se ingrese el dato correcto
        while (validar == false) {
            try {
                if (tipo == 1) {
                    this.setNumero(Double.parseDouble(fs.InputScanner(mensaje)));
                } else {
                    this.setNumero(Double.parseDouble(fs.InputJOptionPane(mensaje)));
                }
                validar = true;
            } catch (Exception e) {
                if (tipo == 1) {
                    fs.ShowScanner("Ha ingresado un dato no válido. ");
                } else {
                    fs.ShowJOptionPane("Ha ingresado un dato no válido. ");
                }
            }
        }
    }

    public Double InputNumericRangeScanner(String mensaje, Double min, Double max) {
        do {
            InputNumeric(mensaje, 1);
        } while (this.getNumero() < min || this.getNumero() > max);

        return this.getNumero();
    }

    public Double InputNumericPONEScanner(String mensaje) {
        do {
            InputNumeric(mensaje, 1);
        } while (this.getNumero() < 0);
        {

            return this.getNumero();

        }
    }

    public int getEntero() {
        return Entero;
    }

    public void setEntero(int Entero) {
        this.Entero = Entero;
    }

    public int InputEnteroScanner(String mensaje) {
        InputEntero(mensaje, 1);
        return this.getEntero();
    }

    public int InputEnteroJOptionPane(String mensaje) {
        InputEntero(mensaje, 2);
        return this.getEntero();
    }

    private void InputEntero(String mensaje, int tipo) {
        Boolean validar = false;
        FunctionString fs = new FunctionString();

        while (!validar) {
            try {
                if (tipo == 1) {
                    this.setEntero(Integer.parseInt(fs.InputScanner(mensaje)));
                } else {
                    this.setEntero(Integer.parseInt(fs.InputJOptionPane(mensaje)));
                }
                validar = true;
            } catch (Exception e) {
                if (tipo == 1) {
                    fs.ShowScanner("Ha ingresado un dato no válido. ");
                } else {
                    fs.ShowJOptionPane("Ha ingresado un dato no válido. ");
                }
            }
        }
    }

    public int InputNumericRangeScanner(String mensaje, int min, int max) {
        do {
            InputEntero(mensaje, 1);
        } while (this.getEntero() < min || this.getEntero() > max);

        return this.getEntero();
    }

    public double InputNumeric0canner(String mensaje) {
        do {
            InputNumeric(mensaje, 1);
        } while (this.getEntero() < 0);
        {

            return this.getEntero();

        }
    }
}
