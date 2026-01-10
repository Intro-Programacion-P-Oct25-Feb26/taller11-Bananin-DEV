/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author reroes
 */
public class Problema5 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] informacion2 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        
        int[][] resultado = sumarMatrices(informacion, informacion2);
 
        for(int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.printf("%s\n",resultado[i][j]);
            }  
        }
    }
    public static int[][] sumarMatrices(int[][] m1, int[][] m2) {
        int filas = m1.length;
        int columnas = m1[0].length;
        int[][] suma = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return suma;
    }
}
