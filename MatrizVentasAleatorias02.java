import java.util.Random;

public class MatrizVentasAleatorias02 {
    public static void main(String[] args) {
        int[][] ventas = new int[3][3];
        int totalVentas = 0;
        double promedioVentas;
        Random random = new Random();

        // Generar ventas aleatorias y asignarlas a la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ventas[i][j] = random.nextInt(9001) + 1000; // Genera un número entre 1000 y 10000
                totalVentas += ventas[i][j];
            }
        }

        // Calcular el promedio de las ventas
        promedioVentas = (double) totalVentas / (3 * 3);

        // Mostrar la matriz de ventas
        System.out.println("Matriz de Ventas (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(ventas[i][j] + "\t");
            }
            System.out.println();
        }

        // Mostrar el total y el promedio de las ventas
        System.out.println("\nTotal de las ventas: " + totalVentas);
        System.out.println("Promedio de las ventas: " + promedioVentas);
    }
}