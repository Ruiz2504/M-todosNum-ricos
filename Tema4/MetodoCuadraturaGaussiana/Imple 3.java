package Tema4.MetodoCuadraturaGaussiana;

import java.util.function.Function;

public class Ejercicio3 {
    // Coeficientes y nodos para la cuadratura Gaussiana con 3 puntos
    private static final double[] nodos = {0, 0.774596669241483, -0.774596669241483};
    private static final double[] pesos = {0.888888888888889, 0.555555555555556, 0.555555555555556};
    

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
        
        System.out.println("\t\t\t\t Método de la Cuadratura Gaussiana - Ejercicio 3 \n");
        
        // Definir la función a integrar
        Function<Double, Double> f = x -> Math.log(x + 1); // Función: ln(x + 1)

        // Límites de integración
        double a = 1; // Límite inferior
        double b = 5; // Límite superior

        // Calcular la integral usando el método de cuadratura Gaussiana
        double resultado = cuadraturaGaussiana(f, a, b);
        System.out.println("El resultado de la integral es: " + resultado);
    }
}
