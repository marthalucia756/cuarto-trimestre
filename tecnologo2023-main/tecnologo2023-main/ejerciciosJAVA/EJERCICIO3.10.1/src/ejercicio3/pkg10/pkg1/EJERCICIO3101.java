/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3.pkg10.pkg1;

/**
 *
 * @author MARTHA ROCHA
 */
import java.util.Scanner;
public class EJERCICIO3101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int total_compra;
       int porcentajedescuento = 0;
       int bola,sn;
       double descuento= 0;
     Scanner scanner = new Scanner(System.in);
   do{
 System.out.println("Ingresa el valor total de la compra:");
  total_compra= scanner.nextInt();
  do{
  System.out.println("Por favor ingresa que color de pelota sacaste:");
  System.out.println("1.Blanca:");
  System.out.println("2.Roja:");
  System.out.println("3 Amarilla:");
   bola=scanner.nextInt();
   
    switch (bola) {
        case 1 -> porcentajedescuento=0;
            case 2 -> porcentajedescuento= 40;
            case 3 -> porcentajedescuento=25;
            default -> System.out.println("opcion no valida");
              }
    
  }while (bola<1 || bola >3);
            descuento=total_compra*porcentajedescuento/100;
              System.out.println("El descuento fue" + descuento);
             System.out.println("El total a pagar es  " + (total_compra-descuento));
             System.out.println("¿Desea hacer otra compra");
             System.out.println("1.SI"); 
             System.out.println("2.NO");
             sn= scanner.nextInt();
  }while (sn==1);
   
}

}