package Class;

public class Ej8 extends Padre {

    @Override
    public void Imprimir() {
        if (num1 % 2 == 0) {
            System.out.println("EL NUMERO ES PAR ");
        } else {
            System.out.println("EL NUMERO ES IMPAR ");
        }
        if (num1 >= 0) {
            System.out.println("EL NUMERO ES POSITIVO");
        } else {
            System.out.println("EL NUMERO ES NEGATIVO");
        }
    }

}
