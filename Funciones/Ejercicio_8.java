import java.util.Scanner;

/*
 * 8. Realizar una función que calcule (muestre en pantalla) el área o el volumen
 * de un cilindro, según se especifique. Para distinguir un caso de otro se le
 * pasará el carácter 'a' (para área) o 'v' (para el volumen).
 * Además hemos de pasarle a la función el radio y la altura.
 */
public class Ejercicio_8 {

    public static void funcion8(String eleccion, double r, double a) {
        Scanner teclado = new Scanner(System.in);
        if (eleccion.equalsIgnoreCase("A")) {
            System.out.println("----");
            System.out.println("Área");
            System.out.println("----");
            System.out.println("Dime el radio");
            r = teclado.nextInt();
            System.out.println("Dime la altura");
            a = teclado.nextInt();
            double RA = 2 * Math.PI * r * (a + r);
            System.out.println("El área del cilindro es de: " + RA);
        } else if (eleccion.equalsIgnoreCase("V")) {
            System.out.println("----");
            System.out.println("Volumen");
            System.out.println("----");
            System.out.println("Dime el radio");
            r = teclado.nextInt();
            System.out.println("Dime la altura");
            a = teclado.nextInt();
            double RV = Math.PI * Math.pow(r, 2) * a;
            System.out.println("El volumen del cilindro es de: " + RV);
        } else {
            System.out.println("------");
            System.out.println(" Error");
            System.out.println("-------");
        }
    }

    public static void main(String[] args) {
        // Bloque de creacion de variables
        int inicio = 0;
        double r = 0, a = 0;
        Scanner teclado = new Scanner(System.in);

        // Bloque de logica del proceso
        System.out.println("Iniciar ejercicio 8?");
        System.out.println("0 = No");
        System.out.println("1 = Si");
        inicio = teclado.nextInt();

        while (inicio != 0) {
            System.out.println("Dime que quieres calcular");
            System.out.println("A. Área");
            System.out.println("V. Volumen");
            System.out.println("-----------------");
            String eleccion = teclado.next();

            funcion8(eleccion, r, a);

            System.out.println("----------");
            System.out.println("Continuar?");
            System.out.println("0 = No");
            System.out.println("1 = Si");
            inicio = teclado.nextInt();
        }
        teclado.close();
    }
}
