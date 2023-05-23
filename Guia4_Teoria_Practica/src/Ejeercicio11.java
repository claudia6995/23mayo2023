
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CRAMOS
 */
public class Ejeercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = sc.nextLine().toLowerCase();
        

        Transformar(frase);
        sc.close();
    }



public static String Transformar(String frase){

    String frase_transformada = "";
       
    for (int i = 0; i < frase.length(); i++) {
       
        switch(frase.substring(i,i+1)){
            case "a":
            frase_transformada += "@";
            break;

            case "e":
            frase_transformada += "#";
            break;

            case "i":
            frase_transformada += "$";
            break;

            case "o":
            frase_transformada += "%";
            break;

            case "u":
            frase_transformada += "*";
            break;
            
            default:
            frase_transformada += frase.substring(i,i+1);

        }

    }
    
    System.out.println("FRASE TRANSFORMADA: " + frase_transformada);
        return null;
        

}
}