import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\t\t\t -- Método de la secante (EJERCICIO 3) --"); 
        
        System.out.print("Ingrese Ingrese la primera aproximación: ");
        double x0 = scanner.nextDouble(); 
        
        System.out.print("Ingrese la segunda aproximación: ");
        double x1 = scanner.nextDouble(); 
        
        System.out.print("Ingrese el número máximo de iteraciones: ");
        int maxIter = scanner.nextInt(); 
        
        System.out.print("Ingrese el valor de tolerancia: ");
        double tol = scanner.nextDouble(); 

        // Se calcula la raíz de la ecuación utilizando el método de la secante
        double root = secantMethod(x0, x1, maxIter, tol); 

        // La parte %.5f%n sirve para formatear el resultado de la variable root como un número decimal con 5 dígitos después del punto decimal.
        System.out.printf("La raíz de la ecuación es: %.5f%n", root); 
    }

    public static double secantMethod(double x0, double x1, int maxIter, double tol) {
        if (func(x0) * func(x1) == 0) {
            System.out.println("El método no puede encontrar una raíz en el intervalo."); // Mensaje que se muestra si la raiz no esta dentro de las 2 aproximaciones
            return -1;
        }

        double x2 = 0;
        for (int i = 0; i < maxIter; i++) {
            x2 = x1 - (func(x1) * (x1 - x0) / (func(x1) - func(x0))); // Calcula la raiz siguendo la formula del método de la secante 
            if (Math.abs(x1 - x2) < tol) {
                return x2; // Si el cambio en las aproximaciones es menor que el valor de tolerancia, devolver la aproximación actual como la raíz
            }
            x0 = x1; // Actualizar el valor de x0
            x1 = x2; // Actualizar el valor de x1
        }
        return x2; // Si se alcanza el número máximo de iteraciones sin encontrar una raíz con la tolerancia especificada, devolver la última aproximación
    }

    public static double func(double x) {
        return 2 * Math.pow(x, 3) - x + 1; // Definir la función cuya raíz se desea encontrar
    }
}