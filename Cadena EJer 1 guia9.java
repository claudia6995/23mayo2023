
package Entidades;


public class Cadena {
  private String frase;
  private int longitud;

    public Cadena() {
    }

    public Cadena(String frase,int longitud) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }
  

Servicio;

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
     
}    
    
/**
Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
*/
Franco Pando  a  Todos 18:26
.
Usted  a  Todos 18:26
clase
package Class;

public class Cadena {
    
   private String frase;
   private int longitud;

    public Cadena() {
    }

    public Cadena(String frase,int longitud) {
        this.frase = frase;
        this.longitud = frase.length();
              
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
   
    
    
}package Class;

public class Cadena {
    
   private String frase;
   private int longitud;

    public Cadena() {
    }

    public Cadena(String frase,int longitud) {
        this.frase = frase;
        this.longitud = frase.length();
              
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
   
    
    
}
Usted  a  Todos 18:28
package Main;

import Class.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;


public class Guia9_Ej1 {

    
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
Ignacio Gómez Rodríguez  a  Todos 18:28
CLASE CADENA
private String frase;
  private int longitud;

    public Cadena() {
    }

    public Cadena(String frase,int longitud) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }
Usted  a  Todos 18:28
clase endtidad
Ignacio Gómez Rodríguez  a  Todos 18:28
CLASE CADENA SERVICIO
Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void mostrarVocales(Cadena f){
        int cont = 0;
        for(int i=0;i<f.getLongitud();i++){
            char letra = f.getFrase().toLowerCase().charAt(i);
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                cont++;
            }
        }
        System.out.println("La frase tiene " + cont + " vocales");
    }
    
    public void invertirFrase(Cadena f){
        String cadenaInvertida = "";
        for(int i=f.getLongitud()-1;i>=0;i--){
            cadenaInvertida += f.getFrase().charAt(i);
        }
        System.out.println("Cadena invertida: " + cadenaInvertida);
    }
    
    public void vecesRepetido(Cadena f){
        int cont = 0;
        System.out.println("Ingrese un caracter");
        char usuarioLetra = leer.next().charAt(0);
        for(int i=0;i<f.getLongitud();i++){
            char letra = f.getFrase().toLowerCase().charAt(i);
            if(letra == usuarioLetra){
                cont++;
            }
        }
        System.out.println("La letra " + usuarioLetra + " está " + cont + " veces");
    }
    
    public void compararLongitud(Cadena f){
        System.out.println("Ingrese la frase nueva");
        String fraseUsuario = leer.next();
        System.out.println("Longitud frase nueva " + fraseUsuario.length());
        System.out.println("Longitud frase objeto " + f.getLongitud());
    }
    
    public void unirFrases(Cadena f){
        System.out.println("Ingrese una frase nueva");
        String fraseNueva = leer.next();
        System.out.println("Frase unida " + f.getFrase().concat(fraseNueva));
    }
    
    public void reemplazar(Cadena f){
        String fraseNueva = "";
        System.out.println("Ingrese letra");
        char usuarioLetra = leer.next().charAt(0);
        for(int i = 0; i<f.getLongitud();i++){
            char letra = f.getFrase().toLowerCase().charAt(i);
            if(letra == 'a'){
                fraseNueva += usuarioLetra;
            } else {
                fraseNueva += letra;
            }
        }
        System.out.println("Frase nueva con reemplazo "+ fraseNueva);
    }
    
    public void contiene(Cadena f){
        int cont = 0;
        System.out.println("Ingrese una letra");
        char usuarioLetra = leer.next().charAt(0);
        for(int i = 0; i<f.getLongitud();i++){
            char letra = f.getFrase().charAt(i);
            if(letra == usuarioLetra){
                System.out.println(true);
                cont++;
                break;
            }
        }
        if(cont == 0){
            System.out.println(false);
        }
    }
Usted  a  Todos 18:28
package Class;

public class Cadena {
    
   private String frase;
   private int longitud;

    public Cadena() {
    }

    public Cadena(String frase,int longitud) {
        this.frase = frase;
        this.longitud = frase.length();
              
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
   
    
    
}
servicio:
package Servicio;

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
     
}    
    
/**
Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
*/
Ignacio Gómez Rodríguez  a  Todos 18:29
MAIN
Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CadenaServicio cs = new CadenaServicio();
        
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        int longitud = frase.length();
        
        Cadena c1 = new Cadena(frase,longitud);
        
        cs.mostrarVocales(c1);
        cs.invertirFrase(c1);
        cs.vecesRepetido(c1);
        cs.compararLongitud(c1);
        cs.unirFrases(c1);
        cs.reemplazar(c1);
        cs.contiene(c1);

    
  
}
