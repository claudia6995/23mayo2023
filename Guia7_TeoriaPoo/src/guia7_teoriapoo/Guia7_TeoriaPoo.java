package guia7_teoriapoo;

import Entidad.Guia7_Objeto;
import java.util.Scanner;

public class Guia7_TeoriaPoo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Guia7_Objeto p1 = new Guia7_Objeto(" Claudia ", 57, 1965, "Clau");
        // modifico los datos

        System.out.println(p1);
        p1.setApodo(" Cll ");

        p1.setEdad(45);
        // muestro los datos modificados 
        System.out.println("--------------");
        // si quiero verlo en distintos renglores lo debo hacer por separado... 

        System.out.println(p1.getApodo() + " " + p1.getEdad());
        System.out.println(p1.getApodo());
    }

}
