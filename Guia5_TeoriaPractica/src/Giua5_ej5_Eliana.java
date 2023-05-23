/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CRAMOS
 */
import java.util.Scanner; 
public class Giua5_ej5_Eliana {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
     
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[][] matriz2 = new int[3][3];
        
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j <matriz.length; j++) {
                System.out.println("Ingrese un numero"); 
              matriz[i] [j]=leer.nextInt();
              
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j <matriz.length; j++) {
         System.out.print(" "+matriz[i][j]+" ");    
                
            }
            System.out.println(" ");
        }
        for (int i = 0; i <matriz2.length; i++) {
            for (int j = 0; j <matriz.length; j++) {
            matriz2[i][j] = matriz [j] [i]* (-1);
                
            }
   
        }
        System.out.println(" ");
        for (int i = 0; i <matriz2.length; i++) {
            for (int j = 0; j <matriz2.length; j++) {
         System.out.print(" "+matriz2[i][j]+" ");    
                
            }
            System.out.println(" ");
    }
    } 
}