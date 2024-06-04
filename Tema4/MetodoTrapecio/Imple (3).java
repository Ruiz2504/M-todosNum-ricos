package Tema4.MetodoTrapecio;

import java.util.function.Function;

public class Ejercicio3 {
    public static double trapezoidalRule(Function<Double, Double> f, double a, double b, int n) {
        double h = (b - a) / n;
        double sum = 0.5 * (f.apply(a) + f.apply(b));
        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            sum += f.apply(x);
        }
        return h * sum;
    }

    public static void main(String[] args) {
        
        System.out.println("\t\t\t\t Método Trapecio - Ejercicio 3 \n");
        
        // Definir la función a integrar
        Function<Double, Double> f = x -> x / (Math.pow(x, 4) + 1); // Definir la función a integrar: x / (x^4 + 1)

        // Límites de integración
        double a = 1; // Límite inferior
        double b = 3; // Límite superior

        // Número de subintervalos
        int n = 8; // Ajustar este valor según la precisión deseada

        // Calcular la integral usando la regla del trapecio
        double result = trapezoidalRule(f, a, b, n);
        System.out.println("El resultado de la integral es: " + result);
    }
}
