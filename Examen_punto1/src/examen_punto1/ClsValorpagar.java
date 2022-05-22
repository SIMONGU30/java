/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_punto1;

/**
 *
 * @author saimon
 */
public class ClsValorpagar {
    
    
    private int numeroCreditos;
    private int valorCredito;

    public ClsValorpagar(int numeroCreditos, int valorCredito) {
        this.numeroCreditos = numeroCreditos;
        this.valorCredito = valorCredito;
    }
    
    
    
    public float valorTotal(){
        
        float valorTotal;
        
            valorTotal=numeroCreditos*valorCredito;
        
        
        return valorTotal;
    }
    public float valorTotal(int estrato){
        
        float valorTotal , descuento;
     
            if (estrato==1  || estrato==2  ||  estrato==3) {
                descuento= (valorCredito * numeroCreditos) * 15/100;
                
                valorTotal=valorCredito * numeroCreditos-descuento;
            }
            else if (estrato==4 || estrato==5){
                descuento= (valorCredito * numeroCreditos) * 10/100;
                
                valorTotal=valorCredito * numeroCreditos-descuento;
            }
                
            else valorTotal=0;
        
        
        
        return valorTotal;
    }
}
