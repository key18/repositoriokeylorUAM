/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VETERINARIA;

/**
 *
 * @author KEYLO
 */
public class Consulta implements Resumible{
    String fecha;
    String motivo;
    Mascota mascota;
    double costo;
private Veterinario veterinario;

    public Consulta(String fecha, String motivo, Mascota mascota, double costo, Veterinario veterinario) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.mascota = mascota;
        this.costo = costo;
        this.veterinario = veterinario;
    }

    

    public Consulta(String fecha, Mascota mascota) {
        this.fecha = fecha;
        this.mascota = mascota;
        this.motivo = "Consulta General";
        this.costo = 0.0;
    }

    public Consulta() {
        this.fecha ="sin fecha";
        this.motivo = "sin motivo";
       this.mascota = null;
        this.costo = 0.0;
        
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
    
    
    
    

    
    
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    
    public void actualizarcosto(double costo){
    setCosto(costo);
    this.motivo = motivo;
   
    }
     public void actualizarCosto(double costo, String motivo){
        setCosto(costo);
        this.motivo = motivo;
     }
    
   
        
   public void mostrarResumen() {
    System.out.println("Fecha: " + fecha);
    System.out.println("Motivo: " + motivo);
    if(mascota != null) mascota.mostrarResumen();
    if (veterinario !=null) veterinario.getNombre();
    System.out.printf("Costo: %.2f\n", costo);
    
    
}
        
}






 
 

    
    
    
        
