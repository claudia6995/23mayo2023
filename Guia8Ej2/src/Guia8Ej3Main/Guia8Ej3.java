/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia8Ej3Main;

/**
 *
 * @author CRAMOS
 */
public class Guia8Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
        
        PersonaServicio pers = new PersonaServicio();// traigo el  objeto en main. 

        //creo las personas: 
        int cantPers = 4;
        // Creado el array con la cantidad de personas. El vector Persona
        Persona[] p = new Persona[cantPers];
                      
        for (int i = 0; i < cantPers; i++) {
        System.out.println("\n - Persona Nº" + (i+1) + " complete los siguientes datos:");
            p[i] =pers.crearPersona();
            
        }
        //  CREAR Vector IMC    
        int[] vIMCs = new int[4];
        pers.calcularPorcentajeIMC(vIMCs);
        //   Vector EDAD         
        boolean[] vEdad = new boolean[4];
        pers.calcularPorcentajeEdad(vEdad);
    }
}

        
        

        // Vector EDAD         boolean[] vEdad = new boolean[4];
        // asiganción del valor         for (int i = 0; i < (3); i++) {            vEdad[i] = pers.esMayordeEdad(Vpersonas[i].getEdad()) // esto devuelve el verdadero/falso
  //  }
    //mostrar el vector EDAD           for (boolean i = 0; i < (3); i++) {             System.out.println("" + vEdad[i] "");

// }
//  CREAR Vector IMC           int[] vIMCs = new int[4]; 
// asignacion valor vIMC          for (int i = 0; i < (3); i++) {             vIMCs[i] = pers.calcularIMC(Vpersonas[i].getPeso(), Vpersona.calcularIMC(personas[i].getAltura());
// }
        //mostrar el vector IMC          for (int i = 0; i < 3; i++) {             System.out.println("" + vIMCs[i] "");
    //        }
       //  }
        
        // falta terminar con vector 
   //  }
    

 /**
 * A continuación, en la clase main hacer lo siguiente:
* Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, 
* deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar 
* para cada objeto si la persona es mayor de edad.
* 
* Por último, guardaremos los resultados de los métodos calcularIMC y
* esMayorDeEdad en distintas variables(arrays), para después calcular
* un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y 
* cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
* Para esto, podemos crear unos métodos adicionales.
*/
