/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viaje_encapsulamiento;

/**
 *
 * @author saimon
 */
public class ClsViaje {
    
    private int cantidadPersonas;
    private float valorPersonas;
    private float porcentajeIva;
    private float  totalViaje;

   

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    
    public void setValorPersonas(float valorPersonas) {
        this.valorPersonas = valorPersonas;
    }

    

    public void setPorcentajeIva(float porcentajeIva) {
        this.porcentajeIva = porcentajeIva;
    }

    public float getTotalViaje() {
        return totalViaje;
    }

    public void Hallar_valor_viaje(){
       
        
        totalViaje =cantidadPersonas*valorPersonas*(1+porcentajeIva/100);
        
    }
    
}
