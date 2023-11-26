/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3.pkg13.pkg3;

/**
 *
 * @author MARTHA ROCHA
 */
public class EJERCICIO3133 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int n = 100; // Puedes modificar el valor de "n" según tus necesidades

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            numeros[i] = i + 1;
        }

        // Imprimir el contenido del vector
        for (int i = 0; i < n; i++) {
            System.out.println(numeros[i]);
        }
    }
}
