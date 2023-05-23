
import java.util.Scanner;


public class GUia5_Ej1_Vector100NumEn {

   
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
    int[] NumEnt = new int[100];
    
         for (int i = 0; i <NumEnt.length; i++) {
             NumEnt[i] =( i+1);

         }
          for (int i=(NumEnt.length-1);  i >= 0;  i--){
            
            System.out.println("El Vector NumEnt "  + NumEnt[i]);
        }
    }
    
}
