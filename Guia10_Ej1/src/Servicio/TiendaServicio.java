package Servicio;

import Entidad.Tienda;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String TipoPr;

    // HashMap<String, Double> tienda = new HashMap(); No lo uso aca porque lo tengo definido ATRIBUTO EN TIENDA,, el conjunto de datos del producto
// Además, se necesita que la aplicación cuente con las funciones básicas. Estas las realizaremos en el servicio. Como,
//introducir un elemento, 
    public void introducirElemento(Tienda T) {
        String resp;
        boolean prodrep;
        System.out.println("--------------------------------------------------");
        do {

            System.out.println("Ingrese el Nombre de Producto");
            TipoPr = leer.next();
            if (T.getProducto().containsKey(TipoPr)) {
                do {
                    System.out.println("Este producto ya existe, desea sobreescribirlo S/N");
                    resp = leer.next();
                } while (!resp.equalsIgnoreCase("S") && !resp.equalsIgnoreCase("N"));
                if (resp.equalsIgnoreCase("N")) {
                    break;
                }
            }

            System.out.println("Ingrese precio de Producto");
            Double valor = leer.nextDouble();
            // con put ingreso toods los valores del objeto 
            T.getProducto().put(TipoPr, valor);
            do {
                System.out.println("Desea agregar otro producto? S/N ");
                resp = leer.next();

            } while (!resp.equalsIgnoreCase("S") && !resp.equalsIgnoreCase("N"));

        } while ("S".equalsIgnoreCase(resp));

    }

//modificar su precio,
    public void modificarPrecioProducto(Tienda T) {
        System.out.println("--------------------------------------------------");
        
        System.out.println("Ingrese producto que desea modificar precio");
        TipoPr = leer.next();
        if (T.getProducto().containsKey(TipoPr)) {
                  System.out.println("Ingrese nuevo precio de producto ingresado");
            Double valor = leer.nextDouble();
            // con put ingreso toods los valores del objeto 
            T.getProducto().put(TipoPr, valor);  
                  }else
            System.out.println("El producto no está en el listado");
        
        }
        //eliminar un producto y
    public void eliminarProducto(Tienda T) {
        System.out.println("--------------------------------------------------");
        
 System.out.println("Ingrese producto que desea eliminar");
        TipoPr = leer.next();
        if (T.getProducto().containsKey(TipoPr)) {
                              
            T.getProducto().remove(TipoPr);  
                  }else
            System.out.println("El producto no está en el listado");
        
    }

    //mostrar los productos que tenemos con su precio (Utilizar Hashmap).
    //El HashMap tendrá de llave el nombre del producto y de valor el precio.
    public void mostrarProductos(Tienda T) {
        System.out.println("--------------------------------------------------");
        for (Map.Entry<String, Double> aux : T.getProducto().entrySet()) {
            System.out.println("- Producto: " + aux.getKey() + ";  Precio: $ " + aux.getValue());

        }
    }

//Realizar un menú para lograr todas las acciones previamente mencionadas.
}
