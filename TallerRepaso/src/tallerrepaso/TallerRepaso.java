/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerrepaso;

import java.util.Scanner;

/**
 *
 * @author saimon
 */
public class TallerRepaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner objlector=new Scanner(System.in);
        
        float  valorBruto , descuento,valorNeto , cantidadPeliculas , valorPeliculas ;
        
        System.out.println("****************** BUENAS TARDES*************************");
        System.out.println("POR FAVOR DIGITE LA CANTIDAD DE PELICULAS QUE VA  A LLEVAR : ");
        cantidadPeliculas=objlector.nextFloat();
        System.out.println("POR FAVOR DIGITE EL VALOR DE LA PELICULA QUE LLEVO : ");
        valorPeliculas=objlector.nextFloat();
        
        
        Clsoperaciones objoperciones = new Clsoperaciones();
        
        valorBruto=objoperciones.hallarValorBruto(cantidadPeliculas, valorPeliculas);
        descuento=objoperciones.hallarDescuento(cantidadPeliculas, valorPeliculas);
        valorNeto=objoperciones.hallarValorNeto(cantidadPeliculas, valorPeliculas,descuento);
        
        
        System.out.println(" SU  VALOR BRUTO ES DE : " + valorBruto);
        System.out.println(" EL VALOR DEL DESCUENTO ES DE  : " + descuento);
        System.out.println(" SU  VALOR NETO  ES DE : " + valorNeto);
        
    
        
        
        
    }
    
}
