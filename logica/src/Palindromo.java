
/*
Escribe un método que determine si una palabra es un palíndromo (se lee igual al derecho y al revés).
 */

import java.util.Scanner;

public class Palindromo {
    Scanner sc = new Scanner(System.in);
    public static void ejecutarPalindromo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = sc.nextLine();

        palabra = palabra.toLowerCase();

        // Verificamos si la palabra  comparáandola con su reverso
        if (palabra.equals(new StringBuilder(palabra).reverse().toString())) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }

    }
}

