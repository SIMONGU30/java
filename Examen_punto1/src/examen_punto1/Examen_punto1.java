/*
 * 
 * 
 */
package examen_punto1;

import java.util.Scanner;

/**
 *
 * @author saimon
 */
public class Examen_punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objlector=new Scanner (System.in);
        
        int numeroCreditos,valorCredito,estrato,opc;
        float valorTotal;
        
        System.out.println("************** BUENAS TARDES **************");
        System.out.println(" DIGITE POR FAVOR EL NUMERO DE CREDIOS QUE DESEA LLEVAR : ");
        numeroCreditos=objlector.nextInt();
        System.out.println(" DIGITE POR FAVOR EL VALOR QUE TIENE CADA CREDITO : ");
        valorCredito=objlector.nextInt();
        System.out.println("DIGITE POR FAVOR LA OPCION DE MODALIDAD DE PAGO QUE DESEA SABER  ASI (1 =OPCION NORMAL  , 2 =OPCION CON DESCUENTO)");
        opc=objlector.nextInt();
        ClsValorpagar objpagar = new ClsValorpagar(numeroCreditos, valorCredito);
        
        switch (opc){
            
            case 1: valorTotal=objpagar.valorTotal();
            
                     break;
            
            case 2:  System.out.println("DIGITE POR FAVOR EL ESTRATO AL CUAL USTED PERTENECE : 1,2,3,4,5 O 6");
                     estrato=objlector.nextInt();
                     valorTotal=objpagar.valorTotal(estrato);
                     
                     break;
                     
            default: System.out.println("OPCION NO VALIDA");
            
            
                    valorTotal=0;
                    
                    break;
            
                
        }
        
        
                System.out.println("SU VALOR TOTAL A PAGAR ES DE : " + valorTotal);
        
    }
    
}
