/*
 
Leer la cantidad de personas que viajan, el valor por persona que viajan a Cartagena y luego imprimir:
Valor bruto del viaje
Valor del IVA (19%), preguntar si tiene o no IVA
Descuento: el descuento es del 10% sobre el valor bruto, preguntar si tiene o no descuento
Valor neto del viaje
Nota: utilizar para cada uno un método

 */
package talllerconstructores.pkg4;

import java.util.Scanner;

/**
 *
 * @author saimon
 */
public class TalllerConstructores4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objlector=new Scanner(System.in);
        
        int cantidadPersonas,valorPersona,valorBruto,tipo;
        String dato;
        float porcentajeDescuento , porcentajeIva,descuento,iva,valorNeto;
        
        System.out.println("*****************BUENAS TARDES******************");
        System.out.print("SEÑ@R USUARIO POR FAVOR DIGITE LA CANTIDAD DE PERSONAS QUE VAN A VIAJAR : ");
        cantidadPersonas=objlector.nextInt();
        System.out.print("SEÑ@R USUARIO POR FAVOR DIGITE  EL VALOR POR PERSONA : ");
        valorPersona=objlector.nextInt();
        System.out.println("SEÑ@R USUARIO INGRESE EL TIPO DE VALOR QUE DESEA ASI 1.VALOR BRUTO 2.IVA 3.DESCUENTO.4VALOR NETO");
        tipo=objlector.nextInt();
        
        clsViaje objviaje=new clsViaje(cantidadPersonas,valorPersona);
        
        switch (tipo) {
            case 1:  valorBruto=objviaje.valorBruto();
                
                break;
                
            case 2: System.out.println("DESEA SABER SI TIENE IVA  , DIGITE SI SI O SI NO");
                    dato=objlector.next();
                    
                    if (dato=="si") {
                        System.out.println("POR FAVOR DIGIGTE EL PORCENTAJE DEL IVA QUE DESEE");
                        porcentajeIva=objlector.nextFloat();
                        
                        iva=objviaje.valorIva(porcentajeIva);
                        
                }
           
                    
                break;

            case 3:  valorBruto=objviaje.valorBruto();
                
                break;
            case 4:  valorBruto=objviaje.valorBruto();
                
                break;
            
            default:
                
        }
        
        
        
        
        
        
        
        
        
        
    }
    
}
