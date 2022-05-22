/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicounotallervectores;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author saimon
 */
public class clsVectores extends  clsCantidad {
    
    public int[] leer_vector(int n){
        Random rnd=new Random();
        Scanner objLector = new Scanner(System.in);
        int i ;
        int [] numeros=new int[n];
        
        for ( i = 0; i < n; i++) {
            
            System.out.println(" DIGITE EL ELEMNETO " + (i+1) + " ");
            numeros[i]=objLector.nextInt();
            
            
            //numeros[i]=rnd.nextInt();
        }
        return numeros;
    }
    
}
