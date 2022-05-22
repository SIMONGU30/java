/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talllerconstructores.pkg4;

/**
 *
 * @author saimon
 */
public class clsViaje {
    
    private int cantidadPersonas ;
    
    private int valorPersona;

    public clsViaje(int cantidadPersonas, int valorPersona) {
        this.cantidadPersonas = cantidadPersonas;
        this.valorPersona = valorPersona;
    }
    
    
    
    
    
    public int valorBruto( ){
        int valorBruto;
                
           valorBruto=cantidadPersonas*valorPersona;  
        
        return valorBruto;        
    }
    
    
    public float valorIva ( float porcentajeIva){
        float iva;
        int valorBruto;
        
                valorBruto=cantidadPersonas*valorPersona;
                iva= valorBruto * porcentajeIva;
        
        return iva;
        
    }
    
    public  float valorDescuento( float porcentajeDescuento){
        
        float descuento;
        int valorBruto;
        
                valorBruto=cantidadPersonas*valorPersona;
                descuento= valorBruto * porcentajeDescuento;
        
        
        return descuento;
        
    }
    
    public float valorNeto(float porcentajeIva , float porecentajeDescuento){
        
        float valorNeto , descuento , iva;
        int valorBruto;
        
        valorBruto=cantidadPersonas*valorPersona;
        descuento= valorBruto *porecentajeDescuento;
        iva= (valorBruto-descuento)+ porcentajeIva;
        valorNeto= valorBruto-descuento+iva;
        
        
        return valorNeto;
        
    }
}
