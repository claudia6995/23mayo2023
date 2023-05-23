
package Main;

import Class.Cadena;
import Servicios.CadenaServicio;
import java.util.Scanner;


public class CadenaMain {

    
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in); 
   /**     System.out.println("Ingrese una frase");
     Cadena ca = new Cadena(leer.nextLine());
        System.out.println(ca.getFrase());
        System.out.println(ca.getLongitud());
       CadenaServicio nv = new CadenaServicio();
       int vocales;
       vocales = nv.mostrarVocales(ca);
        System.out.println(vocales);
     */   
    CadenaServicio nv = new CadenaServicio();
    System.out.println("Ingrese una frase");
    String frase = leer.nextLine();
    int longitud = frase.length();
    Cadena c1 = new Cadena(frase,longitud);
    nv.mostrarVocales(c1);
    nv.invertirFrase(c1);
    nv.vecesRepetido(c1);
    }
    
}
