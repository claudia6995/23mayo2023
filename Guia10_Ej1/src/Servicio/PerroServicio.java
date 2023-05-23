package Servicio;

import Entidad.Perro;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

public class PerroServicio {

    // Creamos pero no inicializamos
    private Scanner leer;
    private ArrayList<Perro> ps;

    public PerroServicio() {
        // dentro del constructor con parametro vamos a inicializar. 
        this.leer = new Scanner(System.in);
        this.ps = new ArrayList();
    }

    public void crearPerro() {

        System.out.println("Ingrese nombre de perro");
        String nombre = leer.next();
        System.out.println("Ingrese Raza del perro");
        String raza = leer.next();
        // cree el objeto: 
        Perro P = new Perro(nombre, raza);
        // al arrayList ps. agrego el objeto creado P. 
        ps.add(P);

//    
    }

    public void mostrarPerro() {
        // For Each (nombre de la clase (Perro) variableAUX: ArrayList)

        for (Perro aux : ps) {
            System.out.println((aux.toString()));
        }
    }

    public void buscarPerro() {

        System.out.println("Ingrese nombre de perro");
        String nombre = leer.next();
        Iterator<Perro> it = ps.iterator();
       
        while (it.hasNext()) {
            Perro aux = it.next();
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
 }else{ System.out.println("No se encontró el perro buscado");
            }
                for (int i = 0; i < ps.size(); i++) {
                                    
                    ps.remove(it);

                }

           

        }
    }
}
