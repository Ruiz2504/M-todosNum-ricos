package Tema4.MetodoTrapecio;

import java.util.function.Function;

public class Ejercicio2 {
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
        
        System.out.println("\t\t\t\t Método Trapecio - Ejercicio 2 \n");
        
        // Definir la función a integrar
        Function<Double, Double> f = x -> ( - Math.pow(x, 2)) + (8*x) - 12;

        // Límites de integración
        double a = 3; // Límite inferior
        double b = 5; // Límite superior

        // Número de subintervalos
        int n = 1; // Ajustar este valor según la precisión deseada

        // Calcular la integral usando la regla del trapecio
        double result = trapezoidalRule(f, a, b, n);
        System.out.println("El resultado de la integral es: " + result);
    }
}
