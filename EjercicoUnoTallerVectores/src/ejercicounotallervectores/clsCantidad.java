/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicounotallervectores;

/**
 *
 * @author saimon
 */
public class clsCantidad {
    
    public int contar_numero( int datos , int[] numeros , int n){
        int cantidad =0;
        
        for (int i = 0; i < n; i++) {
            
            
            if (numeros [i] == datos) {
                    cantidad=cantidad +1;
            }
           
            
        }
        
        
        return cantidad;
        
    }
}
