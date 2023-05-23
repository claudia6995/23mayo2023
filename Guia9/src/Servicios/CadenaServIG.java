
package Servicios;

import Class.CadenaIG;
import java.util.Scanner;

public class CadenaServIG {
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void mostrarVocales(CadenaIG f){
        int cont = 0;
        for(int i=0;i<f.getLongitud();i++){
            char letra = f.getFrase().toLowerCase().charAt(i);
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                cont++;
            }
        }
        System.out.println("La frase tiene " + cont + " vocales");
    }
    
    public void invertirFrase(CadenaIG f){
        String cadenaInvertida = "";
        for(int i=f.getLongitud()-1;i>=0;i--){
            cadenaInvertida += f.getFrase().charAt(i);
        }
        System.out.println("Cadena invertida: " + cadenaInvertida);
    }
    
    public void vecesRepetido(CadenaIG f){
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
    
    public void compararLongitud(CadenaIG f){
        System.out.println("Ingrese la frase nueva");
        String fraseUsuario = leer.next();
        System.out.println("Longitud frase nueva " + fraseUsuario.length());
        System.out.println("Longitud frase objeto " + f.getLongitud());
    }
    
    public void unirFrases(CadenaIG f){
        System.out.println("Ingrese una frase nueva");
        String fraseNueva = leer.next();
        System.out.println("Frase unida " + f.getFrase().concat(fraseNueva));
    }
    
    public void reemplazar(CadenaIG f){
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
    
    public void contiene(CadenaIG f){
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

 
}
