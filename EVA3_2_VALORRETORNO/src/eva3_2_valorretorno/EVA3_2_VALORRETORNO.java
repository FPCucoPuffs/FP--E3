/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_2_valorretorno;

/**
 *
 * @author invitado
 */
public class EVA3_2_VALORRETORNO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //NECESITAMOS RECUPERAR EL VALOR, PARA HACER ALGO CON EL
        int resu;
        resu = sumarDosNumeros(5, 10);
        System.out.println("Resultado: " + resu);
        //segunda alternativa
        System.out.println("Resultado: " + sumarDosNumeros(5, 10));
        //O NO LES INTERESA EL VALOR
        

    }
    public static int sumarDosNumeros(int num1,int num2){
       return num1 + num2;
       
    }
}
