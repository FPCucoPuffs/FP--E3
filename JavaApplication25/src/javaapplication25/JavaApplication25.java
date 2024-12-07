/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication25;

import java.util.Scanner;

/**
 *
 * @author propa
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int numeroEstudiantes;
        do {
            System.out.print("Ingrese el numero de estudiantes: ");
            numeroEstudiantes = scanner.nextInt();
        } while (numeroEstudiantes <= 0);

        
        double[] calificaciones = new double[numeroEstudiantes];

        
        for (int i = 0; i < numeroEstudiantes; i++) {
            double calificacion;
            do {
                System.out.print("Ingrese la calificacion del estudiante " + (i + 1) + ":");
                calificacion = scanner.nextDouble();
            } while (calificacion < 0 || calificacion > 100);
            calificaciones[i] = calificacion;
        }

        double promedio = calcularPromedio(calificaciones);
        int calificacionesMayores = contarCalificacionesMayores(calificaciones, promedio);
        double calificacionAlta = obtenerCalificacionMasAlta(calificaciones);
        double calificacionBaja = obtenerCalificacionMasBaja(calificaciones);

        System.out.println("Resultados:");
        System.out.println("Promedio: " + promedio);
        System.out.println("calificaciones mayores o iguales al promedio: " + calificacionesMayores);
        System.out.println("Calificacion mas alta: " + calificacionAlta);
        System.out.println("Calificacion mas baja: " + calificacionBaja);

        scanner.close();
    }
    
    public static double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    public static int contarCalificacionesMayores(double[] calificaciones, double promedio) {
        int contador = 0;
        for (double calificacion : calificaciones) {
            if (calificacion >= promedio) {
                contador++;
            }
        }
        return contador;
    }

    public static double obtenerCalificacionMasAlta(double[] calificaciones) {
        double max = calificaciones[0];
        for (double calificacion : calificaciones) {
            if (calificacion > max) {
                max = calificacion;
            }
        }
        return max;
    }

    public static double obtenerCalificacionMasBaja(double[] calificaciones) {
        double min = calificaciones[0];
        for (double calificacion : calificaciones) {
            if (calificacion < min) {
                min = calificacion;
            }
        }
        return min;
    }
}



    
    

