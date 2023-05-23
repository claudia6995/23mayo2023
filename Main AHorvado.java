/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado;
import Ahorcado.Ahorcado;
import Ahorcado.AhorcadoServicio;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Ahorcado ahorc = new Ahorcado();
    AhorcadoServicio as = new AhorcadoServicio();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    int rta=1; 
    do{
        ///ejecutar Juego principal
        as.juego(ahorc);
        
        /// ¿volver a jugar?
        do{
        System.out.println("");
        System.out.println("======= ¿Volver a Jugar? =======");
        System.out.println("        1- SI     2- NO");
        
        rta = sc.nextInt();
        }while(rta!=1 && rta!=2);
        
        ///Reseteo los Valores para Volver a Jugar
        if(rta==1){
        System.out.println("");
        as.reset(ahorc);
        }
    }while(rta!=2);
    
        System.out.println("¡Hasta Luego!");
    }
}
