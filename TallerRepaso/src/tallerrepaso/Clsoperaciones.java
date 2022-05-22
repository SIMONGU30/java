/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerrepaso;

/**
 *
 * @author saimon
 */
public class Clsoperaciones {
    
    
    
    public float hallarValorBruto(float cantidadPeliculas , float valorPeliculas){
        
        float valorBruto;
        
                valorBruto = cantidadPeliculas * valorPeliculas;
        
        return valorBruto;
        
    }
    
    
    public float hallarDescuento (float cantidadPeliculas , float valorPeliculas ){
        float descuento;
        
        if (cantidadPeliculas >= 5){
            
            descuento= (cantidadPeliculas*valorPeliculas)*10/100;
        }
        
        else {
            
            descuento=0;
        }
        
        
        return descuento;
    }
    
    
    public float hallarValorNeto(float cantidadPeliculas , float valorPeliculas , float descuento){
        float  valorNeto;
        
        
         
         valorNeto=cantidadPeliculas*valorPeliculas-descuento;
        
        
        return valorNeto;
    }
}


