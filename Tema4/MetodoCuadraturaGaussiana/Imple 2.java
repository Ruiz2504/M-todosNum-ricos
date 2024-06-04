package Tema4.MetodoCuadraturaGaussiana;

import java.util.function.Function;

public class Ejercicio2 {
    // Coeficientes y nodos para la cuadratura Gaussiana con 4 puntos
    private static final double[] nodos = {-0.861136311594053, -0.339981043584856, 0.339981043584856, 0.861136311594053};
    private static final double[] pesos = {0.347854845137454, 0.652145154862546, 0.652145154862546, 0.347854845137454};
    

    public static double cuadraturaGaussiana(Function<Double, Double> f, double a, double b) {
        double suma = 0;
        double escala = (b - a) / 2.0;
        double desplazamiento = (a + b) / 2.0;
        for (int i = 0; i < nodos.length; i++) {
            double x = escala * nodos[i] + desplazamiento;
            suma += pesos[i] * f.apply(x);
        }
        return escala * suma;
    }

    public static void main(String[] args) {
        
        System.out.println("\t\t\t\t Método de la Cuadratura Gaussiana - Ejercicio 2 \n");
        
        // Definir la función a integrar
        Function<Double, Double> f = x -> x * x * x + 2 * x - 1; // Función: x^3 + 2x - 1

        // Límites de integración
        double a = -2; // Límite inferior
        double b = 2; // Límite superior

        // Calcular la integral usando el método de cuadratura Gaussiana
        double resultado = cuadraturaGaussiana(f, a, b);
        System.out.println("El resultado de la integral es: " + resultado);
    }
}
