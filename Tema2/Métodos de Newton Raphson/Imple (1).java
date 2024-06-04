import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\t\t\t -- Método de Newton (EJERCICIO 1) --"); 
        
        System.out.print("Ingrese la aproximación inicial: ");
        double x0 = scanner.nextDouble(); 

        System.out.print("Ingrese el número máximo de iteraciones: ");
        int maxIter = scanner.nextInt(); 

        System.out.print("Ingrese el valor de tolerancia: ");
        double tol = scanner.nextDouble(); 

        // Se calcula la raíz de la ecuación utilizando el método de Newton
        double root = newtonMethod(x0, maxIter, tol); 

        // La parte %.5f%n sirve para formatear el resultado de la variable root como un número decimal con 5 dígitos después del punto decimal.
        System.out.printf("La raíz de la ecuación es: %.5f%n", root); 
    }

    public static double newtonMethod(double x0, int maxIter, double tol) {
        double fx = func(x0); // Calcula el valor de la función en x0
        double df = funcDerivada(x0); // Calcula el valor de la derivada de la función en x0

        if (df == 0) {
            System.out.println("El método no puede encontrar una raíz en la aproximacion."); // Mensaje que se muestra si la derivada en la conjetura inicial no tiene una raiz
            return -1;
        }

        double x1 = 0;
        for (int i = 0; i < maxIter; i++) {
            x1 = x0 - (fx / df); // Actualiza la aproximación utilizando la fórmula del método de Newton
            double error = Math.abs(x1 - x0); // Calcula el error relativo
            if (error < tol) {
                return x1; // Si el error es menor que el valor de tolerancia, devuelve la aproximación actual como la raíz
            }
            x0 = x1; // Actualiza la aproximación para la iteración siguiente
            fx = func(x0); // Calcula el valor de la función en la nueva aproximación
            df = funcDerivada(x0); // Calcula el valor de la derivada de la función en la nueva aproximación
        }
        return x1; // Si se alcanza el número máximo de iteraciones sin encontrar una raíz con la tolerancia especificada, devuelve la última aproximación
    }

    public static double func(double x) {
        return Math.pow(x, 2) - 2 * x - 5; // Definir la función cuya raíz se desea encontrar
    }

    public static double funcDerivada(double x) {
        return 2 * x - 2;  //Definir la derivada de la función
    }
}