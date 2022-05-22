/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenpunto2;

import java.util.Scanner;

/**
 *
 * @author saimon
 */
public class ExamenPunto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objlector=new Scanner(System.in);
        
        int  numeroImpulsos , valorImpulsos , cantidadKilovatios , valorKilovatios,cantidadMetros,valorMetro;
        float subtotalImpulso , subtotalKilovatio, subtotalMetros , subtotalTotal;
        
        
        System.out.println("**************** BUENAS TARDES **************** ");
        System.out.println("DIGITE POR FAVOR  EL NUMERO DE IMPULSOS : ");
        numeroImpulsos=objlector.nextInt();
        System.out.println("DIGITE POR FAVOR  EL VALOR DEL IMPULSOS : ");
        valorImpulsos=objlector.nextInt();
        System.out.println("DIGITE POR FAVOR  LA CANTIDAD DE KILOVATIOS : ");
        cantidadKilovatios=objlector.nextInt();
        System.out.println("DIGITE POR FAVOR  EL VALOR DEL KILOVATIOS : ");
        valorKilovatios=objlector.nextInt();
        System.out.println("DIGITE POR FAVOR  LA CANTIDAD DE METROS  : ");
        cantidadMetros=objlector.nextInt();
        System.out.println("DIGITE POR FAVOR  EL VALOR DEL METRO : ");
        valorMetro=objlector.nextInt();
        
        
        ClsSubtotales objsubtotales = new ClsSubtotales();
        
        subtotalImpulso=objsubtotales.impulsos(numeroImpulsos, valorImpulsos);
        subtotalKilovatio=objsubtotales.kilovatios(cantidadKilovatios, valorKilovatios);
        subtotalMetros=objsubtotales.metros(cantidadMetros, valorMetro);
        subtotalTotal=objsubtotales.total(subtotalImpulso, subtotalKilovatio, subtotalMetros);
        
        
        System.out.println(" EL SUBTOTAL DE IMPULSOS ES : " +subtotalImpulso);
        System.out.println(" EL SUBTOTAL DE KILOVATIOS  ES : " +subtotalKilovatio);
        System.out.println(" EL SUBTOTAL DE METROS  ES : " +subtotalMetros);
        System.out.println(" EL SUBTOTAL DE TOTAL ES : " +subtotalTotal);
        
    }
    
}
