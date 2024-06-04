public class Ejercicio1 {
    public static void main(String[] args) {
        // Definir las matrices directamente
        double[][] matrix = {
            {3, 2, 1, 1},
            {5, 3, 4, 2},
            {1, 1, -1, 1}
        };

        // Realizar el algoritmo de Gauss-Jordan
        gaussJordan(matrix);
        
        // Imprimir la matriz en su forma escalonada reducida por filas
        System.out.println("La matriz en su forma escalonada reducida por filas es:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (Math.abs(matrix[i][j] - (int)matrix[i][j]) < 1e-6) {
                    System.out.print((int)matrix[i][j] + "\t");
                } else {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
        
        // Imprimir los valores de x, y, y z
        System.out.println("Solución del sistema de ecuaciones:");
        double x = matrix[0][matrix[0].length - 1];
        double y = matrix[1][matrix[0].length - 1];
        double z = matrix[2][matrix[0].length - 1];
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
    
    public static void gaussJordan(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        for (int k = 0; k < rows; k++) {
            // Pivoteo parcial
            int maxRow = k;
            for (int i = k + 1; i < rows; i++) {
                if (Math.abs(matrix[i][k]) > Math.abs(matrix[maxRow][k])) {
                    maxRow = i;
                }
            }
            double[] temp = matrix[k];
            matrix[k] = matrix[maxRow];
            matrix[maxRow] = temp;
            
            // Reducción
            for (int i = 0; i < rows; i++) {
                if (i != k) {
                    double factor = matrix[i][k] / matrix[k][k];
                    for (int j = k; j < cols; j++) {
                        matrix[i][j] -= factor * matrix[k][j];
                    }
                }
            }
            
            // Normalización
            double divisor = matrix[k][k];
            for (int j = k; j < cols; j++) {
                matrix[k][j] /= divisor;
            }
        }
    } 
}
