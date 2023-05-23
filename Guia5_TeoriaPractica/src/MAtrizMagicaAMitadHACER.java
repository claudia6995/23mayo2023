

import java.util.Scanner;
import static javafx.scene.input.KeyCode.M;
public class MAtrizMagicaAMitadHACER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int sumaTotal = 0;
        int i;
        int sumaColumnas = 0;
        int sumaFilas = 0;    
        int diagonal=+M[i][i]; 
        int diagonal2=+M[3-1-i][3-1-i];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println(" Ingrese un numero");
                matriz[i][j] = leer.nextInt();
                sumaTotal = matriz[i][j] + sumaTotal;
            }
            System.out.println(" ");
        }
        System.out.println(" Nuestro numero magico es : " + sumaTotal / matriz.length);
        for (int[] matriz1 : matriz) {
        }
            for (int j = 0; j < matriz.length; j++) {
                (int) sumaFilas = matriz[i][j];
               int sumaColumnas += matriz[j[i];
                
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println(" ");
        }