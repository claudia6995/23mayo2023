/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3Extra;

/**
 *
 * @author CRAMOS
 */
public class Mainl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Juego J1 = new Juego();
    J1.IngresarDatos1();
    J1.Adivinador1();
    J1.IngresarDatos2();
    J1.Adivinador2();
    J1.Ganador();
    J1.getN1();
    J1.getN2();
    J1.getintento1();
    J1.getintento2();
}
}