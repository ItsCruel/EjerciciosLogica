import java.util.Scanner;

public class Menu {

    // Método que muestra el menú
    public static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("MENU");
            System.out.println("1. Ejecutar Palíndromo");
            System.out.println("2. Ejecutar FizzBuzz");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();


            switch (opcion) {
                case 1:
                    Palindromo.ejecutarPalindromo();
                    break;

                case 2:
                    FizzBuzz.ejecutarMetodoFizzBuzz();
                    break;

                case 0:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 0);

    }
}
