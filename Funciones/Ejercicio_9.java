import java.util.Scanner;

/*
 * 9) Lee un número por teclado que pida el precio de un producto (puede tener decimales)
 * y calcule el precio final con IVA. El IVA será una constante que será del 21%.
 */
public class Ejercicio_9 {

    public static void funcion9(double precio) {
        final double IVA = 1.21;
        double pf = precio * IVA;
        System.out.println("El precio final con el IVA es de: " + pf);
    }

    public static void main(String[] args) {
        // Bloque de creacion de variables
        int inicio = 0;
        Scanner teclado = new Scanner(System.in);

        // Bloque de logica del proceso
        System.out.println("Iniciar ejercicio 9?");
        System.out.println("0 = No");
        System.out.println("1 = Si");
        inicio = teclado.nextInt();

        while (inicio != 0) {
            System.out.println("Dime el Precio del producto");
            System.out.println("-----------------");
            double precio = teclado.nextDouble();

            funcion9(precio);

            System.out.println("----------");
            System.out.println("Continuar?");
            System.out.println("0 = No");
            System.out.println("1 = Si");
            inicio = teclado.nextInt();
        }
        teclado.close();
    }
}
