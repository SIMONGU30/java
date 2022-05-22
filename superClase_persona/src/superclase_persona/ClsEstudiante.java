/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superclase_persona;

/**
 *
 * @author saimon
 */
public class ClsEstudiante  extends Clspersona{
    
    private  String carrera;
    private  String universidad;
    private  int semestre;

    public ClsEstudiante(String carrera, String universidad, int semestre, String identificacion, String nombre, String fechaNacimiento, String direccion, String telefono) {
        super(identificacion, nombre, fechaNacimiento, direccion, telefono);
        this.carrera = carrera;
        this.universidad = universidad;
        this.semestre = semestre;
    }

   
    }
    
    
    

