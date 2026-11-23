package ejemplo;

import java.util.Scanner;

/*
 * 1. Realizar una función, a la que se le pase como parámetro un número
 * N, y muestre por pantalla N veces, el mensaje: "Módulo ejecutándose"
 */
public class Ejercicio_1 {

    public static void funcion1(double Nv, double N) {
        for (int i = 0; i < Nv; i++) {
            System.out.println(N + " Modulo ejecutandose");
        }
    }

    public static void main(String[] args) {
        // Bloque de creacion de variables
        double N = 0;
        double Nv = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime el numero que quieres que se ejecute");
        N = teclado.nextDouble();
        System.out.println("Dime las veces que quieres que salga este numero");
        Nv = teclado.nextDouble();

        funcion1(Nv, N);
        teclado.close();
    }
}
