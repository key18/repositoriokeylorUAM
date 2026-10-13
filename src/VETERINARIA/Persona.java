/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VETERINARIA;

/**
 *
 * @author KEYLO
 */
public  abstract class Persona implements Resumible{

    protected String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona() {
        this.nombre = "sin nombre";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
        
   
           
        
                
        
    

