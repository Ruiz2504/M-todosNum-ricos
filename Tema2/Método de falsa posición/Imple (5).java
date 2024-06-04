import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("\t\t\t\t -- Método de la falsa posición (EJERCICIO 5) --");
 
        System.out.print("Ingrese el límite inferior: ");
        double a = scanner.nextDouble();
 
        System.out.print("Ingrese el límite superior: ");
        double b = scanner.nextDouble();
 
        System.out.print("Ingrese el número máximo de iteraciones: ");
        int maxIter = scanner.nextInt();
 
        System.out.print("Ingrese el valor de tolerancia: ");
        double tol = scanner.nextDouble();
 
        // Se calcula la raíz de la ecuación utilizando el método de la posición falsa
        double root = falsePositionMethod(a, b, maxIter, tol);
 
        // Se imprime el resultado en formato decimal con 5 cifras después del punto decimal
        System.out.printf("La raíz de la ecuación es: %.5f%n", root);
     }
 
     // Método que implementa el algoritmo de la posición falsa
     public static double falsePositionMethod(double a, double b, int maxIter, double tol) {
        // Se verifica si la función cambia de signo en el intervalo [a, b]
        if (func(a) * func(b) > 0) {
            // Si no cambia de signo, se imprime un mensaje indicando que la función no encierra la raíz
            System.out.println("El método no puede encontrar una raíz en el intervalo.");
            return -1;
         }
 
         double xa, xb, xr = 0;
         xa = a;
         xb = b;
 
         for (int i = 0; i < maxIter; i++) {
             xr = xb - (func(xb) * (xb - xa) / (func(xb) - func(xa)));
             if (Math.abs(func(xr)) < tol) {
                 // Si no cambia de signo, se imprime un mensaje indicando que la función no encuentra la raiz en el intervalo dado 
                 return xr;
             }
             if (func(xa) * func(xr) < 0) {
                 // Si la función cambia de signo entre x0 y x2, se actualiza x1
                 xb = xr;
             } else {
                 // De lo contrario, se actualiza x0
                 xa = xr;
             }
         }
         // Si se alcanza el número máximo de iteraciones sin encontrar una raíz con la tolerancia especificada, se devuelve el último valor de x2 como la raíz aproximada
         return xr;
     }
 
     // Método que define la función cuya raíz se desea encontrar
     public static double func(double x) {
        return -0.5 * Math.pow(x, 2) + 2.5 * x + 4.5;
     }
}