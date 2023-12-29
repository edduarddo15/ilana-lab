import java.util.Scanner;

public class FooBar {

    private static int num;

    public static void main(String[] argumentos) {

        System.out.println("Digite el número: ");
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.next();

        if (!esNumero(entrada)) {
            System.out.println("no es un número");
            return;
        }

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.print("FooBar");
        } else if (num % 5 == 0) {
            System.out.print("Bar");
        } else if (num % 3 == 0) {
            System.out.print("Foo");
        } else {
            System.out.print(num);
        }
    }

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

