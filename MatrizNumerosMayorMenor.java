import java.util.Scanner;
/**
 Ejemplo:
1 2 3
4 5 6
7 8 9
Mayor=9
Menor=1
 */
public class MatrizNumerosMayorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int numeroMayor, numeroMenor;

        // Inicializar variables mayor y menor con valores extremos
        numeroMayor = Integer.MIN_VALUE;
        numeroMenor = Integer.MAX_VALUE;

        // Registrar números en la matriz y encontrar el mayor y menor
        System.out.println("Ingrese 9 números enteros para llenar la matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Número en la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                // Actualizar el número mayor y menor
                if (matriz[i][j] > numeroMayor) {
                    numeroMayor = matriz[i][j];
                }
                if (matriz[i][j] < numeroMenor) {
                    numeroMenor = matriz[i][j];
                }
            }
        }

        // Mostrar la matriz, el número mayor y el número menor
        System.out.println("\nMatriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nNúmero mayor en la matriz: " + numeroMayor);
        System.out.println("Número menor en la matriz: " + numeroMenor);
    }
}