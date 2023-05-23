
package Main;


import Entidades.Cafetera;
import Servicio.CafeteraService;
import java.util.Scanner;


public class Ejercicio2 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CafeteraService cs1 = new CafeteraService();
        System.out.println("Bievenido al menu de la cafetera. Que desea hacer? ");
        int taza=0, agregado=0;
        Cafetera c1 = cs1.iniciarCafetera();
        int respuesta;
        do {
            System.out.println("MENU \n1 Llenar cafetera \n2 Servir taza \n3 Vaciar cafetera \n4 Agregar Cafe \n5 Salir ");
            respuesta = leer.nextInt();
            switch (respuesta) {
                case 1:
                    cs1.llenarCafetera(c1);
                    break;
                case 2:
                    cs1.servirTaza(c1, taza);
                    break;
                case 3:
                    cs1.vaciarCafetera(c1);
                    break;
                case 4:
                    cs1.agregarCafe(c1, agregado);
                    break;
                case 5:
                    respuesta = 5;
                    break;
                default:
                    System.out.println("Respuesta incorrecta");
            }
        } while (respuesta != 5);
        
    }

}
