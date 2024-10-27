import java.util.Scanner;
/**
 Ejemplo:
1 2 3 
4 5 6
7 8 9

sp:20
ci=5

 */
public class MatrizNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int sumaPares = 0;
        int cantidadImpares = 0;

        // Registrar los números en la matriz
        System.out.println("Ingresa 9 números enteros para la matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Número en posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                // Verificar si el número es par o impar
                if (matriz[i][j] % 2 == 0) {
                    sumaPares += matriz[i][j];
                } else {
                    cantidadImpares++;
                }
            }
        }

        // Visualizar los resultados
        System.out.println("\nLa suma de los números pares es: " + sumaPares);
        System.out.println("La cantidad de números impares es: " + cantidadImpares);

        scanner.close();
    }
}