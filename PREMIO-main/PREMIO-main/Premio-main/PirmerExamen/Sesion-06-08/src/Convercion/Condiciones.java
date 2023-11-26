package Convercion;

import Utils.FunctionNumeric;
import Utils.FunctionString;

public class Condiciones extends Notas {

    FunctionNumeric fn = new FunctionNumeric();
    FunctionString fs = new FunctionString();

    private String nombre;
    private Double totalPagar;
    private Double porcentajeDescuento;
    private Byte cantidadUnidad;
    private Byte reprobadas;
    private double costopreparatoria = 180;
    private double costoprofesional = 300;

    public Byte getReprobadas() {
        return reprobadas;
    }

    public void setReprobadas(Byte reprobadas) {
        this.reprobadas = reprobadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getTotalPagar() {
        return totalPagar;
    }

    private void setTotalPagar(Double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public Double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    private void setPorcentajeDescuento(Double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public Byte getCantidadUnidad() {
        return cantidadUnidad;
    }

    private void setCantidadUnidad(Byte cantidadUnidad) {
        this.cantidadUnidad = cantidadUnidad;
    }

    public void GeneraValorPagar() {
    }

    public void GenerarFACTUR() {

        this.CapturarDatos();
        if (super.getTipo().equals("PREPARATORIA")) {
            this.FacturaPreparatoria();
            this.setTotalPagar((costopreparatoria * (this.getCantidadUnidad() / 5) * (1 - this.getPorcentajeDescuento())));
        } else {
            this.FacturaProfesional();

            this.setTotalPagar((costoprofesional * (this.getCantidadUnidad() / 5) * (1 - this.getPorcentajeDescuento())));

        }
    }

    public void CapturarDatos() {
        FunctionString fs = new FunctionString();
        FunctionNumeric fn = new FunctionNumeric();
        this.setNombre(fs.InputScanner("Digite nombre: "));
        do {

            super.setTipo(fs.InputScanner("Digite Preparatoria/Profesional : "));
        } while (!(super.getTipo().equals("preparatoria") || super.getTipo().equals("profesional")));
        super.setPromedio(fn.InputDoubleNumericRangeScanner(" Digite el promedio : ", 0.0, 10.0));

        if (super.getPromedio() <= 7 && super.getTipo().equals("preparatoria")) {
            this.setReprobadas(fn.InputDoubleNumericRangeScanner("digite la cantidad de materias reprobadas 0/6 : ", 0.0, 6.0).byteValue());
        }
    }

    public void FacturaPreparatoria() {
        if (getPromedio() >= 9.5) {
            setCantidadUnidad((byte) 55);
            setPorcentajeDescuento(0.25);
        } else if (getPromedio() >= 9.0) {
            setCantidadUnidad((byte) 50);
            setPorcentajeDescuento(0.10);
        } else if (getPromedio() > 7.0) {
            setCantidadUnidad((byte) 50);
            setPorcentajeDescuento(0.0);
        } else if (getPromedio() <= 7.0 && getReprobadas() <= 3) {
            setCantidadUnidad((byte) 45);
            setPorcentajeDescuento(0.0);
        } else if (getPromedio() <= 7.0 && getReprobadas() > 3) {
            setCantidadUnidad((byte) 40);
            setPorcentajeDescuento(0.0);
        }
    }
   
    public void FacturaProfesional() {
        if (getPromedio() >= 9.5) {
            setCantidadUnidad((byte) 55);
            setPorcentajeDescuento(0.20);
        }
        if (getPromedio() < 9.5) {
            setCantidadUnidad((byte) 55);
            setPorcentajeDescuento(0.0);
        }
    }

    public void mostrarResultados() {
        fs.ShowScanner("-------------------------------------------" + "\n");
        fs.ShowScanner("NOMBRE : " + this.getNombre() + "\n");
        fs.ShowScanner("Promedio : " + this.getPromedio() + "\n");
        fs.ShowScanner("Materias reprobadas : " + this.getReprobadas() + "\n");
        fs.ShowScanner("Unidades : " + this.getCantidadUnidad() + "\n");
        fs.ShowScanner("Descuento : " + (this.getPorcentajeDescuento() * 100) + "%" + "\n");
        fs.ShowScanner("Total a pagar : $" + this.getTotalPagar() + "\n");
        fs.ShowScanner("------------------------------------------" + "\n\"");

    }
}
