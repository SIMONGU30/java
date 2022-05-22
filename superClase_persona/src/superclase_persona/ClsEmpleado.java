/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superclase_persona;

import java.util.Date;

/**
 *
 * @author saimon
 */
public class ClsEmpleado extends Clspersona {
    
    private int salario;
    private String cargo;
    private String empresa;

    public ClsEmpleado(int salario, String cargo, String empresa, String identificacion, String nombre, String fechaNacimiento, String direccion, String telefono) {
        super(identificacion, nombre, fechaNacimiento, direccion, telefono);
        this.salario = salario;
        this.cargo = cargo;
        this.empresa = empresa;
    }

   public float calcularSalarioNeto(){
       float salarioNeto;
       
       if(salario> 4 * 1000000)
           salarioNeto=salario*(float)0.91;
       else
           if (salario > 2 * 1000000)
                salarioNeto=salario*(float)0.92;
       
           else 
                salarioNeto=salario*(float)0.92 + 117000;
           
       
       return salarioNeto;
   }
            
}
