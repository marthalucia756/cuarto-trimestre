/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg11.pkg3;
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
      int cantidadClientes = 0;
      double totalVentas = 0;
      boolean continuar = true;
      do {
         System.out.print("Ingrese el precio de la compra: ");
         double venta = scan.nextDouble();
         totalVentas += venta;
         cantidadClientes++;
         System.out.print("¿V a comprar otra cosa? (S) para si (N) para no: ");
         String respuesta = scan.next();
         if (respuesta.equalsIgnoreCase("N")) {
            continuar = false;
         }
      } while (continuar);
      System.out.println("La cantidad total de las ventas diarias fue de: $" + totalVentas);
      System.out.println("El número de clientes atendidos fue de: " + cantidadClientes);
   }
}
    