import java.util.Scanner;

/*
 * 11) Realiza una aplicación que nos pida un número de ventas a introducir,
 * después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado.
 * Al final mostrará la suma de todas las ventas.
 */
public class Ejercicio_11 {

    public static void main(String[] args) {
        // Bloque de creacion de variables
        int numVentas = 0;
        double sumaVentas = 0;
        Scanner teclado = new Scanner(System.in);

        // Bloque de logica del proceso
        System.out.println("Dime el numero de ventas a introducir:");
        numVentas = teclado.nextInt();

        for (int i = 1; i <= numVentas; i++) {
            System.out.println("Dime el importe de la venta " + i + ":");
            double venta = teclado.nextDouble();
            sumaVentas = sumaVentas + venta;
        }

        System.out.println("La suma total de todas las ventas es: " + sumaVentas);
        teclado.close();
    }
}
