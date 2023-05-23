/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CRAMOS
 * import java.util.Scanner;
 */
import java.util.Scanner;
 public class Guia5_Ej6_CuadradoMagicoULTIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
        int a=0; int b=0; int c=0;int d=0;int e=0; int f=0;int g=0;int h=0;
        int matriz[][]= new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese un valor entre 1 y 9 para la posicion : "+i+" " +j );
                matriz[i][j] = leer.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " +matriz[i][j] );
                if (j==0){a += matriz[i][0];}
                if (j==1){b += matriz[i][1];}
                if (j==2){c += matriz[i][2];}
                if (i==0){d += matriz[0][j];}
                if (i==1){e += matriz[1][j];}
                if (i==2){f += matriz[2][j];}
                if (i==j){g += matriz[i][j];}
                if (i+j==2){ h += matriz[i][2-i];}
            } System.out.println(" ");
        }
        if (a==b && b==c && c==d && d==e && e==f && f==g && g==h){ System.out.println(" La matriz es magica. ");}
        else {System.out.println(" La matriz no es magica. ");}  
    } }