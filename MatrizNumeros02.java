import java.util.Scanner;
/**
 Ejemplo:
  1 2 3
4 5 6
7 8 9

sn=45
pnum=5

 */
public class MatrizNumeros02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int suma = 0;
        double promedio;

        // Registrar números en la matriz
        System.out.println("Ingrese 9 números enteros para llenar la matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Número en la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                suma += matriz[i][j];
            }
        }

        // Calcular el promedio
        promedio = (double) suma / 9;

        // Mostrar la matriz, suma y promedio
        System.out.println("\nMatriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nSuma de los números: " + suma);
        System.out.println("Promedio de los números: " + promedio);

        scanner.close();
    }
}