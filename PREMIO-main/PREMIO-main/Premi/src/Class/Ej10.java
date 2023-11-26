package Class;

/**
 *
 * @author MARTHA ROCHA
 */


import java.util.Scanner;

public class Ej10 extends Padre {

    @Override
    public void Imprimir() {
        if (num1 > num2) {
            System.out.println(num1 + " ES  MAYOR A " + num2);
        } else {
            System.out.println(num2 + " ES  MAYOR A " + num1);
        }
    }

    @Override
    public void Ingresar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------");
        System.out.println("INGRESA EL PRIMER NUMERO ");
        System.out.println("------------------");
        num1 = scanner.nextInt();
        System.out.println("INGRESA EL  SEGUNDO NUMERO  ");
        System.out.println("------------------");

        num2 = scanner.nextInt();

    }

}
