package introduccion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Lista para guardar los nombres de los estudiantes
    // Es global porque luego varios métodos la van a usar
    static List<String> estudiantes = new ArrayList<>();

    // Lista para guardar las calificaciones
    // Coincide con la lista de estudiantes
    static List<Double> calificaciones = new ArrayList<>();

    public static void main(String[] args) {

    	// Scanner para leer lo que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        int opcion; // Variable para guardar la opción elegida
        
        // Mensaje inicial del sistema
        System.out.println("Bienvenido al sistema de gestión de estudiantes.");

     // El menú se repetirá hasta que el usuario elija salir 
        do {

            // Mostramos las opciones directamente 
            System.out.println("\n1. Agregar estudiante");
            System.out.println("2. Mostrar lista de estudiantes");
            System.out.println("3. Calcular promedio");
            System.out.println("4. Mostrar estudiante con mayor calificación");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = Integer.parseInt(scanner.nextLine());

            // Estructura de switch
            switch (opcion) {
                case 1:
                    System.out.println("Opción agregar estudiante (aún no implementada).");
                    break;
                case 2:
                    System.out.println("Opción mostrar estudiantes (aún no implementada).");
                    break;
                case 3:
                    System.out.println("Opción calcular promedio (aún no implementada).");
                    break;
                case 4:
                    System.out.println("Opción mayor calificación (aún no implementada).");
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        // Cerramos el scanner al terminar el programa
        scanner.close();
    }

    // Método que muestra el menú del sistema
    // Se separó para que el código sea más ordenado
    public static void mostrarMenu() {
        System.out.println("\n1. Agregar estudiante");
        System.out.println("2. Mostrar lista de estudiantes");
        System.out.println("3. Calcular promedio");
        System.out.println("4. Mostrar estudiante con mayor calificación");
        System.out.println("5. Salir");
    }
}