import java.util.Scanner;

/*
 * 3. Diseñar una función que tenga como parámetros dos números, y que
 * calcule el máximo.
 */
public class Ejercicio_3 {

    public static int funcion3(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        // Bloque de creacion de variables
        int N1 = 0;
        int N2 = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime el primer numero");
        N1 = teclado.nextInt();
        System.out.println("Dime el segundo numero");
        N2 = teclado.nextInt();

        int maximo = funcion3(N1, N2);
        System.out.println("El numero maximo es: " + maximo);
        teclado.close();
    }
}
