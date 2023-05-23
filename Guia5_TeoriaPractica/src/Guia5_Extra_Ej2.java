/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CRAMOS
 */import java.util.Scanner;
public class Guia5_Extra_Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println(" ingrese la dimension de los vectores");
        int num= leer.nextInt();
        int [] vector = new int[num];
        int []vector2 = new int [num];
        for (int i = 0; i < num; i++) {
            System.out.println("ingrese numero del primer vector");
            vector[i]= leer.nextInt();  
        }
        for (int i = 0; i < num; i++) {
            System.out.println("ingrese numero del segundo vector");
            vector2[i]= leer.nextInt();
        }
        int cont = 0;
        for (int i = 0; i < num; i++) {
            if (vector[i]==vector2[i]) {
            cont++;
            }
           
        }
        if (cont==num) {
            System.out.println("los vectores son iguales");
            
        } else {
            System.out.println("los vectores son distintos");
        }
    }
}