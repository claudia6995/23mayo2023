/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author CRAMOS
 */
public class Rectangulo {

    private int base;
    private int altura;

    public void CrearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectángulo");
        base = leer.nextInt();
        System.out.println("Ingrese la altura del rectángulo");
        altura = leer.nextInt();
    }

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int CalcularSuperficie() {

        int CalcularSuperficie = base * altura;
        System.out.println("La superficie del rectángulo es: " + CalcularSuperficie);
        return CalcularSuperficie;
    }

    public int CalcularPerimetro() {

        int CalcularPerimetro = (base + altura) * 2;
        System.out.println("La superficie del rectángulo es: " + CalcularPerimetro);
        return CalcularPerimetro;
    }

    public int DibujarRectangulo() {

        for (int i = 1; i <= altura; i++) {
            System.out.println(" ");
            for (int j = 1; j <= base; j++) {

   if ( i== 1 || i == altura || j == 1 || j == base ) {  
                      
                System.out.print("*");
                }
                else{
                         System.out.print(" ") ; 
                           }
            }
                           
         
      }
        System.out.println("");
        return 0;
    }
}  
