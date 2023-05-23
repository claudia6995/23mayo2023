import java.util.Scanner;
public class Guia5_Ej3Eliana {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner(System.in);
        int[] vector = new int[10];
        for (int i = 0; i < vector.length; i++) {
            // vector[i] = (int)(Math.random()*10000+0);
            System.out.println("Ingrese un numero");
            vector[i] = leer.nextInt();
            // System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
        MostrarVector(vector);
        ContarDigitos(vector);
    }

    public static void MostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
    }

    public static void ContarDigitos(int[] vector) {
        int division = 10;
        int contador = 0;
        int resultado = 0;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        for (int i = 0; i < vector.length; i++) {
            do {
                resultado = vector[i] / division;
                contador++;
                division = division * 10;
            } while (resultado >= 1);
            // System.out.println("El numero "+vector[i]+" tiene "+contador+"
            // digitos");
            switch (contador) {
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
            }
            contador = 0;
            division = 10;
            resultado = 0;
        }
        System.out.println("Hay " + cont1 + " numeros de 1 cifra" + "\nHay " + cont2 + " numeros de 2 cifras" + "\nHay " + cont3 + " numeros de 3 cifras" + "\nHay " + cont4 + " numeros de 4 cifras" + "\nHay " + cont5 + " numeros de 5 cifras");
    }
}
