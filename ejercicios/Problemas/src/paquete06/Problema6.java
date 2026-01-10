/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Problema6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        double media = calcularMedia(informacion);
        double desviacion = calcularDesviacion(informacion, media);

        System.out.printf("%.2f\n%.2f\n", media, desviacion);
    }

    public static double calcularMedia(int[] arreglo) {
        double suma = 0;
        double variable;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        variable = suma / arreglo.length;
        return variable;
    }

    public static double calcularDesviacion(int[] arreglo, double media) {
        double suma = 0;
        double variable;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + Math.pow(arreglo[i] - media, 2);
        }
        variable = Math.sqrt(suma / arreglo.length);
        return variable;
    }
}
