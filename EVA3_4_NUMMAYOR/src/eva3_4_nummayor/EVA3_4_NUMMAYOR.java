/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_4_nummayor;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_4_NUMMAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(encontrarMayor(10,5));
        System.out.println("Numero de dia de la semana");
        System.out.println(regresarDia(diasem));
    }
    public static int encontrarMayor(int num1, int num2){
        int resu;
        if(num1 > num2){
            resu = num1;
        }else
            resu = num2; 
        return resu; 
           
            
    }
    //METODO QUE REGRESE EL DIA DE LA SEMANA EN TEXTO, pide el numero
    public static String regresarDia (int diasem){
        int diasem2;
        Scanner captu = new Scanner(System.in);
     
        diasem2 = captu.nextInt();
        captu.nextLine();
        
        switch(diasem2){
            case 1:
                return "Domingo";
            case 2:
                return "Lunes";
            case 3:
                return "Martes";
            case 4:
                return "Miercoles";
            case 5:
                return "jueves";
            case 6:
                return "Viernes";
            case 7:
                return "Sabado";
            default:
                return "Dia no vale";
            
        }
            
    }
}
