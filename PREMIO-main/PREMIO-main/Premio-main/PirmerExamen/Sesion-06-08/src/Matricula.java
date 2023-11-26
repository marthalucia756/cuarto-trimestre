package

import Convercion.Notas;
import Utils.FunctionNumeric;
import Utils.FunctionString;

/**
 *
 * @author Ambiente 209-2
 */
public class Matricula extends Notas{
    private String nombre;
    private Double totalPagar;
    private Double porcentajeDescuento;
    private Byte cantidadUnidad;
    private Notas nota;
    private Byte reprobadas;
    private double costopreparatoria = 180;
private double      costoprofeccional = 300;

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
    
    public void GeneraValorPagar(){
    }
    
    public void GenerarFACTUR(){
        
        this.CapturarDatos();
        if(super.getTipo().equals("PREPARATORIA")){
            this.FacturaPreparatoria();
            this.setTotalPagar((costopreparatoria*(this.getCantidadUnidad()/5)*(1-this.getPorcentajeDescuento())));
        }else{
            this.FacturaProfesional();
          
                                this.setTotalPagar((costoprofeccional*(this.getCantidadUnidad()/5)*(1-this.getPorcentajeDescuento())));

        }
    }
    public void CapturarDatos(){
               FunctionString fs = new FunctionString();
        FunctionNumeric fn =new FunctionNumeric();
        do{
            super.setTipo(fs.InputScanner("digite Preparatoria/Prefesional: "));
        }while(!(super.getTipo().equals("preparatoria")) || super.getTipo().equals("profesional"));
        super.setPromedio(fn.InputDoubleNumericRangeScanner("deigite el promedio", 0.0, 10.0));
    
    if(super.getPromedio() <= 7 && super.getTipo().equals("preparatoria")){
    this.setReprobadas(fn.InputDoubleNumericRangeScanner("digite la cantidad de materias reprobadas 0/6: ", 0.0, 6.0).byteValue());
    }
    }
    
    public void FacturaPreparatoria(){
            if(getPromedio() >= 9.5){
           setCantidadUnidad((byte)55);
           setPorcentajeDescuento(0.25);
    }
            if(getPromedio() >= 9.0){
           setCantidadUnidad((byte)50);
           setPorcentajeDescuento(0.10);
    }
            if(getPromedio() > 7.0){
           setCantidadUnidad((byte)50);
           setPorcentajeDescuento(0.0);
    }
            if(getPromedio() <= 7.0 && this.getReprobadas()<=3){
           setCantidadUnidad((byte)45);
           setPorcentajeDescuento(0.0);
    }
            if(getPromedio() <= 7.0 && this.getReprobadas()>3){
           setCantidadUnidad((byte)40);
           setPorcentajeDescuento(0.0);
    }
    }
    public void FacturaProfesional(){
           if(getPromedio() >= 9.5){
           setCantidadUnidad((byte)55);
           setPorcentajeDescuento(0.20);
    }
           if(getPromedio() < 9.5){
           setCantidadUnidad((byte)55);
           setPorcentajeDescuento(0.0);
    }
    }


}