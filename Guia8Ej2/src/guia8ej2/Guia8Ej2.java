/*
 * Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera). Agregar constructor vacío y con parámetros así como setters y getters. Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. y se añade a la cafetera la cantidad de café indicada.

 */
package guia8ej2;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;

public class Guia8Ej2 {
   
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      CafeteraServicio C1 = new CafeteraServicio(); 
        System.out.println("Bienvenido al menú de la cafetera. ¿Qué desea hacer?"); 
      
        int taza =0
        int agregado = 0
        Cafetera C1= C1.iniciarCafetera();
     
        do {
            System.out.println("MENU \n llenar cafetera \n servir taza \n vaciar cafetera \n ); 
        int respuesta = leer.nextInt());
          switch (respuesta)  {
              case 1:
                  C1.llenarCafetera(c1);
                  break
              case 2:
                  C1.servirTaza(c1,taza);
                  break
              case 3:
                  C1.vaciarCafetera(c1);
                  break
                case 4:
                    C1.agregarCafe(c1,agregado);
                    break
                            respuesta = 
              case 5:
                  break
          }
        
        
   
    

