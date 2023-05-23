import java.util.Scanner;

public class Guia5_Ej2_Jose {

  
 public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
         System.out.println("Ingrese la dimension de su vector:");
         int num = leer.nextInt();
         int vector[]=new int [num];
         for (int i = 0; i < num; i++) {
             vector[i]=(int)(Math.random()*10);
             System.out.print(" " +vector[i]);
        }
          System.out.println(" ");
         System.out.println(" Ingrese el numero a buscar : ");
         int num1=leer.nextInt();
         int cont1=0;
         for (int i = 0; i < num; i++) {
            if (vector[i]==num1){
                cont1++; 
             System.out.println(" El numero se encuentra en la posicion : " + i);}
        }
         System.out.println(" El numero se repite " +cont1+ " veces. ");
                 }
}
