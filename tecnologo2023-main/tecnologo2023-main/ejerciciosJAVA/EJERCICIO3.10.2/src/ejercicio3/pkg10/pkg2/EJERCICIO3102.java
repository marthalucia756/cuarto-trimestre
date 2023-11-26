/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3.pkg10.pkg2;

/**
 *
 * @author MARTHA ROCHA
 */
import java.util.Scanner;
public class EJERCICIO3102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   Scanner scanner = new Scanner(System.in);
   
       double total=0.0;
       int respuesta;
       int  precio;
       int cantidad;
       int subtotal;
       
       do{
            System.out.println("Ingresa el precio del articulo:");
             precio= scanner.nextInt();
            System.out.println("Ingresa la cantidad de articulos iguales que has tomado:");
             cantidad= scanner.nextInt();
              
               subtotal= precio*cantidad;
       
         System.out.println("El subtotal de este articulo es: " + subtotal );
         
         total+= subtotal;
         
         System.out.println("¿Deszeas agregar otro articulo?");
            System.out.println("1.SI");
            System.out.println("2.NO");
        respuesta = scanner.nextInt();
        
      } while (respuesta==1);
       
        System.out.println("El total de tus compras es:"+ total);
 
    }
}
