import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumeroFeliz {

    private static String num;

    public static void main(String[] argumentos) {

        // Lineas para capturar por consola el número
        System.out.println("Digite el número: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.next();

        /**
         * Método que devuelve la validación del dato digitado
         */
        if (!esNumero(num)) {
            System.out.println("no es un número");
            return;
        }
        //Línea para asignar una lista para los resultados de las sumas de los números
        List<Integer> listaResultado = new ArrayList<>();
        //Separa cada digito del número digitado
        String[] numeroLista = num.split("");

        // variable para asignar el resultado
        Integer resultado = 0;
        //variable creada para salir del while
        boolean validacion = true;
        while (validacion) {
            //for creado para sumar los números y luego el resultado de la suma de esos números
            for (String numero : numeroLista) {
                //asigna la sumatoria a resultado
                resultado += (Integer.parseInt(numero) * Integer.parseInt(numero));
            }
            //se asigna resultado a la lista de resultados
            listaResultado.add(resultado);
            //se asigna resultado a la variable num para luego compararlo
            num = resultado.toString();
            //Se valida que si el resultado es igual a 1 se salga del ciclo porque ya es un número feliz
            if (resultado == 1) {
                validacion = false;
                break;
            }
            //se almacena los resultados
            int i = 0;
            for (Integer item : listaResultado) {
                if (item.intValue() == resultado.intValue()) {
                    i++;
                }
            }
            // Se valida si se repiten los resultados, se salga del ciclo
            if (i >= 2) {
                break;
            }
            //limpiar la variable resultado para inicializar el ciclo
            resultado = 0;
            //se asigna el valor que tiene la variable num
            numeroLista = num.split("");
        }
        //imprime la validación del ejercicio
        System.out.println("el resultado es: " + !validacion);
    }

    /**
     * Método para validar que el dato sea un número.
     * @param str
     * @return
     */
    public static boolean esNumero(String str) {
        try { //Intentar convertir el String a un número
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            //Si ocurre una excepción, el String no es un número
            return false;
        }
    }
}
