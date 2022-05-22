/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerencapsulamiento2;

/**
 *
 * @author saimon
 */
public class ClsSalario {
    
   
    private int numeroAñoEmpresa;
    private int estrato;
    private int numeroHijos;
    private float salarioNeto;
    private float deducciones;

    public float getSalarioNeto() {
        return salarioNeto;
    }

    

    
    public void setNumeroAñoEmpresa(int numeroAñoEmpresa) {
        this.numeroAñoEmpresa = numeroAñoEmpresa;
    }

    

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }
    
    
    
    public void salarioNeto(float salarioBasico , float auxilioTranspoprte){
        
        float manutencion,bonificacion,valorAuxilio;
        
        if(numeroHijos<=3 && numeroHijos>=1){
            manutencion=50000;
        }
        else {
            manutencion=0;
        }
        
        if(estrato<=3){
            bonificacion=salarioBasico*(float)5/100;
        }
        else {
            bonificacion=0;
        }
        
        
        
        if(salarioBasico <= 1000000){
            
            valorAuxilio=auxilioTranspoprte;
        }
        
        else {
            valorAuxilio=0;
        }
         if(salarioBasico<=4000000){
            deducciones=salarioBasico*(float)8/100;
            
        }
        else {
            deducciones=salarioBasico*(float)9/100;
        }
        
        salarioNeto=salarioBasico+manutencion+bonificacion+valorAuxilio-deducciones;
        
    }
    
    
}
