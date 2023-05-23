package Servicios;

import Class.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

//Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    public void mostrarVocales(Cadena c) {
        int cont = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            String cadena = c.getFrase().toUpperCase().substring(i, i + 1);
         //  (equalsIgnoreCase(c.setFrase().substring(i,i+1) 
            switch (cadena) {
                case "A":
                    cont++;
                    break;
                case "E":
                    cont++;
                    break;
                case "I":
                    cont++;
                    break;
                case "O":
                    cont++;
                    break;
                case "U":
                    cont++;
                    break;
            }
            
       }
        System.out.println(cont);
    }
    public void invertirFrase(Cadena c){
      //Método invertirFrase(),
// deberá invertir la frase ingresada y 
//mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
String invert = ""     ;
for(int i = c.getLongitud()-1; i >= 0; i--){
         invert += c.getFrase().charAt(i);
         // charAt toma caracteres suma de uno.
            
        }
       System.out.println(invert);
          
   }
     //Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar
    // cuántas veces se repite el carácter en la frase, por ejemplo:
// Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
  
     public void vecesRepetido(Cadena c) {
        
         int cont = 0;
         System.out.println("Ingrese una letra");
         String letra = leer.next();
        for (int i = 0; i < c.getLongitud(); i++) {
            if (letra.equalsIgnoreCase(c.getFrase().substring(i,i+1))) {
                cont++;
               
            }
        
       }
         System.out.println("La " +letra+ "se repite "+cont);
    }

    public void compararLongitud(Cadena c1) {
        
    }

    public void unirFrases(Cadena c1) {
        
    }

    public void reemplazar(Cadena c1) {
        
    }

    public void contiene(Cadena c1) {
        
    }
     
}    
   //tel ??  03436119387
/**
Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
*/

    
    

