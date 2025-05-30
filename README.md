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

