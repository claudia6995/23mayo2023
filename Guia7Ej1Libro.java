/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/* Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, 
 * Autor, Número de páginas, y un constructor con todos los atributos pasados por 
 * parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo 
 * los datos al usuario y luego informar mediante otro método el número de ISBN, 
 * el título, el autor del libro y el número de páginas.
 */


public class Libro{
   
    public String ISBN;
    public String titulo;
    public String autor;
    public int paginas;

    public Libro(String ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Libro() {
    }
    
    public void cargarLibro(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa isbn");
        ISBN = leer.next();
        System.out.println("ingrese titulo");
        titulo = leer.next();
         System.out.println("ingrese autor");
        autor = leer.next();
        System.out.println("ingrese paginas");
        paginas = leer.nextInt();
        
        
    }
    
    public void mostrarLibro(){
        System.out.println(ISBN+"\n "+titulo+"\n "+autor+"\n"+paginas+"\n" );
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '}';
    }
    
    
    
    
    
}
