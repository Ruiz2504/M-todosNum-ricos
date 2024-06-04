package Tema4.MetodoCuadraturaGaussiana;

import java.util.function.Function;

public class Ejercicio1 {
    // Coeficientes y nodos para la cuadratura Gaussiana con 5 puntos
    private static final double[] nodos = {-0.906179845938664, -0.538469310105683, 0, 0.538469310105683, 0.906179845938664};
    private static final double[] pesos = {0.236926885056189, 0.478628670499366, 0.568888888888889, 0.478628670499366, 0.236926885056189};

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
        
        System.out.println("\t\t\t\t Método de la Cuadratura Gaussiana - Ejercicio 1 \n");
        
        // Definir la función a integrar
        Function<Double, Double> f = x -> Math.sin(x); // Ejemplo: integral de sin(x)

        // Límites de integración
        double a = 0; // Límite inferior
        double b = Math.PI; // Límite superior

        // Calcular la integral usando el método de cuadratura Gaussiana
        double resultado = cuadraturaGaussiana(f, a, b);
        System.out.println("El resultado de la integral es: " + resultado);
    }
}
