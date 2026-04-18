# Utilidades de Colecciones con Lambdas y Streams

## Es una biblioteca de utilerias en java pensada para el procesamiento basico de colecciones y mapas de cadenas de caracteres usando lambdas de forma eficiente y segura.

## Metodos de UtileriaCadenas
Clase especializada en el procesamiento de colecciones de texto.

### 1.- **`filtroSelectivo`:** Elimina palabras de un ArrayList según su letra inicial (insensible a mayúsculas) y una longitud mínima.
Recibe de parametros la letra prohibida, Longitud mínima, y un ArrayList.
Retorna un ArrayList con las palabras filtradas.

**Ejemplo de uso**
Entrada: char 'a', int 4, ArrayList ["Avión", "Bote", "Sol", "Gato"].
Retorno: ArrayList ["Bote", "Gato"] 
Omitió "Avión" por la letra y "Sol" por la longitud.

### 2.- **`conversorDeMayusculas`:** Transforma una lista de cadenas a mayúsculas omitiendo valores nulos.
Recibe de parametro el ArrayList con las palabras.
Retorna un ArrayList con las mismas palabras pero en mayusculas.

**Ejemplo de uso**
Entrada: ArrayList ["hola", "mundo", null].
Retorno: ArrayList ["HOLA", "MUNDO"].
Se quitó null porque esta preparado para limpiar los null de la lista.

### 3.- **`mapaDeLongitudes`:** Crea un mapa que asocia cada palabra única con su número de caracteres.
Recibe de parametro un ArrayList de palabras.
Retorna un HashMap en la que se asocia cada palabra con su longitud.

**Ejemplo de uso**
Entrada: ArrayList ["Java", "POO"].
Retorno: HashMap {"Java"=4, "POO"=3}.

### 4.- **`contadorDeFrecuencias`:** Genera un mapa de palabras indicando cuántas veces aparece cada una.
Recibe de parametro un ArrayList de palabras.
Retorna un HashMap en la que se asocia cada palabra con la cantidad de veces que se repitió.

**Ejemplo de uso**
Entrada: ArrayList ["Gato", "Perro", "Gato"].
Retorno: HashMap {"Gato"=2, "Perro"=1}.

### 5.- **`clasificadorDePalabras`:** Filtra un mapa de frecuencias para obtener solo las palabras que superan un umbral de repetición.
Recibe de parametros un número entero el cual es el umbral, y un HashMap el cual es el mapa de frecuencias.
Retorna un ArrayList con las palabras que pasaron ese umbral.

**Ejemplo de uso**
Entrada: int 1, HashMap {"Gato"=2, "Perro"=1}.
Retorno: ArrayList ["Gato"].

### 6.- **`dedupliacionDePalabras`:** Procesa una frase, elimina signos de puntuación y devuelve un conjunto de palabras únicas en minúsculas que tengan una longitud mayor a cierto umbral.
Recibe de parametros una frase larga (String) y un número entero que representa el minimo de longitud de cada palabra.
Retorna un HashSet con solo las palabras que hayan pasado ese umbral, se eliminan los repetidos y se convierten a minúsculas.

**Ejemplo de uso**
Entrada: String "¡Hola hola mundo!", int 4
Retorno: HashSet ["hola", "mundo"].

## UtileriaNumeros
Clase especializada en el procesamiento de colecciones de numeros:

### 1.- **`multiplicador`:** Multiplica todos los elementos de una lista por un factor dado (modificación in-place).
Recibe de parametros un ArrayList de numeros enteros (Integer) y un numero entero el cual es el factor.
Retorna un ArrayList con los numeros multiplicados por el factor.

**Ejemplo de uso**
Entrada: ArrayList [1, 2, 3], int 10.
Retorno: ArrayList [10, 20, 30].

### 2.- **`cuadradosUnicos`:** Filtra números pares, los eleva al cuadrado y elimina duplicados.
Recibe de parametro un ArrayList de numeros enteros (Integer).
Retorna un HashSet con los numeros elevados al cuadrado.

**Ejemplo de uso**
Entrada: ArrayList [2, 2, 3, 4].
Retorno: ArrayList [4, 16].
Omitió el impar '3' y no duplicó el '4'.

### 3.- **`modificadorDeInventario`:** Aplica un descuento porcentual a los valores de un mapa de productos.
Recibe de parametro un HashMap que relaciona un producto (String) con su precio (Double).
No retorna nada porque es void, imprime en la consola el inventario con un descuento del 10%.

**Ejemplo de uso**
Entrada: HashMap {"Cloro"=100.0, "Detergente"=50.0}.
Retorno: Imprime en la consola los valores con 10% de descuento: "Cloro" 90.0, "Detergente" 45.0.

### 4.- **`topeDeFrecuencia`:** Normaliza un mapa limitando los valores numéricos a un máximo establecido.
Recibe de parametro un HashMap que representa un mapa de frecuencias, y un numero entero que representa la frecuencia máxima
No retorna nada porque es void, imprime en la consola el mapa con la frecuencia limitada.

**Ejemplo de uso**
Entrada: HashMap {"Java": 5, "C++": 2}, int 3
Retorno: Imprime en la consola el mapa con la frecuencia limitada a 3: {"Java"=3, "C++"=2}.

## Como compilar y ejecutar el programa
### Si no tienes un IDE puedes seguir las siguientes instrucciones. Si tienes un IDE basta con que le des al boton de play en el proyecto donde pegaste los archivos
**1.- Compilar todas las clases:**
Este comando compila todos los archivos `.java` en la carpeta actual. Tienes que estar en la carpeta donde descargaste los archivos
```bash
javac *.java
```
**2.- Ejecutar el Archivo de pruebas**
```bash
java Main
```
La clase Main solamente es para comprobar el correcto funcionamiento de los metodos enlistados anteriormente.
