/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajovectores;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Ambiente 209-2
 */
public class VectorNumeros {
    
    private List<Integer> numeros;

    public VectorNumeros() {
        numeros = new ArrayList<>();
    }

    public void ingresarNumeros() {
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        do {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            numeros.add(numero);

            System.out.print("¿Desea ingresar otro número? (S/N): ");
            respuesta = scanner.next();
        } while (respuesta.equalsIgnoreCase("S"));
    }

    public void mostrarNumeros() {
        System.out.println("Números ingresados:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Número " + (i + 1) + ": " + numeros.get(i));
        }
    }

    public int contarPares() {
        int contadorPares = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                contadorPares++;
            }
        }
        return contadorPares;
    }

    public int contarImpares() {
        int contadorImpares = 0;
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                contadorImpares++;
            }
        }
        return contadorImpares;
    }

    public void mostrarPositivos() {
        System.out.println("Números positivos:");
        for (int numero : numeros) {
            if (numero > 0) {
                System.out.println(numero);
            }
        }
    }

    public void mostrarNegativos() {
        System.out.println("Números negativos:");
        for (int numero : numeros) {
            if (numero < 0) {
                System.out.println(numero);
            }
        }
    }

    public void mostrarCeros() {
        System.out.println("Números cero:");
        for (int numero : numeros) {
            if (numero == 0) {
                System.out.println(numero);
            }
        }
    }

    public int encontrarNumeroMasAlto() {
        int masAlto = Integer.MIN_VALUE;
        for (int numero : numeros) {
            if (numero > masAlto) {
                masAlto = numero;
            }
        }
        return masAlto;
    }

    public int encontrarNumeroMasBajo() {
        int masBajo = Integer.MAX_VALUE;
        for (int numero : numeros) {
            if (numero < masBajo) {
                masBajo = numero;
            }
        }
        return masBajo;
    }
}

