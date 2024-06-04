package Tema4.MetodoCuadraturaGaussiana;

import java.util.function.Function;

public class Ejercicio5 {
    // Coeficientes y nodos para la cuadratura Gaussiana con 8 puntos
    private static final double[] nodos = {0, 0.183434642495650, -0.183434642495650, 0.525532409916329, -0.525532409916329, 0.796666477413627, -0.796666477413627, 0.960289856497536, -0.960289856497536};
    private static final double[] pesos = {0.361418309562439, 0.313706645877887, 0.313706645877887, 0.222381034453374, 0.222381034453374, 0.101228536290376, 0.101228536290376, 0.062303530026471, 0.062303530026471};
    

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
        
        System.out.println("\t\t\t\t Método de la Cuadratura Gaussiana - Ejercicio 5 \n");
        
        // Definir la función a integrar
        Function<Double, Double> f = x -> Math.sin(x) + Math.cos(x); // Función: sin(x) + cos(x)

        // Límites de integración
        double a = 0; // Límite inferior
        double b = Math.PI / 2; // Límite superior

        // Calcular la integral usando el método de cuadratura Gaussiana
        double resultado = cuadraturaGaussiana(f, a, b);
        System.out.println("El resultado de la integral es: " + resultado);
    }
}
