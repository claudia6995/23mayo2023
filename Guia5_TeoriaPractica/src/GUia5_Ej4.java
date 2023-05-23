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

public class GUia5_Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer = new Scanner(System.in);
         int [][] matriz= new int [4][4];
         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 100); 
             }
            
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
              System.out.print(" " + matriz[i][j] + " ");  
            }
            System.out.println(" "); 
        }
        System.out.println(" ");
        
        int [][]matriz2 = new int [4][4];
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matriz2[i][j] = matriz[j][i];
            }
        }
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
              System.out.print(" " + matriz2[i][j] + " ");  
            }
            System.out.println(" "); 
        } 
    }
    
}