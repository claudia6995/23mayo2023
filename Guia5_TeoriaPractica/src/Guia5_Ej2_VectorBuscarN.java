
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
public class Guia5_Ej2_VectorBuscarN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese una dimensión para el vector");
        int N = Leer.nextInt();
        int VectorN[] = new int[N];
        
        for (int i = 0; i < N; i++) {
            VectorN[i]=(int)(Math.random()*10);
            System.out.println(" " + VectorN[i]);
        }
  
        System.out.println("Ingrese el numero a que desea comparar ");
        int Num = Leer.nextInt();
        int cont=0;
        
        for (int i = 0; i < Num; i++) {
            if (VectorN[i]==Num){
            cont++;
         System.out.println("El nùmero se encuentra en la posición "+i); }
        cont++;}
            }
        
        System.out.println("El nùmero se repite "+ cont +" veces");
}
    
    
