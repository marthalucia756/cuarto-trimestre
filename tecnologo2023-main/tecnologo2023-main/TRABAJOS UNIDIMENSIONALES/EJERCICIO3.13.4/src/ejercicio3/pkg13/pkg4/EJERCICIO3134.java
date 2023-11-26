/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3.pkg13.pkg4;

/**
 *
 * @author MARTHA ROCHA
 */
import java.util.Scanner;
public class EJERCICIO3134 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de 'n': ");
        int n = scanner.nextInt();
        
        int[] numeros = new int[n];
        
        for (int i = 0; i < n; i++) {
            numeros[i] = i + 1;
        }
        
        System.out.println("Números pares:");
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }
        
        System.out.println("Números impares:");
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
            }
        }
    }
}

 
