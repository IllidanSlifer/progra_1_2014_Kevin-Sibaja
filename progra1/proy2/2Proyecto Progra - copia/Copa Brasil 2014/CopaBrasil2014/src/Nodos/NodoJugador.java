/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

/**
 *
 * @author Dinier
 */
public class NodoJugador {
       
    private String nombre;
    private int edad;
    private NodoJugador siguienteJugador;

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
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the siguienteJugador
     */
    public NodoJugador getSiguienteJugador() {
        return siguienteJugador;
    }

    /**
     * @param siguienteJugador the siguienteJugador to set
     */
    public void setSiguienteJugador(NodoJugador siguienteJugador) {
        this.siguienteJugador = siguienteJugador;
    }
    
}
