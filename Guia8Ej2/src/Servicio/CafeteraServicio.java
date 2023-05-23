package Servicio;
import Entidad.Cafetera;
import java.util.Scanner;


/**Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe 
package Servicio;
*/
public class CafeteraServicio {
   Scanner leer = new Scanner(System.in).useDelimiter ("\n"); 

  public Cafetera inciciarCafetera(Cafetera aux){
      
/** aux.setCantidadMaxima(1000);
 * aux.setCantidadActual((int)(Math.random()*1000));
 */
 return new Cafetera(1000 ((int)(Math.random()*1000)));
  } 
// Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
public void llenarCafetera(Cafetera aux){
System.out.println("La cafetera se ha llenado"+(aux.getCantidadMaxima(aux.cantidadActual()));
aux.setCantidadActual(1000);
}
// Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
   
public int servirTaza(Cafetera aux){
    System.out.println("Ingrese la capacidad de sus taza");
    taza = leer.nextInt();
    if (aux.getcantidadActual()<taza){
        System.out.println("La taza no está completa. Se lleno con la cantidad: " +aux.getcantidadActual(0));
    }aux.setcantidadActual(0)}
else{aux-setCatindadActual(aux.getCantidadActual()-taza);
            System.out.println("La taza está completa le queda la cantidad de café "+aux.getcantidadActual());
            
    return 0;
}
// Método vaciarCafetera(): pone la cantidad de café actual en cero. 
public void vaciarCafetera(Cafetera aux){
    aux.setcantidadActual(0);
    System.out.println(" la cafetera ya está vacía");
    
}
// Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
public void agregarCafe(Cafetera aux, int agregado){
    System.out.println("La cafetera tiene"+ aux.getcantidadActual()+"Puede agregar hasta "+(aux.getcantidadMaxima()-auxcantidadActual()));
    System.out.println("Ingrese cafe ");
    agregado = leer.nextInt();
    if ((aux.getcantidadMaxima()-auxcantidadActual()<agregado) {
        System.out.println("La cafetera se rebalsó "+( agregado + aux.getcantidadMaxima()-auxcantidadActual()));
       aux.setcantidadActual(1000);
    }else{
        System.out.println("Se llenó la cafetera ");
    aux.setcantidadActual(agregado +  aux.setcantidadActual()); + 
)  
            }
    
}https://github.com/JuanPabloPutero1984/Ejercicio1_POO
}
