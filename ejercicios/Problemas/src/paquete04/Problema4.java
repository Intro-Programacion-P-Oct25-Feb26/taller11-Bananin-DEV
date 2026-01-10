/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.Scanner;

/*
         * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;
        String nombre;
        String cedula;
        String mensaje = "";

        System.out.printf("Seleccione una opcion:\n1. Calcular el valor"
                + " de planilla de luz\n2. Calcular el valor del predio\n");
        opcion = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Ingrese el nombre del cliente: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la cedula del cliente: ");
        cedula = entrada.nextLine();

        if (opcion == 1) {
            calcularValorLuz(nombre, cedula);
        } else if (opcion == 2) {
            calcularPredio(nombre, cedula);
        } else {
            System.out.println("Opcion no valida");
        }
    }

    public static void calcularValorLuz(String nombre, String cedula) {
        Scanner entrada = new Scanner(System.in);
        double valorKilowatio;
        double numeroKilowatios;
        double total;
        String mensaje = "";

        System.out.print("Ingrese el valor del kilowatio: ");
        valorKilowatio = entrada.nextDouble();
        System.out.print("Ingrese el numero de kilowatios del mes: ");
        numeroKilowatios = entrada.nextDouble();

        total = valorKilowatio * numeroKilowatios;

        mensaje = mensaje + String.format(
                "El cliente %s con cedula %s debe cancelar el valor de $%.2f%n",
                nombre, 
                cedula, 
                total);

        System.out.print(mensaje);
    }

    public static void calcularPredio(String nombre, String cedula) {
        Scanner entrada = new Scanner(System.in);
        double valorInmueble;
        double valorPredio;
        String mensaje = "";

        System.out.print("Ingrese el valor del inmueble: ");
        valorInmueble = entrada.nextDouble();

        valorPredio = valorInmueble * 0.02;

        mensaje = mensaje + String.format(
                "El cliente %s con cedula %s tiene un bien inmueble valorado en"
                + " $%.2f y tiene que pagar de predio $%.2f%n",
                nombre,
                cedula,
                valorInmueble,
                valorPredio);

        System.out.print(mensaje);
    }
}
