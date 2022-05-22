/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenpunto2;

/**
 *
 * @author saimon
 */
public class ClsSubtotales {
    
    
    public float impulsos( int numeroImpulsos , int valorImpulsos){
        
        float subtotalImpulso;
        
                subtotalImpulso=numeroImpulsos*valorImpulsos;
        
        return subtotalImpulso;
        
    }
    
    public float kilovatios(int cantidadKilovatios, int valorKilovatios){
        
        float subtotalKilovatio;
        
                subtotalKilovatio=cantidadKilovatios*valorKilovatios;
        
        return subtotalKilovatio;
        
    }
    
    public float metros(int cantidadMetros,int valorMetro){
        
        float subtotalMetros;
        
                subtotalMetros=cantidadMetros*valorMetro;
        
        return subtotalMetros;
        
    }
    
    public float total(float subtotalImpulso , float subtotalKilovatio , float subtotalMetros  ){
        float subtotalTotal;
        
                subtotalTotal= subtotalImpulso+subtotalKilovatio+subtotalMetros;
                        
        return subtotalTotal;
                
                
    }
}
