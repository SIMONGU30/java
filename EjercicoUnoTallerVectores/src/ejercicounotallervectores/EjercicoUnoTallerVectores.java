/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicounotallervectores;

import  java.util.Scanner;

public class EjercicoUnoTallerVectores {

   
    public static void main(String[] args) {
      
	Scanner objLector = new Scanner(System.in);
        clsVectores objvector=new clsVectores();
        
        
        int n , cantidad, dato;
        
        //leer el tamaño del vector
        
        
        System.out.println("¿CUANTOS ELEMENTOS TIENE EL VECTOR?");
        n=objLector.nextInt();
        
        // definir el vector
        
        int [] numeros=new int[n];
        
        // leer el vector
        
        numeros=objvector.leer_vector(n);
         // leer un nmero y lo voy a busar en el vector creado
         
         System.out.println(" DIGITE NUMERO APUNTAR EN EL VECTOR");
         dato=objLector.nextInt();
         cantidad=objvector.contar_numero(dato, numeros, n);
         System.out.println(" CANTIDAD DE VECES QUE  ESTA EL NUMERO EN EL VECTOR " +cantidad);
        
        
        }
        
    }
    

