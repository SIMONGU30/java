/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobrecargametodos;

/**
 *
 * @author saimon
 */
public class clsCompra {
    private int numeroUnidades;
    private int valorUnitario;

    public clsCompra(int numeroUnidades, int valorUnitario) {
        this.numeroUnidades = numeroUnidades;
        this.valorUnitario = valorUnitario;
    }
   

   
      
    
    
            
    float valorNeto;
    
    public float calcularCompra(){
        
       
        
        valorNeto=numeroUnidades * valorUnitario;
        
        return  valorNeto;
        
    }
            
    /**
     *
     * @return
     */
    public float calcularCompra(float porcentaje){
        
        float valorBruto , descuento;
        
        descuento=numeroUnidades*valorUnitario *porcentaje;
        
        valorBruto=numeroUnidades * valorUnitario - descuento;
        
        valorNeto=valorBruto;
        
        return  valorNeto;     
            
} 
 
        public float calcularCompra(int porcentajeIva){
        
        float valorBruto ,iva,porIva;
        
        
        porIva=(float)porcentajeIva/100;
        
        iva=numeroUnidades*valorUnitario * porIva;
        
        valorNeto=numeroUnidades * valorUnitario + iva;
        
        return  valorNeto;     
            
} 
 
        
        public float calcularCompra(float porcentaje ,float porcentajeIva ){
        
        float valorBruto ,iva ,descuento;
        
        descuento=numeroUnidades*valorUnitario *porcentaje;
          
        iva=numeroUnidades*valorUnitario *porcentajeIva;
        
        valorBruto=numeroUnidades * valorUnitario + iva - descuento;
        
        valorNeto=valorBruto;
        
        return  valorNeto;     
            
} 
        
} 
       




    
