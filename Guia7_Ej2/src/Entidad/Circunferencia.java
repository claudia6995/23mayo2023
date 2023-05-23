/*Declarar una clase llamada Circunferencia que tenga como
atributo privado el radio de tipo real. 
A continuación, se deben crear los siguientes métodos:

 */
package Entidad;

/**
 *import Entidad.Circunferencia;
 * @author CRAMOS
 */
import java.util.Scanner;

public class Circunferencia {
    private double radio1;

    public Circunferencia() {
    }

    
    
    public Circunferencia(double radio1) {
        this.radio1 = radio1;
    }
    
    public double getRadio1() {
        return radio1 = radio1;
    }
    public void setRadio1(double radio1) {
        this.radio1 = radio1;
    }
    // Crear el area para hacer el calculo 
    public void nombre() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio ");
        radio1 = leer.nextDouble();
    }
    
    public double area() {
        double area = Math.PI*radio1*radio1;
        System.out.println("Área "+ area);
      return area;
      }  
       public double perimetro() {
        double perimetro = 2*Math.PI*radio1;
        System.out.println("Perimetro "+ perimetro);
      return perimetro; 
      }   
}

/**Método constructor que inicialice el radio pasado como parámetro.
//Métodos get y set para el atributo radio de la clase Circunferencia.
// Método para crearCircunferencia(): que le pide el radio y lo guarda 
* //en el atributo del objeto.
// Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
// Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).


        
        
