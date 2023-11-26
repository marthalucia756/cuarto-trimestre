/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3.pkg12.pkg4;

/**
 *
 * @author MARTHA ROCHA
 */
import java.util.Scanner;
public class EJERCICIO3124 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el multiplicando: ");
        int multiplicando = scanner.nextInt();
        System.out.println("Ingrese el multiplicador: ");
        int multiplicador = scanner.nextInt();
        int producto = multiplicando * multiplicador;
        
        System.out.println("Tabla de multiplicar de " + multiplicando );
        for (int i = 1; i <= multiplicador; i++) {
            System.out.println(multiplicando + " x " + i + " = " + (multiplicando * i));
     
    }
}   
}
   