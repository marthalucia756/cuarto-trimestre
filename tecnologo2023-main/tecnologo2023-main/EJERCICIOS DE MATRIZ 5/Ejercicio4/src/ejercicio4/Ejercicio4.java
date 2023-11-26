/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author MARTHA ROCHA
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws Exception {
         Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int[] vector1 = new int[5];
        int[] vector2 = new int[1];
        int pocision = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("escriba el valor deseado para esta ubicacion " + (i + 1) + " , " + (j + 1));
                matriz[i][j] = scan.nextInt();
                vector1[j] = vector1[j] + matriz[i][j];

            }
        }
        for (int i = 0; i < 5; i++) {
            if (vector1[i] > vector2[0]) {
                vector2[0] = vector1[i];
                pocision = i;
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("");
            System.out.print("|");
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "|");
            }
        }
        System.out.println("");
        System.out.println("la columna con mayor valor es: " + (pocision + 1) + " con el valor de: " + vector2[0]);
        scan.close();
    }
}

   
