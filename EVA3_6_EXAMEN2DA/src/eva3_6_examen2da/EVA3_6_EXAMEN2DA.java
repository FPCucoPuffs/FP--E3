/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_6_examen2da;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_6_EXAMEN2DA {
    public static final int PIEDRA = 1;
    public static final int PAPEL = 2;
    public static final int TIJERA = 3;
    public static final int GANA = 1;
    public static final int PIERDE = 2;
    public static final int EMPATE = 3;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jugadaUsu;
        int jugadaComp;
        int resuJugada;
        do{
        jugadaUsu = capturarJugada("introduce tu jugada (1 = piedra, 2 = papel, 3 = tijera, salir = 0)");
        jugadaComp = generarJugadaComp();
        resuJugada = evaluarjugadas(jugadaUsu, jugadaComp);
        System.out.println(jugadaComp);
        }while(jugadaUsu != 0);
                
        
    }
    public static int capturarJugada(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        int resu = captu.nextInt();
        return resu;
        
    }
        
    public static int generarJugadaComp(){
        int resu;
        double valor = Math.random();
        
        if((valor >= 0)&&(valor < 0.3))
            resu = 1;
        else if((valor >= 0.3)&&(valor < 0.6))
            resu = 2;
        else
            resu = 3;
        return resu;
    }
    public static int evaluarjugadas(int jugadaU, int jugadaC){
        int resu;
        if((jugadaU == PIEDRA) && (jugadaC == PIEDRA))
            resu = EMPATE;
        else if((jugadaU == PIEDRA) && (jugadaC == PAPEL))
            resu = PIERDE;
        else if((jugadaU == PIEDRA) && (jugadaC == TIJERA))
            resu = GANA;
        else if((jugadaU == PAPEL) && (jugadaC == PIEDRA))
            resu = GANA;
        else if((jugadaU == PAPEL) && (jugadaC == PAPEL))
            resu = EMPATE;
        else if((jugadaU == PAPEL) && (jugadaC == TIJERA))
            resu = PIERDE;
        else if((jugadaU == TIJERA) && (jugadaC == PIEDRA))
            resu = PIERDE;
        else if((jugadaU == TIJERA) && (jugadaC == PAPEL))
            resu = GANA;
        else
            resu = EMPATE;
        return resu;
    }
            
}
