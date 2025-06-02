# MétodosNuméricos
Aqupi se encuentran todos los ejercicios del semestre :))

# Tema 1
## Método overflow
El overflow en métodos numéricos ocurre cuando los resultados de cálculos exceden los límites manejables por el sistema o el tipo de dato utilizado, generando errores o comportamientos inesperados. Esto suele presentarse en algoritmos iterativos que no convergen, operaciones con valores extremadamente grandes o al usar tipos de datos con rango insuficiente. Para prevenirlo, se implementan estrategias como la normalización de datos, el uso de algoritmos estables y la selección adecuada de tipos de datos. Su manejo es esencial para garantizar la precisión y estabilidad de los resultados numéricos <br>
### Fórmula
El overflow ocurre cuando:

Donde:
- `a` y `b` son los valores involucrados en el cálculo.
- `max_value` es el límite superior permitido por el tipo de dato.

Para prevenir overflow, se recomienda escalar los valores o elegir tipos de datos con mayor rango.

### Algoritmo

1. Ingresar los valores \( a \) y \( b \).
2. Definir \( max\_value \), el límite máximo permitido por el tipo de dato.
3. Calcular \( resultado = a * b \).
4. Si \( resultado > max\_value \):
   - Mostrar mensaje: "Overflow detectado".
   - Detener el cálculo o ajustar valores.
5. Si no, retornar \( resultado \).

### Implementaciónes con caso de uso
<a href="/Tema1/Overflow/Imple (1).java">Ejercicio 1</a><br>
<a href="/Tema1/Overflow/Imple (2).java">Ejercicio 2</a><br>
<a href="/Tema1/Overflow/Imple (3).java">Ejercicio 3</a><br>
<a href="/Tema1/Overflow/Imple (4).java">Ejercicio 4</a><br>
<a href="/Tema1/Overflow/Imple (5).java">Ejercicio 5</a><br>
<br>
## Método de Redondeo
El método de redondeo consiste en aproximar un número al entero más cercano según su valor decimal. Si la parte decimal es mayor o igual a 0.5, el número se redondea hacia arriba; de lo contrario, hacia abajo. Es ampliamente usado para reducir errores de representación en cálculos numéricos.
### Fórmula
El redondeo se calcula como:

- Si \( x \geq 0 \): `round(x) = floor(x + 0.5)`
- Si \( x < 0 \): `round(x) = ceil(x - 0.5)`

Donde:
- `x` es el número a redondear.
- `floor` es la función piso (mayor entero menor o igual que el argumento).
- `ceil` es la función techo (menor entero mayor o igual que el argumento).

### Algoritmo del Método de Redondeo

1. Ingresar el número \( x \).
2. Si \( x \geq 0 \):
   - Calcular \( resultado = \lfloor x + 0.5 \rfloor \).
3. Si \( x < 0 \):
   - Calcular \( resultado = \lceil x - 0.5 \rceil \).
4. Retornar \( resultado \).

### Implementaciones con caso de uso

<a href="/Tema1/Redondeo/Codigo1.java">Ejercicio 1</a><br>
<a href="/Tema1/Redondeo/Codigo2.java">Ejercicio 2</a><br>
<a href="/Tema1/Redondeo/Codigo3.java">Ejercicio 3</a><br>
<a href="/Tema1/Redondeo/Codigo4.java">Ejercicio 4</a><br>
<a href="/Tema1/Redondeo/Codigo5.java">Ejercicio 5</a><br>

## Método de Truncamiento
El método de truncamiento consiste en eliminar la parte decimal de un número, dejando solo la parte entera sin importar el valor de la fracción. Es útil cuando se quiere una aproximación rápida hacia cero, sin redondeos. Este método puede generar errores mayores que el redondeo, pero es sencillo y rápido de aplicar.

### Fórmula
El truncamiento se calcula como:

- Si \( x \geq 0 \): `trunc(x) = floor(x)`
- Si \( x < 0 \): `trunc(x) = ceil(x)`

Donde:
- `x` es el número a truncar.
- `floor` es la función piso (mayor entero menor o igual que el argumento).
- `ceil` es la función techo (menor entero mayor o igual que el argumento).

### Algoritmo del Método de Truncamiento

1. Ingresar el número \( x \).
2. Si \( x \geq 0 \):
   - Calcular \( resultado = \lfloor x \rfloor \).
3. Si \( x < 0 \):
   - Calcular \( resultado = \lceil x \rceil \).
4. Retornar \( resultado \).

# Tema 2

## Método de la Secante
El método de la secante es una técnica numérica para encontrar raíces de una función aproximando la solución mediante líneas secantes entre dos puntos cercanos. A diferencia del método de Newton, no requiere el cálculo de derivadas, lo que lo hace útil cuando la derivada es difícil de obtener. Es un método iterativo que converge rápidamente si se eligen buenos puntos iniciales.

### Fórmula
La fórmula iterativa del método de la secante es:

\[
x_{n+1} = x_n - f(x_n) \cdot \frac{x_n - x_{n-1}}{f(x_n) - f(x_{n-1})}
\]

Donde:
- \( x_n \) y \( x_{n-1} \) son las aproximaciones actuales y anteriores.
- \( f(x) \) es la función cuyo cero se busca.

### Algoritmo del Método de la Secante

1. Ingresar dos valores iniciales \( x_0 \) y \( x_1 \).
2. Calcular \( x_{n+1} = x_n - f(x_n) \cdot \frac{x_n - x_{n-1}}{f(x_n) - f(x_{n-1})} \).
3. Verificar si \( |x_{n+1} - x_n| \) es menor que la tolerancia deseada.
   - Si sí, terminar y retornar \( x_{n+1} \).
   - Si no, actualizar \( x_{n-1} = x_n \) y \( x_n = x_{n+1} \), luego repetir el paso 2.
4. Repetir hasta cumplir criterio de convergencia o límite de iteraciones.


### Implementaciones con caso de uso

<a href="/Tema2/Método Secante/Imple (1).java">Ejercicio 1</a><br>
<a href="/Tema2/Método Secante/Imple (2).java">Ejercicio 2</a><br>
<a href="/Tema2/Método Secante/Imple (3).java">Ejercicio 3</a><br>
<a href="/Tema2/Método Secante/Imple (4).java">Ejercicio 4</a><br>
<a href="/Tema2/Método Secante/Imple (5).java">Ejercicio 5</a><br>

## Método de Bisección
El método de bisección es una técnica numérica para encontrar raíces de una función continua, dividiendo iterativamente un intervalo donde la función cambia de signo. Se basa en el teorema del valor intermedio, garantizando la existencia de una raíz dentro del intervalo. Es simple, seguro y converge linealmente, aunque puede ser más lento que otros métodos.

### Fórmula
En cada iteración, se calcula el punto medio:

\[
x_m = \frac{a + b}{2}
\]

Donde:
- \( a \) y \( b \) son los extremos del intervalo actual donde \( f(a) \cdot f(b) < 0 \).
- \( x_m \) es el nuevo punto medio donde se evalúa \( f(x_m) \).

Según el signo de \( f(x_m) \), se elige el subintervalo que contiene la raíz para la siguiente iteración.

### Algoritmo del Método de Bisección

1. Ingresar el intervalo inicial \([a, b]\) tal que \( f(a) \cdot f(b) < 0 \).
2. Calcular el punto medio \( x_m = \frac{a + b}{2} \).
3. Evaluar \( f(x_m) \).
4. Si \( f(x_m) = 0 \) o el error es menor que la tolerancia, retornar \( x_m \).
5. Si \( f(a) \cdot f(x_m) < 0 \), entonces asignar \( b = x_m \); si no, asignar \( a = x_m \).
6. Repetir desde el paso 2 hasta cumplir el criterio de convergencia.

### Implementaciones con caso de uso

<a href="/Tema2/Método Bisección/Imple (1).java">Ejercicio 1</a><br>
<a href="/Tema2/Método Bisección/Imple (2).java">Ejercicio 2</a><br>
<a href="/Tema2/Método Bisección/Imple (3).java">Ejercicio 3</a><br>
<a href="/Tema2/Método Bisección/Imple (4).java">Ejercicio 4</a><br>
<a href="/Tema2/Método Bisección/Imple (5).java">Ejercicio 5</a><br>

## Método de la Falsa Posición
El método de la falsa posición es una técnica numérica para encontrar raíces de una función continua que combina la bisección con la interpolación lineal. Se calcula un punto basado en la secante del intervalo, buscando una aproximación más rápida que la bisección. Este método garantiza la convergencia si la función cambia de signo en el intervalo.

### Fórmula
El punto \( x_r \) se calcula con:

\[
x_r = b - \frac{f(b)(a - b)}{f(a) - f(b)}
\]

Donde:
- \( a \) y \( b \) son los extremos del intervalo con \( f(a) \cdot f(b) < 0 \).
- \( f(a) \) y \( f(b) \) son los valores de la función en esos puntos.

### Algoritmo del Método de la Falsa Posición

1. Ingresar el intervalo inicial \([a, b]\) tal que \( f(a) \cdot f(b) < 0 \).
2. Calcular \( x_r = b - \frac{f(b)(a - b)}{f(a) - f(b)} \).
3. Evaluar \( f(x_r) \).
4. Si \( f(x_r) = 0 \) o el error es menor que la tolerancia, retornar \( x_r \).
5. Si \( f(a) \cdot f(x_r) < 0 \), entonces asignar \( b = x_r \); si no, asignar \( a = x_r \).
6. Repetir desde el paso 2 hasta cumplir el criterio de convergencia.

### Implementaciones con caso de uso

<a href="/Tema2/Método falsa posición/Imple (1).java">Ejercicio 1</a><br>
<a href="/Tema2/Método falsa posición/Imple (2).java">Ejercicio 2</a><br>
<a href="/Tema2/Método falsa posición/Imple (3).java">Ejercicio 3</a><br>
<a href="/Tema2/Método falsa posición/Imple (4).java">Ejercicio 4</a><br>
<a href="/Tema2/Método falsa posición/Imple (5).java">Ejercicio 5</a><br>

## Método de Newton-Raphson
El método de Newton-Raphson es un procedimiento iterativo para encontrar raíces de funciones usando la derivada de la función. A partir de una aproximación inicial, se mejora la estimación mediante la fórmula que usa la pendiente de la tangente, logrando una convergencia rápida si la función es suave y la aproximación está cerca de la raíz.

### Fórmula
La fórmula iterativa es:

\[
x_{n+1} = x_n - \frac{f(x_n)}{f'(x_n)}
\]

Donde:
- \( x_n \) es la aproximación actual.
- \( f(x) \) es la función.
- \( f'(x) \) es la derivada de la función.

### Algoritmo del Método de Newton-Raphson

1. Ingresar la aproximación inicial \( x_0 \).
2. Calcular \( x_{n+1} = x_n - \frac{f(x_n)}{f'(x_n)} \).
3. Verificar si \( |x_{n+1} - x_n| \) es menor que la tolerancia deseada.
   - Si sí, retornar \( x_{n+1} \).
   - Si no, actualizar \( x_n = x_{n+1} \) y repetir el paso 2.
4. Repetir hasta cumplir criterio de convergencia o límite de iteraciones.

### Implementaciones con caso de uso

<a href="/Tema2/Métodos de Newton Rapshon/Imple (1).java">Ejercicio 1</a><br>
<a href="/Tema2/Métodos de Newton Rapshon/Imple (2).java">Ejercicio 2</a><br>
<a href="/Tema2/Métodos de Newton Rapshon/Imple (3).java">Ejercicio 3</a><br>
<a href="/Tema2/Métodos de Newton Rapshon/Imple (4).java">Ejercicio 4</a><br>
<a href="/Tema2/Métodos de Newton Rapshon/Imple (5).java">Ejercicio 5</a><br>

# Tema 3

## Método de Eliminación Gaussiana
El método de Eliminación Gaussiana es una técnica para resolver sistemas de ecuaciones lineales. Consiste en transformar la matriz aumentada del sistema en una matriz triangular superior mediante operaciones elementales de filas, y luego resolver el sistema por sustitución regresiva.

### Fórmula
El procedimiento se basa en las operaciones elementales:

1. Escalar filas para que el pivote sea igual a 1.
2. Hacer ceros por debajo del pivote en la columna correspondiente.
3. Continuar con las siguientes filas hasta obtener una matriz triangular superior.

La solución se encuentra al resolver el sistema a partir de la última ecuación hacia arriba.

### Algoritmo del Método de Eliminación Gaussiana

1. Ingresar el sistema de ecuaciones en forma de matriz aumentada \( A|B \).
2. Para cada fila \( i \) de la matriz:
   - Dividir la fila \( i \) por el pivote \( A[i][i] \).
   - Restar múltiplos de la fila \( i \) de las filas debajo de ella para hacer ceros.
3. Realizar sustitución regresiva para encontrar las soluciones.

### Implementaciones con caso de uso

<a href="/Tema3/Eliminación Gaussiana/Imple 1.java">Ejercicio 1</a><br>
<a href="/Tema3/Eliminación Gaussiana/Imple 2.java">Ejercicio 2</a><br>
<a href="/Tema3/Eliminación Gaussiana/Imple 3.java">Ejercicio 3</a><br>
<a href="/Tema3/Eliminación Gaussiana/Imple 4.java">Ejercicio 4</a><br>
<a href="/Tema3/Eliminación Gaussiana/Imple 5.java">Ejercicio 5</a><br>

## Método de Gauss-Jordan
El método de Gauss-Jordan es una extensión del método de Eliminación Gaussiana que permite obtener la solución exacta de un sistema de ecuaciones lineales directamente, transformando la matriz aumentada en su forma reducida por filas (matriz identidad en el lado de los coeficientes).

### Fórmula
El método utiliza operaciones elementales de filas para convertir la matriz aumentada \( A|B \) en una matriz identidad \( I|X \), donde \( X \) es la solución del sistema. Esto se logra haciendo ceros arriba y abajo de cada pivote y normalizando los pivotes a 1.

### Algoritmo del Método de Gauss-Jordan

1. Ingresar el sistema de ecuaciones en forma de matriz aumentada \( A|B \).
2. Para cada columna \( j \) de la matriz:
   - Dividir la fila \( j \) por el pivote \( A[j][j] \) para normalizarlo a 1.
   - Restar múltiplos de la fila \( j \) de las demás filas para hacer ceros arriba y abajo del pivote.
3. Continuar hasta transformar \( A \) en una matriz identidad.
4. Extraer \( X \) como la solución del sistema.

### Implementaciones con caso de uso

<a href="/Tema3/Método de Gauss-Jordan/Imple (1).java">Ejercicio 1</a><br>
<a href="/Tema3/Método de Gauss-Jordan/Imple (2).java">Ejercicio 2</a><br>
<a href="/Tema3/Método de Gauss-Jordan/Imple (3).java">Ejercicio 3</a><br>
<a href="/Tema3/Método de Gauss-Jordan/Imple (4).java">Ejercicio 4</a><br>
<a href="/Tema3/Método de Gauss-Jordan/Imple (5).java">Ejercicio 5</a><br>

# Método de Gauss-Seidel

El método de Gauss-Seidel es un método iterativo utilizado para resolver sistemas de ecuaciones lineales. Este método es particularmente útil cuando el sistema es grande y escasamente poblado, ya que reduce significativamente el costo computacional en comparación con métodos directos.

## Fórmula

El método se basa en la iteración de las siguientes ecuaciones, donde \( x_i^{(k+1)} \) es la aproximación de la \( i \)-ésima variable en la \( k+1 \)-ésima iteración:

\[
x_i^{(k+1)} = \frac{1}{a_{ii}} \left( b_i - \sum_{j=1}^{i-1} a_{ij}x_j^{(k+1)} - \sum_{j=i+1}^n a_{ij}x_j^{(k)} \right)
\]

Donde:
- \( a_{ii} \): es el elemento diagonal de la matriz de coeficientes.
- \( b_i \): es el término independiente correspondiente.
- \( x_j^{(k+1)} \): utiliza el valor más reciente de la iteración actual (para \( j < i \)).
- \( x_j^{(k)} \): utiliza el valor de la iteración anterior (para \( j > i \)).

## Algoritmo del Método de Gauss-Seidel

1. Representar el sistema de ecuaciones lineales en forma matricial \( A \mathbf{x} = \mathbf{b} \).
2. Inicializar un vector \( \mathbf{x}^{(0)} \) con valores iniciales (habitualmente ceros).
3. Para cada iteración \( k+1 \), realizar los siguientes pasos:
   - Para cada variable \( x_i \), actualizar su valor usando la fórmula iterativa.
4. Evaluar el criterio de convergencia:
   - Si la norma de la diferencia \( ||\mathbf{x}^{(k+1)} - \mathbf{x}^{(k)}|| \) es menor que un umbral dado (tolerancia), detener el proceso.
5. Retornar \( \mathbf{x} \) como la solución aproximada del sistema.

## Implementaciones con caso de uso

<a href="/Tema3/Método de Gauss-Seidel/Imple (1).java">Ejercicio 1</a><br>
<a href="/Tema3/Método de Gauss-Seidel/Imple (2).java">Ejercicio 2</a><br>
<a href="/Tema3/Método de Gauss-Seidel/Imple (3).java">Ejercicio 3</a><br>
<a href="/Tema3/Método de Gauss-Seidel/Imple (4).java">Ejercicio 4</a><br>
<a href="/Tema3/Método de Gauss-Seidel/Imple (5).java">Ejercicio 5</a><br>

# Método de Jacobi

El método de Jacobi es un método iterativo utilizado para resolver sistemas de ecuaciones lineales. Es especialmente útil para sistemas grandes y dispersos y, al igual que el método de Gauss-Seidel, requiere que el sistema sea diagonalmente dominante para garantizar su convergencia.

## Fórmula

En cada iteración, el método calcula una nueva aproximación para cada variable \( x_i \) utilizando únicamente los valores de la iteración anterior. La fórmula iterativa es:

\[
x_i^{(k+1)} = \frac{1}{a_{ii}} \left( b_i - \sum_{j=1, j \neq i}^n a_{ij}x_j^{(k)} \right)
\]

Donde:
- \( a_{ii} \): es el elemento diagonal de la matriz de coeficientes.
- \( b_i \): es el término independiente correspondiente.
- \( x_j^{(k)} \): es el valor de la variable \( j \) en la iteración anterior.

## Algoritmo del Método de Jacobi

1. Representar el sistema de ecuaciones lineales en forma matricial \( A \mathbf{x} = \mathbf{b} \).
2. Inicializar un vector \( \mathbf{x}^{(0)} \) con valores iniciales (habitualmente ceros).
3. Para cada iteración \( k+1 \):
   - Calcular cada \( x_i^{(k+1)} \) usando los valores de \( \mathbf{x}^{(k)} \) y la fórmula iterativa.
4. Evaluar el criterio de convergencia:
   - Si la norma de la diferencia \( ||\mathbf{x}^{(k+1)} - \mathbf{x}^{(k)}|| \) es menor que un umbral dado (tolerancia),

## Implementaciones con caso de uso

<a href="/Tema3/Método%20de%20Jacobi/Imple%20(1).java">Ejercicio 1</a><br>
<a href="/Tema3/Método%20de%20Jacobi/Imple%20(2).java">Ejercicio 2</a><br>
<a href="/Tema3/Método%20de%20Jacobi/Imple%20(3).java">Ejercicio 3</a><br>
<a href="/Tema3/Método%20de%20Jacobi/Imple%20(4).java">Ejercicio 4</a><br>
<a href="/Tema3/Método%20de%20Jacobi/Imple%20(5).java">Ejercicio 5</a><br>
