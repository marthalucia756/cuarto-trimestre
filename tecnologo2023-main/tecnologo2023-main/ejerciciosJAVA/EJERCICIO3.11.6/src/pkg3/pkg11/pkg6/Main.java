/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg11.pkg6;
import java.util.Scanner;
/**
 *
 * @author martha rocha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int censo, edad;
        char sexo, estadoCivil;
        int contador = 0;
        do {
            System.out.print("Ingrese el número de censo: ");
            censo = scan.nextInt();
            System.out.print("Ingrese el sexo (M/F): ");
            sexo = scan.next().charAt(0);
            System.out.print("Ingrese la edad: ");
            edad = scan.nextInt();
            System.out.print("Ingrese el estado civil (a.- soltero, b. Casado, c. Viudo, d. Divorciado): ");
            estadoCivil = scan.next().charAt(0);
            if (sexo == 'F' && estadoCivil == 'a' && edad >= 16 && edad <= 21) {
                System.out.println("Joven soltera encontrada con número de censo: " + censo);
                contador++;
            }
        } while (contador < 10);
    }
}
