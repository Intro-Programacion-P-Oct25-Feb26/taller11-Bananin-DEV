/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {

    public static void main(String[] args) {

        String[] ciudadesEcuador = ciudades();

        System.out.println("Ciudades ingresadas:");
        for (int i = 0; i < ciudadesEcuador.length; i++) {
            System.out.println("- " + ciudadesEcuador[i]);
        }

        System.out.println("\nCiudades con 4 o 5 caracteres:");
        ciudadesMenoresCinco(ciudadesEcuador);

    }

    public static String[] ciudades() {
        Scanner entrada = new Scanner(System.in);
        int numeroCiudades;
        String nombreCiudades;

        System.out.println("Ingrese el numero de ciudades");
        numeroCiudades = entrada.nextInt();
        entrada.nextLine();
        String[] ciudadesEcuador = new String[numeroCiudades];

        for (int i = 0; i < numeroCiudades; i++) {
            System.out.println("Ingrese el nombre de la ciudad numero: " + (i + 1));
            nombreCiudades = entrada.nextLine();
            ciudadesEcuador[i] = nombreCiudades;
        }

        return ciudadesEcuador;
    }

    public static void ciudadesMenoresCinco(String[] ciudadesEcuador) {
        for (int i = 0; i < ciudadesEcuador.length; i++) {

            if ((ciudadesEcuador[i].length() == 4) || (ciudadesEcuador[i].length() == 5)) {
                System.out.println(ciudadesEcuador[i]);
            }
        }
    }

}
