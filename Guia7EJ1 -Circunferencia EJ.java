/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos: Método constructor que inicialice el radio pasado como parámetro. Métodos get y set para el atributo radio de la clase Circunferencia. Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto. Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2). Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
 *
 */
public class Circunferencia {

    private double radio;

    public Circunferencia() {
    }

    
    public Circunferencia(double radio) {
        this.radio = radio;

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
//Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.

    public double crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese radio");
        radio = leer.nextDouble();
        return radio;
    }

    // Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
    public double area() {
        //double area = Math.PI*(radio*radio);
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    //Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
    public double perimetro(){
        double perimetro = Math.PI *2*radio;
        return perimetro;
    }
    
    
    
}
