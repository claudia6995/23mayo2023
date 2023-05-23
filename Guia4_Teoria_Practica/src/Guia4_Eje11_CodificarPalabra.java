
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
public class Guia4_Eje11_CodificarPalabra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        // TODO code application logic here

    }

    public static String frase() {
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frases = Leer.nextLine();
        String x = "";

        for (int i = 0; i < frases.length ; i++) {
String vocal
            switch vocal.substring(i, i + 1)) {
                case "a":
                    vocal.substring(i, i + 1) = "@";
                    break;

                case "e":
                    frases.substring(i, i + 1) = "#";
                    break;
                case "i":
                    frases.substring(i, i + 1) = "$";
                    break;
                case "o":
                    frases.substring(i, i + 1) = "%";
                    break;
                case "u":
                    frases.substring(i, i + 1) = "*";
                    break;
            }

        }
    
    default
        }

    return x ;

}
}
