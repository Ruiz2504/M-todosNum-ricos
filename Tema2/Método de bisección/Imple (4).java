import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\t\t\t\t -- Método de bisección (EJERCICIO 4) --");

        System.out.print("Ingrese el límite inferior: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el límite superior: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el número máximo de iteraciones: ");
        int maxIter = scanner.nextInt();

        System.out.print("Ingrese el valor de tolerancia: ");
        double tol = scanner.nextDouble();

        // Encontrar la raíz de la función usando el método de bisección
        double root = bisectionMethod(a, b, maxIter, tol);

        // La parte %.5f%n sirve para formatear el resultado de la variable root como un número decimal con 5 dígitos después del punto decimal.
        System.out.printf("La raíz de la ecuación es: %.5f%n", root);
    }

    // Definir el método de bisección
    public static double bisectionMethod(double a, double b, int maxIter, double tol) {
        // Verificar si la función cambia de signo en el intervalo
        if ((func(a) * func(b)) > 0) {
            System.out.println("El método no puede encontrar una raíz en el intervalo.");
            return -1;
        }

        double c;
        // Iterar hasta que se alcance el número máximo de iteraciones
        for (int i = 0; i < maxIter; i++) {
            // Calcular el punto medio del intervalo
            c = (a + b) / 2;
            // Verificar si el punto medio está dentro de la tolerancia
            if (Math.abs(func(c)) < tol) {
                // Devolver el punto medio como la raíz
                return c;
            }
            // Actualizar el intervalo
            if (func(a) * func(c) < 0) {
                b = c;
            } else {
                a = c;
            }
        }
        // Devolver el punto medio del intervalo final como la raíz
        return (a + b) / 2;
    }

    // Definir la función para encontrar la raíz de
    public static double func(double x) {
        return Math.pow(x, 3) - 9 * Math.pow(x, 4) + 2*x + 12;
    }
}