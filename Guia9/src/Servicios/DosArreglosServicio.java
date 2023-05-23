package Servicios;

import java.util.Arrays;
import java.util.Random;

public class DosArreglosServicio {
double vAux [] = new double [50];

    public void inicializarA(double[] arregloA) {
        Random aleatorio = new Random();
        for (int i = 0; i < arregloA.length; i++) {
            //  Math.random() se multiplica por 100  - si uso aleatorio el 100 va dentro de los paréntesis
            arregloA[i] = aleatorio.nextInt(100);
        }
    }

    public void mostrarA(double[] arregloA) {
        System.out.println("Mostrar Arreglo A:");
         for (int i = 0; i < arregloA.length; i++) {

            System.out.print("| "+arregloA[i]+" ");
        }
       System.out.println("\n");
    }
    
    public void ordenar(double[] arregloA) {
 // ordena de menor a mayor 
    Arrays.sort(arregloA);
    
          // guardar el los valores ordenados de mayor a menor
          
       System.out.println("Mostrar Arreglo A ordenado de Mayor a Menor:\n");
       int cont =0;
  for (int i = (arregloA.length-1);i > 0; i--) {
       System.out.print("|"+arregloA[i]+" ");
       
         vAux [cont]= arregloA[i];
         cont ++;
                  System.out.print("|"+vAux[i]+" ");
                  
        }
          System.out.print("\n");
    }
    //Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
    // Luego llenar las últimas 10 posiciones del arreglo B con 0.5.

     public void inicializarB(double[] arregloA, double[] arregloB) {
System.out.print("\n Inicializar Vector B - Primeros 10 números copiados de Vector A y últimos 10 números valor fijo = 0,5 :\n");
        for (int i = 0; i < 10; i++) {
           // 
           arregloB[i]= vAux[i];
            System.out.print("|"+arregloB[i]+" ");
    }
      
       for (int i = 10; i < arregloB.length; i++) {
            arregloB[i] = 0.5;
            System.out.print("| "+ arregloB[i]+" " );
       }
  System.out.println("\n");
     }
}

/**System.out.print("Mostrar Arreglo A ordenado de Menor a Mayor:\n");
      *  for (int i = 0; i < arregloA.length; i++) {
         
        *    System.out.print("| "+ arregloA[i]+ " ");
        }*/
    /**for (int i = 0; i < arregloA.length; i++) {
            System.out.print("| "+ arregloA[i]+" ");
            * 
                
     }
       System.out.println("\n");*/