/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
 
import java.util.Scanner;
/**
 *
 * @author MARTHA ROCHA
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
   
        public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[] vector1 = new int[3];
        int[] vector2 = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("escriba el valor deseado para esta ubicacion " + (i + 1) + " , " + (j + 1));
                matriz[i][j] = scan.nextInt();
                vector1[j] = vector1[j] + matriz[i][j];
                vector2[i] = vector2[i] + matriz[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("la suma de la columna " + i + 1 + " es: ");
            System.out.println(vector1[i]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("la suma de la fila " + i + 1 + " es: ");
            System.out.println(vector2[i]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "|");
            }
        }
        scan.close();
    }
}

   