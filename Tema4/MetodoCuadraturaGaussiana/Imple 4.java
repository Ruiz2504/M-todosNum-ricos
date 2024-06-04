package Tema4.MetodoCuadraturaGaussiana;

import java.util.function.Function;

public class Ejercicio4 {
    // Coeficientes y nodos para la cuadratura Gaussiana con 7 puntos
    private static final double[] nodos = {0, 0.405845151377397, -0.405845151377397, 0.741531185599394, -0.741531185599394, 0.949107912342759, -0.949107912342759};
    private static final double[] pesos = {0.417959183673469, 0.381830050505119, 0.381830050505119, 0.279705391489277, 0.279705391489277, 0.129484966168870, 0.129484966168870};
    

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
        
        System.out.println("\t\t\t\t Método de la Cuadratura Gaussiana - Ejercicio 4 \n");
        
        // Definir la función a integrar
        Function<Double, Double> f = x -> x * x + 3 * x - 2; // Función: x^2 + 3x - 2

        // Límites de integración
        double a = -3; // Límite inferior
        double b = 3; // Límite superior

        // Calcular la integral usando el método de cuadratura Gaussiana
        double resultado = cuadraturaGaussiana(f, a, b);
        System.out.println("El resultado de la integral es: " + resultado);
    }
}
