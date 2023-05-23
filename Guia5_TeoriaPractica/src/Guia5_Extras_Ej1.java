
import java.util.Scanner;
public class Guia5_Extras_Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);

        System.out.println("Definir la longitud del vector: ");
        int N = leer.nextInt();
        
        int[] vector = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese el valor de la posicion " +(i+1));
            vector[i]=leer.nextInt();
            
        }
        for (int i = 0; i < N; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
        suma(vector);
        
    }
    public static void suma(int vector[]){
    int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        System.out.println("La suma del vector es " +suma);
            
        }}