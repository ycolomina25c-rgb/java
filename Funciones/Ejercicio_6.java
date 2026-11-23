import java.util.Scanner;

/*
 * 6. Escribir un método que recibe como parámetro un código de control
 * numérico y conforme a este código imprime un mensaje de error u otro.
 * La correspondencia entre códigos y mensajes es:
 * 1: Error en memoria.
 * 2: Papel atascado en impresora.
 * 3: Disco defectuoso.
 * Cualquier otro número: Error indefinido.
 */
public class Ejercicio_6 {

    public static void funcion6(int N1) {
        switch (N1) {
            case 1:
                System.out.println("Error en memoria.");
                break;
            case 2:
                System.out.println("Papel atascado en impresora.");
                break;
            case 3:
                System.out.println("Disco defectuoso.");
                break;
            default:
                System.out.println("Error indefinido.");
        }
    }

    public static void main(String[] args) {
        // Bloque de creacion de variables
        int N1 = 0;
        int inicio = 0;
        Scanner teclado = new Scanner(System.in);

        // Bloque de logica del proceso
        System.out.println("Iniciar ejercicio 6?");
        System.out.println("0 = No");
        System.out.println("1 = Si");
        inicio = teclado.nextInt();

        while (inicio != 0) {
            System.out.println("Dime el parametro");
            System.out.println("-----------------");
            N1 = teclado.nextInt();

            funcion6(N1);
            System.out.println("----------");
            System.out.println("Continuar?");
            System.out.println("0 = No");
            System.out.println("1 = Si");
            inicio = teclado.nextInt();
        }
        teclado.close();
    }
}
