/*
Crear una clase ParDeNumerosService, en el paquete Servicios, 
que deberá además implementar los siguientes métodos:

*/

package Servicios;

import Class.ParDeNumeros;
import java.util.Scanner;
public class ParDeNumerosServicio {
    Scanner leer = new Scanner(System.in);
    ParDeNumeros n = new ParDeNumeros() ;
   
    public ParDeNumeros Vincular (){
       
       return null;
       
    }
       //Método mostrarValores que muestra cuáles son los dos números guardados.
  public void mostrarValores(){
    
    System.out.println("El Nº 1 es: "+n.getNum1());
     
       System.out.println("El Nº 2 es: "+n.getNum2()); 
   
  }
  
//Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
public void devolverMayor(){
    
 double maxN=  Math.max(n.getNum1(), n.getNum2());
  
 System.out.println("El mayor número es: "+maxN); 

}
 
/** double num1 = 3;
double num2 = 5;
double max = Math.max(num1, num2); // se obtiene el número máximo entre num1 y num2
double min = Math.min(num1, num2); // se obtiene el número mínimo entre num1 y num2
double Pot = Math.pow(max, min); // se eleva max a la potencia min
System.out.println(Pot); // se imprime el resultado, en este caso 125.0
*/
  
//Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. 
// Previamente se deben redondear ambos valores.
public void calcularPotencia() {
double maxN=  Math.max(n.getNum1(), n.getNum2());
double minN=  Math.min(n.getNum1(), n.getNum2());
double Pot = Math.pow(maxN,minN);
System.out.println("El mayor número elevado a la potencia del menor Nº  es: "+Math.round(Pot)); 
}
/** 
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
* */

    public void calculaRaiz() {
      double minN =  Math.min(n.getNum1(), n.getNum2());
      double Abs =  Math.abs(minN);
       double r2 = Math.sqrt(Abs);
       System.out.println("MIN Nº  es: "+minN);
       System.out.println("ABS"+Abs);
       System.out.println("La raíz cuadrada del menor Nº  es: "+r2);
    }
    
    }
 
/**El valor absoluto de un número es la distancia del número a cero en la recta numérica. En otras palabras, es el valor numérico de un número sin tener en cuenta su signo.

Por ejemplo, el valor absoluto de 5 es 5, ya que su distancia a cero es 5. De la misma manera, el valor absoluto de -5 también es 5, ya que su distancia a cero también es 5.

En Java, el valor absoluto de un número se puede obtener utilizando el método Math.abs(). Por ejemplo:

java
Copy code
int num1 = 5;
int num2 = -5;
int valorAbsoluto1 = Math.abs(num1); // valorAbsoluto1 tendrá el valor 5
int valorAbsoluto2 = Math.abs(num2); // valorAbsoluto2 también tendrá el valor 5
En este ejemplo, el método Math.abs() se utiliza para obtener el valor absoluto de num1 y num2, y se guardan los resultados en las variables valorAbsoluto1 y valorAbsoluto2, respectivamente.
* 
