package Class;

public class Ej9 extends Padre {

    @Override
    public void Imprimir() {
        if (num1 >= 200 && num1 <= 300) {
            System.out.println("EL NUMERO ESTA EN RANGO");
        } else {
            System.out.println("EL NUMERO NO ESTA EN EL RANGO");
        }
        if (num1 % 2 == 0) {
            System.out.println("EL NUMERO ES PAR ");
        } else {
            System.out.println("EL NUMERO ES IMPAR ");
        }
    }
}
