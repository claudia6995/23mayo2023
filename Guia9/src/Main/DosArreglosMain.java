package Main;

import Servicios.DosArreglosServicio;
import java.util.Scanner;


public class DosArreglosMain {
   
    public static void main(String[] args) {
        
        Scanner Leer = new Scanner(System.in);
        
        double [] arregloA = new double [50];
        double [] arregloB = new double [20];
        
        DosArreglosServicio V1 = new DosArreglosServicio();
        // V1 es caracter con que llamar al metodo. 
        V1.inicializarA(arregloA);
        V1.mostrarA(arregloA);
        V1.ordenar(arregloA);
        V1.inicializarB(arregloA, arregloB);
        System.out.println("Vector A: " + arregloA+" y mostrar B "+arregloB);
    }
}

