/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofutbol.Modelo;

/**
 *
 * @author Johana
 */
public class Pais {
    private String nombre;
    private int copasGanadas;
    private int nroParticipaciones;
    
    // Constructor (recibe nombre, copasGanadas y nroParticipaciones )
    public Pais (String nombre, int copasGanadas, int nroParticipaciones){
        this.nombre = nombre;
        this.copasGanadas = copasGanadas;
        this.nroParticipaciones = nroParticipaciones;
    }

    
    // Métodos de acceso (Getters) y modificación (Setters)
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the copasGanadas
     */
    public int getCopasGanadas() {
        return copasGanadas;
    }

    /**
     * @param copasGanadas the copasGanadas to set
     */
    public void setCopasGanadas(int copasGanadas) {
        this.copasGanadas = copasGanadas;
    }

    /**
     * @return the nroParticipaciones
     */
    public int getNroParticipaciones() {
        return nroParticipaciones;
    }

    /**
     * @param nroParticipaciones the nroParticipaciones to set
     */
    public void setNroParticipaciones(int nroParticipaciones) {
        this.nroParticipaciones = nroParticipaciones;
    }
    
    // Método para representar textualmente los detalles del Pais
    @Override
    public String toString() {
        return "Nombre: " + nombre + 
               " | Copas Ganadas: " + copasGanadas + 
               " | Numero de Participaciones: " + nroParticipaciones;
    }
}
