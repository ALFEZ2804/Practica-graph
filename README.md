Copyright [2023] [Alberto Fernández Rodríguez]
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
either express or implied. See the License for the specific
language governing permissions and limitations under the
License.

# El juego de la vida

## Breve descripción de la aplicación
* El contenido de este repositorio permite simular una estructura de datos de grafo.
* Versión 1.0

## Intrucciones para ejecutar el programa

limpiar:

```console
mvn clean
```
compilar:

```console
mvn compile
```
generar el `.jar`: 

```console
make jar
```

generar el `javadoc`:

```console
mvn javadoc: javadoc
```

ejecutar el programa entero:

```console
mvn test
```

## Estructura del código

Tal y como se muestra en la imagen


El código consta de dos clases `Graph.java` que está en el paquete 
`practicas` que contiene los métodos de la estructura de datos
y la clase `GraphTest.java` que está en el paquete `practicas` 
que contiene los métodos de los test de la clase Graph.