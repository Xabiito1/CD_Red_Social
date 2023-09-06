package com.campusdual;

import java.util.Scanner;

public class RedSocialApp {
    public static void main(String[] args) {
        // Instancia de Scanner para recibir entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Lógica del menú principal
        while (true) {
            System.out.println("Menú Principal:");
            System.out.println("1. Agregar Usuario");
            System.out.println("2. Agregar Post");
            System.out.println("3. Agregar Comentario");
            System.out.println("4. Dejar de Seguir Usuario");
            System.out.println("5. Listar Mis Posts");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Lógica para agregar un usuario
                    break;
                case 2:
                    // Lógica para agregar un post
                    break;
                case 3:
                    // Lógica para agregar un comentario
                    break;
                case 4:
                    // Lógica para dejar de seguir a un usuario
                    break;
                case 5:
                    // Lógica para listar los posts del usuario actual
                    break;
                case 6:
                    System.out.println("Saliendo de la aplicación.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
