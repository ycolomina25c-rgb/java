package ejemplo;

import java.util.Scanner;

/*
 * 2. Escriba una función que sume los n primeros números impares.
 */
public class Ejercicio_2 {

    public static void funcion2(int Nv) {
        int e = 0;
        for (int i = 0; i < Nv; i++) {
            if (i % 2 != 0) {
                e = e + i;
                System.out.println("impar: " + i);
            }
        }
        System.out.println(e);
    }

    public static void main(String[] args) {
        // Bloque de creacion de variables
        int Nv = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime las veces que quieres que salga este numero");
        Nv = teclado.nextInt();

        funcion2(Nv);
        teclado.close();
    }
}
