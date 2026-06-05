import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el tamaño de la base de la pirámide: ");
        int base = sc.nextInt();

        // Aseguramos que la base sea impar
        if (base % 2 == 0) {
            System.out.println("La base debe ser un número impar para una pirámide simétrica.");
            return;
        }

        int altura = (base + 1) / 2; // número de filas
        for (int i = 1; i <= altura; i++) {
            int numAsteriscos = 2 * i - 1;
            int numEspacios = (base - numAsteriscos) / 2;

            // Imprime espacios
            for (int j = 0; j < numEspacios; j++) {
                System.out.print(" ");
            }

            // Imprime asteriscos
            for (int j = 0; j < numAsteriscos; j++) {
                System.out.print("*");
            }

            System.out.println(); // Nueva línea
        }

        sc.close();
    }
}