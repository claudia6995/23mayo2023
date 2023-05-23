
import java.util.Scanner;


public class Guia2_Teoria_Ej6_Num_May25 {

  
    public static void main(String[] args) {
    
        
    Scanner leer = new Scanner(System.in);
        System.out.println("ingrese 2 numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
             
        if (num1 > 25 & num2 > 25) {
            System.out.println("ambos numeros son mayores 5 ");
            
            
            }else if (num1 <=25 & num2 <=25){
                System.out.println("Ninguno es mayor a 25");
                
               }else if (num1 > 25 & num2 <=25){
                   System.out.println("El primer numero es mayor a 25 pero el segundo no ;( ");
                   
                  }else{
                   System.out.println("El segundo es mayor ,  pero el primero no ");
        }
           
    } 
    }