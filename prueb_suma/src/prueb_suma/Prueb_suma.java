/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueb_suma;

import java.util.Scanner;

/**
 *
 * @author saimon
 */

public class Prueb_suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objlector =  new Scanner(System.in);
        int num1 , num2,result;
        System.out.println("ingrese el primer numero ");
        num1=objlector.nextInt();
        System.out.println("ingrese el segundo numero");
        num2=objlector.nextInt();
        result=num1+num2;
        System.out.println("el resultado es "+result);
        
    }
    
}
