/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarrays;
import java.util.Arrays;
/**
 *
 * @author Alumno Mañana
 */
public class TestArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
       int[] numeros;
       numeros = new int [4];
       
       

       
        for(int i=0; i<4; i++){
            numeros[i]=i*i+4;
        }
        
        System.out.println(Arrays.toString(numeros));
        
        String[] nombres={"Pepe", "Popo", "Pipi", "papa"};
        
       for (int i=0; i<nombres.length; i++){
           System.out.println(nombres[i]);
       }
    }
    
}
