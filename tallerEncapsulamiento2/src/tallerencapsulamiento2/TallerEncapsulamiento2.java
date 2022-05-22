/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerencapsulamiento2;

import java.util.Scanner;

/**
 *
 * @author saimon
 */
public class TallerEncapsulamiento2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objlector=new Scanner(System.in);
        ClsSalario objsalario=new ClsSalario();
        
        int numeroAñoEmpresa,estrato,numeroHijos;
        float deducciones,salarioBasico;
        System.out.println("DIGITE SU SALARIO BASICO ");
        salarioBasico=objlector.nextFloat();
        System.out.println("DIGITE EL NUMERO DE AÑOS QUE LLEVA EN LA EMPRESA : ");
        numeroAñoEmpresa=objlector.nextInt();
        System.out.println(" DIGITE SU ESTRATO : ");
        estrato=objlector.nextInt();    
        System.out.println("DIGITE EL NUMERO DE HIJOS QUE TIENE : ");
        numeroHijos=objlector.nextInt();
        
        deducciones=117000;
        
        objsalario.setEstrato(estrato);
        objsalario.setNumeroAñoEmpresa(numeroAñoEmpresa);
        objsalario.setNumeroHijos(numeroHijos);
        objsalario.salarioNeto(salarioBasico, deducciones);
        
        System.out.println("su salraio neto es de : "+objsalario.getSalarioNeto());
    }
    
  
}
