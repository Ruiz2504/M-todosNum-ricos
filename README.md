# M-todosNum-ricos
Aqupi se encuentran todos los ejercicios del semestre :))

# Tema 1
## Método overflow
El overflow en métodos numéricos ocurre cuando los resultados de cálculos exceden los límites manejables por el sistema o el tipo de dato utilizado, generando errores o comportamientos inesperados. Esto suele presentarse en algoritmos iterativos que no convergen, operaciones con valores extremadamente grandes o al usar tipos de datos con rango insuficiente. Para prevenirlo, se implementan estrategias como la normalización de datos, el uso de algoritmos estables y la selección adecuada de tipos de datos. Su manejo es esencial para garantizar la precisión y estabilidad de los resultados numéricos <br>
### Fórmula del Overflow
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

<a href="/Tema1/Overflow/Imple (1).java">Ejercicio 1</a><br>
<a href="/Tema1/Overflow/Imple (2).java">Ejercicio 2</a><br>
<a href="/Tema1/Overflow/Imple (3).java">Ejercicio 3</a><br>
<a href="/Tema1/Overflow/Imple (4).java">Ejercicio 4</a><br>
<a href="/Tema1/Overflow/Imple (5).java">Ejercicio 5</a><br>
<br>
## Método de Redondeo
El método de redondeo consiste en aproximar un número al entero más cercano según su valor decimal. Si la parte decimal es mayor o igual a 0.5, el número se redondea hacia arriba; de lo contrario, hacia abajo. Es ampliamente usado para reducir errores de representación en cálculos numéricos.
### Formula
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


<a href="/Tema1/Redondeo/Codigo1.java">Ejercicio 1</a><br>
<a href="/Tema1/Redondeo/Codigo2.java">Ejercicio 2</a><br>
<a href="/Tema1/Redondeo/Codigo3.java">Ejercicio 3</a><br>
<a href="/Tema1/Redondeo/Codigo4.java">Ejercicio 4</a><br>
<a href="/Tema1/Redondeo/Codigo5.java">Ejercicio 5</a><br>


