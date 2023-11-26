/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajovectores;

/**
 *
 * @author Ambiente 209-2
 */
public class Main {
    public static void main(String[] args) {
        VectorNumeros vector = new VectorNumeros();
        vector.ingresarNumeros();
        vector.mostrarNumeros();

        int cantidadPares = vector.contarPares();
        int cantidadImpares = vector.contarImpares();

        System.out.println("Cantidad de números pares: " + cantidadPares);
        System.out.println("Cantidad de números impares: " + cantidadImpares);

        vector.mostrarPositivos();
        vector.mostrarNegativos();
        vector.mostrarCeros();

        int numeroMasAlto = vector.encontrarNumeroMasAlto();
        int numeroMasBajo = vector.encontrarNumeroMasBajo();

        System.out.println("Número más alto: " + numeroMasAlto);
        System.out.println("Número más bajo: " + numeroMasBajo);
    }
}
