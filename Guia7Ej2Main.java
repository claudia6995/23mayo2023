/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p6ej1;

import entidad.Circunferencia;

/**
 *
 * @author Migue
 */
public class p6ej2 {

    /**
    Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
    * A continuación, se deben crear los siguientes métodos:
    Método constructor que inicialice el radio pasado como parámetro.
    Métodos get y set para el atributo radio de la clase Circunferencia.
    Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
    Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
    Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

     */
    public static void main(String[] args) {
      
        Circunferencia circulo1 = new Circunferencia();
        
        circulo1.crearCircunferencia();
        
        System.out.println("area = "+circulo1.area());
        
        System.out.println("perimetro = "+circulo1.perimetro());
        
        
        
    }
    
}
