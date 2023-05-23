/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p6ej1;

import entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Migue
 */
public class P6EJ1 {

    /* Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, 
 * Autor, Número de páginas, y un constructor con todos los atributos pasados por 
 * parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo 
 * los datos al usuario y luego informar mediante otro método el número de ISBN, 
 * el título, el autor del libro y el número de páginas. */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Libro libro1 = new Libro();
        Libro libro2 = new Libro();
        System.out.println("libro 1");
        libro1.cargarLibro();
        System.out.println("libro 2");
        libro2.cargarLibro();

        libro1.mostrarLibro();
        System.out.println(libro2.toString());

    }
}
