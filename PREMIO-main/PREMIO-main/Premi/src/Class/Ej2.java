package Class;
/**
 *
 * @author MARTHA ROCHA
 */

public class Ej2 extends Padre {

    @Override
    public void Imprimir() {

        Cuadrado = num1 * num1;
        if (Cuadrado > 5000) {
            System.out.println("EL NUMERO ES MAYOR A 5000");
        } else {
            System.out.println("EL NUMERO NO ES MAYOR A 5000");
        }

    }

}
