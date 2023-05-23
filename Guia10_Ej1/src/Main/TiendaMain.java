package Main;

import Entidad.Tienda;
import Servicio.TiendaServicio;
import java.util.Map;
import java.util.Scanner;

public class TiendaMain {

    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        TiendaServicio pds = new TiendaServicio();

        Tienda prod = new Tienda();

               int resp; 
               
        do {
            System.out.println("--------------------------------------------------");         
            System.out.println("Elija una opción: \n1-Cargar producto\n2- Modificar precio \n3- Eliminar producto \n4- Mostrar productos \n5- Salir");
           resp = leer.nextInt();
            
            switch (resp) {

                case 1:  pds.introducirElemento(prod);

                    break;
                    
                case 2: pds.modificarPrecioProducto(prod);

                    break; 
                    
                case 3:pds.eliminarProducto(prod);

                    break;
                    
                case 4: pds.mostrarProductos(prod);

                    break;
                    
                case 5: System.out.println("SALIR DEL SISTEMA");

                    break;
                   
                          
                default: System.out.println("La opciòn ingresada no es correcta, intente nuevamente");
                    
            }

        } while ( resp !=5);

        System.out.println("--------------------------------------------------");         

    }

}
