/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerencapsulamiento1;

import java.util.Scanner;

/**
 *
 * @author saimon
 */
public class TallerEncapsulamiento1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objlector=new Scanner(System.in);
        ClsRegistro objregistro=new ClsRegistro();
        
        String nombre,genero,tecnicaEstudia;
        int numeroMaterias,edad;
        float valorMateria;
        
        
        System.out.println("Digite su nombre : ");
        nombre=objlector.next();
        System.out.println("Digite su genero (hombre o mujer) : ");
        genero=objlector.next();
        System.out.println("Digite su tecnica que estudia (sistemas , arquitectura,gastronomia) : ");
        tecnicaEstudia=objlector.next();
        System.out.println("Digite  su edad : ");
        edad=objlector.nextInt();
        System.out.println("Digite  el numero de materias : ");
        numeroMaterias=objlector.nextInt();
        System.out.println("digite el valor de la materia : ");
        valorMateria=objlector.nextFloat();
        
        objregistro.setEdad(edad);
        objregistro.setGenero(genero);
        objregistro.setNumeroMaterias(numeroMaterias);
        objregistro.setTecnicaEstudia(tecnicaEstudia);
        objregistro.setValorMateria(valorMateria);
        
        objregistro.valorTotal();
        
        System.out.println("SU VALOR TOTAL ES : " + objregistro.getValorTotal());
        
        
    }
    
}
