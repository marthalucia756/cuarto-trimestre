/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg11.pkg1;
import java.util.Scanner;
/**
 *
 * @author martha rocha
 */
public class EJERCICIO3111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int estudiantes = 40;
        int contadorNoAprobados = 0; 
        for (int i = 1; i <= estudiantes; i++) {
            int j = 1;
            double notaTotal = 0;
            do {
                System.out.print("Ingrese la calificación por unidad " + j + " del estudiante " + i + ": ");
                double nota = scan.nextDouble();
                notaTotal += nota;
                j++;
            } while (j <= 5);
            double promedio = notaTotal / 5;
            if (promedio < 3.0) {
                contadorNoAprobados++;
            }
        }
        System.out.println("el numero de studiantes que no tienen derecho a nivelar es: " + contadorNoAprobados);
    }
}
  