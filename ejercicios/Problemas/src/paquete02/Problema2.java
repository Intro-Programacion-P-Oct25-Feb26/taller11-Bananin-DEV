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
        generarReporte(viviendas,consumoAnual);
    }
    public static String[]obtenerViviendas(){
     Scanner entrada = new Scanner(System.in); 
     String[]viviendas = new String[10];
     for (int i = 0; i < viviendas.length; i++){
         System.out.println("Ingrese el nombre de la vivienda"+(i+1)+":");
         viviendas[i] = entrada.nextLine();
     }
     return viviendas;
    }
}
