import java.util.Scanner;

/**
 * Clase creada para realizar el ejercicio del Foo Bar
 */
public class FooBar {

    private static int num;

    public static void main(String[] argumentos) {

        // Lineas para capturar por consola el número
        System.out.println("Digite el número: ");
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.next();

        /**
         * Método que devuelve la validación del dato digitado
         */
        if (!esNumero(entrada)) {
            System.out.println("no es un número");
            return;
        }

        // Valida si el número es divisible por 3 y por 5
        if (num % 3 == 0 && num % 5 == 0) {
            // Linea para imprimir la salida, si es verdadera la validación
            System.out.print("FooBar");
            // Valida si el número es divisible por 5
        } else if (num % 5 == 0) {
            // Linea para imprimir la salida, si es verdadera la validación
            System.out.print("Bar");
            //Valida si el número es divisible por 3
        } else if (num % 3 == 0) {
            // Linea para imprimir la salida, si es verdadera la validación
            System.out.print("Foo");
            //Imprime el número si no cumple con ninguna validación
        } else {
            System.out.print(num);
        }
    }

    /**
     * Método para validar que el dato sea un número.
     * @param str
     * @return
     */
    public static boolean esNumero(String str) {
        try { //Intentar convertir el String a un número
            num=Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            //Si ocurre una excepción, el String no es un número
            return false;
        }
    }
}

