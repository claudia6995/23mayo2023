package guia9_ejextra;

import java.util.Random;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeDate.getMonth;

public class Guia9_EjExtra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String[] Meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        Random random = new Random();
        String mesSecreto = Meses[random.nextInt(Meses.length)];
        System.out.println("el mes es: " + mesSecreto);
        String mesIngresado;
        System.out.println(" Ingresa un mes ");
        mesIngresado = leer.next();
        do {
            if (mesIngresado.equalsIgnoreCase(mesSecreto)) {
                System.out.println("¡HAS ACERTADO!");
                break;
            } else {
                System.out.println("¡Mes incorrecto, ingresa un nuevo mes ");
                mesIngresado = leer.next();
            }

        } while (mesIngresado != mesSecreto);

    }

}
