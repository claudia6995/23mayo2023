/**
 * Recorrer vector N enteror y decir cuantos son de 1 dìgito, cuando de 2, de 3 hasta 5 dìgitos
 * @author CRAMOS
 */
public class Guia5_Ej3_VectorN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer =new Scanner(System.in);
        System.out.println("Ingrese la dimensión del vector");
        int num = leer.nextIn();
        int[] VectorN = new int [num];
        
        
        for (int i = 0; i < VectorN.length; i++) {
            System.out.println("ingrese un número");
            VectorN [i] = leer.nextIn();
             MostrartarDigitos
            ContarDigitos
        }
        System.out.println("--------------");
       
            
        }
    }
    public static void MostrartarDigitos(int[] VectorN);{}

 public static void ContarDigitos(int[] VectorN);{}