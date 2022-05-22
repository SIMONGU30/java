/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerencapsulamiento1;

/**
 *
 * @author saimon
 */
public class ClsRegistro {
    
    private String nombre;
    private String genero ;
    private String tecnicaEstudia;
    private int edad;
    private int numeroMaterias;
    private float valorMateria;
    private float valorTotal;
    
    

    public String getNombre() {
        return nombre;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    public void setTecnicaEstudia(String tecnicaEstudia) {
        this.tecnicaEstudia = tecnicaEstudia;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }

   
    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }

    

    public void setValorMateria(float valorMateria) {
        this.valorMateria = valorMateria;
    }
    
    
    
    public void valorTotal(){
        float descuento;
        
        
        if (genero.equalsIgnoreCase("mujer") && edad<18 &&  tecnicaEstudia.equalsIgnoreCase("sistemas") ){
            
            descuento= (numeroMaterias*valorMateria)* (float)10/100;
            
        }
        
        else {
            descuento=0;
        }
        
        valorTotal=(float)numeroMaterias*valorMateria-descuento;
    }
    
    
           
    
}
