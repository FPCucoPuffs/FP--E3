/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_10_5dimenciones;

/**
 *
 * @author invitado
 */
public class EVA3_10_5DIMENCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [][][][][] cubo = new int [6][5][4][8][2];
        System.out.println(cubo[1].length);
        for(int i = 0; i < cubo.length; i++){
            for(int j = 0; j < cubo[i].length; j++){
                for(int k = 0; k < cubo[i][j].length; k++){
                    for(int l = 0; l < cubo[i][j][k].length; l++){
                        for(int m = 0; m < cubo[i][j][k][l].length; m++){
                            cubo[i][j][k][l][m] = (int)(Math.random() * 100);
                             System.out.print("[" + cubo[i][j][k][l][m] + "]");
                             
                        }
                    }
                }
            }
        }
        
    }
}
    
   

