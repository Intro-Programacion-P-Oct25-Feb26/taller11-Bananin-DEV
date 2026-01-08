/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int opcion;

        System.out.printf("Seleccione una opcion:\n1. Area del cuadrado"
                + "\n2. Area del triangulo\n3. Area del rectangulo\n");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            obtenerAreaCuadrado();
        } else if (opcion == 2) {
            obtenerAreaTriangulo();
        } else if (opcion == 3) {
            obtenerAreaRectangulo();
        } else {
            System.out.println("Opcion no valida");
        }
    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        double lado;
        double area;

        System.out.print("Ingrese el lado del cuadrado: ");
        lado = entrada.nextDouble();

        area = lado * lado;

        System.out.println("El area del cuadrado es: " + area);
    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        double base, altura, area;

        System.out.print("Ingrese la base del triangulo: ");
        base = entrada.nextDouble();
        System.out.print("Ingrese la altura del triangulo: ");
        altura = entrada.nextDouble();

        area = (base * altura) / 2;

        System.out.println("El área del triangulo es: " + area);
    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        double base, altura, area;

        System.out.print("Ingrese la base del rectangulo: ");
        base = entrada.nextDouble();
        System.out.print("Ingrese la altura del rectangulo: ");
        altura = entrada.nextDouble();

        area = base * altura;

        System.out.println("El area del rectangulo es: " + area);
    }
}
