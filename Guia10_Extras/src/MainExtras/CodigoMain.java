package MainExtras;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author CRAMOS
 */
public class CodigoMain {

    public static void main(String[] args) {
        HashMap<Integer, String> Codigos = new HashMap();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Integer codigo;
        String ciudad;

        for (int i = 0; i < 1; i++) {
            System.out.println("INgrese CP");
            codigo = leer.nextInt();
            System.out.println("Ingrese Cidudad");
            ciudad = leer.next();
            Codigos.put(codigo, ciudad);

        }
        System.out.println(Codigos);

        System.out.println("Ingrese una CP");
        codigo = leer.nextInt();
        if (Codigos.containsKey(codigo)) {
           
//            for (Map.Entry<Integer, String> entry : Codigos.entrySet()) {
//                   System.out.println();
//                   if (Codigos.containsKey(codigo)) {
            System.out.println("La ciudad correspondiente al " + codigo + "es "+ Codigos.get(codigo));
        }
        else{
            System.out.println("El Cp no está en la base de datos. ");
                       
        }
        
        for (int i = 0; i < 2; i++) {
            System.out.println("INgrese CP");
            codigo = leer.nextInt();
            System.out.println("Ingrese Cidudad");
            ciudad = leer.next();
            Codigos.put(codigo, ciudad);
            System.out.println("Nueva lista"+Codigos);
            
  
           // https://www.mapanet.eu/es/
                     // Fañta eliminar.
        }
    }

}

//}
//Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
//página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
//numero.
//• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
//• Muestra por pantalla los datos introducidos
//• Pide un código postal y muestra la ciudad asociada si existe sino avisa al
//usuario.
//• Muestra por pantalla los datos
//• Agregar una ciudad con su código postal correspondiente más al HashMap.
//• Elimina 3 ciudades existentes dentro del HashMap
