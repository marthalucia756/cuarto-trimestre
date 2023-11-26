/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg11.pkg5;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        double totalVentas = 0;
        double totalIVA = 0;
        double totalCobrado = 0;
        do {
            System.out.print("Ingrese el monto de la venta: ");
            double montoVenta = scan.nextDouble();
            double iva = montoVenta * 0.19;
            System.out.println("El IVA es: " + iva);
            totalIVA += iva;
            double total = montoVenta + iva;
            System.out.println("El total a pagar es: " + total);
            totalVentas += total;
            double cantidadPagada;
            do {
                System.out.print("Ingrese la cantidad con la que pago: ");
                cantidadPagada = scan.nextDouble();
                if (cantidadPagada < total) {
                    System.out.println("revise que tenga la cantidad de dinero neceseria e intente de nuevo.");
                }
            } while (cantidadPagada < total);
            double cambio = cantidadPagada - total;
            System.out.println("El cambio es: " + cambio);
            totalCobrado += cantidadPagada;
        } while (scan.nextLine().equalsIgnoreCase("S"));
        System.out.println("El total de ventas es: " + totalVentas);
        System.out.println("El total de IVA es: " + totalIVA);
        System.out.println("El total cobrado es: " + totalCobrado);
    }
}
