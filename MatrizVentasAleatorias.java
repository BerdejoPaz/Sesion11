import java.util.Random;
/**
 Matriz de Ventas (4x4):
4819	3018	4065	3544	
68	3842	1304	288	
4920	3361	2171	3602	
2803	3089	4228	1878	

Venta mayor en la matriz: 4920
Venta menor en la matriz: 68
 */
public class MatrizVentasAleatorias {
    public static void main(String[] args) {
        int[][] ventas = new int[4][4];
        int ventaMayor = Integer.MIN_VALUE;
        int ventaMenor = Integer.MAX_VALUE;
        Random random = new Random();

        // Generar ventas aleatorias y asignarlas a la matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                ventas[i][j] = random.nextInt(4991) + 10; // Genera un número entre 10 y 5000

                // Actualizar la venta mayor y menor
                if (ventas[i][j] > ventaMayor) {
                    ventaMayor = ventas[i][j];
                }
                if (ventas[i][j] < ventaMenor) {
                    ventaMenor = ventas[i][j];
                }
            }
        }

        // Mostrar la matriz de ventas
        System.out.println("Matriz de Ventas (4x4):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(ventas[i][j] + "\t");
            }
            System.out.println();
        }

        // Mostrar la venta mayor y menor
        System.out.println("\nVenta mayor en la matriz: " + ventaMayor);
        System.out.println("Venta menor en la matriz: " + ventaMenor);
    }
}