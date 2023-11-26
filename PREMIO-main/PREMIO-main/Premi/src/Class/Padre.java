package Class;
/**
 *
 * @author MARTHA ROCHA
 */

import Interface.Interface;
import java.util.Scanner;

public abstract class Padre implements Interface {

    double num1;
    double Cuadrado;
    double num2;
    Scanner sc = new Scanner(System.in);

    @Override
    public void Ingresar() {

        System.out.println("------------------");
        System.out.println("Ingrese un numero");
        System.out.println("------------------");
        num1 = sc.nextDouble();

    }

    @Override

    public void Imprimir() {

    }

}
