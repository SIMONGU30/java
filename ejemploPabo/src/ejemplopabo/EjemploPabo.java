/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopabo;

/**
 *
 * 
 */
import  java.util.Scanner;

public class EjemploPabo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner objLector = new Scanner(System.in);
        
        String nombre,universidad,carrera;
        int creditos,totalcredito;
        
        
        System.out.println("******************************************");
        System.out.println("Digite  su nombre : ");
        nombre=objLector.next();
        
        System.out.println("Digite  el nombre de  su universidad : ");
        universidad=objLector.next();
        
        System.out.println("Digite  el nombre de su carrera : ");
        carrera=objLector.next();
        
        System.out.println("digite la cantidad de creditos matriculados : ");
        creditos=objLector.nextInt();
        
        
        
       totalcredito=creditos*35000;
       
       
        System.out.println("*****************resultados********************");
       
        
        System.out.println("Su nombre es  : "+nombre);
        System.out.println("Su universidad es  : "+universidad);
        System.out.println("Su carrera es  : "+carrera);
        System.out.println("la cantidad de creditos fueron  : "+creditos);
        System.out.println("el  valor total es  : "+totalcredito);
        
        
         if(creditos>=20){
            System.out.println("se le asigno un mes de internet gartis");
        }
        else{
             System.out.println("no se le dio  un mes de internet gartis");
        }
    }
    
}
