/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superclase_persona;


import java.util.Scanner;

/**
 *
 * @author saimon
 */
public class SuperClase_persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objlector = new Scanner(System.in);
        String cargo,empresa,identificacion,nombre,fechaNacimiento,direccion,telefono ,carrera ,universidad,deporte,club;
        int semestre,salario ,opc;
        float salarioNeto;
        
        System.out.println("digite su identificacion : ");
        identificacion=objlector.next();
        System.out.println("digite su nombre : ");
        nombre=objlector.next();
        System.out.println("digite su fecha de nacimiento : ");
        fechaNacimiento=objlector.next();
        System.out.println("digite su direccion ");
        direccion=objlector.next();
        System.out.println("digite su telefono : ");
        telefono=objlector.next();
        
        System.out.println("tipo de persona 1.empleado 2.estudiante 3.deportista");
        opc=objlector.nextInt();
        
        switch (opc) {
            case 1: System.out.println("digite el salario : ");
                    salario=objlector.nextInt();
                    System.out.println("digite el cargo : ");
                    cargo=objlector.next();
                    System.out.println("digite el nombre de la empresa");
                    empresa=objlector.next();
                    ClsEmpleado objempleado = new ClsEmpleado(salario, cargo, empresa, identificacion, nombre, fechaNacimiento, direccion, telefono);
                    salarioNeto=objempleado.calcularSalarioNeto();
                    System.out.println("el salario neto es de : "+salarioNeto);
       
                break;
                
            case 2: System.out.println("digite  su carrera");
                    carrera=objlector.next();
                    System.out.println(" digite el nombre de la  universidad en la que estudia:  ");
                    universidad=objlector.next();
                    System.out.println("digite el semestre en el que va : ");
                    semestre=objlector.nextInt();
                    ClsEstudiante objestudiante=new ClsEstudiante(carrera, universidad, semestre, identificacion, nombre, fechaNacimiento, direccion, telefono);
                break;
                
                
            case 3 : System.out.println("digite el deporte que practica");  
                     deporte=objlector.next();
                     System.out.println("digite el nombre del club en el ue se encuentra : ");
                     club=objlector.next();
                     ClsDeportista objdeportista=new ClsDeportista(deporte, club, identificacion, nombre, fechaNacimiento, direccion, telefono);
            default:
                throw new AssertionError();
        }
        
        
        
        
        
    }
    
}
