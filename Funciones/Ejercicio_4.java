import java.util.Scanner;

/*
 * 4. Función a la que se le pasan dos enteros y muestra todos los números
 * comprendidos entre ellos, inclusive. (En la función hay que comprobar
 * cuál es el mayor y cuál es el menor)
 */
public class Ejercicio_4 {

    public static void funcion4(int inicio, int fin) {
        if (inicio < fin) {
            for (int i = inicio; i < fin; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        // Bloque de creacion de variables
        int N1 = 0;
        int N2 = 0;
        Scanner teclado = new Scanner(System.in);

        // Bloque de logica del proceso
        System.out.println("Dime el primer numero");
        N1 = teclado.nextInt();

        System.out.println("Dime el segundo numero");
        N2 = teclado.nextInt();

        funcion4(N1, N2);
        funcion4(N2, N1);
        teclado.close();
    }
}
