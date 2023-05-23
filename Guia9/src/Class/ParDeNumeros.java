
package Class;


public class ParDeNumeros {
   private int num1; 
   private int num2;

    public ParDeNumeros() {
        num1 = (int) (Math.random() * 21) - 10;
        num2 = (int) (Math.random() * 21) - 10;
     
    }

    public ParDeNumeros(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
  
  
}
/**El código que proporcionaste genera un número aleatorio entre -10 y 9  (ambos inclusive) y lo guarda en la variable num1.
* Aquí te explico cómo funciona:
* Math.random() genera un número aleatorio entre 0 y 1 (exclusivo), es decir, un número decimal entre 0 y 0.999... Luego, se multiplica por -10, lo que hace que el resultado sea un número entre 0 y -9.999... Después, se suma 10, lo que desplaza el rango de números aleatorios a la derecha, obteniendo así un número aleatorio entre 10 y 0.000... Finalmente, se hace un cast a int, lo que convierte el número aleatorio en un número entero y se guarda en la variable num1.
* Es importante tener en cuenta que el rango de números generados es de -10 a 9, y no de -10 a 10, ya que el parámetro de la multiplicación es negativo, y por lo tanto, el número generado es negativo y el valor máximo es 9, no 10.
*/  
    
/** Para generar un número aleatorio en Java en el rango de -10 a 10, puedes utilizar el siguiente código:
 * java Copy code int num = (int) (Math.random() * 21) - 10; Este código utiliza Math.random() para generar un número aleatorio entre 0 y 1 (exclusivo) y lo multiplica por 21, lo que da como resultado un número aleatorio entre 0 y 20. Luego se resta 10, lo que desplaza el rango de números aleatorios a la izquierda y obtiene así un número aleatorio entre -10 y 10 (ambos inclusive). Finalmente, se hace un cast a int para convertir el número en un número entero y se guarda en la variable num.
*Es importante tener en cuenta que el rango de números aleatorios generados en este caso es de -10 a 10, ambos inclusive.
 */

