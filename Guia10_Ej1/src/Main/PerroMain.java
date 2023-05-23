package Main;

import Servicio.PerroServicio;
import java.util.Scanner;

public class PerroMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        PerroServicio perros = new PerroServicio();
// -----------------------------------------------------------------
        boolean continuar = true;

        while (continuar) { // Ojo si le doy valor puedo no salir del bucle
            perros.crearPerro();

            System.out.println("¿Desea crear otro Perro? S/N");
            String resp = leer.next();

            if (resp.equalsIgnoreCase("N")) {
                continuar = false;

            }

        }
 perros.mostrarPerro();
 //---------------------------------------------------------------
 perros.buscarPerro();
    }
}
