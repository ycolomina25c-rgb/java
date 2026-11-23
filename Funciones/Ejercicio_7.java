import java.util.Scanner;

/*
 * 7. Hacer una función que tome como argumentos dos números enteros x
 * y n, y calcule la potencia x^n. Escribir un programa que lea los valores de x
 * y n y muestre x^n (El valor de x debe ser menor que 50 y el de n menor que
 * 10) para no tener problemas de desbordamiento.
 */
public class Ejercicio_7 {

    public static void funcion7(int X, int N) {
        if (X > 50) {
            System.out.println("----------------------------------");
            System.out.println("Error: X no puede ser mayor que 50");
            System.out.println("----------------------------------");
        } else if (N > 10) {
            System.out.println("----------------------------------");
            System.out.println("Error: N no puede ser mayor que 10");
            System.out.println("----------------------------------");
        } else {
            int XN = X + N;
            System.out.println("-------------------------");
            System.out.println(" El valor de XN es: " + XN);
            System.out.println("-------------------------");
        }
    }

    public static void main(String[] args) {
        // Bloque de creacion de variables
        int X = 0, N = 0;
        int inicio = 0;
        Scanner teclado = new Scanner(System.in);

        // Bloque de logica del proceso
        System.out.println("Iniciar ejercicio 7?");
        System.out.println("0 = No");
        System.out.println("1 = Si");
        inicio = teclado.nextInt();

        while (inicio != 0) {
            System.out.println("Dime el parametro X");
            System.out.println("-----------------");
            X = teclado.nextInt();
            System.out.println("Dime el parametro N");
            System.out.println("-----------------");
            N = teclado.nextInt();

            funcion7(X, N);

            System.out.println("----------");
            System.out.println("Continuar?");
            System.out.println("0 = No");
            System.out.println("1 = Si");
            inicio = teclado.nextInt();
        }
        teclado.close();
    }
}
