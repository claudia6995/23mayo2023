
package Entidad;

import java.util.Scanner;

public class Operacion {

    private int N1;
    private int N2;

    public Operacion(int N1, int N2) {
        this.N1 = N1;
        this.N2 = N2;
    }

    public Operacion() {
    }

    public void setN1(int N1) {
        this.N1 = N1;
    }

    public void setN2(int N2) {
        this.N2 = N2;
    }

    public int getN1() {
        return N1;
    }

    public int getN2() {
        return N2;
    }

    public void CrearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un Número");
        N1 = leer.nextInt();
        System.out.println("Ingrese un Número");
        N2 = leer.nextInt();

    }

    public int Sumar() {
        int Sumar = N1 + N2;

        System.out.println("La suma es " + Sumar);
        return Sumar;
    }

    public int Restar() {
        int Restar = N1 - N2;
        System.out.println("La resta es " + Restar);
        return Restar;
    }

    public int Multiplicacion() {
        if (this.N1 == 0 || this.N2 == 0) {
            System.out.println("¡ERROR! No corresponde multiplicar por 0");
            return 0;
        } else {
            int Multiplicacion = N1 * N2;
            System.out.println("El resultado de la multiplicación es: " + Multiplicacion);
            return Multiplicacion;

        }

    }

    public int Division(){
        if (this.N2 == 0) {
            System.out.println("¡ERROR! no se puede divir por 0");
            return 0;
        } else {
            int Division = N1 / N2;
            System.out.println("El resultado de la multiplicación es: " + Division);
            return (int) ((float) this.N1 / this.N2);
        }

        }
    }

