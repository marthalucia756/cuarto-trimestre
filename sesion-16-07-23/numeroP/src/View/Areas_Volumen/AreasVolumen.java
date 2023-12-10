/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Areas_Volumen;

import Class.numero;
import Class.Areas.Area.Triangulo;
import Class.Areas.Area.Rectangulo;
import Class.Areas.Area.Circuferencia;
import Class.Areas.Area.Trapecio;
import Class.Areas.Area.Rombo;
import Class.Areas.Area.Cuadrado;
import Class.Volumen.Cubo;
import Class.Volumen.Esfera;
import Class.Volumen.Cilindro;
import Class.Volumen.Cono;
/**
 *
 * @author JuanDa
 */
public class AreasVolumen {

    public static void main(String[] args) {
        numero x = new numero();

        Triangulo tri = new Triangulo();
        x.setMensaje("Digite la base del triangulo:");
        tri.setBase(x.capturar());
        x.setMensaje("Digite la altura del triangulo:");
        tri.setAltura(x.capturar());
        System.out.println("El area del triangulo es: " + tri.Area());

        Rectangulo rec = new Rectangulo();
        x.setMensaje("Digite la base del rectangulo");
        rec.setBase(x.capturar());
        x.setMensaje("Digite la altura del rectangulo");
        rec.setAltura(x.capturar());
        System.out.println("El area del rectangulo es: " + rec.Area());

        Circuferencia cir = new Circuferencia();
        x.setMensaje("Digite el radio de la circuferencia");
        cir.setRadio(x.capturar());
        System.out.println("El area de la circuferencia es: " + cir.Area());
        
        Trapecio tra = new Trapecio();
        x.setMensaje("Ingrese la base mayor del trapecio: ");
        tra.setBaseM(x.capturar());
        x.setMensaje("Ingrese la base menor del trapecio: ");
        tra.setBaseMe(x.capturar());
        x.setMensaje("Ingrese la altura del trapecio: ");
        tra.setAltura(x.capturar());
        System.out.println("El area del trapecio es: "+tra.Area());
        
        Rombo rombo = new Rombo();
        x.setMensaje("Digite el diagnonal mayor: ");
        rombo.setDiagonalMa(x.capturar());
        x.setMensaje("Digite el diagonal menor: ");
        rombo.setDiagonalMe(x.capturar());
        System.out.println("El area del rombo es: "+rombo.Area());
        
        Cuadrado cuadrado = new Cuadrado();
        x.setMensaje("Inserte lado del cuadrado: ");
        cuadrado.setLado(x.capturar());
        System.out.println("El area del cuadrado es: "+cuadrado.Area());
        
        System.out.println("Ahora volumen de algunas figuras: ");
        
        Cubo cubo = new Cubo();
        x.setMensaje("Digite el lado del cubo: ");
        cubo.setLado(x.capturar());
        System.out.println("El volumen del cubo es: "+cubo.Volumen());
        
        Esfera esfera = new Esfera();
        x.setMensaje("Digite el radio de la esfera: ");
        esfera.setRadio(x.capturar());
        System.out.println("El volumen de la esfera es: "+esfera.Volumen());
        
        Cilindro cili = new Cilindro();
        x.setMensaje("Digite el radio del cilindro: ");
        cili.setRadio(x.capturar());
        
        Cono cono = new Cono();
        x.setMensaje("Digite el radio del cono: ");
        cono.setRadio(x.capturar());
        x.setMensaje("Digite la altura del cono");
        cono.setAltura(x.capturar());
        System.out.println("El volumen del cono es: "+cono.Volumen());
        
        
    }

}
