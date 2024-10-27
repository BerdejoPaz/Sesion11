import java.util.Scanner;
/**
 Ingrese el valor de las ventas para llenar la matriz 4x4:
Matriz de Ventas (4x4):
1000.0	1025.0	1090.0	1120.0	
998.0	1035.0	1250.0	1320.0	
1002.0	1025.0	1150.0	1190.0	
1180.0	1222.0	1526.0	1212.0	

El total de las ventas es: 18345.0
 */
public class MatrizVentas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] ventas = new double[4][4];
        double totalVentas = 0;

        // Registrar ventas en la matriz
        System.out.println("Ingrese el valor de las ventas para llenar la matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Venta en la posición [" + i + "][" + j + "]: ");
                ventas[i][j] = scanner.nextDouble();
                totalVentas += ventas[i][j];
            }
        }

        // Mostrar la matriz de ventas
        System.out.println("\nMatriz de Ventas (4x4):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(ventas[i][j] + "\t");
            }
            System.out.println();
        }

        // Mostrar el total de las ventas
        System.out.println("\nEl total de las ventas es: " + totalVentas);

        scanner.close();
    }
}