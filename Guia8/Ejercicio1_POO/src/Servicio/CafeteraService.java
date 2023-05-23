
package Servicio;

import Entidades.Cafetera;
import java.util.Scanner;


public class CafeteraService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Cafetera iniciarCafetera(){
        
        return new Cafetera(1000, ((int)(Math.random()*1000)));
    
    }
    
    public void llenarCafetera(Cafetera aux){
        System.out.println("La cafetera tenia " + aux.getCantidadActual() +" Ml.");
        System.out.println("La cafetera se ha llenado " +(aux.getCantidadMaxima()- aux.getCantidadActual()) + " Ml.");
        aux.setCantidadActual(1000);
        
    }
    
    public void servirTaza(Cafetera aux, int taza){
        System.out.println("Ingrese la capacidad de su taza");
        taza = leer.nextInt();
        if (aux.getCantidadActual()< taza) {
            System.out.println("La taza no esta completa. Se lleno con la cantidad "+ aux.getCantidadActual());
            aux.setCantidadActual(0);
        } else {
            aux.setCantidadActual(aux.getCantidadActual()- taza);
            System.out.println("La taza esta completa. Le queda esta cantidad de cafe " + aux.getCantidadActual());
        }
    }
    
    public void vaciarCafetera(Cafetera aux){
         aux.setCantidadActual(0);
         System.out.println("La cafetera se ha vaciado");
    }
    
    public void agregarCafe(Cafetera aux, int agregado){
        System.out.println("La cafetera actualmente tiene " + aux.getCantidadActual() + " Puede agregarle hasta "+ (aux.getCantidadMaxima()-aux.getCantidadActual()));
        System.out.println("Ingrese la cantidad de cafe que quiera agregar");
        agregado = leer.nextInt();
        
            if ((aux.getCantidadMaxima()-aux.getCantidadActual())< agregado) {
            System.out.println("La cafetera se rebalso. Se ha llenado y ha desperdiciado " + (agregado - aux.getCantidadMaxima()+aux.getCantidadActual()));
            aux.setCantidadActual(1000);
            }else{
                System.out.println("Se agrego cafe correctamente ");
                aux.setCantidadActual(agregado + aux.getCantidadActual());
                System.out.println("Cantidad actual " + aux.getCantidadActual());
            }
        
    }
}
