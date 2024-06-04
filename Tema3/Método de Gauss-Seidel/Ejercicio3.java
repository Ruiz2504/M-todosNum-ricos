public class Ejercicio3 {
    public static void main(String[] args) {
        double[][] coeficientes = {
            {3, -0.1, -0.2},
            {0.1, 7, -0.3},
            {0.3, -0.2, 10}
        };
        double[] terminosIndependientes = {7.85, -19.3, 71.4};
        double[] solucion = resolverSistema(coeficientes, terminosIndependientes);
        for (int i = 0; i < solucion.length; i++) {
            System.out.println("x[" + (i+1) + "] = " + solucion[i]);
        }

    }

    public static double[] resolverSistema(double[][] coeficientes, double[] terminosIndependientes) {
        int n = coeficientes.length;
        double[] x = new double[n];
        double[] nuevoX = new double[n];
        int iteracionesMaximas = 100;
        double epsilon = 1e-6;

        for (int iter = 0; iter < iteracionesMaximas; iter++) {
            for (int i = 0; i < n; i++) {
                nuevoX[i] = terminosIndependientes[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        nuevoX[i] -= coeficientes[i][j] * x[j];
                    }
                }
                nuevoX[i] /= coeficientes[i][i];
            }

            boolean detener = true;
            for (int i = 0; i < n; i++) {
                if (Math.abs(nuevoX[i] - x[i]) > epsilon) {
                    detener = false;
                    break;
                }
            }

            if (detener) {
                break;
            }

            System.arraycopy(nuevoX, 0, x, 0, n);
        }
        return x;
    }
}
