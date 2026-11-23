import java.util.Scanner;

/*
 * Programa un menú de consola para el inventario de la empresa con cuatro opciones:
 * 1) Alta de un equipo (nombre y tipo)
 * 2) Listar todos
 * 3) Buscar por nombre
 * 0) Salir
 * Los datos se guardan en arrays mientras el programa está abierto.
 */
public class Ejemplo_arrays {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        String[] nombre = new String[50];
        String[] tipo = new String[50];
        int operacion = -1;
        int totalEquipos = 0;

        System.out.println("MENU");
        System.out.println("------------------");
        System.out.println("1 Alta de un equipo (nombre y tipo)");
        System.out.println("2 Listar todos");
        System.out.println("3 Buscar por nombre");
        System.out.println("0 Salir");
        System.out.println("Dime la operacion:");
        operacion = teclado.nextInt();

        switch (operacion) {
            case 1:
                System.out.println("Dime el nombre:");
                nombre[totalEquipos] = teclado2.nextLine();
                System.out.println("Dime el tipo:");
                tipo[totalEquipos] = teclado2.nextLine();
                totalEquipos++;
                break;

            case 2:
                for (int i = 0; i < nombre.length; i++) {
                    System.out.println("Total de equipos: " + totalEquipos);
                    if (nombre[i] != null) {
                        System.out.println("El nombre " + i + " es: " + nombre[i]);
                        System.out.println("El tipo " + i + " es: " + tipo[i]);
                    }
                }
                break;

            case 3:
                boolean encontrado = false;
                System.out.println("Dime el nombre");
                String buscar = teclado2.nextLine();
                for (int i = 0; i < totalEquipos; i++) {
                    if (nombre[i] != null && (nombre[i].equals(buscar) || tipo[i].equals(buscar))) {
                        System.out.println("Encontrado en la linea " + i);
                        encontrado = true;
                    }
                }
                if (!encontrado) {
                    System.out.println("No se ha encontrado ningún equipo con ese criterio.");
                }
                break;

            case 0:
                System.out.println("Saliendo...");
                break;

            default:
                System.out.println("Opción no válida.");
        }
        teclado.close();
        teclado2.close();
    }
}
