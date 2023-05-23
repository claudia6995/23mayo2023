
package Main;


import Class.CadenaIG;
import Servicios.CadenaServIG;
import java.util.Scanner;

public class CadenaMainIG {

    
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     CadenaServIG cs = new CadenaServIG();
        
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        int longitud = frase.length();
        
        CadenaIG c1 = new CadenaIG(frase,longitud);
       
        cs.mostrarVocales(c1);
        cs.invertirFrase(c1);
        cs.vecesRepetido(c1);
        cs.compararLongitud(c1);
        cs.unirFrases(c1);  
        cs.reemplazar(c1);
        cs.contiene(c1);
    }
    
}
