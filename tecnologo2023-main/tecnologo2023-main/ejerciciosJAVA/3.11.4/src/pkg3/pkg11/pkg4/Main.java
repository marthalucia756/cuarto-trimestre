/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg11.pkg4;
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
      double totalDineroCaja = 0;
      boolean continuar = true;
      do {
         System.out.print("Ingrese el valor de la venta: $");
         double venta = scan.nextDouble();
         double iva = venta * 0.19;
         System.out.println("El IVA es de: $" + iva);
         double totalPagar = venta + iva;
         System.out.println("El total a pagar es de: $" + totalPagar);
         System.out.print("Ingrese la cantidad con la que paga el cliente: $");
         double cantidadPaga = scan.nextDouble();
         double cambio = cantidadPaga - totalPagar;
         System.out.println("El cambio es de: $" + cambio);
         totalVentas += venta;
         totalIVA += iva;
         totalDineroCaja += totalPagar;
         System.out.print("¿Desea registrar otra venta? (S) para si (N) para no: ");
         String respuesta = scan.next();
         if (respuesta.equalsIgnoreCase("N")) {
            continuar = false;
         }
      } while (continuar);
      System.out.println("El dinero que debe estar en caja es de: $" + totalDineroCaja);
   }
}
    
