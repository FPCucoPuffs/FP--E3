/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_3_captura;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_3_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //NOMBRE COMPLETO
        String nombre = capturarTexto("Escribe tu nombre");
        String apellido = capturarTexto("Escribe tu apellido");
        
        //EDAD
        int edad = capturarEdad("Escribe tu edad");
        
        //SALARIO
        double salario = capturarSalario("Escribe tu salario");
        
        //IMPRIMIR
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Salario " + salario);
    }
    public static String capturarTexto(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        String texto = captu.nextLine();
        return texto;
    
    }
    public static int capturarEdad(String mensajeEdad){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensajeEdad);
        int edad = captu.nextInt();
        captu.nextLine();
        return edad;
    
    }
    public static double capturarSalario(String mensajeSalario){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensajeSalario);
        double salario = captu.nextDouble();
        captu.nextLine();
        return salario;
    }
}
