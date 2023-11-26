/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3.pkg10.pkg3;

/**
 *
 * @author MARTHA ROCHA
 */
import java.util.Scanner;
public class EJERCICIO3103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  
       int cant1=0;
       int cant2=0;
       int  cant3=0;
       int cant4=0;
       int cant5=0;
       int cantpersonas;
       
       double precioAsiento=100.000;
        double descuento1=0.35;
        double descuento2=0.25;
         double descuento3=0.1;
         double descuento4=0.25;
         double descuento5=0.35;
         double perdida1,perdida2,perdida3,perdida4,perdida5;
         
        System.out.println("ingrese la cantidad de personas que asistiran al teatro:");
         cantpersonas= scanner.nextInt();
         
        for (int i =0;i <cantpersonas; i++){
        System.out.println("ingrese la edad de la persona"+ (i+1));
        int edad = scanner.nextInt();
        
        if(edad >= 5 && edad <= 14){
            cant1++;
        }else if (edad>= 15 && edad <= 19) {
            cant2++;
         }else if (edad>= 20 && edad <= 45) {   
             cant3++;
         }else if (edad>= 46 && edad <= 65) {   
             cant4++;
        }else if (edad>= 66) {   
            cant5++;
        }
     }
     System.out.println("cantidad de personas en la categoria 1(5-14 años):"+ cant1);
     System.out.println("cantidad de personas en la categoria 2(15-19 años):"+ cant2);
     System.out.println("cantidad de personas en la categoria 3(20-45 años):"+ cant3);
     System.out.println("cantidad de personas en la categoria 4(46-65 años):"+ cant4);
     System.out.println("cantidad de personas en la categoria 5(66 años en adelante):"+ cant5);
     
      perdida1= cant1*precioAsiento*descuento1;
      perdida2= cant2*precioAsiento*descuento2;
      perdida3= cant3*precioAsiento*descuento3;
      perdida4= cant4*precioAsiento*descuento4;
      perdida5= cant5*precioAsiento*descuento5;
      
      System.out.println("El teatro deja de percibir "+ perdida1+" en la categoria 1");
     System.out.println("El teatro deja de percibir "+ perdida2+" en la categoria 2");  
     System.out.println("El teatro deja de percibir "+ perdida3+" en la categoria 3");
     System.out.println("El teatro deja de percibir "+ perdida4+" en la categoria 4");
     System.out.println("El teatro deja de percibir "+ perdida5+" en la categoria 5");
     
    }
}

    
    

  