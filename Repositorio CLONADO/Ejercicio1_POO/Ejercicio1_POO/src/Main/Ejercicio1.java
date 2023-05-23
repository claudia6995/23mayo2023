
package Ejercicio1;

import Entidades.CuentaBancaria;
import Servicio.CuentaBancariaServicio;
import java.util.Scanner;


public class Ejercicio1 {

   
    public static void main(String[] args) {
        int respuesta;
        CuentaBancariaServicio cs1 = new CuentaBancariaServicio();
        CuentaBancaria c1 = cs1.Crear();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        do {
            System.out.println("MENU \n1 Ingresar dinero \n2 Retirar dinero \n3 Extraccion Rapida \n4 Consultar Saldo \n5 Consultar Datos \n6 Salir ");
            respuesta = leer.nextInt();
            switch (respuesta) {
                case 1:
                    cs1.agregar(c1);
                    break;
                case 2:
                    cs1.retirar(c1);
                    break;
                case 3:
                    cs1.ExtraccionRapida(c1);
                    break;
                case 4:
                    cs1.ConsultarSaldo(c1);
                    break;
                case 5:
                    cs1.ConsultarDatos(c1);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opcion Erronea");
            }
            
            
        } while (respuesta != 6);
        
    }

}
