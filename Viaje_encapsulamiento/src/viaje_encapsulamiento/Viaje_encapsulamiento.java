/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viaje_encapsulamiento;

import java.util.Scanner;

/**
 *
 * @author saimon
 */
public class Viaje_encapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objlector=new Scanner(System.in);
        ClsViaje objviaje=new ClsViaje();
        
        int cantidadPersonas;
        float valorPersona,porcentjeIva;
        
        
        System.out.println("digite la cantidad de personas que viajaran : ");
        cantidadPersonas=objlector.nextInt();
        
        System.out.println("digite el valor de  cada persona : ");
        valorPersona=objlector.nextFloat();
        
        System.out.println("digite el porcentaje del iva asi : 19 si es el 19% ");
        porcentjeIva=objlector.nextFloat();
        
        objviaje.setValorPersonas(valorPersona);
        objviaje.setCantidadPersonas(cantidadPersonas);
        objviaje.setPorcentajeIva(porcentjeIva);
        objviaje.Hallar_valor_viaje();
        System.out.println("EL VALOR DEL VIAJE ES : "+objviaje.getTotalViaje());
        
        
        
        
    }
    
}
