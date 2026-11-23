/*
 * Ejemplo básico de inicialización y recorrido de arrays en Java
 */
public class Ejemplo_Array {

    public static void main(String[] args) {
        // Mi primer array
        int cantidad = 25;
        int[] fila = new int[cantidad];
        // Imaginar que no quiero NEW
        String[] equipos2 = { "PC1", "PC2", "PC3" };
        // Con New
        String[] equipos = new String[cantidad];
        // Bucle para inicializar el array
        for (int i = 0; i < fila.length; i++) {
            fila[i] = -1;
        }
        // Bucle para mostrar el contenido
        for (int i = 0; i < fila.length; i++) {
            System.out.println("Inicializado posición " + i + ": " + fila[i]);
        }
    }
}
