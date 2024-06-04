package Tema4.MetodoReglaSimpson1_3;

import java.util.function.Function;

public class Ejercicio1 {
    public static double simpsonOneThirdRule(Function<Double, Double> f, double a, double b, int n) {
        double h = (b - a) / n;
        double sum = f.apply(a) + f.apply(b);
        
        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            if (i % 2 == 0) {
                sum += 2 * f.apply(x);
            } else {
                sum += 4 * f.apply(x);
            }
        }
        
        return (h / 3) * sum;
    }

    public static void main(String[] args) {
        
        System.out.println("\t\t\t\t Método de la Regla de Simpson 1/3 - Ejercicio 1 \n");
        
        // Definir la función a integrar
        Function<Double, Double> f = x -> Math.sqrt(5 + Math.pow(x, 3));

        // Límites de integración
        double a = 0; // Límite inferior
        double b = 1; // Límite superior

        // Número de subintervalos (debe ser par)
        int n = 2; // Ajustar este valor según la precisión deseada
        if (n % 2 != 0) {
            System.out.println("El número de subintervalos debe ser par.");
            return;
        }

        // Calcular la integral usando el método de Simpson 1/3
        double result = simpsonOneThirdRule(f, a, b, n);
        System.out.println("El resultado de la integral es: " + result);
    }
}
