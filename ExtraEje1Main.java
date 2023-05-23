/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mains;

import Clases.ExtraEje1Cancion;

/**
 *
 * @author Usuario
 */
public class ExtraEje1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExtraEje1Cancion cancion = new ExtraEje1Cancion();
        cancion.getAutor();
        cancion.getTitulo();
        cancion.setAutor("nicolas");
        cancion.setTitulo("casa");
        System.out.println("el nombre del autor es: "+ cancion.getAutor());
        System.out.println("el titulo es: "+ cancion.getTitulo());
    }
    
}
