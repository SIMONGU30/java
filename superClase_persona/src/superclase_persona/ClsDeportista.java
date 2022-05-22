/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superclase_persona;

/**
 *
 * @author saimon
 */
public class ClsDeportista extends Clspersona {
    
    private String deporte;
    private String club; 

    public ClsDeportista(String deporte, String club, String identificacion, String nombre, String fechaNacimiento, String direccion, String telefono) {
        super(identificacion, nombre, fechaNacimiento, direccion, telefono);
        this.deporte = deporte;
        this.club = club;
    }
    
    
    
    
}
