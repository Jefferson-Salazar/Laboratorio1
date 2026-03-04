# Universidad Mariano Gálvez de Guatemala

## Facultad de Ingeniería en Sistemas
Curso: Programación I  
Laboratorio 1  

### Estudiantes
- Jefferson Osberto Salazar Escobar  
- Yesmy Darlery Escobar Escobar  


## Análisis del Programa Original

En el programa original todo el código estaba dentro del método main.
Ahí mismo se mostraba el menú, se leían los datos, se agregaban estudiantes, se calculaba el promedio y se buscaba la nota más alta.

El problema de esto es que el main tenía demasiadas responsabilidades.
También había validaciones repetidas, como verificar si la lista estaba vacía en varias partes.

Esto hacía que el código fuera más difícil de leer y un poco desordenado si se quería modificar algo.

## Decisiones de Modularización

Para mejorar la organización se dividió el programa en varios métodos:

mostrarMenu()

leerOpcion()

agregarEstudiante()

mostrarEstudiantes()

calcularPromedio()

mostrarMayorCalificacion()

Cada método cumple una sola función específica.
De esta manera el código queda más claro y es más fácil trabajar cada parte por separado.

Si en el futuro se necesita cambiar algo, por ejemplo la forma de calcular el promedio, solo se modifica ese método y no todo el programa.

## Variables Locales y Globales

Se dejaron como variables globales:

estudiantes

calificaciones

Se decidió esto porque son listas que se usan en varios métodos y necesitan mantenerse durante toda la ejecución del programa.

### Las siguientes variables se declararon como locales:

nombre

calificacion

suma

promedio

max

estudianteMax

opcion

Estas variables solo se utilizan dentro de un método específico, por lo que no es necesario que sean globales.

Usar variables locales ayuda a evitar errores y hace que el código sea más seguro.

## Validaciones Implementadas

Se agregaron validaciones para evitar errores como:

Ingresar texto cuando se espera un número.

Ingresar calificaciones fuera del rango permitido (0 a 100).

Intentar calcular el promedio cuando no hay estudiantes registrados.

Se utilizó try-catch para capturar la excepción NumberFormatException cuando el usuario ingresa un dato incorrecto.

Estas validaciones son importantes porque evitan que el programa se cierre de manera inesperada y hacen que el sistema sea más estable.

## Preguntas de Reflexión
### 1. ¿Qué ventajas tiene dividir el código en métodos?

Dividir el código en métodos permite que el programa esté más organizado y sea más fácil de entender.
También facilita encontrar errores y reutilizar partes del código en otros proyectos.

### 2. ¿Por qué no es recomendable usar muchas variables globales?

Porque las variables globales pueden modificarse desde cualquier parte del programa.
Esto puede provocar errores difíciles de detectar y hacer que los métodos dependan demasiado unos de otros.

### 3. ¿Cómo mejora la modularización la legibilidad?

La modularización mejora la legibilidad porque cada método tiene un nombre que indica claramente lo que hace.
Además, el método main queda más limpio y se entiende mejor la estructura general del programa.
