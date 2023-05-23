/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ej3;

import Entidad.Operacion;

/**
 *
 * @author CRAMOS
 */
public class Guia7_Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion M1 = new Operacion();
        M1.CrearOperacion();
        M1.Sumar();
        M1.Restar();
        M1.Multiplicacion();
        M1.Division();
    }
    
}
