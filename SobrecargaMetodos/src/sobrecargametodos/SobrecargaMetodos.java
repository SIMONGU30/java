/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sobrecargametodos;
import  java.util.Scanner;

/**
 *
 * @author saimon
 */
public class SobrecargaMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner objlector = new Scanner(System.in);
     
     String nombreProducto ,nombre;
     int  numeroUnidades, valorUnitario ,tipo,iva1;
     float   porcentaje = 0 ,iva = 0,valorNeto;
     
        System.out.println("**************BUENAS TARDES*************** ");
        System.out.print(" ¿CUAL ES EL NOMBRE DEL USUARIO ? : ");
        nombre=objlector.next();
        System.out.println("¿CUAL ES EL NOMBRE DEL PRODUCTO QUE EL USUARIO VA A  LLEVAR ? :  ");
        nombreProducto=objlector.next();
        System.out.println("CUAL ES EL VALOR  UNITARIO DE  " + nombreProducto);
        valorUnitario=objlector.nextInt();
        System.out.println("¿CUAL ES EL NUMERO DE UNIDADES  DE " + nombreProducto + "  QUE LLEVO  EL USUARIO ?");
        numeroUnidades=objlector.nextInt();
        System.out.println("¿CUAL ES EL TIPO DE VALOR NETO QUE QUIERE REALIZAR"
                + " 1.NORMAL  2.DESCUENTO 3.IVA 4.CON DESCUENTO Y IVA ?");
        tipo=objlector.nextInt();
        clsCompra objcompra=new clsCompra(valorUnitario,numeroUnidades);
        
        switch (tipo) {
                 case 1: valorNeto=objcompra.calcularCompra();
                
                 case 2:System.out.println(" SEA TAN AMABLE Y DIGITA EL DESCUENTO ASI 0.2 SI ES EL 20%");
                     porcentaje=objlector.nextFloat();
                     valorNeto=objcompra.calcularCompra(porcentaje);
                     break;
                          
                 case 4: System.out.println(" SEA TAN AMABLE Y DIGITA EL DESCUENTO ASI 0.2 SI ES EL 20%");
                     porcentaje=objlector.nextFloat();
                     
                     System.out.println("SEA TAN AMABLE Y ME DIGITA EL IVA ASI 20 SI ES EL 20% ");
                     iva=objlector.nextInt();
                     
                     valorNeto=objcompra.calcularCompra(porcentaje,(float) iva);
                     break;
                 case 3:  System.out.println("SEA TAN AMABLE Y ME DIGITA EL IVA ASI 20 SI ES EL 20% ");
                     iva1=objlector.nextInt();
                     valorNeto=objcompra.calcularCompra(iva1);
                     break;
                 default: System.out.println("OPCION NO VALIDA");
                
                valorNeto=0;
                break;
                        
                
        }
        
     
     
        System.out.println("SU VALOR TOTAL ES DE : "+valorNeto);
    }
    
}
