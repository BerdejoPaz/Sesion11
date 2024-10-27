import java.util.Scanner;

public class MatrizCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] compras = new double[4][4];
        double totalCompras = 0;
        double promedioCompras;

        // Registrar compras en la matriz
        System.out.println("Ingrese el valor de las compras para llenar la matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Compra en la posición [" + i + "][" + j + "]: ");
                compras[i][j] = scanner.nextDouble();
                totalCompras += compras[i][j];
            }
        }

        // Calcular el promedio de las compras
        promedioCompras = totalCompras / (4 * 4);

        // Mostrar la matriz de compras
        System.out.println("\nMatriz de Compras (4x4):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(compras[i][j] + "\t");
            }
            System.out.println();
        }

        // Mostrar el total y el promedio de las compras
        System.out.println("\nTotal de las compras: " + totalCompras);
        System.out.println("Promedio de las compras: " + promedioCompras);

        scanner.close();
    }
}