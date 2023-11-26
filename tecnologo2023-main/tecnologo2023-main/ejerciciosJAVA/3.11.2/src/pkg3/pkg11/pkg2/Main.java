/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg11.pkg2;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
      int candidato1 = 0;
      int candidato2 = 0;
      int candidato3 = 0;
      int votosTotales = 25;
      int contadorVotos = 0;
      do {
         System.out.print("Por que cantidado desa votar (1, 2 o 3): ");
         int voto = scan.nextInt();
         if (voto == 1) {
            candidato1++;
            contadorVotos++;
         } else if (voto == 2) {
            candidato2++;
            contadorVotos++;
         } else if (voto == 3) {
            candidato3++;
            contadorVotos++;
         } else {
            System.out.println("ese numero no es valido vuelva a intentar.");
         }
      } while (contadorVotos < votosTotales);
      System.out.println("Los votos totales son: " + votosTotales);
      if (candidato1 > candidato2 && candidato1 > candidato3) {
         System.out.println("El ganador es el candidato número 1 con " + candidato1 + " votos.");
      } else if (candidato2 > candidato1 && candidato2 > candidato3) {
         System.out.println("El ganador es el candidato número 2 con " + candidato2 + " votos.");
      } else if (candidato3 > candidato1 && candidato3 > candidato2) {
         System.out.println("El ganador es el candidato número 3 con " + candidato3 + " votos.");
      } else {
         System.out.println("Empate.");
      }
   }
}
   
