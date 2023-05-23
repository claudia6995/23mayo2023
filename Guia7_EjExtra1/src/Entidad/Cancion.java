/*
 *
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author CRAMOS
 */
public class Cancion {

    private String Titulo;
    private String Autor;

    public Cancion() {
        // Constructor vacío que inicializa titulo y autor en cadenas "" vacias 
        this.Titulo = "";
        this.Autor = "";
    }
// Construtor con parametros
    public Cancion(String Titulo, String Autor) {
        this.Titulo = Titulo;
        this.Autor = Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setTitulo(String Titulo, String Autor) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int IngresarTIT() {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese título de la canción ");
        Titulo = leer.next();
        return 0;

    }

    public int IngresarAutor() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese autor de la canción ");
        Autor = leer.next();
        return 0;
    }
public int MostrarTityAutor() {
        Scanner leer = new Scanner(System.in);
        System.out.println(" La canción se llama: " + Titulo );
           
        System.out.println(" El autor de la canción es: " + Autor);
        Autor = leer.next();
        return 0;
}}
