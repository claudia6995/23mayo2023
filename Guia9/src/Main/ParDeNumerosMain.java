
package Main;

import Class.ParDeNumeros;
import Servicios.ParDeNumerosServicio;
import java.util.Scanner;

public class ParDeNumerosMain {
    
public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
 ParDeNumerosServicio n = new ParDeNumerosServicio();
 ParDeNumeros nn = new ParDeNumeros();
 n.mostrarValores();
 n.devolverMayor();
 n.calcularPotencia();
 n.calculaRaiz();
}
}
