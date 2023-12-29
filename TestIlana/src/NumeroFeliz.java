import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumeroFeliz {

    private static String num;

    public static void main(String[] argumentos) {

        System.out.println("Digite el número: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.next();

        if (!esNumero(num)) {
            System.out.println("no es un número");
            return;
        }
        List<Integer> listaResultado = new ArrayList<>();
        String[] numeroLista = num.split("");

        Integer resultado=0;
        boolean validacion=true;
        while (validacion){
            for (String numero : numeroLista) {
                resultado += (Integer.parseInt(numero) * Integer.parseInt(numero));
            }
            listaResultado.add(resultado);
            num = resultado.toString();
            if (resultado == 1) {
                validacion=false;
                break;
            }
            int i=0;
            for(Integer item : listaResultado){
                if(item.intValue()==resultado.intValue()){
                    i++;
                }
            }
            if(i>=2){
                break;
            }
            resultado=0;
            numeroLista = num.split("");
        }
        System.out.println("el resultado es: " + !validacion);
    }

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
