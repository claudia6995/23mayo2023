/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/* Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. 
        A continuación, se deben crear los siguientes métodos:
        Método constructor con todos los atributos pasados por parámetro.
        Método constructor sin los atributos pasados por parámetro.
        Métodos get y set.
        Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
        Método sumar(): calcular la suma de los números y devolver el resultado al main.
        Método restar(): calcular la resta de los números y devolver el resultado al main
        Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, 
            el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
        Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, 
            el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el 
            resultado al main.*/
public class Operacion {

    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    // Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto. 

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese numero 1");
        numero1 = leer.nextInt();

        System.out.println("ingrese numero 2");
        numero2 = leer.nextInt();
    }

    // Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public int sumar() {
        int suma = numero1 + numero2;
        return suma;
    }

    //Método restar(): calcular la resta de los números y devolver el resultado al main
    public int restar() {
        int resta = numero1 - numero2;
        return resta;
    }

    /*Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, 
    el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main*/
    public int multiplicar() {
        int producto = numero1 * numero2;
        if (producto == 0) {
            System.out.println("resultado = 0");
            System.out.println("error");
            return 0;
        } else {
            System.out.println("resultado= " + producto);
            return producto;
        }

    }

    public String multi2() {
        int multi = numero1 * numero2;
        return multi == 0 ? "error=0" : " " + multi;

    }

    /*Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, 
    el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y 
    se devuelve el resultado al main.*/
    public double dividir() {
        double division;
        if (numero2 == 0) {
            System.out.println("resultado = 0");
            System.out.println("error");
            return 0;
        } else {
            division = numero1 / numero2;
            System.out.println("resultado= " + division);
            return division;
        }

    }

}
