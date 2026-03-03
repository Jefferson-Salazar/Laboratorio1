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

        // Mensaje inicial del sistema
        System.out.println("Bienvenido al sistema de gestión de estudiantes.");

    }
}