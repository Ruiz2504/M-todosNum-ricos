package Tema4.MetodoReglaSimpson3_8;

import java.util.function.Function;

public class Ejercicio4 {
    public static double simpsonThreeEighthRule(Function<Double, Double> f, double a, double b, int n) {
        double h = (b - a) / n;
        double sum = f.apply(a) + f.apply(b);
        
        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            if (i % 3 == 0) {
                sum += 2 * f.apply(x);
            } else {
                sum += 3 * f.apply(x);
            }
        }
        
        return (3 * h / 8) * sum;
    }

    public static void main(String[] args) {
        
        System.out.println("\t\t\t\t Método de la Regla de Simpson 3/8 - Ejercicio 4 \n");
        
        // Definir la función a integrar
        Function<Double, Double> f = x -> Math.sin(x) / (Math.pow(x, 4) + 1);

        // Límites de integración
        double a = -1; // Límite inferior
        double b = 3; // Límite superior

        // Número de subintervalos (debe ser múltiplo de 3)
        int n = 9; // Ajustar este valor según la precisión deseada
        if (n % 3 != 0) {
            System.out.println("El número de subintervalos debe ser múltiplo de 3.");
            return;
        }

        // Calcular la integral usando el método de Simpson 3/8
        double result = simpsonThreeEighthRule(f, a, b, n);
        System.out.println("El resultado de la integral es: " + result);
    }
}
