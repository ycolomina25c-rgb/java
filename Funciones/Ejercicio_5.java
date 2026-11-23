import java.util.Scanner;

/*
 * 5. Función que muestra en pantalla el doble del valor que se le pasa
 * como parámetro.
 */
public class Ejercicio_5 {

    public static void funcion5(int parametro) {
        int resultado = parametro * parametro;
        System.out.println("El doble de tu parametro es: " + resultado);
    }

    public static void main(String[] args) {
        // Bloque de creacion de variables
        int N1 = 0;
        Scanner teclado = new Scanner(System.in);

        // Bloque de logica del proceso
        System.out.println("Dime el parametro");
        N1 = teclado.nextInt();

        funcion5(N1);
        teclado.close();
    }
}
