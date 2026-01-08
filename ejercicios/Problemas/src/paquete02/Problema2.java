/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] viviendas = obtenerViviendas();
        double[][] consumos = obtenerConsumos();
        double[] consumoAnual = calcularConsumoAnual(consumos);
        generarReporte(viviendas, consumoAnual);
    }

    public static String[] obtenerViviendas() {
        Scanner entrada = new Scanner(System.in);
        String[] viviendas = new String[10];
        for (int i = 0; i < viviendas.length; i++) {
            System.out.println("Ingrese el nombre de la vivienda" + (i + 1) + ":");
            viviendas[i] = entrada.nextLine();
        }
        return viviendas;
    }

    public static double[][] obtenerConsumos() {
        Scanner entrada = new Scanner(System.in);
        double[][] consumo = new double[10][12];
        for (int i = 0; i < consumo.length; i++) {
            System.out.println("Ingresar consumo de la vivienda" + (i + 1));
            for (int j = 0; j < consumo[i].length; j++) {
                System.out.print("Mes" + (j + 1) + ":");
                consumo[i][j] = entrada.nextDouble();
            }
        }
        return consumo;
    }

    public static double[] calcularConsumoAnual(double[][] consumos) {

        double[] totalAnual = new double[consumos.length];

        for (int i = 0; i < consumos.length; i++) {
            double suma = 0;
            for (int j = 0; j < consumos[i].length; j++) {
                suma = suma + consumos[i][j];
            }
            totalAnual[i] = suma;
        }
        return totalAnual;
    }

    public static void generarReporte(String[] viviendas, double[] consumoAnual) {

        String reporte = String.format("REPORTE ANUAL DE CONSUMO ELECTRICO%n");

        for (int i = 0; i < viviendas.length; i++) {
            reporte += String.format(
                    "%-15s : %.2f kWh%n",
                    viviendas[i],
                    consumoAnual[i]
            );
        }

        System.out.println(reporte);
    }
}
