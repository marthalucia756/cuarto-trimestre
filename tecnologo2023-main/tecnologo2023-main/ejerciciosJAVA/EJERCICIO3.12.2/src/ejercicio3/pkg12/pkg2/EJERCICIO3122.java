/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3.pkg12.pkg2;

/**
 *
 * @author MARTHA ROCHA
 */
import java.util.Scanner;
public class EJERCICIO3122 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scann = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número: ");
        int num1 = scann.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        int num2 = scann.nextInt();
        
        int producto = 0;
        
        for (int i = 0; i < num2; i++) {
            producto += num1;
        }
        
        System.out.println("El producto de " + num1 + " y " + num2 + " es " + producto);
 
    }
    
}
    