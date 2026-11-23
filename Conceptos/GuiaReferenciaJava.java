import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ============================================================================
 * GUÍA DE REFERENCIA COMPLETA DE JAVA (TEMAS 1 A 5)
 * ============================================================================
 * Contenido estructurado del temario:
 *   1. Introducción a Java, Algoritmia y Programación Orientada a Objetos (POO)
 *   2. Java Básico: Sintaxis, Variables, Operadores, Estructuras de Control y Excepciones
 *   3. Métodos y Funciones
 *   4. Manejo de Cadenas de Texto (String y StringBuffer)
 *   5. Manejo de Arrays (1D, 2D, 3D) y Colecciones Dinámicas (ArrayList)
 *
 * Nota: Este archivo compila y se puede ejecutar directamente para ver ejemplos
 *       prácticos de cada apartado en consola.
 * ============================================================================
 */
public class GuiaReferenciaJava {

    public static void main(String[] args) {
        System.out.println("=== 1. INTRODUCCION Y POO ===");
        tema1_IntroduccionYPOO();

        System.out.println("\n=== 2. JAVA BASICO, OPERADORES, CONTROL Y EXCEPCIONES ===");
        tema2_JavaBasico();

        System.out.println("\n=== 3. METODOS Y FUNCIONES ===");
        tema3_MetodosYFunciones();

        System.out.println("\n=== 4. MANEJO DE STRINGS ===");
        tema4_ManejoStrings();

        System.out.println("\n=== 5. MANEJO DE ARRAYS Y ARRAYLIST ===");
        tema5_ManejoArraysYArrayList();
    }

    // ========================================================================
    // TEMA 1: INTRODUCCIÓN A JAVA, ALGORITMIA Y POO
    // ========================================================================
    /*
     * 1.1 CONCEPTOS FUNDAMENTALES DE PROGRAMACIÓN
     * - Programa informático: Secuencia de instrucciones escritas para realizar una tarea.
     * - Lenguaje de programación: Conjunto de reglas sintácticas y semánticas para escribir código.
     * - Software: Conjunto de programas que puede ejecutar el hardware.
     * - Ciclo de vida del software:
     *     Código Fuente (.java) -> Compilador (javac) -> Bytecodes / Código Objeto (.class)
     *     -> Intérprete / Máquina Virtual Java (JVM) -> Ejecución en cualquier SO.
     * - Lema de Java: "Write once, run anywhere" (escríbelo una vez, ejecútalo en cualquier lugar).
     * - Historia y características: Creado en 1990 por James Gosling (Sun Microsystems).
     *   Es orientado a objetos, sencillo, robusto, seguro (no accede directo a memoria) y multiplataforma.
     * - Distribuciones de Java:
     *     * Java SE (J2SE): Standard Edition (base del lenguaje, aplicaciones de escritorio/consola).
     *     * Java EE (J2EE): Enterprise Edition (aplicaciones empresariales, web y servidores).
     *     * Java ME (J2ME): Micro Edition (dispositivos móviles y embebidos).
     *
     * 1.2 LICENCIAS DE SOFTWARE
     * - GPL (General Public License): Software libre y de código abierto; permite usar, copiar,
     *   modificar y distribuir libremente (las modificaciones deben mantener licencia libre).
     * - Privativas: Código cerrado; no se puede ver ni modificar el código fuente, ni redistribuir. De pago.
     * - Freeware: Uso gratuito e indefinido, pero sin acceso al código fuente.
     * - Shareware: Uso gratuito limitado (por tiempo o funciones) como prueba antes de comprar. Sin código fuente.
     *
     * 1.3 ALGORITMOS, PSEUDOCÓDIGO Y PROGRAMACIÓN ESTRUCTURADA
     * - Algoritmo: Conjunto ordenado de pasos para resolver un problema.
     *   * Características: Preciso (indica orden), Definido (mismo resultado siempre) y Finito (tiene fin).
     *   * Partes: Entrada (datos) -> Proceso (operaciones) -> Salida (resultados).
     * - Pseudocódigo: Representación de un algoritmo en lenguaje natural estructurado (Inicio ... Fin).
     * - Teorema de Dijkstra (Programación Estructurada): Todo programa se construye con 3 estructuras:
     *     1. Secuencia: Instrucciones ejecutadas una tras otra.
     *     2. Selección: Bifurcación condicional (SI condición ... SINO ... FIN SI).
     *     3. Iteración: Repetición mientras se cumpla una condición (MIENTRAS condición ... FIN MIENTRAS).
     *
     * 1.4 PROGRAMACIÓN ORIENTADA A OBJETOS (POO)
     * - Clase: Plantilla o modelo que define características (atributos) y comportamientos (métodos).
     * - Objeto: Instancia concreta creada a partir de una clase mediante el operador 'new'.
     * - Constructor: Método especial con el mismo nombre que la clase, sin tipo de retorno, que
     *   inicializa los atributos del objeto al crearlo.
     * - Herencia (extends): Permite crear una subclase a partir de una superclase heredando sus
     *   atributos y métodos, pudiendo añadir nuevos o redefinirlos.
     * - Polimorfismo y Sobreescritura (@Override): Redefinir en la clase hija un método heredado
     *   (por ejemplo, toString() de la clase Object) para adaptar su comportamiento.
     */
    public static void tema1_IntroduccionYPOO() {
        // Instanciación de objetos (Clase vs Objeto)
        Vehiculo v = new Vehiculo();
        Coche c = new Coche();
        c.cambiaCilindrada(2000);
        c.pinta(Vehiculo.AZUL);
        Barco b = new Barco();

        System.out.println("Vehiculo color por defecto (3=rojo): " + v.color());
        System.out.println("Coche color: " + c.color() + ", cilindrada: " + c.cilindrada());
        System.out.println("Barco heredado numSerie: " + b.numeroSerie());

        // Ejemplo de @Override toString()
        Coordenada coord = new Coordenada(1, 2);
        System.out.println("Coord: " + coord); // Llama automáticamente a coord.toString() -> (1,2)
    }

    // ========================================================================
    // TEMA 2: JAVA BÁSICO, VARIABLES, OPERADORES, CONTROL Y EXCEPCIONES
    // ========================================================================
    /*
     * 2.1 SINTAXIS, IDENTIFICADORES Y CONVENCIONES
     * - Instrucción: Línea o líneas de código terminadas en punto y coma (;).
     * - Bloque: Conjunto de instrucciones agrupadas entre llaves ({ }).
     * - Identificadores (nombres de clases, métodos, variables):
     *     * Empiezan por letra, '_' o '$' (NUNCA por un dígito).
     *     * Java distingue entre mayúsculas y minúsculas (case-sensitive).
     *     * No pueden coincidir con palabras reservadas.
     * - Convenciones de estilo (CamelCase):
     *     * Clases: PascalCase -> PrimeraLetraMayuscula (ej: MiClaseEjemplo).
     *     * Variables y métodos: camelCase -> primeraLetraMinuscula (ej: cantPersonas, calcularTotal).
     *     * Constantes: MAYUSCULAS_CON_GUION_BAJO con modificador 'final' (ej: final double IVA = 0.21;).
     *
     * 2.2 PALABRAS RESERVADAS DE JAVA
     * abstract, assert, boolean, break, byte, case, catch, char, class, const*, continue,
     * default, do, double, else, enum, extends, final, finally, float, for, goto*, if,
     * implements, import, instanceof, int, interface, long, native, new, package, private,
     * protected, public, return, short, static, strictfp, super, switch, synchronized,
     * this, throw, throws, transient, try, void, volatile, while.
     * (Además de los literales booleanos/nulos: true, false, null).
     *
     * 2.3 LOS 8 TIPOS DE DATOS PRIMITIVOS
     * Categoría 1 - Enteros (con signo):
     *   - byte  : 1 Byte  (8 bits)  -> -128 a 127
     *   - short : 2 Bytes (16 bits) -> -32,768 a 32,767
     *   - int   : 4 Bytes (32 bits) -> -2,147,483,648 a 2,147,483,647
     *   - long  : 8 Bytes (64 bits) -> -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807 (sufijo L)
     * Categoría 2 - Coma flotante (decimales):
     *   - float : 4 Bytes (32 bits) -> Precisión simple, 6-7 dígitos (obligatorio sufijo f, ej: 3.14f)
     *   - double: 8 Bytes (64 bits) -> Precisión doble, 15 dígitos (por defecto para decimales)
     * Categoría 3 - Caracteres:
     *   - char  : 2 Bytes (16 bits) -> Carácter Unicode simple entre comillas simples (ej: 'z')
     * Categoría 4 - Booleanos:
     *   - boolean: Valores lógicos -> únicamente true o false
     *
     * 2.4 PRECEDENCIA DE OPERADORES (de mayor a menor prioridad)
     *   1. ()               Paréntesis
     *   2. !                Negación lógica (NOT) y signos unarios
     *   3. *, /, %          Multiplicación, División, Módulo (resto)
     *   4. +, -             Suma, Resta
     *   5. <, <=, >, >=     Relacionales de orden
     *   6. ==, !=           Igualdad y desigualdad
     *   7. &&               Y lógico (AND)
     *   8. ||               O lógico (OR)
     *   9. =                Asignación
     */
    public static void tema2_JavaBasico() {
        // --- Declaración y asignación de variables ---
        byte b = 100;
        short s = 30000;
        int i = 7;
        long l = 10000000000L;
        float pi = 3.1416f;
        double d = 12.5;
        char letra = 'z';
        boolean existe = false;
        final double IVA = 0.21; // Constante

        System.out.println("Variables -> int: " + i + ", float: " + pi + ", char: " + letra + ", boolean: " + existe);

        // --- Operadores aritméticos (división entera vs decimal y módulo %) ---
        double d1 = 14, d2 = 5;
        int i1 = 14, i2 = 5;
        double resDecimal = d1 / d2; // 2.8
        int resEntero = i1 / i2;     // 2 (trunca decimales)
        int resto = i1 % i2;         // 4 (resto de 14 / 5)
        double conCasting = (double) i1 / i2; // 2.8 (conversión explícita / casting)
        System.out.println("14/5 decimal: " + resDecimal + " | entera: " + resEntero + " | resto (%): " + resto);

        // --- Operadores relacionales y lógicos (!, &&, ||) ---
        int edad = 20;
        boolean carnetConducir = true;
        boolean mayorDeEdad = edad >= 18;
        boolean menorDeEdad = !mayorDeEdad; // NOT
        boolean puedeConducir = mayorDeEdad && carnetConducir; // AND (ambas true)
        boolean nieva = true, llueve = false, graniza = false;
        boolean malTiempo = nieva || llueve || graniza; // OR (al menos una true)
        int precedencia = 8 + 4 / 2; // Primero 4/2 = 2, luego 8+2 = 10
        System.out.println("Puede conducir: " + puedeConducir + ", Mal tiempo: " + malTiempo + ", 8+4/2 = " + precedencia);

        // --- Entrada por teclado con Scanner (ejemplo simulado sin bloquear consola) ---
        // En uso real por teclado: Scanner input = new Scanner(System.in);
        Scanner inputSimulado = new Scanner("Ana\n22\n1.68\nHola mundo");
        String nombre = inputSimulado.next();       // Lee una palabra (hasta espacio/salto)
        int edadLeida = inputSimulado.nextInt();    // Lee un entero
        inputSimulado.nextLine();                   // Limpia el salto de línea pendiente tras nextInt()
        String linea = inputSimulado.nextLine();    // Lee la línea completa (nota: si se usa coma/punto decimal depende del Locale)
        System.out.println("Scanner -> nombre: " + nombre + ", edad: " + edadLeida);
        inputSimulado.close();

        // --- Estructuras Selectivas: if / else if / else ---
        float nota = 6.76f;
        String calificacion;
        if (nota >= 9.0f) {
            calificacion = "Sobresaliente";
        } else if (nota >= 7.0f) {
            calificacion = "Notable";
        } else if (nota >= 5.0f) {
            calificacion = "Aprobado";
        } else {
            calificacion = "Insuficiente";
        }
        System.out.println("Nota " + nota + " -> " + calificacion);

        // --- Estructuras Selectivas: switch ---
        // Soporta byte, short, int, char y String. Sin 'break' ejecuta los casos siguientes.
        int diaSemana = 3;
        String dia;
        switch (diaSemana) {
            case 1: dia = "Lunes"; break;
            case 2: dia = "Martes"; break;
            case 3: dia = "Miércoles"; break;
            case 4: dia = "Jueves"; break;
            case 5: dia = "Viernes"; break;
            case 6: dia = "Sábado"; break;
            case 7: dia = "Domingo"; break;
            default: dia = "Día no válido";
        }
        System.out.println("Switch día 3 -> " + dia);

        // --- Estructuras Repetitivas: while, do-while, for ---
        // 1) while: evalúa condición AL PRINCIPIO (puede ejecutarse 0 veces)
        int contadorWhile = 1;
        while (contadorWhile <= 3) {
            contadorWhile++;
        }

        // 2) do-while: evalúa condición AL FINAL (se ejecuta AL MENOS 1 VEZ; ideal para menús)
        int contadorDo = 0;
        do {
            contadorDo++;
        } while (contadorDo < 1);

        // 3) for: ideal cuando conocemos el número exacto de iteraciones (inicio; condición; incremento)
        int sumaFor = 0;
        for (int k = 1; k <= 5; k++) {
            sumaFor += k;
        }
        System.out.println("Bucles -> while llegó a " + contadorWhile + ", do-while a " + contadorDo + ", suma for(1..5): " + sumaFor);

        // --- Control de Excepciones: try / catch / finally ---
        int numerador = 10;
        int denominador = 0;
        float division;
        try {
            division = numerador / denominador; // Lanza ArithmeticException (/ by zero)
        } catch (ArithmeticException ex) {
            division = 0;
            System.out.println("Excepción capturada (" + ex.getMessage() + ") -> division = " + division);
        } finally {
            // El bloque finally se ejecuta SIEMPRE, haya o no excepción
        }
    }

    // ========================================================================
    // TEMA 3: MÉTODOS Y FUNCIONES
    // ========================================================================
    /*
     * Estructura general de un método en Java:
     *   <modificadores> <tipo_retorno> <nombre>(<parámetros>) {
     *       <cuerpo_instrucciones>
     *       [return valor;] // Obligatorio si tipo_retorno no es 'void'
     *   }
     *
     * Partes:
     * 1. Modificadores: ej. 'public static' (permite llamarlo sin instanciar la clase).
     * 2. Tipo de retorno: cualquiera de los 8 tipos primitivos, una clase (String, etc.) o 'void' (no devuelve nada).
     * 3. Nombre: identificador en camelCase.
     * 4. Parámetros: variables locales que reciben los datos de entrada (opcionales).
     * 5. Cuerpo: bloque de código entre llaves { }.
     */
    public static void tema3_MetodosYFunciones() {
        int x = 11, y = 12;
        int resultado = sumar(x, y); // Llamada pasando argumentos
        mostrarMensaje("La suma de " + x + " + " + y + " es: " + resultado);
    }

    // Método con retorno (int) y dos parámetros
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método sin retorno (void)
    public static void mostrarMensaje(String msg) {
        System.out.println(msg);
    }

    // ========================================================================
    // TEMA 4: MANEJO DE STRINGS
    // ========================================================================
    /*
     * - String (paquete java.lang, importado por defecto): Representa una secuencia INMUTABLE
     *   de caracteres (no se modifica el objeto original; cada operación crea uno nuevo).
     * - StringBuffer (y StringBuilder): Clases para crear cadenas MUTABLES que sí pueden
     *   modificarse tras ser creadas (append, insert, reverse, etc.).
     */
    public static void tema4_ManejoStrings() {
        // 1. Creación
        String s1 = "Hola Mundo";             // Forma literal (recomendada)
        String s2 = new String("Hola Mundo"); // Mediante constructor

        // 2. Concatenación con el operador +
        int x = 9;
        String concatenada = "El número es " + x;

        // 3. Longitud: length() (en String es un MÉTODO con paréntesis)
        String palabra = "hola";
        System.out.println("length() de 'hola': " + palabra.length()); // 4

        // 4. Extraer un carácter: charAt(posición) (índices empiezan en 0; fuera de rango da StringIndexOutOfBoundsException)
        System.out.println("charAt(1) de 'hola': " + palabra.charAt(1)); // 'o'

        // 5. Extraer subcadenas: substring()
        String manual = "Manual Seguridad";
        System.out.println("substring(7): " + manual.substring(7));       // "Seguridad" (desde 7 hasta el final)
        System.out.println("substring(0, 6): " + manual.substring(0, 6)); // "Manual" (inicio incluido, fin EXCLUIDO)

        // 6. Dividir por delimitador: split(regex) -> devuelve String[]
        String csv = "a,b,c";
        String[] partesComa = csv.split(",");
        String frase = "uno dos tres";
        String[] partesEspacio = frase.split("\\s"); // "\s" representa espacio en blanco
        System.out.println("split(','): " + Arrays.toString(partesComa) + " | split('\\s'): " + Arrays.toString(partesEspacio));

        // 7. Búsqueda de posición: indexOf(cadena) -> índice de primera ocurrencia (o -1 si no existe)
        System.out.println("indexOf('b') en 'a,b,c': " + csv.indexOf("b")); // 2

        // 8. Comparación de cadenas:
        //    - equals() / equalsIgnoreCase(): devuelve boolean (NUNCA usar == para comparar contenido de Strings)
        //    - compareTo() / compareToIgnoreCase(): devuelve int (0 si son iguales, <0 si es menor, >0 si es mayor)
        String str = "Smr";
        System.out.println("equals('SMR'): " + str.equals("SMR"));                           // false
        System.out.println("equalsIgnoreCase('SMR'): " + str.equalsIgnoreCase("SMR"));       // true
        System.out.println("compareTo('SMR'): " + str.compareTo("SMR"));                     // != 0
        System.out.println("compareToIgnoreCase('SMR'): " + str.compareToIgnoreCase("SMR")); // 0

        // 9. Comprobar si contiene una subcadena: contains() -> boolean
        String curso = "Este es el curso de Smr";
        System.out.println("contains('curso'): " + curso.contains("curso")); // true

        // 10. Conversión mayúsculas / minúsculas: toLowerCase() y toUpperCase()
        String ciclo = "curso SMR";
        System.out.println("toLowerCase(): " + ciclo.toLowerCase() + " | toUpperCase(): " + ciclo.toUpperCase());

        // 11. Cadena mutable con StringBuffer
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Básico");
        System.out.println("StringBuffer mutable: " + sb.toString());
    }

    // ========================================================================
    // TEMA 5: MANEJO DE ARRAYS Y ARRAYLIST
    // ========================================================================
    /*
     * 5.1 ARRAYS ESTÁTICOS
     * - Lista de elementos del MISMO tipo (homogénea) identificados por índice (de 0 a length - 1).
     * - Tamaño fijo definido al crearlo con 'new'.
     * - Propiedad pública '.length' (SIN paréntesis) devuelve su capacidad total.
     *
     * 5.2 ARRAYLIST (java.util.ArrayList)
     * - Estructura dinámica similar a un Array, pero su tamaño crece y decrece automáticamente.
     * - Solo almacena OBJETOS (para tipos primitivos se usan clases envoltorio: Integer, Double, Boolean...).
     */
    public static void tema5_ManejoArraysYArrayList() {
        // --- 1. Declaración e inicialización de Array 1D ---
        int[] fila;                     // Declaración
        fila = new int[100];            // Creación (100 elementos: índices 0 a 99)
        fila[0] = 42;
        fila[99] = 1763;                // Última posición
        System.out.println("Longitud del array fila (.length): " + fila.length);

        // Inicialización directa con valores
        double[] primos20 = {2.0, 3.0, 5.0, 7.0, 11.0, 13.0, 17.0, 19.0};
        System.out.print("Primos: ");
        for (int i = 0; i < primos20.length; i++) {
            System.out.print(primos20[i] + " ");
        }
        System.out.println();

        // --- 2. Arrays Bidimensionales (Matrices) y Multidimensionales ---
        int[][] mat = new int[3][5]; // 3 filas x 5 columnas
        // mat.length -> número de filas (3)
        // mat[i].length -> número de columnas de la fila i (5)
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = (i + 1) * 10 + (j + 1);
            }
        }
        System.out.println("Matriz 3x5:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        // Array tridimensional (cuidado con el consumo de memoria)
        int[][][] mat3D = new int[2][2][2];
        mat3D[0][0][0] = 1;

        // --- 3. ArrayList y todas sus operaciones ---
        ArrayList<String> lista = new ArrayList<String>();

        // add(elemento): añade elementos al final
        lista.add("Elemento 0");
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 1");

        // size(): devuelve el número de elementos actuales
        System.out.println("ArrayList size(): " + lista.size());

        // get(indice): obtiene el elemento de la posición indicada
        System.out.println("ArrayList get(2): " + lista.get(2));

        // contains(elemento): devuelve true si existe el elemento
        System.out.println("ArrayList contains('Elemento 1'): " + lista.contains("Elemento 1"));

        // indexOf(elemento) y lastIndexOf(elemento): primera y última posición
        System.out.println("indexOf('Elemento 1'): " + lista.indexOf("Elemento 1"));         // 1
        System.out.println("lastIndexOf('Elemento 1'): " + lista.lastIndexOf("Elemento 1")); // 3

        // remove(indice) y remove(objeto): borra por posición o por primera coincidencia
        lista.remove(0);              // Borra el elemento de la posición 0
        lista.remove("Elemento 1");   // Borra la primera ocurrencia de "Elemento 1"

        // clone(): crea una copia superficial del ArrayList
        @SuppressWarnings("unchecked")
        ArrayList<String> copia = (ArrayList<String>) lista.clone();

        // toArray(): convierte el ArrayList en un Array estándar de Object[]
        Object[] arrayConvertido = lista.toArray();
        System.out.println("ArrayList convertido con toArray(): " + Arrays.toString(arrayConvertido));

        // clear() e isEmpty(): vacía la lista y comprueba si está vacía
        copia.clear();
        System.out.println("Copia tras clear(), ¿isEmpty()?: " + copia.isEmpty()); // true
    }
}

// ============================================================================
// CLASES AUXILIARES DE EJEMPLO PARA POO Y HERENCIA (TEMA 1)
// ============================================================================

class Vehiculo {
    public static final int ROJO = 3, VERDE = 2, AZUL = 1;
    private int color;
    private int numeroSerie;

    // Constructor sin parámetros
    public Vehiculo() {
        this.color = ROJO;
        this.numeroSerie = 0;
    }

    public int numeroSerie() {
        return numeroSerie;
    }

    public int color() {
        return color;
    }

    public void cambiaNumSerie(int numSerie) {
        this.numeroSerie = numSerie;
    }

    public void pinta(int nuevoColor) {
        this.color = nuevoColor;
    }
}

// Subclase que hereda de Vehiculo y añade atributo y métodos propios
class Coche extends Vehiculo {
    private int cilindrada;

    public int cilindrada() {
        return cilindrada;
    }

    public void cambiaCilindrada(int nuevaCilin) {
        this.cilindrada = nuevaCilin;
    }
}

// Subclase que hereda todo de Vehiculo sin añadir nada nuevo
class Barco extends Vehiculo {
}

// Ejemplo de sobreescritura (@Override) del método toString()
class Coordenada {
    private int x;
    private int y;

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
