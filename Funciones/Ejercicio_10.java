/*
 * 10) Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
 */
public class Ejercicio_10 {

    public static void main(String[] args) {
        int num = 0;
        int f = 100;
        int sum = 1;
        while (num < f) {
            num = num + sum;
            System.out.println(num);
        }
    }
}
