/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author CRAMOS
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // ingresar dos numeros y ver si son multiplos
Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo numero");
        int num2 = sc.nextInt();

        Multiplo(num1,num2);
// PARA EVITARA QUE SIGA CORRIENDO Y NO GASTE RAM

        sc.close();
    }


    public static void Multiplo(int num1, int num2){
    // EQUIVALE A MOD
        if (num1%num2==0){
            System.out.println("SON MULTIPLOS");
        } else{
            System.out.println("NO SON MULTIPLOS");
        }
    
    }
    

}

