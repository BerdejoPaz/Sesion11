import java.util.Random;
/**
 Matriz de Sueldos (5x5):
2500	7525	9090	8557	1895	
2298	8691	2363	8962	2440	
1074	6297	9925	1855	1844	
8304	6685	1799	3564	4696	
9967	3212	4127	3524	9957	

Suma de sueldos: 131151
Sueldo promedio: 5246.04
 */
public class MatrizSueldos {
    public static void main(String[] args) {
        int[][] sueldos = new int[5][5];
        int sumaSueldos = 0;
        double promedioSueldos;
        Random random = new Random();

        // Generar sueldos aleatorios y asignarlos a la matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sueldos[i][j] = random.nextInt(8976) + 1025; // Rango de 1025 a 10000
                sumaSueldos += sueldos[i][j];
            }
        }

        // Calcular el promedio de los sueldos
        promedioSueldos = (double) sumaSueldos / (5 * 5);

        // Mostrar la matriz de sueldos, la suma y el promedio
        System.out.println("Matriz de Sueldos (5x5):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(sueldos[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nSuma de sueldos: " + sumaSueldos);
        System.out.println("Sueldo promedio: " + promedioSueldos);
    }
}